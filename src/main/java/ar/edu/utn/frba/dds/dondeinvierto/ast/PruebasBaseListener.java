// Generated from DondeInviertoSinCodigoJava.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.ast;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaListener;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser;
import ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link DondeInviertoSinCodigoJavaListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class PruebasBaseListener implements DondeInviertoSinCodigoJavaListener {
	
	private double resultado;
	
	public double getResultado() {
		return resultado;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIdentificador(DondeInviertoSinCodigoJavaParser.IdentificadorContext ctx) { 
//		System.out.println("Enter Identificador: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdentificador(DondeInviertoSinCodigoJavaParser.IdentificadorContext ctx) {
//		System.out.println("Exit Identificador: " + ctx.getText());
//		resultado=Double.parseDouble(ctx.getText());
//		resultado=(double) ctx.expresion.exp;
		resultado=(double)ctx.exp.ejecutar();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMetodologia(DondeInviertoSinCodigoJavaParser.MetodologiaContext ctx) { 
//		System.out.println("Enter Metodologia: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMetodologia(DondeInviertoSinCodigoJavaParser.MetodologiaContext ctx) { 
//		System.out.println("Exit Metodologia: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTermino(DondeInviertoSinCodigoJavaParser.TerminoContext ctx) { 
//		System.out.println("Enter Termino: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTermino(DondeInviertoSinCodigoJavaParser.TerminoContext ctx) { 
//		System.out.println("Exit Termino: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(DondeInviertoSinCodigoJavaParser.FactorContext ctx) { 
//		System.out.println("Enter Factor: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(DondeInviertoSinCodigoJavaParser.FactorContext ctx) { 
//		System.out.println("Exit Factor: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCientifica(DondeInviertoSinCodigoJavaParser.CientificaContext ctx) { 
//		System.out.println("Enter Cientifica: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCientifica(DondeInviertoSinCodigoJavaParser.CientificaContext ctx) { 
//		System.out.println("Exit Cientifica: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelop(DondeInviertoSinCodigoJavaParser.RelopContext ctx) { 
//		System.out.println("Enter Relop: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelop(DondeInviertoSinCodigoJavaParser.RelopContext ctx) { 
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
	public void enterCientif(DondeInviertoSinCodigoJavaParser.CientifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCientif(DondeInviertoSinCodigoJavaParser.CientifContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNombreCuenta(DondeInviertoSinCodigoJavaParser.NombreCuentaContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNombreCuenta(DondeInviertoSinCodigoJavaParser.NombreCuentaContext ctx) {
		
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
	public void enterParentesis(DondeInviertoSinCodigoJavaParser.ParentesisContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParentesis(DondeInviertoSinCodigoJavaParser.ParentesisContext ctx) {
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
			ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser.ExpresionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpresion(
			ar.edu.utn.frba.dds.dondeinvierto.antlr.DondeInviertoSinCodigoJavaParser.ExpresionContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
}