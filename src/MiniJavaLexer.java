// Generated from MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, This=35, New=36, Int=37, BoolValue=38, Identifier=39, 
		Integer=40, WS=41, LineComment=42, BlockComment=43, Digit=44, Lowercase=45, 
		Uppercase=46, Alphabet=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "This", "New", "Int", "BoolValue", "Identifier", "Integer", "WS", 
		"LineComment", "BlockComment", "Digit", "Lowercase", "Uppercase", "Alphabet"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "'return'", "';'", 
		"','", "'boolean'", "'if'", "'System.out.println'", "'else'", "'while'", 
		"'='", "'||'", "'&&'", "'<'", "'>'", "'=='", "'+'", "'-'", "'*'", "'/'", 
		"'.'", "'length'", "'!'", "'this'", "'new'", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "This", 
		"New", "Int", "BoolValue", "Identifier", "Integer", "WS", "LineComment", 
		"BlockComment", "Digit", "Lowercase", "Uppercase", "Alphabet"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0107"+
		"\n\'\3(\3(\3(\3(\7(\u010d\n(\f(\16(\u0110\13(\3)\6)\u0113\n)\r)\16)\u0114"+
		"\3*\6*\u0118\n*\r*\16*\u0119\3*\3*\3+\3+\3+\3+\7+\u0122\n+\f+\16+\u0125"+
		"\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0132\n,\f,\16,\u0135\13,\3,"+
		"\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u0144\n\60\2\2\61\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\n\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\3\2\62;\3\2c|\3\2C\\\u0150\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2"+
		"\5g\3\2\2\2\7i\3\2\2\2\tp\3\2\2\2\13w\3\2\2\2\r|\3\2\2\2\17\u0081\3\2"+
		"\2\2\21\u0083\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2"+
		"\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u009a\3\2\2\2\37\u00a1\3\2\2\2"+
		"!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00ad\3\2\2\2\'\u00b0\3\2\2\2)\u00c3\3"+
		"\2\2\2+\u00c8\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61\u00d3\3\2\2\2\63"+
		"\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67\u00da\3\2\2\29\u00dd\3\2\2\2;\u00df"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E"+
		"\u00ee\3\2\2\2G\u00f0\3\2\2\2I\u00f5\3\2\2\2K\u00f9\3\2\2\2M\u0106\3\2"+
		"\2\2O\u0108\3\2\2\2Q\u0112\3\2\2\2S\u0117\3\2\2\2U\u011d\3\2\2\2W\u0128"+
		"\3\2\2\2Y\u013b\3\2\2\2[\u013d\3\2\2\2]\u013f\3\2\2\2_\u0143\3\2\2\2a"+
		"b\7e\2\2bc\7n\2\2cd\7c\2\2de\7u\2\2ef\7u\2\2f\4\3\2\2\2gh\7}\2\2h\6\3"+
		"\2\2\2ij\7r\2\2jk\7w\2\2kl\7d\2\2lm\7n\2\2mn\7k\2\2no\7e\2\2o\b\3\2\2"+
		"\2pq\7u\2\2qr\7v\2\2rs\7c\2\2st\7v\2\2tu\7k\2\2uv\7e\2\2v\n\3\2\2\2wx"+
		"\7x\2\2xy\7q\2\2yz\7k\2\2z{\7f\2\2{\f\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7"+
		"k\2\2\177\u0080\7p\2\2\u0080\16\3\2\2\2\u0081\u0082\7*\2\2\u0082\20\3"+
		"\2\2\2\u0083\u0084\7U\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089\22\3\2\2\2\u008a"+
		"\u008b\7]\2\2\u008b\24\3\2\2\2\u008c\u008d\7_\2\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\7+\2\2\u008f\30\3\2\2\2\u0090\u0091\7\177\2\2\u0091\32\3\2\2\2"+
		"\u0092\u0093\7g\2\2\u0093\u0094\7z\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\u0099\7u\2\2\u0099"+
		"\34\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2\u00a0\36\3\2\2\2\u00a1"+
		"\u00a2\7=\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7d\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac$\3\2\2"+
		"\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af&\3\2\2\2\u00b0\u00b1\7"+
		"U\2\2\u00b1\u00b2\7{\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7\60\2\2\u00bb\u00bc\7r\2"+
		"\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7p\2\2\u00c2(\3\2\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"*\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf"+
		".\3\2\2\2\u00d0\u00d1\7~\2\2\u00d1\u00d2\7~\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d4\7(\2\2\u00d4\u00d5\7(\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\66\3\2\2\2\u00da\u00db\7?\2\2\u00db"+
		"\u00dc\7?\2\2\u00dc8\3\2\2\2\u00dd\u00de\7-\2\2\u00de:\3\2\2\2\u00df\u00e0"+
		"\7/\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7"+
		"\61\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6B\3\2\2\2\u00e7\u00e8"+
		"\7n\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7i\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00edD\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef"+
		"F\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7u\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		"\u00f8\7y\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7w\2\2\u0100\u0107\7g\2\2\u0101\u0102\7h\2\2\u0102\u0103\7c\2\2"+
		"\u0103\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0107\7g\2\2\u0106\u00fd"+
		"\3\2\2\2\u0106\u0101\3\2\2\2\u0107N\3\2\2\2\u0108\u010e\5_\60\2\u0109"+
		"\u010d\5_\60\2\u010a\u010d\5Y-\2\u010b\u010d\7a\2\2\u010c\u0109\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010fP\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0113\5Y-\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115R\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\b*\2\2\u011cT\3\2\2\2\u011d\u011e\7\61\2\2"+
		"\u011e\u011f\7\61\2\2\u011f\u0123\3\2\2\2\u0120\u0122\n\3\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\b+\2\2\u0127V\3\2\2\2\u0128"+
		"\u0129\7\61\2\2\u0129\u012a\7,\2\2\u012a\u0133\3\2\2\2\u012b\u0132\5W"+
		",\2\u012c\u0132\n\4\2\2\u012d\u012e\7\61\2\2\u012e\u0132\n\5\2\2\u012f"+
		"\u0130\7,\2\2\u0130\u0132\n\6\2\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2"+
		"\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\7,\2\2\u0137\u0138\7\61\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\b,\2\2\u013aX\3\2\2\2\u013b\u013c\t\7\2\2\u013cZ\3\2\2\2\u013d"+
		"\u013e\t\b\2\2\u013e\\\3\2\2\2\u013f\u0140\t\t\2\2\u0140^\3\2\2\2\u0141"+
		"\u0144\5[.\2\u0142\u0144\5]/\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2"+
		"\u0144`\3\2\2\2\f\2\u0106\u010c\u010e\u0114\u0119\u0123\u0131\u0133\u0143"+
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