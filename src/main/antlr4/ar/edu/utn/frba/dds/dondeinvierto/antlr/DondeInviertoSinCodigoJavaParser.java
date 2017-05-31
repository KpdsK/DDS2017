// Generated from DondeInviertoSinCodigoJava.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;

import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DondeInviertoSinCodigoJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOMBRE_INDICADOR=1, NOMBRE_CUENTA=2, LPAREN=3, RPAREN=4, SUMA=5, RESTA=6, 
		MULT=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, E=13, POTENCIA=14, LETTER=15, 
		NUMERO=16, DIGITO=17, WS=18;
	public static final int
		RULE_metodologia = 0, RULE_identificador = 1, RULE_expresion = 2, RULE_termino = 3, 
		RULE_factor = 4, RULE_atom = 5, RULE_cientifica = 6, RULE_relop = 7, RULE_number = 8;
	public static final String[] ruleNames = {
		"metodologia", "identificador", "expresion", "termino", "factor", "atom", 
		"cientifica", "relop", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
		"'='", "'.'", null, "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOMBRE_INDICADOR", "NOMBRE_CUENTA", "LPAREN", "RPAREN", "SUMA", 
		"RESTA", "MULT", "DIV", "GT", "LT", "EQ", "POINT", "E", "POTENCIA", "LETTER", 
		"NUMERO", "DIGITO", "WS"
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
	public String getGrammarFileName() { return "DondeInviertoSinCodigoJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  List<Operable> lista = new ArrayList<Operable>();
	  public DondeInviertoSinCodigoJavaParser(TokenStream input, List<Operable> listaOperable) {
			super(input);
			_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
			lista=listaOperable;
	  }
	  
	  public double obtenerValor(String nombre, List<Operable> lOperables) {
		return lOperables.stream().filter(operable -> nombre.equalsIgnoreCase(operable.getNombre())).findFirst().get().operar(lOperables);
	  }

	public DondeInviertoSinCodigoJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MetodologiaContext extends ParserRuleContext {
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
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterMetodologia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitMetodologia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitMetodologia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodologiaContext metodologia() throws RecognitionException {
		MetodologiaContext _localctx = new MetodologiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_metodologia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			expresion();
			setState(19);
			relop();
			setState(20);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Object valor;
		public ExpresionContext expresion;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((IdentificadorContext)_localctx).expresion = expresion();
			((IdentificadorContext)_localctx).valor = (double)((IdentificadorContext)_localctx).expresion.valor; System.out.println(_localctx.valor);
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
		public Object valor;
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
			this.valor = ctx.valor;
		}
	}
	public static class SumaContext extends ExpresionContext {
		public TerminoContext t1;
		public TerminoContext t2;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(DondeInviertoSinCodigoJavaParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(DondeInviertoSinCodigoJavaParser.SUMA, i);
		}
		public SumaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestaContext extends ExpresionContext {
		public TerminoContext t1;
		public TerminoContext t2;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> RESTA() { return getTokens(DondeInviertoSinCodigoJavaParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(DondeInviertoSinCodigoJavaParser.RESTA, i);
		}
		public RestaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expresion);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SumaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((SumaContext)_localctx).t1 = termino();
				((SumaContext)_localctx).valor = (double)((SumaContext)_localctx).t1.valor;
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUMA) {
					{
					{
					setState(27);
					match(SUMA);
					setState(28);
					((SumaContext)_localctx).t2 = termino();
					((SumaContext)_localctx).valor = (double)_localctx.valor+(double)((SumaContext)_localctx).t2.valor;
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new RestaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((RestaContext)_localctx).t1 = termino();
				((RestaContext)_localctx).valor = (double)((RestaContext)_localctx).t1.valor;
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RESTA) {
					{
					{
					setState(38);
					match(RESTA);
					setState(39);
					((RestaContext)_localctx).t2 = termino();
					((RestaContext)_localctx).valor = (double)_localctx.valor-(double)((RestaContext)_localctx).t2.valor;
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
		public Object valor;
		public FactorContext f1;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DondeInviertoSinCodigoJavaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(DondeInviertoSinCodigoJavaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DondeInviertoSinCodigoJavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DondeInviertoSinCodigoJavaParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termino);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((TerminoContext)_localctx).f1 = factor();
				((TerminoContext)_localctx).valor = (double)((TerminoContext)_localctx).f1.valor;
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT) {
					{
					{
					setState(51);
					match(MULT);
					setState(52);
					((TerminoContext)_localctx).f2 = factor();
					((TerminoContext)_localctx).valor = (double)_localctx.valor*(double)((TerminoContext)_localctx).f2.valor;
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((TerminoContext)_localctx).f1 = factor();
				((TerminoContext)_localctx).valor = (double)((TerminoContext)_localctx).f1.valor;
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(62);
					match(DIV);
					setState(63);
					((TerminoContext)_localctx).f2 = factor();
					((TerminoContext)_localctx).valor = (double)_localctx.valor / (double)((TerminoContext)_localctx).f2.valor;
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
		public Object valor;
		public AtomContext a1;
		public AtomContext a2;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(DondeInviertoSinCodigoJavaParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(DondeInviertoSinCodigoJavaParser.POTENCIA, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitFactor(this);
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
			setState(73);
			((FactorContext)_localctx).a1 = atom();
			((FactorContext)_localctx).valor = (double)((FactorContext)_localctx).a1.valor;
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENCIA) {
				{
				{
				setState(75);
				match(POTENCIA);
				setState(76);
				((FactorContext)_localctx).a2 = atom();
				((FactorContext)_localctx).valor = (double)_localctx.valor+(double)((FactorContext)_localctx).a2.valor;
				}
				}
				setState(83);
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
		public Object valor;
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
			this.valor = ctx.valor;
		}
	}
	public static class NombreCuentaContext extends AtomContext {
		public Token NOMBRE_CUENTA;
		public TerminalNode NOMBRE_CUENTA() { return getToken(DondeInviertoSinCodigoJavaParser.NOMBRE_CUENTA, 0); }
		public NombreCuentaContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterNombreCuenta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitNombreCuenta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitNombreCuenta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CientifContext extends AtomContext {
		public CientificaContext cientifica;
		public CientificaContext cientifica() {
			return getRuleContext(CientificaContext.class,0);
		}
		public CientifContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterCientif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitCientif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitCientif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisContext extends AtomContext {
		public ExpresionContext expresion;
		public TerminalNode LPAREN() { return getToken(DondeInviertoSinCodigoJavaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DondeInviertoSinCodigoJavaParser.RPAREN, 0); }
		public ParentesisContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NombreIdentificacionContext extends AtomContext {
		public Token NOMBRE_INDICADOR;
		public TerminalNode NOMBRE_INDICADOR() { return getToken(DondeInviertoSinCodigoJavaParser.NOMBRE_INDICADOR, 0); }
		public NombreIdentificacionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterNombreIdentificacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitNombreIdentificacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitNombreIdentificacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				_localctx = new CientifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((CientifContext)_localctx).cientifica = cientifica();
				((CientifContext)_localctx).valor = (double)((CientifContext)_localctx).cientifica.valor;
				}
				break;
			case NOMBRE_CUENTA:
				_localctx = new NombreCuentaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((NombreCuentaContext)_localctx).NOMBRE_CUENTA = match(NOMBRE_CUENTA);
				((NombreCuentaContext)_localctx).valor =  this.obtenerValor(((NombreCuentaContext)_localctx).NOMBRE_CUENTA.getText(), lista);
				}
				break;
			case NOMBRE_INDICADOR:
				_localctx = new NombreIdentificacionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((NombreIdentificacionContext)_localctx).NOMBRE_INDICADOR = match(NOMBRE_INDICADOR);
				((NombreIdentificacionContext)_localctx).valor = obtenerValor(((NombreIdentificacionContext)_localctx).NOMBRE_INDICADOR.getText(), lista);
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(LPAREN);
				setState(92);
				((ParentesisContext)_localctx).expresion = expresion();
				setState(93);
				match(RPAREN);
				((ParentesisContext)_localctx).valor = (double)((ParentesisContext)_localctx).expresion.valor;
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
		public Object valor;
		public NumberContext n1;
		public NumberContext n2;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode E() { return getToken(DondeInviertoSinCodigoJavaParser.E, 0); }
		public CientificaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cientifica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterCientifica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitCientifica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitCientifica(this);
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
			setState(98);
			((CientificaContext)_localctx).n1 = number();
			((CientificaContext)_localctx).valor = (double)((CientificaContext)_localctx).n1.valor;
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(100);
				match(E);
				setState(101);
				((CientificaContext)_localctx).n2 = number();
				((CientificaContext)_localctx).valor = (double)_localctx.valor * Math.pow(10,(double)((CientificaContext)_localctx).n2.valor);
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
		public TerminalNode EQ() { return getToken(DondeInviertoSinCodigoJavaParser.EQ, 0); }
		public TerminalNode GT() { return getToken(DondeInviertoSinCodigoJavaParser.GT, 0); }
		public TerminalNode LT() { return getToken(DondeInviertoSinCodigoJavaParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitRelop(this);
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
			setState(106);
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
		public Object valor;
		public Token NUMERO;
		public TerminalNode NUMERO() { return getToken(DondeInviertoSinCodigoJavaParser.NUMERO, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DondeInviertoSinCodigoJavaListener ) ((DondeInviertoSinCodigoJavaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DondeInviertoSinCodigoJavaVisitor ) return ((DondeInviertoSinCodigoJavaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((NumberContext)_localctx).NUMERO = match(NUMERO);
			((NumberContext)_localctx).valor =  Double.parseDouble(((NumberContext)_localctx).NUMERO.getText());
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\5\4\62\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5E\n\5"+
		"\f\5\16\5H\13\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\3\3\2\13\r\2s\2\24\3\2\2\2\4\30\3\2\2\2\6\61\3\2\2\2\bI\3\2\2"+
		"\2\nK\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20l\3\2\2\2\22n\3\2\2\2\24\25\5\6"+
		"\4\2\25\26\5\20\t\2\26\27\5\6\4\2\27\3\3\2\2\2\30\31\5\6\4\2\31\32\b\3"+
		"\1\2\32\5\3\2\2\2\33\34\5\b\5\2\34#\b\4\1\2\35\36\7\7\2\2\36\37\5\b\5"+
		"\2\37 \b\4\1\2 \"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$"+
		"\62\3\2\2\2%#\3\2\2\2&\'\5\b\5\2\'.\b\4\1\2()\7\b\2\2)*\5\b\5\2*+\b\4"+
		"\1\2+-\3\2\2\2,(\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\61\33\3\2\2\2\61&\3\2\2\2\62\7\3\2\2\2\63\64\5\n\6\2\64;\b\5"+
		"\1\2\65\66\7\t\2\2\66\67\5\n\6\2\678\b\5\1\28:\3\2\2\29\65\3\2\2\2:=\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<J\3\2\2\2=;\3\2\2\2>?\5\n\6\2?F\b\5\1\2@A\7"+
		"\n\2\2AB\5\n\6\2BC\b\5\1\2CE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2GJ\3\2\2\2HF\3\2\2\2I\63\3\2\2\2I>\3\2\2\2J\t\3\2\2\2KL\5\f\7\2"+
		"LS\b\6\1\2MN\7\20\2\2NO\5\f\7\2OP\b\6\1\2PR\3\2\2\2QM\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2US\3\2\2\2VW\5\16\b\2WX\b\7\1\2Xc\3"+
		"\2\2\2YZ\7\4\2\2Zc\b\7\1\2[\\\7\3\2\2\\c\b\7\1\2]^\7\5\2\2^_\5\6\4\2_"+
		"`\7\6\2\2`a\b\7\1\2ac\3\2\2\2bV\3\2\2\2bY\3\2\2\2b[\3\2\2\2b]\3\2\2\2"+
		"c\r\3\2\2\2de\5\22\n\2ej\b\b\1\2fg\7\17\2\2gh\5\22\n\2hi\b\b\1\2ik\3\2"+
		"\2\2jf\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lm\t\2\2\2m\21\3\2\2\2no\7\22\2\2"+
		"op\b\n\1\2p\23\3\2\2\2\13#.\61;FISbj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}