// Generated from ParserTC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTI=3, DIVI=4, MOD=5, POW=6, QUOTE=7, UNION=8, INTER=9, 
		DIFF=10, PRINT=11, SEMICOLON=12, DOT=13, COMMA=14, COLON=15, ASSIGN_OP=16, 
		EQUALS=17, NOTEQ=18, AND=19, OR=20, LT=21, LTEQ=22, GT=23, GTEQ=24, OP_PAREN=25, 
		CL_PAREN=26, OP_BRACE=27, CL_BRACE=28, OP_BRACK=29, CL_BRACK=30, BOOLEAN=31, 
		IDENT=32, NUM=33, TEXT=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTI", "DIVI", "MOD", "POW", "QUOTE", "UNION", "INTER", 
			"DIFF", "PRINT", "SEMICOLON", "DOT", "COMMA", "COLON", "ASSIGN_OP", "EQUALS", 
			"NOTEQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "OP_PAREN", "CL_PAREN", 
			"OP_BRACE", "CL_BRACE", "OP_BRACK", "CL_BRACK", "BOOLEAN", "IDENT", "NUM", 
			"TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'''", "'union'", "'intersection'", 
			"'difference'", "'print'", "';'", "'.'", "','", "':'", "'='", "'=='", 
			"'!='", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTI", "DIVI", "MOD", "POW", "QUOTE", "UNION", 
			"INTER", "DIFF", "PRINT", "SEMICOLON", "DOT", "COMMA", "COLON", "ASSIGN_OP", 
			"EQUALS", "NOTEQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "OP_PAREN", 
			"CL_PAREN", "OP_BRACE", "CL_BRACE", "OP_BRACK", "CL_BRACK", "BOOLEAN", 
			"IDENT", "NUM", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ParserTCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserTC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00b1"+
		"\n \3!\6!\u00b4\n!\r!\16!\u00b5\3\"\6\"\u00b9\n\"\r\"\16\"\u00ba\3#\3"+
		"#\3#\3#\7#\u00c1\n#\f#\16#\u00c4\13#\3#\3#\3$\6$\u00c9\n$\r$\16$\u00ca"+
		"\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%\3\2\6\4\2C\\c|\3\2\62;\5\2\f\f\17\17$$\5\2\13"+
		"\f\17\17\"\"\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13"+
		"Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23]\3\2\2\2\25j\3\2\2\2\27"+
		"u\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2"+
		"+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009b"+
		"\3\2\2\2\65\u009d\3\2\2\2\67\u009f\3\2\2\29\u00a1\3\2\2\2;\u00a3\3\2\2"+
		"\2=\u00a5\3\2\2\2?\u00b0\3\2\2\2A\u00b3\3\2\2\2C\u00b8\3\2\2\2E\u00bc"+
		"\3\2\2\2G\u00c8\3\2\2\2IJ\7-\2\2J\4\3\2\2\2KL\7/\2\2L\6\3\2\2\2MN\7,\2"+
		"\2N\b\3\2\2\2OP\7\61\2\2P\n\3\2\2\2QR\7\'\2\2R\f\3\2\2\2ST\7`\2\2T\16"+
		"\3\2\2\2UV\7)\2\2V\20\3\2\2\2WX\7w\2\2XY\7p\2\2YZ\7k\2\2Z[\7q\2\2[\\\7"+
		"p\2\2\\\22\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a\7g\2\2ab\7t\2\2bc\7u\2"+
		"\2cd\7g\2\2de\7e\2\2ef\7v\2\2fg\7k\2\2gh\7q\2\2hi\7p\2\2i\24\3\2\2\2j"+
		"k\7f\2\2kl\7k\2\2lm\7h\2\2mn\7h\2\2no\7g\2\2op\7t\2\2pq\7g\2\2qr\7p\2"+
		"\2rs\7e\2\2st\7g\2\2t\26\3\2\2\2uv\7r\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2y"+
		"z\7v\2\2z\30\3\2\2\2{|\7=\2\2|\32\3\2\2\2}~\7\60\2\2~\34\3\2\2\2\177\u0080"+
		"\7.\2\2\u0080\36\3\2\2\2\u0081\u0082\7<\2\2\u0082 \3\2\2\2\u0083\u0084"+
		"\7?\2\2\u0084\"\3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7?\2\2\u0087$\3"+
		"\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7?\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\7(\2\2\u008c\u008d\7(\2\2\u008d(\3\2\2\2\u008e\u008f\7~\2\2\u008f\u0090"+
		"\7~\2\2\u0090*\3\2\2\2\u0091\u0092\7>\2\2\u0092,\3\2\2\2\u0093\u0094\7"+
		">\2\2\u0094\u0095\7?\2\2\u0095.\3\2\2\2\u0096\u0097\7@\2\2\u0097\60\3"+
		"\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a\62\3\2\2\2\u009b\u009c"+
		"\7*\2\2\u009c\64\3\2\2\2\u009d\u009e\7+\2\2\u009e\66\3\2\2\2\u009f\u00a0"+
		"\7}\2\2\u00a08\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2:\3\2\2\2\u00a3\u00a4"+
		"\7]\2\2\u00a4<\3\2\2\2\u00a5\u00a6\7_\2\2\u00a6>\3\2\2\2\u00a7\u00a8\7"+
		"v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00b1\7g\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af"+
		"\u00b1\7g\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1@\3\2\2\2\u00b2"+
		"\u00b4\t\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6B\3\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"D\3\2\2\2\u00bc\u00c2\7$\2\2\u00bd\u00c1\n\4\2\2\u00be\u00bf\7$\2\2\u00bf"+
		"\u00c1\7$\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6F\3\2\2\2\u00c7\u00c9\t\5\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b$\2\2\u00cdH\3\2\2\2\t\2\u00b0\u00b5"+
		"\u00ba\u00c0\u00c2\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}