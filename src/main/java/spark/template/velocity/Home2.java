package spark.template.velocity;

import static spark.Spark.staticFiles;

/**
 * VelocityTemplateRoute example.
 */

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;

	import org.pac4j.core.client.Client;
	import org.pac4j.core.client.Clients;
	import org.pac4j.core.config.Config;
	import org.pac4j.core.exception.HttpAction;
	import org.pac4j.core.profile.CommonProfile;
	import org.pac4j.core.profile.ProfileManager;
	import org.pac4j.http.client.indirect.FormClient;

	import org.pac4j.sparkjava.CallbackRoute;
	import org.pac4j.sparkjava.LogoutRoute;
	import org.pac4j.sparkjava.SecurityFilter;
	import org.pac4j.sparkjava.SparkWebContext;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import spark.ModelAndView;
	import spark.Request;
	import spark.Response;
	import static spark.Spark.staticFiles;

	import static spark.Spark.*;

	public final class Home2 {
		private final static Logger logger = LoggerFactory.getLogger(Home2.class);
		private final static VelocityTemplateEngine templateEngine = new VelocityTemplateEngine();
		
		public static void main(String[] args) {
			staticFiles.location("/publico");
			port(4567);
			final String JWT_SALT = "12345678901234567890123456789012";
			final Config config = new FabricaConfiguracion(JWT_SALT, templateEngine).build();

			get("/", Home2::index, templateEngine);
			final CallbackRoute callback = new CallbackRoute(config, null, true);
			//callback.setRenewSession(false);
			get("/callback", callback);
			post("/callback", callback);
	        final SecurityFilter facebookFilter = new SecurityFilter(config, "FacebookClient", "", "excludedPath");
	        before("/loginFacebook", facebookFilter);
			before("/loginFacebook/*", facebookFilter);
			before("/loginTwitter", new SecurityFilter(config, "TwitterClient,FacebookClient"));
			before("/form", new SecurityFilter(config, "FormClient"));
			get("/loginFacebook", Home2::protectedIndex, templateEngine);
			get("/loginTwitter", Home2::protectedIndex, templateEngine);
			get("/form", Home2::protectedIndex, templateEngine);
			get("/loginForm", (rq, rs) -> form(config), templateEngine);
			final LogoutRoute localLogout = new LogoutRoute(config, "/");
			localLogout.setDestroySession(true);
			get("/logout", localLogout);
			final LogoutRoute centralLogout = new LogoutRoute(config);
			centralLogout.setDefaultUrl("http://localhost:4567");
			centralLogout.setLogoutUrlPattern("http://localhost:4567/.*");
			centralLogout.setLocalLogout(false);
			centralLogout.setCentralLogout(true);
			centralLogout.setDestroySession(true);
			get("/centralLogout", centralLogout);

	    }

		private static ModelAndView index(final Request request, final Response response) {
			final Map map = new HashMap();
			map.put("profiles", getProfiles(request, response));
			final SparkWebContext ctx = new SparkWebContext(request, response);
			map.put("sessionId", ctx.getSessionIdentifier());
			return new ModelAndView(map, "login.html");
		}


		private static ModelAndView form(final Config config) {
			final Map map = new HashMap();
			final FormClient formClient = config.getClients().findClient(FormClient.class);
			map.put("callbackUrl", formClient.getCallbackUrl());
			return new ModelAndView(map, "inicio.html");
		}

		private static ModelAndView protectedIndex(final Request request, final Response response) {
			final Map map = new HashMap();
			map.put("profiles", getProfiles(request, response));
			return new ModelAndView(map, "inicio.html");
		}

		private static List<CommonProfile> getProfiles(final Request request, final Response response) {
			final SparkWebContext context = new SparkWebContext(request, response);
			final ProfileManager manager = new ProfileManager(context);
			return manager.getAll(true);
		}

	}