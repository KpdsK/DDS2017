package ar.edu.utn.frba.dds.dondeinvierto.ast;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser;

public class ExpresionIdentificador {

	private String expresion;
	private PruebasBaseListener listener = new PruebasBaseListener();
	
	public ExpresionIdentificador(String expresion) {
		super();
		this.expresion = expresion;
	}

	public String getExpresion() {
		return expresion;
	}

	public void ejecutar() {
		DondeInviertoSinCodigoJavaLexer lexer = new DondeInviertoSinCodigoJavaLexer( new ANTLRInputStream(this.expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoSinCodigoJavaParser parser = new DondeInviertoSinCodigoJavaParser( tokens );
		DondeInviertoSinCodigoJavaParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk( this.listener , tree);
	}
}
