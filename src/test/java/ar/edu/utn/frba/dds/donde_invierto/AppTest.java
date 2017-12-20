package ar.edu.utn.frba.dds.donde_invierto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import ar.edu.utn.frba.dds.dondeinvierto.Cuenta;
import ar.edu.utn.frba.dds.dondeinvierto.Empresa;
import ar.edu.utn.frba.dds.dondeinvierto.ExpresionInvalidaException;
import ar.edu.utn.frba.dds.dondeinvierto.Indicador;
import ar.edu.utn.frba.dds.dondeinvierto.Metodologia;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import ar.edu.utn.frba.dds.dondeinvierto.Regla;
import ar.edu.utn.frba.dds.dondeinvierto.ReglaBooleana;
import ar.edu.utn.frba.dds.dondeinvierto.ReglaPorRatio;
import ar.edu.utn.frba.dds.dondeinvierto.ResultadoRegla;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoLexer;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;
import ar.edu.utn.frba.dds.dondeinvierto.ast.PruebasBaseListener;
import ar.edu.utn.frba.dds.dondeinvierto.jpa.ManejadorPersistencia;
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
	
//	private double evaluarExpresion(String expresion, List<Operable> listaCuentas) {
//		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
//		CommonTokenStream tokens = new CommonTokenStream( lexer );
//		DondeInviertoParser parser = new DondeInviertoParser( tokens, listaCuentas);
//		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
//		ParseTreeWalker walker = new ParseTreeWalker();
//		PruebasBaseListener listener = new PruebasBaseListener(); 
//		walker.walk(listener , tree);
//		return listener.getResultadoExpresion();
//	}
//	
//	private double evaluarExpresion(String expresion) {
//		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(expresion));
//		CommonTokenStream tokens = new CommonTokenStream( lexer );
//		DondeInviertoParser parser = new DondeInviertoParser( tokens );
//		DondeInviertoParser.IdentificadorContext tree = parser.identificador();
//		ParseTreeWalker walker = new ParseTreeWalker();
//		PruebasBaseListener listener = new PruebasBaseListener(); 
//		walker.walk(listener , tree);
//		return listener.getResultadoExpresion();
//	}
//	
//	private boolean evaluarCondicion(String condicion, List<Operable> listaCuentas) {
//		DondeInviertoLexer lexer = new DondeInviertoLexer( new ANTLRInputStream(condicion));
//		CommonTokenStream tokens = new CommonTokenStream( lexer );
//		DondeInviertoParser parser = new DondeInviertoParser( tokens, listaCuentas);
//		DondeInviertoParser.CondicionContext tree = parser.condicion();
//		ParseTreeWalker walker = new ParseTreeWalker();
//		PruebasBaseListener listener = new PruebasBaseListener(); 
//		walker.walk(listener , tree);
//		return listener.getResultadoCondicion();
//	}
//	
//	/**
//	 * Rigourous Test :-)
//	 * @throws IOException 
//	 */
//	public void testFormatoNumerico() throws IOException
//	{
////		Visitador vis = new Visitador();
////		vis.visit(tree);
//		Assert.assertEquals(2.34, evaluarExpresion("2.34"), 0.000001);
//		Assert.assertEquals(-2.04, evaluarExpresion("-2.04"), 0.000001);
//		Assert.assertEquals(0.34, evaluarExpresion("0.34"), 0.000001);
//		Assert.assertEquals(2.0, evaluarExpresion("2"), 0.000001);
//		Assert.assertEquals(-2.0, evaluarExpresion("-2"), 0.000001);
//	}
//	public void testSuma() throws IOException
//	{
//		//TODO: Completar casuistica
//		Assert.assertEquals(4.0, evaluarExpresion("1+3"), 0.000001);
//		Assert.assertEquals(3.34, evaluarExpresion("0.34+3"), 0.000001);
//		Assert.assertEquals(3.39, evaluarExpresion("3+0.39"), 0.000001);
//		Assert.assertEquals(3.4, evaluarExpresion("0.34+3.06"), 0.000001);
//		Assert.assertEquals(3.0, evaluarExpresion("-2+5"), 0.000001);
//		Assert.assertEquals(-3.0, evaluarExpresion("2+-5"), 0.000001);
//		Assert.assertEquals(-1.67, evaluarExpresion("0.33+-2"), 0.000001);
//	}
//	public void testResta() throws IOException
//	{
//		//TODO: Completar casuistica
//		Assert.assertEquals(-2.0, evaluarExpresion("1 - 3"), 0.000001);
//		Assert.assertEquals(-2.66, evaluarExpresion("0.34 - 3"), 0.000001);
//		Assert.assertEquals(2.61, evaluarExpresion("3 - 0.39"), 0.000001);
//		Assert.assertEquals(-2.72, evaluarExpresion("0.34 - 3.06"), 0.000001);
//		Assert.assertEquals(-7.0, evaluarExpresion("-2 - 5"), 0.000001);
//		Assert.assertEquals(7.0, evaluarExpresion("2 - -5"), 0.000001);
//		Assert.assertEquals(2.33, evaluarExpresion("0.33 - -2"), 0.000001);
//	}
//	public void testMultiplicacion() throws IOException
//	{
//		//TODO: Completar casuistica
//		Assert.assertEquals(3.0, evaluarExpresion("1 * 3"), 0.000001);
//		Assert.assertEquals(1.02, evaluarExpresion("0.34 * 3"), 0.000001);
//		Assert.assertEquals(1.17, evaluarExpresion("3 * 0.39"), 0.000001);
//		Assert.assertEquals(1.0404, evaluarExpresion("0.34 * 3.06"), 0.000001);
//		Assert.assertEquals(-10.0, evaluarExpresion("-2 * 5"), 0.000001);
//		Assert.assertEquals(-10.0, evaluarExpresion("2 * -5"), 0.000001);
//		Assert.assertEquals(-0.66, evaluarExpresion("0.33 * -2"), 0.000001);
//	}
//	public void testDivision() throws IOException
//	{
//		//TODO: Completar casuistica
//		Assert.assertEquals(2.0, evaluarExpresion("6 / 3"), 0.000001);
//		Assert.assertEquals(0.12, evaluarExpresion("0.36 / 3"), 0.000001);
//		Assert.assertEquals(10.0, evaluarExpresion("3 / 0.3"), 0.000001);
//		Assert.assertEquals(3.4, evaluarExpresion("0.34 / 0.1"), 0.000001);
//		Assert.assertEquals(-0.4, evaluarExpresion("-2 / 5"), 0.000001);
//		Assert.assertEquals(-0.4, evaluarExpresion("2 / -5"), 0.000001);
//		Assert.assertEquals(-0.17, evaluarExpresion("0.34 / -2"), 0.000001);
//	}
//	public void testExpresionConCuenta() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Operable> listaDeCuentas = new ArrayList<Operable>();
//		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
//		listaDeCuentas.add(cuenta);
//		Assert.assertEquals(3.9, evaluarExpresion("1 + CU_valor3", listaDeCuentas), 0.000001);
//		Assert.assertEquals(2.9, evaluarExpresion("1 * CU_valor3", listaDeCuentas), 0.000001);
//		Assert.assertEquals(5.8, evaluarExpresion("1 * CU_valor3 + 2.9", listaDeCuentas), 0.000001);
//		Assert.assertEquals(1.0, evaluarExpresion("1 * CU_valor3 / 2.9", listaDeCuentas), 0.000001);
//	}
//	public void testExpresionConIndicadores() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Operable> listaDeIndicadores = new ArrayList<Operable>();
//		Indicador indicador = new Indicador("IN_valor3", "2 + 2");
//		listaDeIndicadores.add(indicador);
//		Assert.assertEquals(5, evaluarExpresion("1 + IN_valor3", listaDeIndicadores), 0.000001);
//		Assert.assertEquals(4, evaluarExpresion("1 * IN_valor3", listaDeIndicadores), 0.000001);
//		Assert.assertEquals(6.9, evaluarExpresion("1 * IN_valor3 + 2.9", listaDeIndicadores), 0.000001);
//	}
//	public void testExpresionConIndicadoresYCuentas() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Operable> listaDeIndicadoresYCuentas = new ArrayList<Operable>();
//		Indicador indicador = new Indicador("IN_valor3", "2 + 2");
//		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
//		listaDeIndicadoresYCuentas.add(indicador);
//		listaDeIndicadoresYCuentas.add(cuenta);
//		Assert.assertEquals(2.1, evaluarExpresion("1 + IN_valor3 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
//		Assert.assertEquals(1.1, evaluarExpresion("1 * IN_valor3 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
//		Assert.assertEquals(4.0, evaluarExpresion("1 * IN_valor3 + 2.9 - CU_valor3", listaDeIndicadoresYCuentas), 0.000001);
//	}
//	public void testExpresionDeMetodologiaConOperadorIgualdad() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Operable> listaDeIndicadoresYCuentas = new ArrayList<Operable>();
//		Indicador indicador = new Indicador("IN_valor3", "2 + 2");
//		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
//		listaDeIndicadoresYCuentas.add(indicador);
//		listaDeIndicadoresYCuentas.add(cuenta);
//		Assert.assertFalse(evaluarCondicion("1 + IN_valor3 = CU_valor3", listaDeIndicadoresYCuentas));
//		Assert.assertTrue(evaluarCondicion("1 * IN_valor3 >= CU_valor3", listaDeIndicadoresYCuentas));
//		Assert.assertTrue(evaluarCondicion("1 * IN_valor3 = 1.1 +  CU_valor3", listaDeIndicadoresYCuentas));
//	}
//	
//	public void testExpresionDeMetodologiaIndicadorConCuenta() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Operable> listaDeIndicadoresYCuentas = new ArrayList<Operable>();
//		Cuenta cuenta = new Cuenta("CU_valor3", 2.9);
//		Indicador indicador = new Indicador("IN_valor3", "CU_valor3 + 2");
//		listaDeIndicadoresYCuentas.add(indicador);
//		listaDeIndicadoresYCuentas.add(cuenta);
//		Assert.assertFalse(evaluarCondicion("1 + IN_valor3 = CU_valor3", listaDeIndicadoresYCuentas));
//		Assert.assertTrue(evaluarCondicion("1 * IN_valor3 >= CU_valor3", listaDeIndicadoresYCuentas));
//		Assert.assertTrue(evaluarCondicion("1 * IN_valor3 = 2 +  CU_valor3", listaDeIndicadoresYCuentas));
//	}
	
