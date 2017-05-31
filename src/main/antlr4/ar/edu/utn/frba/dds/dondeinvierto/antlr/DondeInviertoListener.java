// Generated from DondeInvierto.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DondeInviertoParser}.
 */
public interface DondeInviertoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(DondeInviertoParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(DondeInviertoParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#metodologia}.
	 * @param ctx the parse tree
	 */
	void enterMetodologia(DondeInviertoParser.MetodologiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#metodologia}.
	 * @param ctx the parse tree
	 */
	void exitMetodologia(DondeInviertoParser.MetodologiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(DondeInviertoParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(DondeInviertoParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(DondeInviertoParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(DondeInviertoParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DondeInviertoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DondeInviertoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCientif(DondeInviertoParser.CientifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCientif(DondeInviertoParser.CientifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNombreCuenta(DondeInviertoParser.NombreCuentaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNombreCuenta(DondeInviertoParser.NombreCuentaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NombreIdentificador}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNombreIdentificador(DondeInviertoParser.NombreIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NombreIdentificador}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNombreIdentificador(DondeInviertoParser.NombreIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(DondeInviertoParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(DondeInviertoParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#cientifica}.
	 * @param ctx the parse tree
	 */
	void enterCientifica(DondeInviertoParser.CientificaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#cientifica}.
	 * @param ctx the parse tree
	 */
	void exitCientifica(DondeInviertoParser.CientificaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(DondeInviertoParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(DondeInviertoParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link DondeInviertoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumero(DondeInviertoParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link DondeInviertoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumero(DondeInviertoParser.NumeroContext ctx);
}