package spark.template.velocity;

import org.pac4j.core.config.ConfigFactory;
import org.pac4j.core.config.Config;
import org.pac4j.core.client.Clients;

import org.pac4j.oauth.client.FacebookClient;

import spark.TemplateEngine;

public class FacebookOAuthConfigFactory implements ConfigFactory {

    private String facebook_client_id;
    private String facebook_client_secret;
    private String callback_url;

    private final String salt;

    private final TemplateEngine templateEngine;

    public FacebookOAuthConfigFactory(String facebook_client_id,
				    String facebook_client_secret,
				    String callback_url,
				    String salt,
				    TemplateEngine templateEngine) {
	this.facebook_client_id = facebook_client_id;
	this.facebook_client_secret = facebook_client_secret;
	this.callback_url = callback_url;
	this.salt = salt;
	this.templateEngine = templateEngine;	
    }
    
	@Override
	public Config build(Object... arg0) {
		FacebookClient facebookClient =
			    new FacebookClient(facebook_client_id,
					     facebook_client_secret);

//			facebookClient.setScope("public_profile");
//			Clients clients = new Clients(this.callback_url, facebookClient);
			
			org.pac4j.core.config.Config config =
			    new org.pac4j.core.config.Config(this.callback_url, facebookClient);

			config.setHttpActionAdapter(new DemoHttpActionAdapter(templateEngine));
			
			return config;
	}
}
