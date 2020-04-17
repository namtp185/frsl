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
		T__9=10, T__10=11, T__11=12, USECASE=13, DESCRIPTION=14, ACTORS=15, FLOWS=16, 
		NEWLINE=17, STATEMENT=18, PHRASE=19, LETTER=20, NUMBER=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "USECASE", "DESCRIPTION", "ACTORS", "FLOWS", 
			"NEWLINE", "STATEMENT", "PHRASE", "LETTER", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Precondition:'", "'Postcondition:'", "'Trigger:'", "'Special requirement:'", 
			"','", "'Basic flows:'", "'Specific alternative flows:'", "'Global alternative flows:'", 
			"'Bounded alternative flows:'", "':'", "'Step '", "'Flow '", "'Use case:'", 
			"'Brief description:'", "'Actors:'", "'Flows:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "USECASE", "DESCRIPTION", "ACTORS", "FLOWS", "NEWLINE", "STATEMENT", 
			"PHRASE", "LETTER", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u0106\n\22\r\22"+
		"\16\22\u0107\3\23\3\23\6\23\u010c\n\23\r\23\16\23\u010d\3\23\3\23\3\24"+
		"\3\24\6\24\u0114\n\24\r\24\16\24\u0115\3\25\6\25\u0119\n\25\r\25\16\25"+
		"\u011a\3\26\3\26\3\27\6\27\u0120\n\27\r\27\16\27\u0121\3\27\3\27\2\2\30"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\3\2\f\f\4\2..\60\60\6\2\62;"+
		"C\\aac|\3\2\62;\5\2\13\13\17\17\"\"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5=\3\2\2\2\7L\3\2\2\2\t"+
		"U\3\2\2\2\13j\3\2\2\2\rl\3\2\2\2\17y\3\2\2\2\21\u0095\3\2\2\2\23\u00af"+
		"\3\2\2\2\25\u00ca\3\2\2\2\27\u00cc\3\2\2\2\31\u00d2\3\2\2\2\33\u00d8\3"+
		"\2\2\2\35\u00e2\3\2\2\2\37\u00f5\3\2\2\2!\u00fd\3\2\2\2#\u0105\3\2\2\2"+
		"%\u010b\3\2\2\2\'\u0113\3\2\2\2)\u0118\3\2\2\2+\u011c\3\2\2\2-\u011f\3"+
		"\2\2\2/\60\7R\2\2\60\61\7t\2\2\61\62\7g\2\2\62\63\7e\2\2\63\64\7q\2\2"+
		"\64\65\7p\2\2\65\66\7f\2\2\66\67\7k\2\2\678\7v\2\289\7k\2\29:\7q\2\2:"+
		";\7p\2\2;<\7<\2\2<\4\3\2\2\2=>\7R\2\2>?\7q\2\2?@\7u\2\2@A\7v\2\2AB\7e"+
		"\2\2BC\7q\2\2CD\7p\2\2DE\7f\2\2EF\7k\2\2FG\7v\2\2GH\7k\2\2HI\7q\2\2IJ"+
		"\7p\2\2JK\7<\2\2K\6\3\2\2\2LM\7V\2\2MN\7t\2\2NO\7k\2\2OP\7i\2\2PQ\7i\2"+
		"\2QR\7g\2\2RS\7t\2\2ST\7<\2\2T\b\3\2\2\2UV\7U\2\2VW\7r\2\2WX\7g\2\2XY"+
		"\7e\2\2YZ\7k\2\2Z[\7c\2\2[\\\7n\2\2\\]\7\"\2\2]^\7t\2\2^_\7g\2\2_`\7s"+
		"\2\2`a\7w\2\2ab\7k\2\2bc\7t\2\2cd\7g\2\2de\7o\2\2ef\7g\2\2fg\7p\2\2gh"+
		"\7v\2\2hi\7<\2\2i\n\3\2\2\2jk\7.\2\2k\f\3\2\2\2lm\7D\2\2mn\7c\2\2no\7"+
		"u\2\2op\7k\2\2pq\7e\2\2qr\7\"\2\2rs\7h\2\2st\7n\2\2tu\7q\2\2uv\7y\2\2"+
		"vw\7u\2\2wx\7<\2\2x\16\3\2\2\2yz\7U\2\2z{\7r\2\2{|\7g\2\2|}\7e\2\2}~\7"+
		"k\2\2~\177\7h\2\2\177\u0080\7k\2\2\u0080\u0081\7e\2\2\u0081\u0082\7\""+
		"\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7v\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7t\2\2\u0087\u0088\7p\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7x\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7\"\2\2\u008e\u008f\7h\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7y\2\2\u0092\u0093\7u\2\2\u0093\u0094\7<\2\2\u0094"+
		"\20\3\2\2\2\u0095\u0096\7I\2\2\u0096\u0097\7n\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7d\2\2\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7\"\2"+
		"\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7<\2\2\u00ae"+
		"\22\3\2\2\2\u00af\u00b0\7D\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7f\2\2"+
		"\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7x\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7u\2\2\u00c8"+
		"\u00c9\7<\2\2\u00c9\24\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb\26\3\2\2\2\u00cc"+
		"\u00cd\7U\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2"+
		"\u00d0\u00d1\7\"\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7H\2\2\u00d3\u00d4\7"+
		"n\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\32\3\2\2\2\u00d8\u00d9\7W\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db"+
		"\u00dc\7\"\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7u\2"+
		"\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7<\2\2\u00e1\34\3\2\2\2\u00e2\u00e3"+
		"\7D\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7h\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2"+
		"\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7<\2\2\u00f4\36\3\2\2\2\u00f5"+
		"\u00f6\7C\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7q\2\2"+
		"\u00f9\u00fa\7t\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7<\2\2\u00fc \3\2\2"+
		"\2\u00fd\u00fe\7H\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7y\2\2\u0101\u0102\7u\2\2\u0102\u0103\7<\2\2\u0103\"\3\2\2\2\u0104\u0106"+
		"\t\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108$\3\2\2\2\u0109\u010c\5\'\24\2\u010a\u010c\t\3\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\60\2\2"+
		"\u0110&\3\2\2\2\u0111\u0112\7\"\2\2\u0112\u0114\5)\25\2\u0113\u0111\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"(\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b*\3\2\2\2\u011c\u011d\t"+
		"\5\2\2\u011d,\3\2\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b\27\2\2\u0124.\3\2\2\2\t\2\u0107\u010b\u010d\u0115\u011a\u0121"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}