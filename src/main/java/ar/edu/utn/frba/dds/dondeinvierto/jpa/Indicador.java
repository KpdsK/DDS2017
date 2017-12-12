package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta;
import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;

@Entity
@Table(name = "indicador")
public class Indicador {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private String expresion;

	public Integer getId() {
		return id;
	}

	public Indicador setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getExpresion() {
		return expresion;
	}

	public Indicador setExpresion(String expresion) throws ExpresionInvalidaException {
		this.expresion = verificarExpresion(expresion);
		return this;
	}
	private String verificarExpresion(String expresion) throws ExpresionInvalidaException {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, obtenerCuentasEindicadoresDeUsuario());
		if(parser.getNumberOfSyntaxErrors()>0)
			throw new ExpresionInvalidaException();
		return expresion;
	}

	private List<Operable> obtenerCuentasEindicadoresDeUsuario() {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		List<Indicador> indicadores = em.createQuery("SELECT i FROM indicador i", Indicador.class).getResultList();
		List<Cuenta> cuentas = em.createQuery("SELECT c FROM cuenta c", Cuenta.class).getResultList();
		List<Operable> listaOperables = indicadores.stream().map(indicador -> new ar.edu.utn.frba.dds.dondeinvierto.Indicador(indicador.getNombre(), indicador.getExpresion())).collect(Collectors.toList());
		listaOperables.addAll(cuentas.stream().map(cuenta -> new ar.edu.utn.frba.dds.dondeinvierto.Cuenta(cuenta.getNombre(), cuenta.getValor())).collect(Collectors.toList()));
		//		List<String> nombresIndicadores = em.createQuery("SELECT nombre FROM indicador", String.class).getResultList();
		//		List<String> nombresCuentas = em.createQuery("SELECT nombre FROM cuenta", String.class).getResultList();
		//		nombresCuentas.addAll(nombresIndicadores);
		//		TODO: agregar cuentas y quitar este metodo a una nueva abstraccion con metodo estatico
		//		List<Cuentas> cuentas = em.createQuery("SELECT * FROM cuenta", Cuentas.class).getResultList();
		return listaOperables;
	}

	public String getNombre() {
		return nombre.substring(4);
	}

	public Indicador setNombre(String nombre) {
		this.nombre = "IN_"+nombre;
		return this;
	}
}
