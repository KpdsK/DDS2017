package spark.template.velocity;

import java.util.HashMap;
import java.util.Map;

import org.pac4j.core.config.Config;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;
import org.pac4j.oauth.profile.facebook.FacebookPicture;
import org.pac4j.oauth.profile.facebook.FacebookProfile;
import org.pac4j.sparkjava.CallbackRoute;
import org.pac4j.sparkjava.LogoutRoute;
import org.pac4j.sparkjava.SecurityFilter;
import org.pac4j.sparkjava.SparkWebContext;

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
public final class Home {
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

				FacebookProfile fp = (FacebookProfile) firstProfile;
				// See: https://github.com/pac4j/pac4j/blob/master/pac4j-oauth/src/main/java/org/pac4j/oauth/profile/facebook/FacebookProfile.java

				// And: https://github.com/pac4j/pac4j/blob/master/pac4j-oauth/src/main/java/org/pac4j/oauth/profile/facebook/FacebookPicture.java

				FacebookPicture fbPic = fp.getPicture();

				model.put("fp", fp); 
				model.put("name",fp.getDisplayName());
				if (fbPic!=null)
					model.put("avatar_url",fbPic.getUrl());
				else
					model.put("avatar_url","");
				model.put("email",fp.getEmail()); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;	
	}
	public static void main(String[] args) {

		


		HashMap<String,String> envVars = new HashMap<String, String>() {
			{
				put("FACEBOOK_CLIENT_ID", "1091856944283517");
				put("FACEBOOK_CLIENT_SECRET", "4d43d2452ebe853ba63a1095c1a41e75");
				put("FACEBOOK_CALLBACK_URL", "http://localhost:4567/callback");
				put("APPLICATION_SALT", "4d43d2452ebe853ba63a1095c1a41e75");
			}
		};

		Config config = new
				FacebookOAuthConfigFactory(envVars.get("FACEBOOK_CLIENT_ID"),
						envVars.get("FACEBOOK_CLIENT_SECRET"),
						envVars.get("FACEBOOK_CALLBACK_URL"),
						envVars.get("APPLICATION_SALT"),
						new VelocityTemplateEngine()).build();

		// directorio donde se encuantran los recursos que usa la webApp (ej.:
		// html, img, css, bootstrap, templates, etc.)
		staticFiles.location("/publico"); // Static files

		get("/ingreso", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			return new ModelAndView(buildModel(request, response), "login.html"); // located in the resources directory
		}, new VelocityTemplateEngine());

		before("/loginSocial", new SecurityFilter(config, "FacebookClient"));

		get("/loginSocial",
				(request, response) -> { Map<String, Object> model = new HashMap<>();
				return new ModelAndView(buildModel(request, response), "inicio.html"); // located in the resources directory
				}, new VelocityTemplateEngine());
		get("/logout", new LogoutRoute(config, "/ingreso"));
		get("/inicio", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			return new ModelAndView(buildModel(request, response), "inicio.html"); // located in the resources directory
		}, new VelocityTemplateEngine());
		CallbackRoute callback = new CallbackRoute(config, null, true);

		get("/callback", callback);
		post("/callback", callback);
		// Manejo de errores de pagina. Using string/html
		notFound("<html><body><h1>Error 404 no existe la pagina</h1></body></html>");

	}

}