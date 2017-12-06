package spark.template.velocity;



import org.pac4j.core.authorization.authorizer.RequireAnyRoleAuthorizer;
import org.pac4j.core.client.Clients;
import org.pac4j.core.client.direct.AnonymousClient;
import org.pac4j.core.config.Config;
import org.pac4j.core.config.ConfigFactory;
import org.pac4j.core.credentials.TokenCredentials;
import org.pac4j.core.matching.PathMatcher;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.util.CommonHelper;
import org.pac4j.http.client.direct.DirectBasicAuthClient;
import org.pac4j.http.client.direct.HeaderClient;
import org.pac4j.http.client.indirect.FormClient;
import org.pac4j.http.client.indirect.IndirectBasicAuthClient;
import org.pac4j.http.credentials.authenticator.test.SimpleTestUsernamePasswordAuthenticator;
import org.pac4j.oauth.client.FacebookClient;
import org.pac4j.oauth.client.TwitterClient;

import spark.TemplateEngine;

public class FabricaConfiguracion implements ConfigFactory {

	private final String salt;

	private final TemplateEngine templateEngine;

	public FabricaConfiguracion(final String salt, final TemplateEngine templateEngine) {
		this.salt = salt;
		this.templateEngine = templateEngine;
	}

	@Override
	public Config build(final Object... parameters) {

		final FacebookClient facebookClient = new FacebookClient("1091856944283517", "4d43d2452ebe853ba63a1095c1a41e75");
		final TwitterClient twitterClient = new TwitterClient("CoxUiYwQOSFDReZYdjigBA", "2kAzunH5Btc4gRSaMr7D7MkyoJ5u1VzbOOzE8rBofs");
		// HTTP
		final FormClient formClient = new FormClient("http://localhost:4567/loginForm", new SimpleTestUsernamePasswordAuthenticator());
		final IndirectBasicAuthClient indirectBasicAuthClient = new IndirectBasicAuthClient(new SimpleTestUsernamePasswordAuthenticator());

		// basic auth
		final DirectBasicAuthClient directBasicAuthClient = new DirectBasicAuthClient(new SimpleTestUsernamePasswordAuthenticator());

		final HeaderClient headerClient = new HeaderClient("Authorization", (credentials, ctx) -> {
			final String token = ((TokenCredentials) credentials).getToken();
			if (CommonHelper.isNotBlank(token)) {
				final CommonProfile profile = new CommonProfile();
				profile.setId(token);
				credentials.setUserProfile(profile);
			}
		});

		final Clients clients = new Clients("http://localhost:4567/callback", facebookClient,
				twitterClient, formClient, indirectBasicAuthClient, directBasicAuthClient, new AnonymousClient(),
				headerClient);

		final Config config = new Config(clients);
		config.addAuthorizer("admin", new RequireAnyRoleAuthorizer("ROLE_ADMIN"));
		config.addAuthorizer("custom", new AutorizadorPersonalizado());
		config.addMatcher("excludedPath", new PathMatcher().excludeRegex("^/facebook/notprotected$"));
		config.setHttpActionAdapter(new DemoHttpActionAdapter(templateEngine));
		return config;
	}
}
