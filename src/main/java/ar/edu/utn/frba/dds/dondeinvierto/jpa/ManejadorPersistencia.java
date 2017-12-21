package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.utn.frba.dds.dondeinvierto.Operable;

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
	
	public static void persistir(Object obj) {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		em.getTransaction()
		.begin();
		em.persist(obj);
		em.getTransaction()
		.commit();
		em.close();
	}

	public static List<Operable> listaIndicadoresEjecutables() {
		return listaIndicadores().stream().map(ind -> ind.obtenerIndicadorEjecutable()).collect(Collectors.toList());
	}
	
	public static List<Indicador> listaIndicadores() {
		return INSTANCE.getEntityManager().createQuery("SELECT i FROM Indicador i" , Indicador.class).getResultList();
	}

	public static List<Empresa> listaEmpresas() {
		return INSTANCE.getEntityManager().createQuery("SELECT e FROM Empresa e" , Empresa.class).getResultList();
	}
	
	public static List<ar.edu.utn.frba.dds.dondeinvierto.Empresa> listaEmpresasEjecutables() {
		return listaEmpresas().stream().map(emp -> emp.obtenerEmpresaEjecutable()).collect(Collectors.toList());
	}
}