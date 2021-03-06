// Generated from D:/v/test/antlr/rsql2/src/main/antlr\RsqlSelect.g4 by ANTLR 4.8
package rsql.antlr.select;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RsqlSelectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AVG=2, MAX=3, MIN=4, SUM=5, ALL=6, DIST=7, COUNT=8, GRP=9, DOT=10, 
		LR_BRACKET=11, RR_BRACKET=12, COMMA=13, SEMI=14, AT_SIGN=15, SINGLE_QUOTE_SYMB=16, 
		DOUBLE_QUOTE_SYMB=17, REVERSE_QUOTE_SYMB=18, COLON_SYMB=19, STRING_LITERAL=20, 
		DECIMAL_LITERAL=21, REAL_LITERAL=22, DOT_ID=23, ID=24, NEWLINE=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "AVG", "MAX", "MIN", "SUM", "ALL", "DIST", "COUNT", "GRP", "DOT", 
			"LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE_SYMB", 
			"DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", "COLON_SYMB", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "REAL_LITERAL", "DOT_ID", "ID", "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z", "ID_LITERAL", "EXPONENT_NUM_PART", 
			"DEC_DIGIT", "DQUOTA_STRING", "SQUOTA_STRING", "BQUOTA_STRING", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", null, null, null, null, null, null, null, null, "'.'", "'('", 
			"')'", "','", "';'", "'@'", "'''", "'\"'", "'`'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AVG", "MAX", "MIN", "SUM", "ALL", "DIST", "COUNT", "GRP", 
			"DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE_SYMB", 
			"DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", "COLON_SYMB", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "REAL_LITERAL", "DOT_ID", "ID", "NEWLINE", "WS"
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


	public RsqlSelectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RsqlSelect.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u00b4\n\25\3\26\6\26\u00b7"+
		"\n\26\r\26\16\26\u00b8\3\27\6\27\u00bc\n\27\r\27\16\27\u00bd\5\27\u00c0"+
		"\n\27\3\27\3\27\6\27\u00c4\n\27\r\27\16\27\u00c5\3\27\6\27\u00c9\n\27"+
		"\r\27\16\27\u00ca\3\27\3\27\3\27\3\27\6\27\u00d1\n\27\r\27\16\27\u00d2"+
		"\5\27\u00d5\n\27\3\27\3\27\6\27\u00d9\n\27\r\27\16\27\u00da\3\27\3\27"+
		"\3\27\6\27\u00e0\n\27\r\27\16\27\u00e1\3\27\3\27\5\27\u00e6\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\7\64\u0123\n\64\f\64\16\64\u0126\13\64\3\65\3\65"+
		"\5\65\u012a\n\65\3\65\6\65\u012d\n\65\r\65\16\65\u012e\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u0139\n\67\f\67\16\67\u013c\13\67\3\67"+
		"\3\67\38\38\38\38\38\38\78\u0146\n8\f8\168\u0149\138\38\38\39\39\39\3"+
		"9\39\39\79\u0153\n9\f9\169\u0156\139\39\39\3:\5:\u015b\n:\3:\3:\3;\6;"+
		"\u0160\n;\r;\16;\u0161\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2"+
		"Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\33u\34\3\2$\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\6\2&&C\\aac|\7"+
		"\2&&\62;C\\aac|\4\2--//\3\2\62;\4\2$$^^\4\2))^^\4\2^^bb\4\2\13\13\"\""+
		"\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7"+
		"}\3\2\2\2\t\u0081\3\2\2\2\13\u0085\3\2\2\2\r\u0089\3\2\2\2\17\u008d\3"+
		"\2\2\2\21\u0092\3\2\2\2\23\u0098\3\2\2\2\25\u009c\3\2\2\2\27\u009e\3\2"+
		"\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2\35\u00a4\3\2\2\2\37\u00a6\3\2\2"+
		"\2!\u00a8\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b3"+
		"\3\2\2\2+\u00b6\3\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00ea\3\2\2\2"+
		"\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f4"+
		"\3\2\2\2=\u00f6\3\2\2\2?\u00f8\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E"+
		"\u00fe\3\2\2\2G\u0100\3\2\2\2I\u0102\3\2\2\2K\u0104\3\2\2\2M\u0106\3\2"+
		"\2\2O\u0108\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2\2\2U\u010e\3\2\2\2W\u0110"+
		"\3\2\2\2Y\u0112\3\2\2\2[\u0114\3\2\2\2]\u0116\3\2\2\2_\u0118\3\2\2\2a"+
		"\u011a\3\2\2\2c\u011c\3\2\2\2e\u011e\3\2\2\2g\u0120\3\2\2\2i\u0127\3\2"+
		"\2\2k\u0130\3\2\2\2m\u0132\3\2\2\2o\u013f\3\2\2\2q\u014c\3\2\2\2s\u015a"+
		"\3\2\2\2u\u015f\3\2\2\2wx\7,\2\2x\4\3\2\2\2yz\5\63\32\2z{\5]/\2{|\5? "+
		"\2|\6\3\2\2\2}~\5K&\2~\177\5\63\32\2\177\u0080\5a\61\2\u0080\b\3\2\2\2"+
		"\u0081\u0082\5K&\2\u0082\u0083\5C\"\2\u0083\u0084\5M\'\2\u0084\n\3\2\2"+
		"\2\u0085\u0086\5W,\2\u0086\u0087\5[.\2\u0087\u0088\5K&\2\u0088\f\3\2\2"+
		"\2\u0089\u008a\5\63\32\2\u008a\u008b\5I%\2\u008b\u008c\5I%\2\u008c\16"+
		"\3\2\2\2\u008d\u008e\59\35\2\u008e\u008f\5C\"\2\u008f\u0090\5W,\2\u0090"+
		"\u0091\5Y-\2\u0091\20\3\2\2\2\u0092\u0093\5\67\34\2\u0093\u0094\5O(\2"+
		"\u0094\u0095\5[.\2\u0095\u0096\5M\'\2\u0096\u0097\5Y-\2\u0097\22\3\2\2"+
		"\2\u0098\u0099\5? \2\u0099\u009a\5U+\2\u009a\u009b\5Q)\2\u009b\24\3\2"+
		"\2\2\u009c\u009d\7\60\2\2\u009d\26\3\2\2\2\u009e\u009f\7*\2\2\u009f\30"+
		"\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3"+
		"\34\3\2\2\2\u00a4\u00a5\7=\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7B\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7)\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab"+
		"$\3\2\2\2\u00ac\u00ad\7b\2\2\u00ad&\3\2\2\2\u00ae\u00af\7<\2\2\u00af("+
		"\3\2\2\2\u00b0\u00b4\5m\67\2\u00b1\u00b4\5o8\2\u00b2\u00b4\5q9\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4*\3\2\2\2"+
		"\u00b5\u00b7\5k\66\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9,\3\2\2\2\u00ba\u00bc\5k\66\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c4\5k\66\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00e6\3\2\2\2\u00c7\u00c9\5k\66\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7\60\2\2\u00cd\u00ce\5i\65\2\u00ce\u00e6\3\2\2\2\u00cf\u00d1\5"+
		"k\66\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\60\2\2\u00d7\u00d9\5k\66\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5i\65\2\u00dd\u00e6\3\2\2\2\u00de"+
		"\u00e0\5k\66\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5i\65\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00bf\3\2\2\2\u00e5\u00c8\3\2\2\2\u00e5\u00d4\3\2"+
		"\2\2\u00e5\u00df\3\2\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9"+
		"\5g\64\2\u00e9\60\3\2\2\2\u00ea\u00eb\5g\64\2\u00eb\62\3\2\2\2\u00ec\u00ed"+
		"\t\2\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\t\3\2\2\u00ef\66\3\2\2\2\u00f0\u00f1"+
		"\t\4\2\2\u00f18\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3:\3\2\2\2\u00f4\u00f5"+
		"\t\6\2\2\u00f5<\3\2\2\2\u00f6\u00f7\t\7\2\2\u00f7>\3\2\2\2\u00f8\u00f9"+
		"\t\b\2\2\u00f9@\3\2\2\2\u00fa\u00fb\t\t\2\2\u00fbB\3\2\2\2\u00fc\u00fd"+
		"\t\n\2\2\u00fdD\3\2\2\2\u00fe\u00ff\t\13\2\2\u00ffF\3\2\2\2\u0100\u0101"+
		"\t\f\2\2\u0101H\3\2\2\2\u0102\u0103\t\r\2\2\u0103J\3\2\2\2\u0104\u0105"+
		"\t\16\2\2\u0105L\3\2\2\2\u0106\u0107\t\17\2\2\u0107N\3\2\2\2\u0108\u0109"+
		"\t\20\2\2\u0109P\3\2\2\2\u010a\u010b\t\21\2\2\u010bR\3\2\2\2\u010c\u010d"+
		"\t\22\2\2\u010dT\3\2\2\2\u010e\u010f\t\23\2\2\u010fV\3\2\2\2\u0110\u0111"+
		"\t\24\2\2\u0111X\3\2\2\2\u0112\u0113\t\25\2\2\u0113Z\3\2\2\2\u0114\u0115"+
		"\t\26\2\2\u0115\\\3\2\2\2\u0116\u0117\t\27\2\2\u0117^\3\2\2\2\u0118\u0119"+
		"\t\30\2\2\u0119`\3\2\2\2\u011a\u011b\t\31\2\2\u011bb\3\2\2\2\u011c\u011d"+
		"\t\32\2\2\u011dd\3\2\2\2\u011e\u011f\t\33\2\2\u011ff\3\2\2\2\u0120\u0124"+
		"\t\34\2\2\u0121\u0123\t\35\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125h\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0127\u0129\7G\2\2\u0128\u012a\t\36\2\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\5k\66\2\u012c\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"j\3\2\2\2\u0130\u0131\t\37\2\2\u0131l\3\2\2\2\u0132\u013a\7$\2\2\u0133"+
		"\u0134\7^\2\2\u0134\u0139\13\2\2\2\u0135\u0136\7$\2\2\u0136\u0139\7$\2"+
		"\2\u0137\u0139\n \2\2\u0138\u0133\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013en\3\2\2\2\u013f"+
		"\u0147\7)\2\2\u0140\u0141\7^\2\2\u0141\u0146\13\2\2\2\u0142\u0143\7)\2"+
		"\2\u0143\u0146\7)\2\2\u0144\u0146\n!\2\2\u0145\u0140\3\2\2\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7)"+
		"\2\2\u014bp\3\2\2\2\u014c\u0154\7b\2\2\u014d\u014e\7^\2\2\u014e\u0153"+
		"\13\2\2\2\u014f\u0150\7b\2\2\u0150\u0153\7b\2\2\u0151\u0153\n\"\2\2\u0152"+
		"\u014d\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7b\2\2\u0158r\3\2\2\2\u0159\u015b\7\17\2\2"+
		"\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\7\f\2\2\u015dt\3\2\2\2\u015e\u0160\t#\2\2\u015f\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\b;\2\2\u0164v\3\2\2\2\31\2\u00b3\u00b8\u00bd\u00bf\u00c5\u00ca"+
		"\u00d2\u00d4\u00da\u00e1\u00e5\u0124\u0129\u012e\u0138\u013a\u0145\u0147"+
		"\u0152\u0154\u015a\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}