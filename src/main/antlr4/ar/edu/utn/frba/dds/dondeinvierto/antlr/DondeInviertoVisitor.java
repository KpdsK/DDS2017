// Generated from DondeInvierto.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DondeInviertoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DondeInviertoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(DondeInviertoParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#metodologia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodologia(DondeInviertoParser.MetodologiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(DondeInviertoParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(DondeInviertoParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DondeInviertoParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCientif(DondeInviertoParser.CientifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreCuenta(DondeInviertoParser.NombreCuentaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NombreIdentificador}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreIdentificador(DondeInviertoParser.NombreIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(DondeInviertoParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#cientifica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCientifica(DondeInviertoParser.CientificaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(DondeInviertoParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link DondeInviertoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(DondeInviertoParser.NumeroContext ctx);
}