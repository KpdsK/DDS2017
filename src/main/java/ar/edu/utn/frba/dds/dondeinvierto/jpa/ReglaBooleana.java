package ar.edu.utn.frba.dds.dondeinvierto.jpa;

import java.util.List;

import javax.persistence.Entity;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import ar.edu.utn.frba.dds.dondeinvierto.Regla;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;

@Entity
public class ReglaBooleana extends ReglaAbstracta{

	public ReglaBooleana() {
		super();
	}
	
	public ReglaBooleana(String expresion, int periodo) throws ExpresionInvalidaException {
		super(expresion, periodo);
	}

	@Override
	protected String verificarExpresion(String expresion) throws ExpresionInvalidaException {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, MetodosUtiles.obtenerCuentasEindicadoresDeUsuario());
		DondeInviertoParser.CondicionContext tree = parser.condicion();
		if(parser.getNumberOfSyntaxErrors()>0)
			throw new ExpresionInvalidaException();
		return expresion;
	}

	@Override
	protected ar.edu.utn.frba.dds.dondeinvierto.ReglaBooleana construirReglaEjecutable() {
		return new ar.edu.utn.frba.dds.dondeinvierto.ReglaBooleana(this.expresion, this.periodo, ManejadorPersistencia.listaIndicadoresEjecutables());
	}
}
