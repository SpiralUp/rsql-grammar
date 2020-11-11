// Generated from /home/vrba/v/rsql-parser/src/main/antlr/RsqlWhere.g4 by ANTLR 4.8
package rsql.antlr.where;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, OR=7, GT=8, LT=9, GE=10, 
		LE=11, LIKE=12, IN=13, BT=14, DOT=15, LR_BRACKET=16, RR_BRACKET=17, COMMA=18, 
		SEMI=19, AT_SIGN=20, SINGLE_QUOTE_SYMB=21, DOUBLE_QUOTE_SYMB=22, REVERSE_QUOTE_SYMB=23, 
		COLON_SYMB=24, DATE_LITERAL=25, DATETIME_LITERAL=26, STRING_LITERAL=27, 
		DECIMAL_LITERAL=28, REAL_LITERAL=29, DOT_ID=30, ID=31, NEWLINE=32, WS=33;
	public static final int
		RULE_where = 0, RULE_condition = 1, RULE_inList = 2, RULE_inListElement = 3, 
		RULE_singleCondition = 4, RULE_operator = 5, RULE_operatorEQ = 6, RULE_operatorNEQ = 7, 
		RULE_operatorGT = 8, RULE_operatorLT = 9, RULE_operatorGE = 10, RULE_operatorLE = 11, 
		RULE_operatorLIKE = 12, RULE_operatorIN = 13, RULE_operatorBT = 14, RULE_field = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"where", "condition", "inList", "inListElement", "singleCondition", "operator", 
			"operatorEQ", "operatorNEQ", "operatorGT", "operatorLT", "operatorGE", 
			"operatorLE", "operatorLIKE", "operatorIN", "operatorBT", "field"
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
			"COLON_SYMB", "DATE_LITERAL", "DATETIME_LITERAL", "STRING_LITERAL", "DECIMAL_LITERAL", 
			"REAL_LITERAL", "DOT_ID", "ID", "NEWLINE", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				condition(0);
				}
				}
				setState(35); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterConditionSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitConditionSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitConditionSingle(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitConditionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitConditionAnd(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterConditionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitConditionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitConditionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionParensContext extends ConditionContext {
		public TerminalNode LR_BRACKET() { return getToken(RsqlWhereParser.LR_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlWhereParser.RR_BRACKET, 0); }
		public ConditionParensContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterConditionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitConditionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitConditionParens(this);
			else return visitor.visitChildren(this);
		}
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ConditionSingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				singleCondition();
				}
				break;
			case LR_BRACKET:
				{
				_localctx = new ConditionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(LR_BRACKET);
				setState(40);
				condition(0);
				setState(41);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionAndContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(45);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(46);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==SEMI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						condition(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionOrContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(48);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(49);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==COMMA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						condition(2);
						}
						break;
					}
					} 
				}
				setState(55);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InListContext inList() throws RecognitionException {
		InListContext _localctx = new InListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			inListElement();
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(57);
				match(COMMA);
				setState(58);
				inListElement();
				}
				}
				setState(63);
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
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public InListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterInListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitInListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitInListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InListElementContext inListElement() throws RecognitionException {
		InListElementContext _localctx = new InListElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inListElement);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(STRING_LITERAL);
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(DATE_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(DATETIME_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(DECIMAL_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(REAL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionOtherField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionOtherField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionOtherField(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionDate(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionIn(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionString(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionDatetime(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionDecimal(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionReal(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterSingleConditionBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitSingleConditionBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitSingleConditionBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleConditionContext singleCondition() throws RecognitionException {
		SingleConditionContext _localctx = new SingleConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleCondition);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SingleConditionBetweenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				field();
				setState(73);
				operatorBT();
				setState(74);
				match(LR_BRACKET);
				setState(75);
				inListElement();
				setState(76);
				match(COMMA);
				setState(77);
				inListElement();
				setState(78);
				match(RR_BRACKET);
				}
				break;
			case 2:
				_localctx = new SingleConditionInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				field();
				setState(81);
				operatorIN();
				setState(82);
				match(LR_BRACKET);
				setState(83);
				inList();
				setState(84);
				match(RR_BRACKET);
				}
				break;
			case 3:
				_localctx = new SingleConditionStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				field();
				setState(87);
				operator();
				setState(88);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new SingleConditionDateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				field();
				setState(91);
				operator();
				setState(92);
				match(DATE_LITERAL);
				}
				break;
			case 5:
				_localctx = new SingleConditionDatetimeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				field();
				setState(95);
				operator();
				setState(96);
				match(DATETIME_LITERAL);
				}
				break;
			case 6:
				_localctx = new SingleConditionDecimalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				field();
				setState(99);
				operator();
				setState(100);
				match(DECIMAL_LITERAL);
				}
				break;
			case 7:
				_localctx = new SingleConditionRealContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				field();
				setState(103);
				operator();
				setState(104);
				match(REAL_LITERAL);
				}
				break;
			case 8:
				_localctx = new SingleConditionOtherFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				field();
				setState(107);
				operator();
				setState(108);
				field();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				operatorEQ();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				operatorNEQ();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				operatorLT();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				operatorGT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				operatorLE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				operatorGE();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
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

	public static class OperatorEQContext extends ParserRuleContext {
		public OperatorEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorEQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorEQContext operatorEQ() throws RecognitionException {
		OperatorEQContext _localctx = new OperatorEQContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operatorEQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorNEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorNEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorNEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorNEQContext operatorNEQ() throws RecognitionException {
		OperatorNEQContext _localctx = new OperatorNEQContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operatorNEQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorGT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorGTContext operatorGT() throws RecognitionException {
		OperatorGTContext _localctx = new OperatorGTContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operatorGT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__3);
			setState(126);
			match(GT);
			setState(127);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorLT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorLTContext operatorLT() throws RecognitionException {
		OperatorLTContext _localctx = new OperatorLTContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operatorLT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__3);
			setState(130);
			match(LT);
			setState(131);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorGEContext operatorGE() throws RecognitionException {
		OperatorGEContext _localctx = new OperatorGEContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operatorGE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__3);
			setState(134);
			match(GE);
			setState(135);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorLEContext operatorLE() throws RecognitionException {
		OperatorLEContext _localctx = new OperatorLEContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operatorLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__3);
			setState(138);
			match(LE);
			setState(139);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorLIKE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorLIKE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorLIKE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorLIKEContext operatorLIKE() throws RecognitionException {
		OperatorLIKEContext _localctx = new OperatorLIKEContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operatorLIKE);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__4);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__3);
				setState(143);
				match(LIKE);
				setState(144);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorIN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorINContext operatorIN() throws RecognitionException {
		OperatorINContext _localctx = new OperatorINContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operatorIN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__3);
			setState(148);
			match(IN);
			setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterOperatorBT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitOperatorBT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitOperatorBT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBTContext operatorBT() throws RecognitionException {
		OperatorBTContext _localctx = new OperatorBTContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operatorBT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__3);
			setState(152);
			match(BT);
			setState(153);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlWhereListener ) ((RsqlWhereListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlWhereVisitor ) return ((RsqlWhereVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(DOT_ID);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7z\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0094\n\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00a0\n\21\f\21\16"+
		"\21\u00a3\13\21\3\21\2\3\4\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\2\5\4\2\b\b\25\25\4\2\t\t\24\24\3\2\4\5\2\u00ad\2#\3\2\2\2\4-\3\2\2\2"+
		"\6:\3\2\2\2\bH\3\2\2\2\np\3\2\2\2\fy\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22"+
		"\177\3\2\2\2\24\u0083\3\2\2\2\26\u0087\3\2\2\2\30\u008b\3\2\2\2\32\u0093"+
		"\3\2\2\2\34\u0095\3\2\2\2\36\u0099\3\2\2\2 \u009d\3\2\2\2\"$\5\4\3\2#"+
		"\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\b\3\1\2(.\5\n\6"+
		"\2)*\7\22\2\2*+\5\4\3\2+,\7\23\2\2,.\3\2\2\2-\'\3\2\2\2-)\3\2\2\2.\67"+
		"\3\2\2\2/\60\f\4\2\2\60\61\t\2\2\2\61\66\5\4\3\5\62\63\f\3\2\2\63\64\t"+
		"\3\2\2\64\66\5\4\3\4\65/\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:?\5\b\5\2;<\7\24\2\2<>\5\b\5\2="+
		";\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BI\7\35\2"+
		"\2CI\7\33\2\2DI\7\34\2\2EI\7\36\2\2FI\7\37\2\2GI\5 \21\2HB\3\2\2\2HC\3"+
		"\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\t\3\2\2\2JK\5 \21\2KL"+
		"\5\36\20\2LM\7\22\2\2MN\5\b\5\2NO\7\24\2\2OP\5\b\5\2PQ\7\23\2\2Qq\3\2"+
		"\2\2RS\5 \21\2ST\5\34\17\2TU\7\22\2\2UV\5\6\4\2VW\7\23\2\2Wq\3\2\2\2X"+
		"Y\5 \21\2YZ\5\f\7\2Z[\7\35\2\2[q\3\2\2\2\\]\5 \21\2]^\5\f\7\2^_\7\33\2"+
		"\2_q\3\2\2\2`a\5 \21\2ab\5\f\7\2bc\7\34\2\2cq\3\2\2\2de\5 \21\2ef\5\f"+
		"\7\2fg\7\36\2\2gq\3\2\2\2hi\5 \21\2ij\5\f\7\2jk\7\37\2\2kq\3\2\2\2lm\5"+
		" \21\2mn\5\f\7\2no\5 \21\2oq\3\2\2\2pJ\3\2\2\2pR\3\2\2\2pX\3\2\2\2p\\"+
		"\3\2\2\2p`\3\2\2\2pd\3\2\2\2ph\3\2\2\2pl\3\2\2\2q\13\3\2\2\2rz\5\16\b"+
		"\2sz\5\20\t\2tz\5\24\13\2uz\5\22\n\2vz\5\30\r\2wz\5\26\f\2xz\5\32\16\2"+
		"yr\3\2\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2"+
		"z\r\3\2\2\2{|\7\3\2\2|\17\3\2\2\2}~\t\4\2\2~\21\3\2\2\2\177\u0080\7\6"+
		"\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7\6\2\2\u0082\23\3\2\2\2\u0083\u0084"+
		"\7\6\2\2\u0084\u0085\7\13\2\2\u0085\u0086\7\6\2\2\u0086\25\3\2\2\2\u0087"+
		"\u0088\7\6\2\2\u0088\u0089\7\f\2\2\u0089\u008a\7\6\2\2\u008a\27\3\2\2"+
		"\2\u008b\u008c\7\6\2\2\u008c\u008d\7\r\2\2\u008d\u008e\7\6\2\2\u008e\31"+
		"\3\2\2\2\u008f\u0094\7\7\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7\16\2\2"+
		"\u0092\u0094\7\6\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0094\33"+
		"\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7\17\2\2\u0097\u0098\7\6\2\2"+
		"\u0098\35\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\7\20\2\2\u009b\u009c"+
		"\7\6\2\2\u009c\37\3\2\2\2\u009d\u00a1\7!\2\2\u009e\u00a0\7 \2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2!\3\2\2\2\u00a3\u00a1\3\2\2\2\f%-\65\67?Hpy\u0093\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}