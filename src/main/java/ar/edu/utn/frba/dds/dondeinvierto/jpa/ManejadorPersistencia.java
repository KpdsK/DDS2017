package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum ManejadorPersistencia {
	INSTANCE;
	private EntityManagerFactory emFactory;
	private ManejadorPersistencia() {
		emFactory = Persistence.createEntityManagerFactory("donde_invierto");
	}

	public EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

	public void close() {
		emFactory.close();
	}
}