package ar.edu.utn.frba.dds.donde_invierto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ar.edu.utn.frba.dds.dondeinvierto.Cuenta;
import ar.edu.utn.frba.dds.dondeinvierto.Indicador;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser;
import ar.edu.utn.frba.dds.dondeinvierto.ast.PruebasBaseListener;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("deprecation")
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}
	
	private double evaluarExpresion(String expresion, List<Operable> listaCuentas) {
		DondeInviertoSinCodigoJavaLexer lexer = new DondeInviertoSinCodigoJavaLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoSinCodigoJavaParser parser = new DondeInviertoSinCodigoJavaParser( tokens, listaCuentas);
		DondeInviertoSinCodigoJavaParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultado();
	}
	
	private double evaluarExpresion(String expresion) {
		DondeInviertoSinCodigoJavaLexer lexer = new DondeInviertoSinCodigoJavaLexer( new ANTLRInputStream(expresion));
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		DondeInviertoSinCodigoJavaParser parser = new DondeInviertoSinCodigoJavaParser( tokens );
		DondeInviertoSinCodigoJavaParser.IdentificadorContext tree = parser.identificador();
		ParseTreeWalker walker = new ParseTreeWalker();
		PruebasBaseListener listener = new PruebasBaseListener(); 
		walker.walk(listener , tree);
		return listener.getResultado();
	}
	
	/**
	 * Rigourous Test :-)
	 * @throws IOException 
	 */
	public void testFormatoNumerico() throws IOException
	{
//		Visitador vis = new Visitador();
//		vis.visit(tree);
		Assert.assertEquals(2.34, evaluarExpresion("2.34"), 0.000001);
		Assert.assertEquals(-2.04, evaluarExpresion("-2.04"), 0.000001);
		Assert.assertEquals(0.34, evaluarExpresion("0.34"), 0.000001);
		Assert.assertEquals(2.0, evaluarExpresion("2"), 0.000001);
		Assert.assertEquals(-2.0, evaluarExpresion("-2"), 0.000001);
	}
	public void testSuma() throws IOException
	{
		//TODO: Completar casuistica
		Assert.assertEquals(4.0, evaluarExpresion("1+3"), 0.000001);
		Assert.assertEquals(3.34, evaluarExpresion("0.34+3"), 0.000001);
		Assert.assertEquals(3.39, evaluarExpresion("3+0.39"), 0.000001);
		Assert.assertEquals(3.4, evaluarExpresion("0.34+3.06"), 0.000001);
		Assert.assertEquals(3.0, evaluarExpresion("-2+5"), 0.000001);
		Assert.assertEquals(-3.0, evaluarExpresion("2+-5"), 0.000001);
		Assert.assertEquals(-1.67, evaluarExpresion("0.33+-2"), 0.000001);
	}
	public void testResta() throws IOException
	{
		//TODO: Completar casuistica
		Assert.assertEquals(-2.0, evaluarExpresion("1 - 3"), 0.000001);
		Assert.assertEquals(-2.66, evaluarExpresion("0.34 - 3"), 0.000001);
		Assert.assertEquals(2.61, evaluarExpresion("3 - 0.39"), 0.000001);
		Assert.assertEquals(-2.72, evaluarExpresion("0.34 - 3.06"), 0.000001);
		Assert.assertEquals(-7.0, evaluarExpresion("-2 - 5"), 0.000001);
		Assert.assertEquals(7.0, evaluarExpresion("2 - -5"), 0.000001);
		Assert.assertEquals(2.33, evaluarExpresion("0.33 - -2"), 0.000001);
	}
	public void testMultiplicacion() throws IOException
	{
		//TODO: Completar casuistica
		Assert.assertEquals(3.0, evaluarExpresion("1 * 3"), 0.000001);
		Assert.assertEquals(1.02, evaluarExpresion("0.34 * 3"), 0.000001);
		Assert.assertEquals(1.17, evaluarExpresion("3 * 0.39"), 0.000001);
		Assert.assertEquals(1.0404, evaluarExpresion("0.34 * 3.06"), 0.000001);
		Assert.assertEquals(-10.0, evaluarExpresion("-2 * 5"), 0.000001);
		Assert.assertEquals(-10.0, evaluarExpresion("2 * -5"), 0.000001);
		Assert.assertEquals(-0.66, evaluarExpresion("0.33 * -2"), 0.000001);
	}
	public void testDivision() throws IOException
	{
		//TODO: Completar casuistica
		Assert.assertEquals(2.0, evaluarExpresion("6 / 3"), 0.000001);
		Assert.assertEquals(0.12, evaluarExpresion("0.36 / 3"), 0.000001);
		Assert.assertEquals(10.0, evaluarExpresion("3 / 0.3"), 0.000001);
		Assert.assertEquals(3.4, evaluarExpresion("0.34 / 0.1"), 0.000001);
		Assert.assertEquals(-0.4, evaluarExpresion("-2 / 5"), 0.000001);
		Assert.assertEquals(-0.4, evaluarExpresion("2 / -5"), 0.000001);
		Assert.assertEquals(-0.17, evaluarExpresion("0.34 / -2"), 0.000001);
	}
	public void testExpresionConCuenta() throws IOException
	{
		//TODO: Completar casuistica
		List<Operable> listaDeCuentas = new ArrayList<Operable>();
		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
		listaDeCuentas.add(cuenta);
		Assert.assertEquals(3.9, evaluarExpresion("1 + CU_valor3", listaDeCuentas), 0.000001);
		Assert.assertEquals(2.9, evaluarExpresion("1 * CU_valor3", listaDeCuentas), 0.000001);
		Assert.assertEquals(5.8, evaluarExpresion("1 * CU_valor3 + 2.9", listaDeCuentas), 0.000001);
		Assert.assertEquals(1.0, evaluarExpresion("1 * CU_valor3 / 2.9", listaDeCuentas), 0.000001);
	}
	public void testExpresionConIndicadores() throws IOException
	{
		//TODO: Completar casuistica
		List<Operable> listaDeIndicadores = new ArrayList<Operable>();
		Indicador indicador = new Indicador("IN_valor3", "2 + 2");
		listaDeIndicadores.add(indicador);
		Assert.assertEquals(5, evaluarExpresion("1 + IN_valor3", listaDeIndicadores), 0.000001);
		Assert.assertEquals(4, evaluarExpresion("1 * IN_valor3", listaDeIndicadores), 0.000001);
		Assert.assertEquals(6.9, evaluarExpresion("1 * IN_valor3 + 2.9", listaDeIndicadores), 0.000001);
	}
	public void testExpresionConIndicadoresYCuentas() throws IOException
	{
		//TODO: Completar casuistica
		List<Operable> listaDeIndicadoresYCuentas = new ArrayList<Operable>();
		Indicador indicador = new Indicador("IN_valor3", "2 + 2");
		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
		listaDeIndicadoresYCuentas.add(indicador);
		listaDeIndicadoresYCuentas.add(cuenta);
		Assert.assertEquals(2.1, evaluarExpresion("1 + IN_valor3 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
		Assert.assertEquals(1.1, evaluarExpresion("1 * IN_valor3 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
		Assert.assertEquals(4.0, evaluarExpresion("1 * IN_valor3 + 2.9 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
	}
}