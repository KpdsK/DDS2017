// Generated from DondeInviertoSinCodigoJava.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DondeInviertoSinCodigoJavaParser}.
 */
public interface DondeInviertoSinCodigoJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#metodologia}.
	 * @param ctx the parse tree
	 */
	void enterMetodologia(DondeInviertoSinCodigoJavaParser.MetodologiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#metodologia}.
	 * @param ctx the parse tree
	 */
	void exitMetodologia(DondeInviertoSinCodigoJavaParser.MetodologiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(DondeInviertoSinCodigoJavaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(DondeInviertoSinCodigoJavaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSuma(DondeInviertoSinCodigoJavaParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSuma(DondeInviertoSinCodigoJavaParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterResta(DondeInviertoSinCodigoJavaParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitResta(DondeInviertoSinCodigoJavaParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(DondeInviertoSinCodigoJavaParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(DondeInviertoSinCodigoJavaParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DondeInviertoSinCodigoJavaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DondeInviertoSinCodigoJavaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCientif(DondeInviertoSinCodigoJavaParser.CientifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cientif}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCientif(DondeInviertoSinCodigoJavaParser.CientifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNombreCuenta(DondeInviertoSinCodigoJavaParser.NombreCuentaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NombreCuenta}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNombreCuenta(DondeInviertoSinCodigoJavaParser.NombreCuentaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NombreIdentificacion}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNombreIdentificacion(DondeInviertoSinCodigoJavaParser.NombreIdentificacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NombreIdentificacion}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNombreIdentificacion(DondeInviertoSinCodigoJavaParser.NombreIdentificacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(DondeInviertoSinCodigoJavaParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link DondeInviertoSinCodigoJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(DondeInviertoSinCodigoJavaParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#cientifica}.
	 * @param ctx the parse tree
	 */
	void enterCientifica(DondeInviertoSinCodigoJavaParser.CientificaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#cientifica}.
	 * @param ctx the parse tree
	 */
	void exitCientifica(DondeInviertoSinCodigoJavaParser.CientificaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(DondeInviertoSinCodigoJavaParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(DondeInviertoSinCodigoJavaParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DondeInviertoSinCodigoJavaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DondeInviertoSinCodigoJavaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DondeInviertoSinCodigoJavaParser.NumberContext ctx);
}