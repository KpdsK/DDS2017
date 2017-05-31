// Generated from DondeInviertoSinCodigoJava.g4 by ANTLR 4.7
package ar.edu.utn.frba.dds.dondeinvierto.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DondeInviertoSinCodigoJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOMBRE_INDICADOR=1, NOMBRE_CUENTA=2, LPAREN=3, RPAREN=4, SUMA=5, RESTA=6, 
		MULT=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, E=13, POTENCIA=14, LETTER=15, 
		NUMERO=16, DIGITO=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOMBRE_INDICADOR", "NOMBRE_CUENTA", "LPAREN", "RPAREN", "SUMA", "RESTA", 
		"MULT", "DIV", "GT", "LT", "EQ", "POINT", "E", "POTENCIA", "LETTER", "NUMERO", 
		"DIGITO", "WS"
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


	public DondeInviertoSinCodigoJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DondeInviertoSinCodigoJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\38\n\3\r\3\16\39\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\7\20V\n\20\f\20\16\20Y\13\20\3\21\5\21\\\n\21\3\21\6\21_\n\21\r\21\16"+
		"\21`\3\21\3\21\6\21e\n\21\r\21\16\21f\5\21i\n\21\3\22\3\22\3\23\6\23n"+
		"\n\23\r\23\16\23o\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\4\2GGgg\5\2"+
		"C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\61"+
		"\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E"+
		"\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35"+
		"Q\3\2\2\2\37S\3\2\2\2![\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'(\7K\2\2()\7P\2\2"+
		")*\7a\2\2*-\3\2\2\2+.\5\37\20\2,.\5#\22\2-+\3\2\2\2-,\3\2\2\2./\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\4\3\2\2\2\61\62\7E\2\2\62\63\7W\2\2\63\64"+
		"\7a\2\2\64\67\3\2\2\2\658\5\37\20\2\668\5#\22\2\67\65\3\2\2\2\67\66\3"+
		"\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\6\3\2\2\2;<\7*\2\2<\b\3\2\2\2"+
		"=>\7+\2\2>\n\3\2\2\2?@\7-\2\2@\f\3\2\2\2AB\7/\2\2B\16\3\2\2\2CD\7,\2\2"+
		"D\20\3\2\2\2EF\7\61\2\2F\22\3\2\2\2GH\7@\2\2H\24\3\2\2\2IJ\7>\2\2J\26"+
		"\3\2\2\2KL\7?\2\2L\30\3\2\2\2MN\7\60\2\2N\32\3\2\2\2OP\t\2\2\2P\34\3\2"+
		"\2\2QR\7`\2\2R\36\3\2\2\2SW\t\3\2\2TV\t\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X \3\2\2\2YW\3\2\2\2Z\\\5\r\7\2[Z\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2]_\5#\22\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3\2\2\2"+
		"bd\5\31\r\2ce\5#\22\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hb\3\2\2\2hi\3\2\2\2i\"\3\2\2\2jk\t\4\2\2k$\3\2\2\2ln\t\5\2\2ml\3\2"+
		"\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\23\2\2r&\3\2\2\2\r\2"+
		"-/\679W[`fho\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}