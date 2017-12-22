package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import ar.edu.utn.frba.dds.dondeinvierto.Operable;

public class MetodosUtiles {
	
	public static List<Operable> obtenerCuentasEindicadoresDeUsuario(String idUsuario) {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		List<Indicador> indicadores = em.createQuery("SELECT i FROM Indicador i where idUsuario='" + idUsuario + "'", Indicador.class).getResultList();
		List<Cuenta> cuentas = em.createQuery("SELECT c FROM Cuenta c", Cuenta.class).getResultList();
		List<Operable> listaOperables = indicadores.stream().map(indicador -> new ar.edu.utn.frba.dds.dondeinvierto.Indicador("IN_"+indicador.getNombre(), indicador.getExpresion())).collect(Collectors.toList());
		listaOperables.addAll(cuentas.stream().map(cuenta -> new ar.edu.utn.frba.dds.dondeinvierto.Cuenta("CU_"+cuenta.getNombre(), cuenta.getValor())).collect(Collectors.toList()));
		return listaOperables;
	}

}
