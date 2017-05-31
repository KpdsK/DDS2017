// Generated from DondeInvierto.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DondeInviertoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOMBRE_IDENTIFICADOR=1, NOMBRE_CUENTA=2, LPAREN=3, RPAREN=4, SUMA=5, RESTA=6, 
		MULT=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, E=13, POTENCIA=14, LETTER=15, 
		DIGIT=16, WS=17;
	public static final int
		RULE_identificador = 0, RULE_metodologia = 1, RULE_expresion = 2, RULE_termino = 3, 
		RULE_factor = 4, RULE_atom = 5, RULE_cientifica = 6, RULE_relop = 7, RULE_number = 8;
	public static final String[] ruleNames = {
		"identificador", "metodologia", "expresion", "termino", "factor", "atom", 
		"cientifica", "relop", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
		"'='", "'.'", null, "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOMBRE_IDENTIFICADOR", "NOMBRE_CUENTA", "LPAREN", "RPAREN", "SUMA", 
		"RESTA", "MULT", "DIV", "GT", "LT", "EQ", "POINT", "E", "POTENCIA", "LETTER", 
		"DIGIT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DondeInvierto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DondeInviertoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdentificadorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodologiaContext extends ParserRuleContext {
		public NodoAST nodo;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public MetodologiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodologia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterMetodologia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitMetodologia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitMetodologia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodologiaContext metodologia() throws RecognitionException {
		MetodologiaContext _localctx = new MetodologiaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_metodologia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			expresion();
			setState(21);
			relop();
			setState(22);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public NodoAST nodo;
		public TerminoContext t1;
		public TerminoContext t2;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(DondeInviertoParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(DondeInviertoParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(DondeInviertoParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(DondeInviertoParser.RESTA, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((ExpresionContext)_localctx).t1 = termino();
			((ExpresionContext)_localctx).nodo =  ((ExpresionContext)_localctx).t1.nodo;
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUMA:
					{
					setState(26);
					match(SUMA);
					setState(27);
					((ExpresionContext)_localctx).t2 = termino();
					((ExpresionContext)_localctx).nodo =  new Suma(_localctx.nodo, ((ExpresionContext)_localctx).t2.nodo);
					}
					break;
				case RESTA:
					{
					setState(30);
					match(RESTA);
					setState(31);
					((ExpresionContext)_localctx).t2 = termino();
					((ExpresionContext)_localctx).nodo =  new Resta(_localctx.nodo, ((ExpresionContext)_localctx).t2.nodo);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public NodoAST nodo;
		public FactorContext f1;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DondeInviertoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(DondeInviertoParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DondeInviertoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DondeInviertoParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((TerminoContext)_localctx).f1 = factor();
			((TerminoContext)_localctx).nodo =  ((TerminoContext)_localctx).f1.nodo;
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(41);
					match(MULT);
					setState(42);
					((TerminoContext)_localctx).f2 = factor();
					((TerminoContext)_localctx).nodo =  new Multiplicacion(_localctx.nodo, ((TerminoContext)_localctx).f2.nodo);
					}
					break;
				case DIV:
					{
					setState(45);
					match(DIV);
					setState(46);
					((TerminoContext)_localctx).f2 = factor();
					((TerminoContext)_localctx).nodo =  new Division(_localctx.nodo, ((TerminoContext)_localctx).f2.nodo);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public NodoAST nodo;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(DondeInviertoParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(DondeInviertoParser.POTENCIA, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			atom();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENCIA) {
				{
				{
				setState(55);
				match(POTENCIA);
				setState(56);
				atom();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NodoAST nodo;
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
			this.nodo = ctx.nodo;
		}
	}
	public static class NombreCuentaContext extends AtomContext {
		public TerminalNode NOMBRE_CUENTA() { return getToken(DondeInviertoParser.NOMBRE_CUENTA, 0); }
		public NombreCuentaContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterNombreCuenta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitNombreCuenta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitNombreCuenta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CientifContext extends AtomContext {
		public CientificaContext cientifica() {
			return getRuleContext(CientificaContext.class,0);
		}
		public CientifContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterCientif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitCientif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitCientif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(DondeInviertoParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DondeInviertoParser.RPAREN, 0); }
		public ParentesisContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NombreIdentificadorContext extends AtomContext {
		public TerminalNode NOMBRE_IDENTIFICADOR() { return getToken(DondeInviertoParser.NOMBRE_IDENTIFICADOR, 0); }
		public NombreIdentificadorContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterNombreIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitNombreIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitNombreIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
			case DIGIT:
				_localctx = new CientifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				cientifica();
				}
				break;
			case NOMBRE_CUENTA:
				_localctx = new NombreCuentaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NOMBRE_CUENTA);
				}
				break;
			case NOMBRE_IDENTIFICADOR:
				_localctx = new NombreIdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(NOMBRE_IDENTIFICADOR);
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(LPAREN);
				setState(66);
				expresion();
				setState(67);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CientificaContext extends ParserRuleContext {
		public NodoAST nodo;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode E() { return getToken(DondeInviertoParser.E, 0); }
		public CientificaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cientifica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterCientifica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitCientifica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitCientifica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CientificaContext cientifica() throws RecognitionException {
		CientificaContext _localctx = new CientificaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cientifica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			number();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(72);
				match(E);
				setState(73);
				number();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public NodoAST nodo;
		public TerminalNode EQ() { return getToken(DondeInviertoParser.EQ, 0); }
		public TerminalNode GT() { return getToken(DondeInviertoParser.GT, 0); }
		public TerminalNode LT() { return getToken(DondeInviertoParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeroContext extends NumberContext {
		public TerminalNode RESTA() { return getToken(DondeInviertoParser.RESTA, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(DondeInviertoParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DondeInviertoParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(DondeInviertoParser.POINT, 0); }
		public NumeroContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoListener ) ((DondeInviertoListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoVisitor ) return ((DondeInviertoVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			_localctx = new NumeroContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTA) {
				{
				setState(78);
				match(RESTA);
				}
			}

			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(DIGIT);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(86);
				match(POINT);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					match(DIGIT);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4%\n\4\f\4\16\4"+
		"(\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5\f\5\16\5\67"+
		"\13\5\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7H\n\7\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\n\5\nR\n\n\3\n\6\nU\n\n\r\n\16"+
		"\nV\3\n\3\n\6\n[\n\n\r\n\16\n\\\5\n_\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\3\3\2\13\r\2d\2\24\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b)\3\2\2\2"+
		"\n8\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2\22Q\3\2\2\2\24\25\5\6\4"+
		"\2\25\3\3\2\2\2\26\27\5\6\4\2\27\30\5\20\t\2\30\31\5\6\4\2\31\5\3\2\2"+
		"\2\32\33\5\b\5\2\33&\b\4\1\2\34\35\7\7\2\2\35\36\5\b\5\2\36\37\b\4\1\2"+
		"\37%\3\2\2\2 !\7\b\2\2!\"\5\b\5\2\"#\b\4\1\2#%\3\2\2\2$\34\3\2\2\2$ \3"+
		"\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2)*\5\n\6\2"+
		"*\65\b\5\1\2+,\7\t\2\2,-\5\n\6\2-.\b\5\1\2.\64\3\2\2\2/\60\7\n\2\2\60"+
		"\61\5\n\6\2\61\62\b\5\1\2\62\64\3\2\2\2\63+\3\2\2\2\63/\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\67\65\3\2\2\28=\5\f"+
		"\7\29:\7\20\2\2:<\5\f\7\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13"+
		"\3\2\2\2?=\3\2\2\2@H\5\16\b\2AH\7\4\2\2BH\7\3\2\2CD\7\5\2\2DE\5\6\4\2"+
		"EF\7\6\2\2FH\3\2\2\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2H\r\3\2\2"+
		"\2IL\5\22\n\2JK\7\17\2\2KM\5\22\n\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NO"+
		"\t\2\2\2O\21\3\2\2\2PR\7\b\2\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7\22\2"+
		"\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W^\3\2\2\2XZ\7\16\2\2Y[\7\22"+
		"\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^X\3\2\2\2^_"+
		"\3\2\2\2_\23\3\2\2\2\r$&\63\65=GLQV\\^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}