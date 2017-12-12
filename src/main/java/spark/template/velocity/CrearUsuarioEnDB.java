package spark.template.velocity;

import org.pac4j.core.credentials.UsernamePasswordCredentials;
import org.pac4j.core.credentials.password.PasswordEncoder;
import org.pac4j.core.credentials.password.SpringSecurityPasswordEncoder;
import org.pac4j.core.exception.CredentialsException;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.sql.profile.service.DbProfileService;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class CrearUsuarioEnDB {
	private static final int DB_ID = 1;
	private static final String DB_LINKED_ID = "dbLinkedId";
	private static final String DB_PASS = "Alonso";
	private static final String DB_USER = "Daniel";
	private static final String DB_USER2 = "dalonso";
	private static final PasswordEncoder PASSWORD_ENCODER = new SpringSecurityPasswordEncoder(new StandardPasswordEncoder());

	public static void main(String[] args) throws HttpAction, CredentialsException {
//		DataSource ds =  JdbcConnectionPool.create("jdbc:h2:donde_invierto;DB_CLOSE_DELAY=-1", "usuarios", "clave");
//				final DbProfile profile = new DbProfile();
//				profile.setId("ID" + DB_ID);
//				profile.setLinkedId(DB_LINKED_ID);
//				profile.addAttribute("username", DB_USER);
//				final DbProfileService dbProfileService = new DbProfileService(ds);
//				dbProfileService.setPasswordEncoder(PASSWORD_ENCODER);
//				// create
//				dbProfileService.create(profile, DB_PASS);

		MysqlDataSource mSqlDS = new MysqlDataSource();
		mSqlDS.setURL("jdbc:mysql://localhost:3306/donde_invierto");
		mSqlDS.setUser("pds");
		mSqlDS.setPassword("clave");
//		List<Map<String, Object>> dddms = new DBI(mSqlDS).open().createQuery("show tables").list(4);
		final DbProfileService dbProfileService = new DbProfileService(mSqlDS,"nombre");
		dbProfileService.setPasswordEncoder(PASSWORD_ENCODER);
		final UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("Daniel", "Alonso", "");
		dbProfileService.validate(credentials, null);
		
//		final DbProfileService dbProfileService2 = new DbProfileService(ds, "nombre");
//		dbProfileService2.setPasswordEncoder(PASSWORD_ENCODER);
//
//		final UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("Daniel", "Alonso", "");
//		dbProfileService2.validate(credentials, null);
//		System.out.println("Termino");
	}
}
