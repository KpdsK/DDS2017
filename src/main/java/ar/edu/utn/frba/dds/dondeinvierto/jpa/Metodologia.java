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
@Table(name = "metodologia")
public class Metodologia {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private String expresion;

	public Integer getId() {
		return id;
	}

	public Metodologia setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getExpresion() {
		return expresion;
	}

	public Metodologia setExpresion(String expresion) throws ExpresionInvalidaException {
		this.expresion = verificarExpresion(expresion);
		return this;
	}
	private String verificarExpresion(String expresion) throws ExpresionInvalidaException {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, obtenerCuentasEindicadoresDeUsuario());
		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
		if(parser.getNumberOfSyntaxErrors()>0)
			throw new ExpresionInvalidaException();
		return expresion;
	}

	private List<Operable> obtenerCuentasEindicadoresDeUsuario() {
		EntityManager em = ManejadorPersistencia.INSTANCE.getEntityManager();
		List<Metodologia> indicadores = em.createQuery("SELECT i FROM Indicador i", Metodologia.class).getResultList();
		List<Cuenta> cuentas = em.createQuery("SELECT c FROM Cuenta c", Cuenta.class).getResultList();
		List<Operable> listaOperables = indicadores.stream().map(indicador -> new ar.edu.utn.frba.dds.dondeinvierto.Indicador("IN_"+indicador.getNombre(), indicador.getExpresion())).collect(Collectors.toList());
		listaOperables.addAll(cuentas.stream().map(cuenta -> new ar.edu.utn.frba.dds.dondeinvierto.Cuenta("CU_"+cuenta.getNombre(), cuenta.getValor())).collect(Collectors.toList()));
		return listaOperables;
	}

	public String getNombre() {
		return nombre;
	}

	public Metodologia setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}