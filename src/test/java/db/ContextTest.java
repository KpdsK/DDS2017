package db;

import junit.framework.Assert;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

	public void contextUp() {
		Assert.assertNotNull(entityManager());
	}

	public void contextUpWithTransaction() throws Exception {
		withTransaction(() -> {});
	}
}