package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser.IdentificadorContext;
import ar.edu.utn.frba.dds.dondeinvierto.ast.PruebasBaseListener;

public class Indicador implements Operable {
	private String expresionIndicador;
	private String nombre;

	public Indicador(String nombre, String expresionIndicador) {
		super();
		this.expresionIndicador = expresionIndicador;
		this.nombre = nombre;
	}

	public String getExpresionIndicador() {
		return expresionIndicador;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public double operar(List<Operable> listaOperable) {
		DondeInviertoSinCodigoJavaLexer lexer = new DondeInviertoSinCodigoJavaLexer( new ANTLRInputStream(expresionIndicador));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoSinCodigoJavaParser parser = new DondeInviertoSinCodigoJavaParser( tokens, listaOperable);
		DondeInviertoSinCodigoJavaParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultado();
	}
}