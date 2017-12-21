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
	public Indicador setExpresion(String expresion) {
		this.expresion = expresion;
		return this;
	}
	public Indicador asignarExpresion(String expresion) throws ExpresionInvalidaException {
		this.expresion = verificarExpresion(expresion);
		return this;
	}
	private String verificarExpresion(String expresion) throws ExpresionInvalidaException {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, MetodosUtiles.obtenerCuentasEindicadoresDeUsuario());
		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
		if(parser.getNumberOfSyntaxErrors()>0)
			throw new ExpresionInvalidaException();
		return expresion;
	}

	public String getNombre() {
		return nombre.substring(3);
	}

	public Indicador setNombre(String nombre) {
		this.nombre = "IN_"+nombre;
		return this;
	}

	public ar.edu.utn.frba.dds.dondeinvierto.Indicador obtenerIndicadorEjecutable() {
		return new ar.edu.utn.frba.dds.dondeinvierto.Indicador(this.nombre, this.expresion);
	}
}