package ar.edu.utn.frba.dds.dondeinvierto;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;
import ar.edu.utn.frba.dds.dondeinvierto.ast.PruebasBaseListener;

public class Evaluador {

	//List<Operable> listaDeOperables = new ArrayList<Operable>();
//	String expresion;
//	
//	public Evaluador(List<Operable> listaDeOperables, String expresion) {
//		super();
//		this.listaDeOperables = listaDeOperables;
//		this.expresion = expresion;
//	}
	
	public static double evaluarExpresion(String expresion, List<Operable> listaCuentas) {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, listaCuentas);
		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultadoExpresion();
	}
	
	public static double evaluarExpresion(String expresion) {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens );
		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultadoExpresion();
	}
	
	public static boolean evaluarCondicion(String condicion, List<Operable> listaCuentas) {
		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(condicion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoParser parser = new DondeInviertoParser( tokens, listaCuentas);
		DondeInviertoParser.CondicionContext tree = parser.condicion();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultadoCondicion();
	}
}
