package spark.template.velocity;

import java.io.UnsupportedEncodingException;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.Regla;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ReglaBooleana;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ReglaPorRatio;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.eclipse.jetty.util.UrlEncoded;
import org.h2.jdbcx.JdbcConnectionPool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;
import org.pac4j.core.credentials.UsernamePasswordCredentials;
import org.pac4j.core.credentials.password.PasswordEncoder;
import org.pac4j.core.credentials.password.SpringSecurityPasswordEncoder;
import org.pac4j.core.exception.CredentialsException;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;
import org.pac4j.http.client.indirect.FormClient;
import org.pac4j.oauth.client.FacebookClient;
import org.pac4j.oauth.client.TwitterClient;
import org.pac4j.oauth.profile.facebook.FacebookPicture;
import org.pac4j.oauth.profile.facebook.FacebookProfile;
import org.pac4j.sparkjava.CallbackRoute;
import org.pac4j.sparkjava.LogoutRoute;
import org.pac4j.sparkjava.SecurityFilter;
import org.pac4j.sparkjava.SparkWebContext;
import org.pac4j.sql.profile.service.DbProfileService;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import ar.edu.utn.frba.dds.dondeinvierto.jpa.Metodologia;
import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.Indicador;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ManejadorPersistencia;

import static spark.Spark.before;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.notFound;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

/**
 * VelocityTemplateRoute example.
 */