//	public void testPersistenciaIndicador() throws ExpresionInvalidaException
//	{
//		ar.edu.utn.frba.dds.dondeinvierto.jpa.Indicador indicador = new ar.edu.utn.frba.dds.dondeinvierto.jpa.Indicador();
//	
//		indicador.setExpresion("3 + 5").setNombre("PruebaTest");
//		ManejadorPersistencia.persistir(indicador);
//	}
	
//	public void testPersistenciaCuenta()
//	{
//		ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta cuenta = new ar.edu.utn.frba.dds.dondeinvierto.jpa.Cuenta();
//	
//		cuenta.setNombre("cuenta")
//		.setValor(3.01);
//		ManejadorPersistencia.persistir(cuenta);
//	}
//	
//	public void testPersistenciaEmpresa()
//	{
//		ar.edu.utn.frba.dds.dondeinvierto.jpa.Empresa empresa = new ar.edu.utn.frba.dds.dondeinvierto.jpa.Empresa();
//	
//		empresa.setNombre("Empresa");
//		ManejadorPersistencia.persistir(empresa);
//	}
	public void testPersistenciaMetodologia() throws ExpresionInvalidaException
	{
		ar.edu.utn.frba.dds.dondeinvierto.jpa.Metodologia metodologia = new ar.edu.utn.frba.dds.dondeinvierto.jpa.Metodologia();
	
		List<ar.edu.utn.frba.dds.dondeinvierto.jpa.Regla> listaReglas = new ArrayList<>();
		listaReglas.add(new ar.edu.utn.frba.dds.dondeinvierto.jpa.ReglaBooleana("jklasdh",9));
		listaReglas.add(new ar.edu.utn.frba.dds.dondeinvierto.jpa.ReglaPorRatio("Ratio",2));
		metodologia.setNombre("MetodologiaPrueba").setReglas(listaReglas);
		ManejadorPersistencia.persistir(metodologia);
	}
