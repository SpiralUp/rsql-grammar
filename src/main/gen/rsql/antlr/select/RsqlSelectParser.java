// Generated from D:/v/test/antlr/rsql2/src/main/antlr\RsqlSelect.g4 by ANTLR 4.8
package rsql.antlr.select;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RsqlSelectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AVG=2, MAX=3, MIN=4, SUM=5, ALL=6, DIST=7, COUNT=8, GRP=9, DOT=10, 
		LR_BRACKET=11, RR_BRACKET=12, COMMA=13, SEMI=14, AT_SIGN=15, SINGLE_QUOTE_SYMB=16, 
		DOUBLE_QUOTE_SYMB=17, REVERSE_QUOTE_SYMB=18, COLON_SYMB=19, STRING_LITERAL=20, 
		DECIMAL_LITERAL=21, REAL_LITERAL=22, DOT_ID=23, ID=24, NEWLINE=25, WS=26;
	public static final int
		RULE_select = 0, RULE_selectElements = 1, RULE_selectElement = 2, RULE_functionCall = 3, 
		RULE_aggregateFunction = 4, RULE_functionArgs = 5, RULE_functionArg = 6, 
		RULE_simpleField = 7, RULE_field = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"select", "selectElements", "selectElement", "functionCall", "aggregateFunction", 
			"functionArgs", "functionArg", "simpleField", "field"
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

	@Override
	public String getGrammarFileName() { return "RsqlSelect.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RsqlSelectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SelectContext extends ParserRuleContext {
		public List<SelectElementsContext> selectElements() {
			return getRuleContexts(SelectElementsContext.class);
		}
		public SelectElementsContext selectElements(int i) {
			return getRuleContext(SelectElementsContext.class,i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				selectElements();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << GRP) | (1L << ID))) != 0) );
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

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RsqlSelectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RsqlSelectParser.COMMA, i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(23);
				((SelectElementsContext)_localctx).star = match(T__0);
				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GRP:
			case ID:
				{
				setState(24);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(27);
				match(COMMA);
				setState(28);
				selectElement();
				}
				}
				setState(33);
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

	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeFuncCallContext extends SelectElementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode COLON_SYMB() { return getToken(RsqlSelectParser.COLON_SYMB, 0); }
		public SimpleFieldContext simpleField() {
			return getRuleContext(SimpleFieldContext.class,0);
		}
		public SeFuncCallContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSeFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSeFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSeFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeFieldContext extends SelectElementContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode COLON_SYMB() { return getToken(RsqlSelectParser.COLON_SYMB, 0); }
		public SimpleFieldContext simpleField() {
			return getRuleContext(SimpleFieldContext.class,0);
		}
		public SeFieldContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSeField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSeField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSeField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeAllContext extends SelectElementContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RsqlSelectParser.DOT, 0); }
		public SeAllContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSeAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSeAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSeAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectElement);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SeAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				field();
				setState(35);
				match(DOT);
				setState(36);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new SeFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				field();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_SYMB) {
					{
					setState(39);
					match(COLON_SYMB);
					setState(40);
					simpleField();
					}
				}

				}
				break;
			case 3:
				_localctx = new SeFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				functionCall();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_SYMB) {
					{
					setState(44);
					match(COLON_SYMB);
					setState(45);
					simpleField();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			aggregateFunction();
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

	public static class AggregateFunctionContext extends ParserRuleContext {
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
	 
		public AggregateFunctionContext() { }
		public void copyFrom(AggregateFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CountAllContext extends AggregateFunctionContext {
		public Token starArg;
		public Token aggregator;
		public TerminalNode COUNT() { return getToken(RsqlSelectParser.COUNT, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RsqlSelectParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(RsqlSelectParser.RR_BRACKET, 0); }
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode ALL() { return getToken(RsqlSelectParser.ALL, 0); }
		public CountAllContext(AggregateFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterCountAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitCountAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitCountAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends AggregateFunctionContext {
		public Token aggregator;
		public TerminalNode LR_BRACKET() { return getToken(RsqlSelectParser.LR_BRACKET, 0); }
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlSelectParser.RR_BRACKET, 0); }
		public TerminalNode AVG() { return getToken(RsqlSelectParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(RsqlSelectParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(RsqlSelectParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(RsqlSelectParser.SUM, 0); }
		public TerminalNode GRP() { return getToken(RsqlSelectParser.GRP, 0); }
		public TerminalNode ALL() { return getToken(RsqlSelectParser.ALL, 0); }
		public TerminalNode DIST() { return getToken(RsqlSelectParser.DIST, 0); }
		public FuncCallContext(AggregateFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountDistContext extends AggregateFunctionContext {
		public Token aggregator;
		public TerminalNode COUNT() { return getToken(RsqlSelectParser.COUNT, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RsqlSelectParser.LR_BRACKET, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RsqlSelectParser.RR_BRACKET, 0); }
		public TerminalNode DIST() { return getToken(RsqlSelectParser.DIST, 0); }
		public CountDistContext(AggregateFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterCountDist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitCountDist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitCountDist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aggregateFunction);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << GRP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				match(LR_BRACKET);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DIST) {
					{
					setState(54);
					((FuncCallContext)_localctx).aggregator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DIST) ) {
						((FuncCallContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(57);
				functionArg();
				setState(58);
				match(RR_BRACKET);
				}
				break;
			case 2:
				_localctx = new CountAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(COUNT);
				setState(61);
				match(LR_BRACKET);
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(62);
					((CountAllContext)_localctx).starArg = match(T__0);
					}
					break;
				case AVG:
				case MAX:
				case MIN:
				case SUM:
				case ALL:
				case COUNT:
				case GRP:
				case ID:
					{
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL) {
						{
						setState(63);
						((CountAllContext)_localctx).aggregator = match(ALL);
						}
					}

					setState(66);
					functionArg();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69);
				match(RR_BRACKET);
				}
				break;
			case 3:
				_localctx = new CountDistContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(COUNT);
				setState(71);
				match(LR_BRACKET);
				setState(72);
				((CountDistContext)_localctx).aggregator = match(DIST);
				setState(73);
				functionArgs();
				setState(74);
				match(RR_BRACKET);
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

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RsqlSelectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RsqlSelectParser.COMMA, i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			functionArg();
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				functionArg();
				}
				}
				setState(85);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArg);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				field();
				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GRP:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				functionCall();
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

	public static class SimpleFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RsqlSelectParser.ID, 0); }
		public SimpleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterSimpleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitSimpleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitSimpleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFieldContext simpleField() throws RecognitionException {
		SimpleFieldContext _localctx = new SimpleFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
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
		public TerminalNode ID() { return getToken(RsqlSelectParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(RsqlSelectParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(RsqlSelectParser.DOT_ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RsqlSelectListener ) ((RsqlSelectListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RsqlSelectVisitor ) return ((RsqlSelectVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(93);
				match(DOT_ID);
				}
				}
				setState(98);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\5\3\34\n\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\5\4\61\n\4\5\4\63\n\4"+
		"\3\5\3\5\3\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6"+
		"\5\6F\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\7\7T\n\7\f"+
		"\7\16\7W\13\7\3\b\3\b\5\b[\n\b\3\t\3\t\3\n\3\n\7\na\n\n\f\n\16\nd\13\n"+
		"\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\4\7\13\13\3\2\b\t\2k\2\25\3\2"+
		"\2\2\4\33\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16Z"+
		"\3\2\2\2\20\\\3\2\2\2\22^\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\34\7\3\2\2\32\34\5"+
		"\6\4\2\33\31\3\2\2\2\33\32\3\2\2\2\34!\3\2\2\2\35\36\7\17\2\2\36 \5\6"+
		"\4\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2"+
		"\2\2$%\5\22\n\2%&\7\f\2\2&\'\7\3\2\2\'\63\3\2\2\2(+\5\22\n\2)*\7\25\2"+
		"\2*,\5\20\t\2+)\3\2\2\2+,\3\2\2\2,\63\3\2\2\2-\60\5\b\5\2./\7\25\2\2/"+
		"\61\5\20\t\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62$\3\2\2\2\62(\3"+
		"\2\2\2\62-\3\2\2\2\63\7\3\2\2\2\64\65\5\n\6\2\65\t\3\2\2\2\66\67\t\2\2"+
		"\2\679\7\r\2\28:\t\3\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\16\b\2<=\7"+
		"\16\2\2=O\3\2\2\2>?\7\n\2\2?E\7\r\2\2@F\7\3\2\2AC\7\b\2\2BA\3\2\2\2BC"+
		"\3\2\2\2CD\3\2\2\2DF\5\16\b\2E@\3\2\2\2EB\3\2\2\2FG\3\2\2\2GO\7\16\2\2"+
		"HI\7\n\2\2IJ\7\r\2\2JK\7\t\2\2KL\5\f\7\2LM\7\16\2\2MO\3\2\2\2N\66\3\2"+
		"\2\2N>\3\2\2\2NH\3\2\2\2O\13\3\2\2\2PU\5\16\b\2QR\7\17\2\2RT\5\16\b\2"+
		"SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2X[\5\22\n"+
		"\2Y[\5\b\5\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\]\7\32\2\2]\21\3\2\2\2^"+
		"b\7\32\2\2_a\7\31\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\23\3\2"+
		"\2\2db\3\2\2\2\17\27\33!+\60\629BENUZb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}