public final class Home3 {
	private static java.util.List<CommonProfile> getProfiles(final Request request,
		final Response response) {
		final SparkWebContext context = new SparkWebContext(request, response);
		final ProfileManager manager = new ProfileManager(context);
		return manager.getAll(true);
	}   
	private static Map buildModel(Request request, Response response) {

		final Map model = new HashMap<String,Object>();

		Map<String, Object> map = new HashMap<String, Object>();
		for (String k: request.session().attributes()) {
			Object v = request.session().attribute(k);
			map.put(k,v);
		}

		model.put("session", map.entrySet());

		java.util.List<CommonProfile> userProfiles = getProfiles(request,response);

		model.put("profiles", userProfiles);

		try {
			if (userProfiles.size()>0) {
				CommonProfile firstProfile = userProfiles.get(0);
				model.put("firstProfile", firstProfile);	
				model.put("name",firstProfile.getDisplayName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;	
	}
	static Configuration configuration = new Configuration().configure();
	static ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
	static SessionFactory sf = configuration.buildSessionFactory(serviceRegistry);
	//	 sf = new Configuration().configure().buildSessionFactory(serviceRegistry);
	public static void main(String[] args) {

		// directorio donde se encuantran los recursos que usa la webApp (ej.:
		// html, img, css, bootstrap, templates, etc.)
		staticFiles.location("/publico"); // Static files
		FacebookClient facebookClient = new FacebookClient("1091856944283517", "4d43d2452ebe853ba63a1095c1a41e75");
		final TwitterClient twitterClient = new TwitterClient("CoxUiYwQOSFDReZYdjigBA", "2kAzunH5Btc4gRSaMr7D7MkyoJ5u1VzbOOzE8rBofs");

		final Clients clients = new Clients("http://localhost:4567/callback", facebookClient, twitterClient);
		final Config config = new Config(clients);
		config.setHttpActionAdapter(new DemoHttpActionAdapter(new VelocityTemplateEngine()));
		
		get("/ingreso", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("ingresoValido", true);
			return new ModelAndView(model, "publico/pages/login.vm"); // located in the resources directory
		}, new VelocityTemplateEngine());

		post("/ingreso", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("ingresoValido", true);
			return new ModelAndView(model, "publico/pages/login.vm"); // located in the resources directory
		}, new VelocityTemplateEngine());

		before("/loginFacebook", new SecurityFilter(config, "FacebookClient"));

		get("/loginFacebook",
				(request, response) -> { 
				return new ModelAndView(buildModel(request, response), "publico/pages/inicio.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());

		before("/loginTwitter", new SecurityFilter(config, "TwitterClient"));

		get("/loginTwitter",
				(request, response) -> { 
				return new ModelAndView(buildModel(request, response), "publico/pages/inicio.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());

		get("/crear-ind",
				(request, response) -> { Map<String, Object> model = new HashMap<>();
				model.put("guardadoExitoso", true);
				return new ModelAndView(model, "publico/pages/crear-ind.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());
		get("/consultar-ind",
				(request, response) -> {
				return new ModelAndView(obtenerDatosParaTablaIndicadores(), "publico/pages/consultar-ind.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());
		get("/crear-met",
				(request, response) -> { Map<String, Object> model = new HashMap<>();
				model.put("guardadoExitoso", true);
				return new ModelAndView(model, "publico/pages/crear-met.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());
		get("/consultar-met",
				(request, response) -> {
				return new ModelAndView(obtenerDatosParaTablaMetodologias(), "publico/pages/consultar-met.vm"); // located in the resources directory
				}, new VelocityTemplateEngine());
		get("/loginDB", Home3::formulario, new VelocityTemplateEngine());
		post("/loginDB", Home3::formulario, new VelocityTemplateEngine());
		get("/logout", new LogoutRoute(config, "/ingreso"));
		get("/inicio", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			return new ModelAndView(buildModel(request, response), "publico/pages/inicio.vm"); // located in the resources directory
		}, new VelocityTemplateEngine());
		CallbackRoute callback = new CallbackRoute(config, null, true);

		get("/callback", callback);
		post("/callback", callback);
		
		post("/aplicarMetodologia", (request, response) -> {
			String datos = request.queryParams("datos").trim();
		    Map<String, Object> model = new HashMap<>();
		    model.put("datosTabla", aplicarMetodologia(datos));
		    model.put("nombreMetodologia", datos);
		    return new ModelAndView(model, "publico/pages/resultado-met.vm");
		}, new VelocityTemplateEngine());
		
		post("/guardarMetodologia", (request, response) -> {
			String datos = request.queryParams("objTabla[]");
			String[] datosMetodologia = datos.split(",");
		    Map<String, Object> model = new HashMap<>();
		    model.put("guardadoExitoso", crearMetodologia((String)datosMetodologia[0],datosMetodologia[1]));
		    return new ModelAndView(model, "publico/pages/crear-met.vm");
		}, new VelocityTemplateEngine());
		
		post("/guardar-indicador", (request, response) -> {
			Map<String, Object> mapDatos =asMap(request.body(),"UTF-8");
		    Map<String, Object> model = new HashMap<>();
		    model.put("guardadoExitoso", crearIndicador((String)mapDatos.get("nombre"),(String)mapDatos.get("expresion")));
		    return new ModelAndView(model, "publico/pages/crear-ind.vm");
		}, new VelocityTemplateEngine());
		// Manejo de errores de pagina. Using string/html
		notFound("<html><body><h1>Error 404 no existe la pagina</h1></body></html>");
	}
	
	public static String aplicarMetodologia(String datos) {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		Metodologia metodologia = em.createQuery("SELECT i FROM Metodologia i where nombre=\'" + datos.trim() + "\'" , Metodologia.class).getResultList().get(0);
		return metodologia.construirMetodologiaEjecutable().obtenerResultadosParaWeb(); 
	}
	private static List<Regla> obtenerListaDeReglas(String cadenaReglas) throws NumberFormatException, ExpresionInvalidaException{
		List<Regla> listaReglas = new ArrayList<Regla>();
		Arrays.asList(cadenaReglas.split("#")).stream().forEach(datos -> {
			String[] datosRegla = datos.split(":");
		try {
			listaReglas.add(Boolean.valueOf(datosRegla[1]) ? new ReglaBooleana(datosRegla[0], Integer.parseInt(datosRegla[2])) : new ReglaPorRatio(datosRegla[0], Integer.parseInt(datosRegla[2])));
		} catch (NumberFormatException | ExpresionInvalidaException e) {
			e.printStackTrace();
		}
		});
		if (listaReglas.isEmpty()) {
			throw new ExpresionInvalidaException();
		}
		return listaReglas;
	}
	private static Map<String, Object> obtenerDatosParaTablaMetodologias() {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		List<Metodologia> metodologias= em.createQuery("SELECT i FROM Metodologia i", Metodologia.class).getResultList();
		String datos="";
		for (Metodologia m : metodologias){
			datos = datos.concat("[\""+m.getNombre()+"\",\""+obtenerReglas(m.getReglas())+"\"],");
		}
		Map<String, Object> map= new HashMap<>();
		if (!datos.isEmpty())
			datos="["+datos.substring(0, datos.length()-1)+"];";
		map.put("datosTabla", datos);
		return map;
	}

	private static String obtenerReglas(List<Regla> reglas) {
		String cadenaDatosReglas = "";
		for( Regla regla: reglas) {
			cadenaDatosReglas += regla.getExpresion() + "," + regla.getPeriodo() + ":";
		}
		if (!cadenaDatosReglas.isEmpty())
			cadenaDatosReglas= cadenaDatosReglas.substring(0, cadenaDatosReglas.length()-1);
		return cadenaDatosReglas;
	}
	private static Map<String, Object> obtenerDatosParaTablaIndicadores() {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		List<Indicador> indicadores = em.createQuery("SELECT i FROM Indicador i", Indicador.class).getResultList();
		String datos="";
		for (Indicador i : indicadores) {
			datos = datos.concat("[\""+i.getNombre()+"\",\""+i.getExpresion()+"\"],");
		}
		Map<String, Object> map= new HashMap<>();
		if (!datos.isEmpty())
			datos="["+datos.substring(0, datos.length()-1)+"]";
		map.put("datosTabla", datos);
		return map;
	}
	private static boolean crearIndicador(String nombre, String expresion) {
		Map<String, Object> map= new HashMap<>();
		try {
			ManejadorPersistencia.persistir(new Indicador().setNombre(nombre).asignarExpresion(expresion));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	private static boolean crearMetodologia(String nombre, String reglas) {
		Map<String, Object> map= new HashMap<>();
		try {
			ManejadorPersistencia.persistir(new Metodologia().setNombre(nombre).setReglas(obtenerListaDeReglas(reglas)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	private static ModelAndView formulario(final Request request, final Response response) throws HttpAction, UnsupportedEncodingException {
		Map<String, Object> mapDatos =asMap(request.body(),"UTF-8");
		PasswordEncoder PASSWORD_ENCODER = new SpringSecurityPasswordEncoder(new StandardPasswordEncoder());
		MysqlDataSource mSqlDS = new MysqlDataSource();
		mSqlDS.setURL("jdbc:mysql://localhost:3306/donde_invierto");
		mSqlDS.setUser("pds");
		mSqlDS.setPassword("clave");
		final DbProfileService dbProfileService = new DbProfileService(mSqlDS,"nombre");
		dbProfileService.setPasswordEncoder(PASSWORD_ENCODER);
		final UsernamePasswordCredentials credentials = new UsernamePasswordCredentials((String) mapDatos.get("username"), (String) mapDatos.get("password"), "");
		final Map map = new HashMap();
		try {
			dbProfileService.validate(credentials, null);
		} catch (CredentialsException e) {
			map.put("ingresoInvalido", "inputError");
			map.put("error", "has-error");
			map.put("ingresoValido", false);
			return new ModelAndView(map, "publico/pages/login.vm");
		}
		Session session = sf.openSession();
		map.put("name", credentials.getUserProfile().getId());
		return new ModelAndView(map, "publico/pages/inicio.vm");
	}
	
	public static Map<String, Object> asMap(String urlencoded, String encoding) throws UnsupportedEncodingException {
	    Map<String, Object> map = new LinkedHashMap<>();
	    for (String keyValue : urlencoded.trim().split("&")) {
	      String[] tokens = keyValue.trim().split("=");
	      String key = tokens[0];
	      String value = tokens.length == 1 ? null : URLDecoder.decode(tokens[1], encoding);
	      String[] keys = key.split("\\.");
	      Map<String, Object> pointer = map;
	      for (int i = 0; i < keys.length - 1; i++) {
	        String currentKey = keys[i];
	        Map<String, Object> nested = (Map<String, Object>) pointer.get(keys[i]);
	        if (nested == null) {
	          nested = new LinkedHashMap<>();
	        }
	        pointer.put(currentKey, nested);
	        pointer = nested;
	      }
	      pointer.put(keys[keys.length - 1], value);
	    }
	    return map;
	  }
}