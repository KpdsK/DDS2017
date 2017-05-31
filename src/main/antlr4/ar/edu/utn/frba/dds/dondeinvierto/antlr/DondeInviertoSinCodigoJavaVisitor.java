// Generated from DondeInviertoSinCodigoJava.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DondeInviertoSinCodigoJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DondeInviertoSinCodigoJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#metodologia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodologia(DondeInviertoSinCodigoJavaParser.MetodologiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(DondeInviertoSinCodigoJavaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(DondeInviertoSinCodigoJavaParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(DondeInviertoSinCodigoJavaParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(DondeInviertoSinCodigoJavaParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DondeInviertoSinCodigoJavaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCientif(DondeInviertoSinCodigoJavaParser.CientifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreCuenta(DondeInviertoSinCodigoJavaParser.NombreCuentaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NombreIdentificacion}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreIdentificacion(DondeInviertoSinCodigoJavaParser.NombreIdentificacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(DondeInviertoSinCodigoJavaParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#cientifica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCientifica(DondeInviertoSinCodigoJavaParser.CientificaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(DondeInviertoSinCodigoJavaParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DondeInviertoSinCodigoJavaParser.NumberContext ctx);
}