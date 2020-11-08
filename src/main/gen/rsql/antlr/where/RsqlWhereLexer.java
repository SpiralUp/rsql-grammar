// Generated from D:/v/test/antlr/rsql2/src/main/antlr\RsqlWhere.g4 by ANTLR 4.8
package rsql.antlr.where;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RsqlWhereLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, OR=7, GT=8, LT=9, GE=10, 
		LE=11, LIKE=12, IN=13, BT=14, DOT=15, LR_BRACKET=16, RR_BRACKET=17, COMMA=18, 
		SEMI=19, AT_SIGN=20, SINGLE_QUOTE_SYMB=21, DOUBLE_QUOTE_SYMB=22, REVERSE_QUOTE_SYMB=23, 
		COLON_SYMB=24, STRING_LITERAL=25, DECIMAL_LITERAL=26, REAL_LITERAL=27, 
		DOT_ID=28, ID=29, NEWLINE=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "AND", "OR", "GT", "LT", "GE", 
			"LE", "LIKE", "IN", "BT", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
			"SEMI", "AT_SIGN", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", 
			"COLON_SYMB", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", "DOT_ID", 
			"ID", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ID_LITERAL", 
			"EXPONENT_NUM_PART", "DEC_DIGIT", "DQUOTA_STRING", "SQUOTA_STRING", "BQUOTA_STRING", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'=!'", "'!='", "'='", "'=*'", null, null, null, null, 
			null, null, null, null, null, "'.'", "'('", "')'", "','", "';'", "'@'", 
			"'''", "'\"'", "'`'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "AND", "OR", "GT", "LT", "GE", "LE", 
			"LIKE", "IN", "BT", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", 
			"AT_SIGN", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", 
			"COLON_SYMB", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", "DOT_ID", 
			"ID", "NEWLINE", "WS"
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


	public RsqlWhereLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RsqlWhere.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u00c5\n\32\3\33\6\33\u00c8"+
		"\n\33\r\33\16\33\u00c9\3\34\6\34\u00cd\n\34\r\34\16\34\u00ce\5\34\u00d1"+
		"\n\34\3\34\3\34\6\34\u00d5\n\34\r\34\16\34\u00d6\3\34\6\34\u00da\n\34"+
		"\r\34\16\34\u00db\3\34\3\34\3\34\3\34\6\34\u00e2\n\34\r\34\16\34\u00e3"+
		"\5\34\u00e6\n\34\3\34\3\34\6\34\u00ea\n\34\r\34\16\34\u00eb\3\34\3\34"+
		"\3\34\6\34\u00f1\n\34\r\34\16\34\u00f2\3\34\3\34\5\34\u00f7\n\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\79\u0134\n9\f9\169\u0137\139\3:\3:\5:\u013b\n:\3:\6:\u013e"+
		"\n:\r:\16:\u013f\3;\3;\3<\3<\3<\3<\3<\3<\7<\u014a\n<\f<\16<\u014d\13<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\7=\u0157\n=\f=\16=\u015a\13=\3=\3=\3>\3>\3>\3"+
		">\3>\3>\7>\u0164\n>\f>\16>\u0167\13>\3>\3>\3?\5?\u016c\n?\3?\3?\3@\6@"+
		"\u0171\n@\r@\16@\u0172\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U"+
		"\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2} \177!\3\2"+
		"$\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2--//\3\2\62;\4\2$$^^\4\2))^^\4\2^"+
		"^bb\4\2\13\13\"\"\2\u0171\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2"+
		"\2\5\u0084\3\2\2\2\7\u0087\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r"+
		"\u008f\3\2\2\2\17\u0093\3\2\2\2\21\u0096\3\2\2\2\23\u0099\3\2\2\2\25\u009c"+
		"\3\2\2\2\27\u009f\3\2\2\2\31\u00a2\3\2\2\2\33\u00a7\3\2\2\2\35\u00aa\3"+
		"\2\2\2\37\u00ad\3\2\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'"+
		"\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2"+
		"\2\2\61\u00bf\3\2\2\2\63\u00c4\3\2\2\2\65\u00c7\3\2\2\2\67\u00f6\3\2\2"+
		"\29\u00f8\3\2\2\2;\u00fb\3\2\2\2=\u00fd\3\2\2\2?\u00ff\3\2\2\2A\u0101"+
		"\3\2\2\2C\u0103\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K"+
		"\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0113\3\2"+
		"\2\2U\u0115\3\2\2\2W\u0117\3\2\2\2Y\u0119\3\2\2\2[\u011b\3\2\2\2]\u011d"+
		"\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c\u0123\3\2\2\2e\u0125\3\2\2\2g"+
		"\u0127\3\2\2\2i\u0129\3\2\2\2k\u012b\3\2\2\2m\u012d\3\2\2\2o\u012f\3\2"+
		"\2\2q\u0131\3\2\2\2s\u0138\3\2\2\2u\u0141\3\2\2\2w\u0143\3\2\2\2y\u0150"+
		"\3\2\2\2{\u015d\3\2\2\2}\u016b\3\2\2\2\177\u0170\3\2\2\2\u0081\u0082\7"+
		"?\2\2\u0082\u0083\7?\2\2\u0083\4\3\2\2\2\u0084\u0085\7?\2\2\u0085\u0086"+
		"\7#\2\2\u0086\6\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089\7?\2\2\u0089\b"+
		"\3\2\2\2\u008a\u008b\7?\2\2\u008b\n\3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e"+
		"\7,\2\2\u008e\f\3\2\2\2\u008f\u0090\5=\37\2\u0090\u0091\5W,\2\u0091\u0092"+
		"\5C\"\2\u0092\16\3\2\2\2\u0093\u0094\5Y-\2\u0094\u0095\5_\60\2\u0095\20"+
		"\3\2\2\2\u0096\u0097\5I%\2\u0097\u0098\5c\62\2\u0098\22\3\2\2\2\u0099"+
		"\u009a\5S*\2\u009a\u009b\5c\62\2\u009b\24\3\2\2\2\u009c\u009d\5I%\2\u009d"+
		"\u009e\5E#\2\u009e\26\3\2\2\2\u009f\u00a0\5S*\2\u00a0\u00a1\5E#\2\u00a1"+
		"\30\3\2\2\2\u00a2\u00a3\5S*\2\u00a3\u00a4\5M\'\2\u00a4\u00a5\5Q)\2\u00a5"+
		"\u00a6\5E#\2\u00a6\32\3\2\2\2\u00a7\u00a8\5M\'\2\u00a8\u00a9\5W,\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\5? \2\u00ab\u00ac\5c\62\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7\60\2\2\u00ae \3\2\2\2\u00af\u00b0\7*\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7+\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4&\3\2\2\2\u00b5\u00b6"+
		"\7=\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7B\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7"+
		")\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc.\3\2\2\2\u00bd\u00be\7b"+
		"\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0\62\3\2\2\2\u00c1\u00c5"+
		"\5w<\2\u00c2\u00c5\5y=\2\u00c3\u00c5\5{>\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\64\3\2\2\2\u00c6\u00c8\5u;\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\66\3\2\2\2\u00cb\u00cd\5u;\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\60"+
		"\2\2\u00d3\u00d5\5u;\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00f7\3\2\2\2\u00d8\u00da\5u;\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\60\2\2\u00de\u00df\5s:\2\u00df"+
		"\u00f7\3\2\2\2\u00e0\u00e2\5u;\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\60\2\2"+
		"\u00e8\u00ea\5u;\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5s:\2\u00ee"+
		"\u00f7\3\2\2\2\u00ef\u00f1\5u;\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\5s:\2\u00f5\u00f7\3\2\2\2\u00f6\u00d0\3\2\2\2\u00f6\u00d9\3\2\2\2\u00f6"+
		"\u00e5\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f78\3\2\2\2\u00f8\u00f9\7\60\2\2"+
		"\u00f9\u00fa\5q9\2\u00fa:\3\2\2\2\u00fb\u00fc\5q9\2\u00fc<\3\2\2\2\u00fd"+
		"\u00fe\t\2\2\2\u00fe>\3\2\2\2\u00ff\u0100\t\3\2\2\u0100@\3\2\2\2\u0101"+
		"\u0102\t\4\2\2\u0102B\3\2\2\2\u0103\u0104\t\5\2\2\u0104D\3\2\2\2\u0105"+
		"\u0106\t\6\2\2\u0106F\3\2\2\2\u0107\u0108\t\7\2\2\u0108H\3\2\2\2\u0109"+
		"\u010a\t\b\2\2\u010aJ\3\2\2\2\u010b\u010c\t\t\2\2\u010cL\3\2\2\2\u010d"+
		"\u010e\t\n\2\2\u010eN\3\2\2\2\u010f\u0110\t\13\2\2\u0110P\3\2\2\2\u0111"+
		"\u0112\t\f\2\2\u0112R\3\2\2\2\u0113\u0114\t\r\2\2\u0114T\3\2\2\2\u0115"+
		"\u0116\t\16\2\2\u0116V\3\2\2\2\u0117\u0118\t\17\2\2\u0118X\3\2\2\2\u0119"+
		"\u011a\t\20\2\2\u011aZ\3\2\2\2\u011b\u011c\t\21\2\2\u011c\\\3\2\2\2\u011d"+
		"\u011e\t\22\2\2\u011e^\3\2\2\2\u011f\u0120\t\23\2\2\u0120`\3\2\2\2\u0121"+
		"\u0122\t\24\2\2\u0122b\3\2\2\2\u0123\u0124\t\25\2\2\u0124d\3\2\2\2\u0125"+
		"\u0126\t\26\2\2\u0126f\3\2\2\2\u0127\u0128\t\27\2\2\u0128h\3\2\2\2\u0129"+
		"\u012a\t\30\2\2\u012aj\3\2\2\2\u012b\u012c\t\31\2\2\u012cl\3\2\2\2\u012d"+
		"\u012e\t\32\2\2\u012en\3\2\2\2\u012f\u0130\t\33\2\2\u0130p\3\2\2\2\u0131"+
		"\u0135\t\34\2\2\u0132\u0134\t\35\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136r\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013a\7G\2\2\u0139\u013b\t\36\2\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5u;\2\u013d\u013c\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140t"+
		"\3\2\2\2\u0141\u0142\t\37\2\2\u0142v\3\2\2\2\u0143\u014b\7$\2\2\u0144"+
		"\u0145\7^\2\2\u0145\u014a\13\2\2\2\u0146\u0147\7$\2\2\u0147\u014a\7$\2"+
		"\2\u0148\u014a\n \2\2\u0149\u0144\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014fx\3\2\2\2\u0150"+
		"\u0158\7)\2\2\u0151\u0152\7^\2\2\u0152\u0157\13\2\2\2\u0153\u0154\7)\2"+
		"\2\u0154\u0157\7)\2\2\u0155\u0157\n!\2\2\u0156\u0151\3\2\2\2\u0156\u0153"+
		"\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7)"+
		"\2\2\u015cz\3\2\2\2\u015d\u0165\7b\2\2\u015e\u015f\7^\2\2\u015f\u0164"+
		"\13\2\2\2\u0160\u0161\7b\2\2\u0161\u0164\7b\2\2\u0162\u0164\n\"\2\2\u0163"+
		"\u015e\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7b\2\2\u0169|\3\2\2\2\u016a\u016c\7\17\2\2"+
		"\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\7\f\2\2\u016e~\3\2\2\2\u016f\u0171\t#\2\2\u0170\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\b@\2\2\u0175\u0080\3\2\2\2\31\2\u00c4\u00c9\u00ce\u00d0\u00d6\u00db"+
		"\u00e3\u00e5\u00eb\u00f2\u00f6\u0135\u013a\u013f\u0149\u014b\u0156\u0158"+
		"\u0163\u0165\u016b\u0172\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}