// Generated from /home/vrba/v/rsql-parser/src/main/antlr/RsqlWhere.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RsqlWhereParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, OR=7, NULL=8, GT=9, LT=10, 
		GE=11, LE=12, LIKE=13, NIN=14, IN=15, BT=16, DOT=17, LR_BRACKET=18, RR_BRACKET=19, 
		COMMA=20, SEMI=21, AT_SIGN=22, SINGLE_QUOTE_SYMB=23, DOUBLE_QUOTE_SYMB=24, 
		REVERSE_QUOTE_SYMB=25, PARAM_LITERAL=26, DATE_LITERAL=27, DATETIME_LITERAL=28, 
		ENUM_LITERAL=29, STRING_LITERAL=30, DECIMAL_LITERAL=31, REAL_LITERAL=32, 
		DOT_ID=33, ID=34, NEWLINE=35, WS=36;
	public static final int
		RULE_where = 0, RULE_condition = 1, RULE_inList = 2, RULE_inListElement = 3, 
		RULE_singleCondition = 4, RULE_operator = 5, RULE_operatorBasic = 6, RULE_operatorEQ = 7, 
		RULE_operatorNEQ = 8, RULE_operatorGT = 9, RULE_operatorLT = 10, RULE_operatorGE = 11, 
		RULE_operatorLE = 12, RULE_operatorLIKE = 13, RULE_operatorIN = 14, RULE_operatorNIN = 15, 
		RULE_operatorBT = 16, RULE_field = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"where", "condition", "inList", "inListElement", "singleCondition", "operator", 
			"operatorBasic", "operatorEQ", "operatorNEQ", "operatorGT", "operatorLT", 
			"operatorGE", "operatorLE", "operatorLIKE", "operatorIN", "operatorNIN", 
			"operatorBT", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'=!'", "'!='", "'='", "'=*'", null, null, null, null, 
			null, null, null, null, null, null, null, "'.'", "'('", "')'", "','", 
			"';'", "'@'", "'''", "'\"'", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "AND", "OR", "NULL", "GT", "LT", 
			"GE", "LE", "LIKE", "NIN", "IN", "BT", "DOT", "LR_BRACKET", "RR_BRACKET", 
			"COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", 
			"REVERSE_QUOTE_SYMB", "PARAM_LITERAL", "DATE_LITERAL", "DATETIME_LITERAL", 
			"ENUM_LITERAL", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", 
			"DOT_ID", "ID", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "RsqlWhere.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RsqlWhereParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WhereContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				condition(0);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LR_BRACKET || _la==ID );
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionSingleContext extends ConditionContext {
		public SingleConditionContext singleCondition() {
			return getRuleContext(SingleConditionContext.class,0);
		}
		public ConditionSingleContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionAndContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(RsqlWhereParser.AND, 0); }
		public TerminalNode SEMI() { return getToken(RsqlWhereParser.SEMI, 0); }
		public ConditionAndContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionOrContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(RsqlWhereParser.OR, 0); }
		public TerminalNode COMMA() { return getToken(RsqlWhereParser.COMMA, 0); }
		public ConditionOrContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionParensContext extends ConditionContext {
		public TerminalNode LR_BRACKET() { return getToken(RsqlWhereParser.LR_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlWhereParser.RR_BRACKET, 0); }
		public ConditionParensContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ConditionSingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42);
				singleCondition();
				}
				break;
			case LR_BRACKET:
				{
				_localctx = new ConditionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(LR_BRACKET);
				setState(44);
				condition(0);
				setState(45);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionAndContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(49);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(50);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(51);
						condition(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionOrContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(52);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(53);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==COMMA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						condition(2);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InListContext extends ParserRuleContext {
		public List<InListElementContext> inListElement() {
			return getRuleContexts(InListElementContext.class);
		}
		public InListElementContext inListElement(int i) {
			return getRuleContext(InListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RsqlWhereParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RsqlWhereParser.COMMA, i);
		}
		public InListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inList; }
	}

	public final InListContext inList() throws RecognitionException {
		InListContext _localctx = new InListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			inListElement();
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(61);
				match(COMMA);
				setState(62);
				inListElement();
				}
				}
				setState(67);
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

	public static class InListElementContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(RsqlWhereParser.STRING_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(RsqlWhereParser.DATE_LITERAL, 0); }
		public TerminalNode DATETIME_LITERAL() { return getToken(RsqlWhereParser.DATETIME_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(RsqlWhereParser.DECIMAL_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(RsqlWhereParser.REAL_LITERAL, 0); }
		public TerminalNode ENUM_LITERAL() { return getToken(RsqlWhereParser.ENUM_LITERAL, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public InListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inListElement; }
	}

	public final InListElementContext inListElement() throws RecognitionException {
		InListElementContext _localctx = new InListElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inListElement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(STRING_LITERAL);
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(DATE_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(DATETIME_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(DECIMAL_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(REAL_LITERAL);
				}
				break;
			case ENUM_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(ENUM_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				field();
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

	public static class SingleConditionContext extends ParserRuleContext {
		public SingleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCondition; }
	 
		public SingleConditionContext() { }
		public void copyFrom(SingleConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleConditionOtherFieldContext extends SingleConditionContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public SingleConditionOtherFieldContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionNullContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorBasicContext operatorBasic() {
			return getRuleContext(OperatorBasicContext.class,0);
		}
		public TerminalNode NULL() { return getToken(RsqlWhereParser.NULL, 0); }
		public SingleConditionNullContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionEnumContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorBasicContext operatorBasic() {
			return getRuleContext(OperatorBasicContext.class,0);
		}
		public TerminalNode ENUM_LITERAL() { return getToken(RsqlWhereParser.ENUM_LITERAL, 0); }
		public SingleConditionEnumContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionParamContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode PARAM_LITERAL() { return getToken(RsqlWhereParser.PARAM_LITERAL, 0); }
		public SingleConditionParamContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionDateContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode DATE_LITERAL() { return getToken(RsqlWhereParser.DATE_LITERAL, 0); }
		public SingleConditionDateContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionNotInContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorNINContext operatorNIN() {
			return getRuleContext(OperatorNINContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RsqlWhereParser.LR_BRACKET, 0); }
		public InListContext inList() {
			return getRuleContext(InListContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlWhereParser.RR_BRACKET, 0); }
		public SingleConditionNotInContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionInContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorINContext operatorIN() {
			return getRuleContext(OperatorINContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RsqlWhereParser.LR_BRACKET, 0); }
		public InListContext inList() {
			return getRuleContext(InListContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlWhereParser.RR_BRACKET, 0); }
		public SingleConditionInContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionStringContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(RsqlWhereParser.STRING_LITERAL, 0); }
		public SingleConditionStringContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionDatetimeContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode DATETIME_LITERAL() { return getToken(RsqlWhereParser.DATETIME_LITERAL, 0); }
		public SingleConditionDatetimeContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionDecimalContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(RsqlWhereParser.DECIMAL_LITERAL, 0); }
		public SingleConditionDecimalContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionRealContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(RsqlWhereParser.REAL_LITERAL, 0); }
		public SingleConditionRealContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleConditionBetweenContext extends SingleConditionContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperatorBTContext operatorBT() {
			return getRuleContext(OperatorBTContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RsqlWhereParser.LR_BRACKET, 0); }
		public List<InListElementContext> inListElement() {
			return getRuleContexts(InListElementContext.class);
		}
		public InListElementContext inListElement(int i) {
			return getRuleContext(InListElementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RsqlWhereParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(RsqlWhereParser.RR_BRACKET, 0); }
		public SingleConditionBetweenContext(SingleConditionContext ctx) { copyFrom(ctx); }
	}

	public final SingleConditionContext singleCondition() throws RecognitionException {
		SingleConditionContext _localctx = new SingleConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleCondition);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SingleConditionBetweenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				field();
				setState(78);
				operatorBT();
				setState(79);
				match(LR_BRACKET);
				setState(80);
				inListElement();
				setState(81);
				match(COMMA);
				setState(82);
				inListElement();
				setState(83);
				match(RR_BRACKET);
				}
				break;
			case 2:
				_localctx = new SingleConditionInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				field();
				setState(86);
				operatorIN();
				setState(87);
				match(LR_BRACKET);
				setState(88);
				inList();
				setState(89);
				match(RR_BRACKET);
				}
				break;
			case 3:
				_localctx = new SingleConditionNotInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				field();
				setState(92);
				operatorNIN();
				setState(93);
				match(LR_BRACKET);
				setState(94);
				inList();
				setState(95);
				match(RR_BRACKET);
				}
				break;
			case 4:
				_localctx = new SingleConditionStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				field();
				setState(98);
				operator();
				setState(99);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				_localctx = new SingleConditionDateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				field();
				setState(102);
				operator();
				setState(103);
				match(DATE_LITERAL);
				}
				break;
			case 6:
				_localctx = new SingleConditionDatetimeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				field();
				setState(106);
				operator();
				setState(107);
				match(DATETIME_LITERAL);
				}
				break;
			case 7:
				_localctx = new SingleConditionDecimalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				field();
				setState(110);
				operator();
				setState(111);
				match(DECIMAL_LITERAL);
				}
				break;
			case 8:
				_localctx = new SingleConditionRealContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				field();
				setState(114);
				operator();
				setState(115);
				match(REAL_LITERAL);
				}
				break;
			case 9:
				_localctx = new SingleConditionOtherFieldContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				field();
				setState(118);
				operator();
				setState(119);
				field();
				}
				break;
			case 10:
				_localctx = new SingleConditionEnumContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				field();
				setState(122);
				operatorBasic();
				setState(123);
				match(ENUM_LITERAL);
				}
				break;
			case 11:
				_localctx = new SingleConditionNullContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				field();
				setState(126);
				operatorBasic();
				setState(127);
				match(NULL);
				}
				break;
			case 12:
				_localctx = new SingleConditionParamContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(129);
				field();
				setState(130);
				operator();
				setState(131);
				match(PARAM_LITERAL);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorEQContext operatorEQ() {
			return getRuleContext(OperatorEQContext.class,0);
		}
		public OperatorNEQContext operatorNEQ() {
			return getRuleContext(OperatorNEQContext.class,0);
		}
		public OperatorLTContext operatorLT() {
			return getRuleContext(OperatorLTContext.class,0);
		}
		public OperatorGTContext operatorGT() {
			return getRuleContext(OperatorGTContext.class,0);
		}
		public OperatorLEContext operatorLE() {
			return getRuleContext(OperatorLEContext.class,0);
		}
		public OperatorGEContext operatorGE() {
			return getRuleContext(OperatorGEContext.class,0);
		}
		public OperatorLIKEContext operatorLIKE() {
			return getRuleContext(OperatorLIKEContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				operatorEQ();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				operatorNEQ();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				operatorLT();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				operatorGT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				operatorLE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				operatorGE();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				operatorLIKE();
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

	public static class OperatorBasicContext extends ParserRuleContext {
		public OperatorEQContext operatorEQ() {
			return getRuleContext(OperatorEQContext.class,0);
		}
		public OperatorNEQContext operatorNEQ() {
			return getRuleContext(OperatorNEQContext.class,0);
		}
		public OperatorBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBasic; }
	}

	public final OperatorBasicContext operatorBasic() throws RecognitionException {
		OperatorBasicContext _localctx = new OperatorBasicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operatorBasic);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				operatorEQ();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				operatorNEQ();
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

	public static class OperatorEQContext extends ParserRuleContext {
		public OperatorEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorEQ; }
	}

	public final OperatorEQContext operatorEQ() throws RecognitionException {
		OperatorEQContext _localctx = new OperatorEQContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatorEQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__0);
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

	public static class OperatorNEQContext extends ParserRuleContext {
		public OperatorNEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorNEQ; }
	}

	public final OperatorNEQContext operatorNEQ() throws RecognitionException {
		OperatorNEQContext _localctx = new OperatorNEQContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operatorNEQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class OperatorGTContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(RsqlWhereParser.GT, 0); }
		public OperatorGTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorGT; }
	}

	public final OperatorGTContext operatorGT() throws RecognitionException {
		OperatorGTContext _localctx = new OperatorGTContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operatorGT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__3);
			setState(153);
			match(GT);
			setState(154);
			match(T__3);
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

	public static class OperatorLTContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RsqlWhereParser.LT, 0); }
		public OperatorLTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLT; }
	}

	public final OperatorLTContext operatorLT() throws RecognitionException {
		OperatorLTContext _localctx = new OperatorLTContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operatorLT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__3);
			setState(157);
			match(LT);
			setState(158);
			match(T__3);
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

	public static class OperatorGEContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(RsqlWhereParser.GE, 0); }
		public OperatorGEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorGE; }
	}

	public final OperatorGEContext operatorGE() throws RecognitionException {
		OperatorGEContext _localctx = new OperatorGEContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operatorGE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__3);
			setState(161);
			match(GE);
			setState(162);
			match(T__3);
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

	public static class OperatorLEContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(RsqlWhereParser.LE, 0); }
		public OperatorLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLE; }
	}

	public final OperatorLEContext operatorLE() throws RecognitionException {
		OperatorLEContext _localctx = new OperatorLEContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operatorLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__3);
			setState(165);
			match(LE);
			setState(166);
			match(T__3);
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

	public static class OperatorLIKEContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(RsqlWhereParser.LIKE, 0); }
		public OperatorLIKEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLIKE; }
	}

	public final OperatorLIKEContext operatorLIKE() throws RecognitionException {
		OperatorLIKEContext _localctx = new OperatorLIKEContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operatorLIKE);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__4);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__3);
				setState(170);
				match(LIKE);
				setState(171);
				match(T__3);
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

	public static class OperatorINContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(RsqlWhereParser.IN, 0); }
		public OperatorINContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorIN; }
	}

	public final OperatorINContext operatorIN() throws RecognitionException {
		OperatorINContext _localctx = new OperatorINContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operatorIN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__3);
			setState(175);
			match(IN);
			setState(176);
			match(T__3);
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

	public static class OperatorNINContext extends ParserRuleContext {
		public TerminalNode NIN() { return getToken(RsqlWhereParser.NIN, 0); }
		public OperatorNINContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorNIN; }
	}

	public final OperatorNINContext operatorNIN() throws RecognitionException {
		OperatorNINContext _localctx = new OperatorNINContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operatorNIN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__3);
			setState(179);
			match(NIN);
			setState(180);
			match(T__3);
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

	public static class OperatorBTContext extends ParserRuleContext {
		public TerminalNode BT() { return getToken(RsqlWhereParser.BT, 0); }
		public OperatorBTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBT; }
	}

	public final OperatorBTContext operatorBT() throws RecognitionException {
		OperatorBTContext _localctx = new OperatorBTContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operatorBT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__3);
			setState(183);
			match(BT);
			setState(184);
			match(T__3);
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RsqlWhereParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(RsqlWhereParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(RsqlWhereParser.DOT_ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(DOT_ID);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\7\4B\n\4\f"+
		"\4\16\4E\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0088"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\5\b\u0095\n\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00af\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00bf\n\23\f\23"+
		"\16\23\u00c2\13\23\3\23\2\3\4\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\5\4\2\b\b\27\27\4\2\t\t\26\26\3\2\4\5\2\u00d0\2\'\3\2\2\2\4\61"+
		"\3\2\2\2\6>\3\2\2\2\bM\3\2\2\2\n\u0087\3\2\2\2\f\u0090\3\2\2\2\16\u0094"+
		"\3\2\2\2\20\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u009a\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a2\3\2\2\2\32\u00a6\3\2\2\2\34\u00ae\3\2\2\2\36\u00b0\3\2"+
		"\2\2 \u00b4\3\2\2\2\"\u00b8\3\2\2\2$\u00bc\3\2\2\2&(\5\4\3\2\'&\3\2\2"+
		"\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\b\3\1\2,\62\5\n\6\2-.\7"+
		"\24\2\2./\5\4\3\2/\60\7\25\2\2\60\62\3\2\2\2\61+\3\2\2\2\61-\3\2\2\2\62"+
		";\3\2\2\2\63\64\f\4\2\2\64\65\t\2\2\2\65:\5\4\3\5\66\67\f\3\2\2\678\t"+
		"\3\2\28:\5\4\3\49\63\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<\5\3\2\2\2=;\3\2\2\2>C\5\b\5\2?@\7\26\2\2@B\5\b\5\2A?\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EC\3\2\2\2FN\7 \2\2GN\7\35\2\2HN\7\36"+
		"\2\2IN\7!\2\2JN\7\"\2\2KN\7\37\2\2LN\5$\23\2MF\3\2\2\2MG\3\2\2\2MH\3\2"+
		"\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OP\5$\23\2PQ\5"+
		"\"\22\2QR\7\24\2\2RS\5\b\5\2ST\7\26\2\2TU\5\b\5\2UV\7\25\2\2V\u0088\3"+
		"\2\2\2WX\5$\23\2XY\5\36\20\2YZ\7\24\2\2Z[\5\6\4\2[\\\7\25\2\2\\\u0088"+
		"\3\2\2\2]^\5$\23\2^_\5 \21\2_`\7\24\2\2`a\5\6\4\2ab\7\25\2\2b\u0088\3"+
		"\2\2\2cd\5$\23\2de\5\f\7\2ef\7 \2\2f\u0088\3\2\2\2gh\5$\23\2hi\5\f\7\2"+
		"ij\7\35\2\2j\u0088\3\2\2\2kl\5$\23\2lm\5\f\7\2mn\7\36\2\2n\u0088\3\2\2"+
		"\2op\5$\23\2pq\5\f\7\2qr\7!\2\2r\u0088\3\2\2\2st\5$\23\2tu\5\f\7\2uv\7"+
		"\"\2\2v\u0088\3\2\2\2wx\5$\23\2xy\5\f\7\2yz\5$\23\2z\u0088\3\2\2\2{|\5"+
		"$\23\2|}\5\16\b\2}~\7\37\2\2~\u0088\3\2\2\2\177\u0080\5$\23\2\u0080\u0081"+
		"\5\16\b\2\u0081\u0082\7\n\2\2\u0082\u0088\3\2\2\2\u0083\u0084\5$\23\2"+
		"\u0084\u0085\5\f\7\2\u0085\u0086\7\34\2\2\u0086\u0088\3\2\2\2\u0087O\3"+
		"\2\2\2\u0087W\3\2\2\2\u0087]\3\2\2\2\u0087c\3\2\2\2\u0087g\3\2\2\2\u0087"+
		"k\3\2\2\2\u0087o\3\2\2\2\u0087s\3\2\2\2\u0087w\3\2\2\2\u0087{\3\2\2\2"+
		"\u0087\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\13\3\2\2\2\u0089\u0091\5"+
		"\20\t\2\u008a\u0091\5\22\n\2\u008b\u0091\5\26\f\2\u008c\u0091\5\24\13"+
		"\2\u008d\u0091\5\32\16\2\u008e\u0091\5\30\r\2\u008f\u0091\5\34\17\2\u0090"+
		"\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2"+
		"\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0095\5\20\t\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2"+
		"\2\u0094\u0093\3\2\2\2\u0095\17\3\2\2\2\u0096\u0097\7\3\2\2\u0097\21\3"+
		"\2\2\2\u0098\u0099\t\4\2\2\u0099\23\3\2\2\2\u009a\u009b\7\6\2\2\u009b"+
		"\u009c\7\13\2\2\u009c\u009d\7\6\2\2\u009d\25\3\2\2\2\u009e\u009f\7\6\2"+
		"\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\7\6\2\2\u00a1\27\3\2\2\2\u00a2\u00a3"+
		"\7\6\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7\6\2\2\u00a5\31\3\2\2\2\u00a6"+
		"\u00a7\7\6\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7\6\2\2\u00a9\33\3\2\2"+
		"\2\u00aa\u00af\7\7\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\7\17\2\2\u00ad"+
		"\u00af\7\6\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\35\3\2\2"+
		"\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\37\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\7\6\2"+
		"\2\u00b7!\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb"+
		"\7\6\2\2\u00bb#\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd\u00bf\7#\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"%\3\2\2\2\u00c2\u00c0\3\2\2\2\r)\619;CM\u0087\u0090\u0094\u00ae\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}