//	public void testMetodologiaConReglaBooleanaCumplida() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 2", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==1);
//		Assert.assertEquals(0.0, (new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getRatio(), 0.000001);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getEmpresa().equals(empresa));
//	}
//	public void testMetodologiaConReglaBooleanaNoCumplida() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 22", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==0);
//	}
//	public void testMetodologiaConReglasBooleanasCumplidas() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(
//				new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 2", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))),
//				new ReglaBooleana("1 + IN_valor3 > 1", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2")))
//				);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==1);
//		Assert.assertEquals(0.0, (new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getRatio(), 0.000001);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getEmpresa().equals(empresa));
//	}
//	public void testMetodologiaConReglasBooleanasParcialmenteCumplidas() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(
//				new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 2", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))),
//				new ReglaBooleana("1 + IN_valor3 > 12", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2")))
//				);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==0);
//	}
//	public void testMetodologiaConReglaBooleanaCumplidaPara2Balances() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 2", 1, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==1);
//		Assert.assertEquals(0.0, (new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getRatio(), 0.000001);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getEmpresa().equals(empresa));
//	}
//	public void testMetodologiaConReglaBooleanaNoCumplidaPara2Balances() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaBooleana("1 + IN_valor3 - CU_valor3 < 2.3", 1, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==0);
//	}
//	public void testMetodologiaConReglaPorRatioCumplida() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaPorRatio("1 + IN_valor3 - CU_valor3", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().size()==1);
//		Assert.assertEquals(2.1, (new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getRatio(), 0.000001);
//		Assert.assertTrue((new Metodologia(Arrays.asList(empresa), "M1", reglas)).ejecutar().get(0).getEmpresa().equals(empresa));
//	}
//	public void testMetodologiaConReglaPorRatioNoCumplida() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		Empresa empresa2 = new Empresa(Arrays.asList(new Cuenta("CU_valor3", 1.9, 2017), new Cuenta("CU_valor3", 1, 2016))
//				, "empresa2", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaPorRatio("1 + IN_valor3 - CU_valor3", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		List<ResultadoRegla> resultado =(new Metodologia(Arrays.asList(empresa, empresa2), "M1", reglas)).ejecutar();
//		Assert.assertTrue(resultado.size()==2);
//		Assert.assertEquals(3.1, resultado.get(0).getRatio(), 0.000001);
//		Assert.assertEquals(2.1, resultado.get(1).getRatio(), 0.000001);
//		Assert.assertTrue(resultado.get(0).getEmpresa().equals(empresa2));
//	}
//	public void testMetodologiaConReglaPorRatioYBooleanaCumplida() throws IOException
//	{
//		//TODO: Completar casuistica
//		List<Cuenta> cuentas= Arrays.asList(new Cuenta("CU_valor3", 2.9, 2017), new Cuenta("CU_valor3", 1, 2016));
//		Empresa empresa = new Empresa(cuentas, "empresa1", 2);
//		Empresa empresa2 = new Empresa(Arrays.asList(new Cuenta("CU_valor3", 3.9, 2017), new Cuenta("CU_valor3", 1, 2016))
//				, "empresa2", 2);
//		List<Regla> reglas = Arrays.asList(new ReglaBooleana("1 + IN_valor3 - CU_valor3 > 2", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))),
//				new ReglaPorRatio("1 + IN_valor3 - CU_valor3", 0, Arrays.asList(new Indicador("IN_valor3", "2 + 2"))));
//		List<ResultadoRegla> resultado =(new Metodologia(Arrays.asList(empresa, empresa2), "M1", reglas)).ejecutar();
//		
//		Assert.assertTrue(resultado.size()==1);
//		Assert.assertEquals(2.1, resultado.get(0).getRatio(), 0.000001);
//		Assert.assertTrue(resultado.get(0).getEmpresa().equals(empresa));
//	}
}