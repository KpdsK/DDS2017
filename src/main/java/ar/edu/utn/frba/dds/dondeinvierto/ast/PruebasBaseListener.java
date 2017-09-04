// Generated from DondeInvierto.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.ast;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoListener;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link DondeInviertoSinCodigoJavaListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class PruebasBaseListener implements DondeInviertoListener {
	
	private double resultadoExpresion;
	private boolean resultadoCondicion;
	
	public double getResultadoExpresion() {
		return resultadoExpresion;
	}
	
	public boolean getResultadoCondicion() {
		return resultadoCondicion;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIdentificador(DondeInviertoParser.IdentificadorContext ctx) { 
//		System.out.println("Enter Identificador: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdentificador(DondeInviertoParser.IdentificadorContext ctx) {
//		System.out.println("Exit Identificador: " + ctx.getText());
//		resultado=Double.parseDouble(ctx.getText());
//		resultado=(double) ctx.expresion.exp;
		resultadoExpresion=(double)ctx.exp.ejecutar();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondicion(DondeInviertoParser.CondicionContext ctx) { 
//		System.out.println("Enter Metodologia: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondicion(DondeInviertoParser.CondicionContext ctx) { 
//		System.out.println("Exit Metodologia: " + ctx.getText());
		resultadoCondicion=(boolean)ctx.exp.ejecutar();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTermino(DondeInviertoParser.TerminoContext ctx) { 
//		System.out.println("Enter Termino: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTermino(DondeInviertoParser.TerminoContext ctx) { 
//		System.out.println("Exit Termino: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(DondeInviertoParser.FactorContext ctx) { 
//		System.out.println("Enter Factor: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(DondeInviertoParser.FactorContext ctx) { 
//		System.out.println("Exit Factor: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCientifica(DondeInviertoParser.CientificaContext ctx) { 
//		System.out.println("Enter Cientifica: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCientifica(DondeInviertoParser.CientificaContext ctx) { 
//		System.out.println("Exit Cientifica: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelop(DondeInviertoParser.RelopContext ctx) { 
//		System.out.println("Enter Relop: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelop(DondeInviertoParser.RelopContext ctx) { 
//		System.out.println("Exit Relop: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { 
//		System.out.println("Enter Every Rule: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { 
//		System.out.println("Exit Every Rule: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { 
//		System.out.println("Visit Terminal: " + node.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

//	@Override
//	public void enterSuma(SumaContext ctx) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void exitSuma(SumaContext ctx) {
//	}
//
//	@Override
//	public void enterResta(RestaContext ctx) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void exitResta(RestaContext ctx) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void enterCientif(DondeInviertoParser.CientifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCientif(DondeInviertoParser.CientifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNombreCuenta(DondeInviertoParser.NombreCuentaContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNombreCuenta(DondeInviertoParser.NombreCuentaContext ctx) {
		
	}

	@Override
	public void enterNombreIdentificacion(NombreIdentificacionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNombreIdentificacion(NombreIdentificacionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParentesis(DondeInviertoParser.ParentesisContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParentesis(DondeInviertoParser.ParentesisContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNumber(NumberContext ctx) {
		System.out.println("Enter Numero: " + ctx.getText());
		
	}

	@Override
	public void exitNumber(NumberContext ctx) {
		System.out.println("Exit Numero: " + ctx.getText());
		
	}

	@Override
	public void enterExpresion(
			ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser.ExpresionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpresion(
			ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoParser.ExpresionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOperacionBooleana(OperacionBooleanaContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOperacionBooleana(OperacionBooleanaContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
}