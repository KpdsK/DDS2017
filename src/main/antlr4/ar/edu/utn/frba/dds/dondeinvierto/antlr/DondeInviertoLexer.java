// Generated from DondeInvierto.g4 by ANTLR 4.7
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
public class DondeInviertoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOMBRE_IDENTIFICADOR=1, NOMBRE_CUENTA=2, LPAREN=3, RPAREN=4, SUMA=5, RESTA=6, 
		MULT=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, E=13, POTENCIA=14, LETTER=15, 
		DIGIT=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOMBRE_IDENTIFICADOR", "NOMBRE_CUENTA", "LPAREN", "RPAREN", "SUMA", "RESTA", 
		"MULT", "DIV", "GT", "LT", "EQ", "POINT", "E", "POTENCIA", "LETTER", "DIGIT", 
		"WS"
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


	public DondeInviertoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DondeInvierto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n\2\f\2\16\2\64"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\7\3A\n\3\f\3\16"+
		"\3D\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20`\n\20\f\20\16"+
		"\20c\13\20\3\21\3\21\3\22\6\22h\n\22\r\22\16\22i\3\22\3\22\2\2\23\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\5\4\2GGgg\5\2C\\aac|\5\2\13\f\17\17\"\"\2r\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2"+
		"\5\65\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2"+
		"\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2"+
		"\2\35[\3\2\2\2\37]\3\2\2\2!d\3\2\2\2#g\3\2\2\2%&\7K\2\2&\'\7F\2\2\'(\7"+
		"a\2\2(,\3\2\2\2)+\5\37\20\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62"+
		"\3\2\2\2.,\3\2\2\2/\61\5!\21\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\4\3\2\2\2\64\62\3\2\2\2\65\66\7E\2\2\66\67\7W\2\2\67"+
		"8\7a\2\28<\3\2\2\29;\5\37\20\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=B\3\2\2\2><\3\2\2\2?A\5!\21\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"C\6\3\2\2\2DB\3\2\2\2EF\7*\2\2F\b\3\2\2\2GH\7+\2\2H\n\3\2\2\2IJ\7-\2\2"+
		"J\f\3\2\2\2KL\7/\2\2L\16\3\2\2\2MN\7,\2\2N\20\3\2\2\2OP\7\61\2\2P\22\3"+
		"\2\2\2QR\7@\2\2R\24\3\2\2\2ST\7>\2\2T\26\3\2\2\2UV\7?\2\2V\30\3\2\2\2"+
		"WX\7\60\2\2X\32\3\2\2\2YZ\t\2\2\2Z\34\3\2\2\2[\\\7`\2\2\\\36\3\2\2\2]"+
		"a\t\3\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b \3\2\2\2"+
		"ca\3\2\2\2de\4\62;\2e\"\3\2\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jk\3\2\2\2kl\b\22\2\2l$\3\2\2\2\t\2,\62<Bai\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}