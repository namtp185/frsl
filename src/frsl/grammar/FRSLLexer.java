// Generated from FRSL.g4 by ANTLR 4.8
package frsl.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FRSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, USECASE=11, DESCRIPTION=12, ACTORS=13, FLOWS=14, NEWLINE=15, 
		STATEMENT=16, PHRASE=17, LETTER=18, NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "USECASE", "DESCRIPTION", "ACTORS", "FLOWS", "NEWLINE", "STATEMENT", 
			"PHRASE", "LETTER", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Precondition:'", "'Postcondition:'", "'Trigger:'", "'Special requirement:'", 
			"','", "'Basic flow:'", "'Alternative flows:'", "':'", "'Step '", "'Flow '", 
			"'Use case:'", "'Brief description:'", "'Actors:'", "'Flows:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "USECASE", 
			"DESCRIPTION", "ACTORS", "FLOWS", "NEWLINE", "STATEMENT", "PHRASE", "LETTER", 
			"NUMBER", "WS"
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


	public FRSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FRSL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00c3\n\20\r\20\16\20\u00c4\3\21"+
		"\3\21\6\21\u00c9\n\21\r\21\16\21\u00ca\3\21\3\21\3\22\3\22\6\22\u00d1"+
		"\n\22\r\22\16\22\u00d2\3\23\6\23\u00d6\n\23\r\23\16\23\u00d7\3\24\3\24"+
		"\3\25\6\25\u00dd\n\25\r\25\16\25\u00de\3\25\3\25\2\2\26\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\7\3\2\f\f\4\2..\60\60\6\2\62;C\\aac|\3\2\62;\5\2\13"+
		"\13\17\17\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\59\3\2\2\2\7H\3\2\2\2\tQ\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17t\3\2\2\2"+
		"\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008f\3\2\2\2\27\u0095\3\2\2\2\31"+
		"\u009f\3\2\2\2\33\u00b2\3\2\2\2\35\u00ba\3\2\2\2\37\u00c2\3\2\2\2!\u00c8"+
		"\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2\'\u00d9\3\2\2\2)\u00dc\3\2\2\2"+
		"+,\7R\2\2,-\7t\2\2-.\7g\2\2./\7e\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7f"+
		"\2\2\62\63\7k\2\2\63\64\7v\2\2\64\65\7k\2\2\65\66\7q\2\2\66\67\7p\2\2"+
		"\678\7<\2\28\4\3\2\2\29:\7R\2\2:;\7q\2\2;<\7u\2\2<=\7v\2\2=>\7e\2\2>?"+
		"\7q\2\2?@\7p\2\2@A\7f\2\2AB\7k\2\2BC\7v\2\2CD\7k\2\2DE\7q\2\2EF\7p\2\2"+
		"FG\7<\2\2G\6\3\2\2\2HI\7V\2\2IJ\7t\2\2JK\7k\2\2KL\7i\2\2LM\7i\2\2MN\7"+
		"g\2\2NO\7t\2\2OP\7<\2\2P\b\3\2\2\2QR\7U\2\2RS\7r\2\2ST\7g\2\2TU\7e\2\2"+
		"UV\7k\2\2VW\7c\2\2WX\7n\2\2XY\7\"\2\2YZ\7t\2\2Z[\7g\2\2[\\\7s\2\2\\]\7"+
		"w\2\2]^\7k\2\2^_\7t\2\2_`\7g\2\2`a\7o\2\2ab\7g\2\2bc\7p\2\2cd\7v\2\2d"+
		"e\7<\2\2e\n\3\2\2\2fg\7.\2\2g\f\3\2\2\2hi\7D\2\2ij\7c\2\2jk\7u\2\2kl\7"+
		"k\2\2lm\7e\2\2mn\7\"\2\2no\7h\2\2op\7n\2\2pq\7q\2\2qr\7y\2\2rs\7<\2\2"+
		"s\16\3\2\2\2tu\7C\2\2uv\7n\2\2vw\7v\2\2wx\7g\2\2xy\7t\2\2yz\7p\2\2z{\7"+
		"c\2\2{|\7v\2\2|}\7k\2\2}~\7x\2\2~\177\7g\2\2\177\u0080\7\"\2\2\u0080\u0081"+
		"\7h\2\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7y\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7<\2\2\u0086\20\3\2\2\2\u0087\u0088\7<\2\2\u0088"+
		"\22\3\2\2\2\u0089\u008a\7U\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7r\2\2\u008d\u008e\7\"\2\2\u008e\24\3\2\2\2\u008f\u0090\7H\2\2"+
		"\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7y\2\2\u0093\u0094"+
		"\7\"\2\2\u0094\26\3\2\2\2\u0095\u0096\7W\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7e\2\2\u009a\u009b\7c\2"+
		"\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\u009e\7<\2\2\u009e\30\3"+
		"\2\2\2\u009f\u00a0\7D\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7f\2"+
		"\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7<\2\2"+
		"\u00b1\32\3\2\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7"+
		"v\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9"+
		"\7<\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7H\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7<\2\2\u00c0"+
		"\36\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5 \3\2\2\2\u00c6\u00c9"+
		"\5#\22\2\u00c7\u00c9\t\3\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\7\60\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d1"+
		"\5%\23\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3$\3\2\2\2\u00d4\u00d6\t\4\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8&\3"+
		"\2\2\2\u00d9\u00da\t\5\2\2\u00da(\3\2\2\2\u00db\u00dd\t\6\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\b\25\2\2\u00e1*\3\2\2\2\t\2\u00c4\u00c8\u00ca"+
		"\u00d2\u00d7\u00de\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}