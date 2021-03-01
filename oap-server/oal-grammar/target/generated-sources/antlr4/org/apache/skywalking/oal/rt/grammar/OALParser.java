// Generated from org/apache/skywalking/oal/rt/grammar/OALParser.g4 by ANTLR 4.7.1
package org.apache.skywalking.oal.rt.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, FILTER=2, DISABLE=3, SRC_ALL=4, SRC_SERVICE=5, SRC_SERVICE_INSTANCE=6, 
		SRC_ENDPOINT=7, SRC_SERVICE_RELATION=8, SRC_SERVICE_INSTANCE_RELATION=9, 
		SRC_ENDPOINT_RELATION=10, SRC_SERVICE_INSTANCE_JVM_CPU=11, SRC_SERVICE_INSTANCE_JVM_MEMORY=12, 
		SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL=13, SRC_SERVICE_INSTANCE_JVM_GC=14, 
		SRC_SERVICE_INSTANCE_JVM_THREAD=15, SRC_DATABASE_ACCESS=16, SRC_SERVICE_INSTANCE_CLR_CPU=17, 
		SRC_SERVICE_INSTANCE_CLR_GC=18, SRC_SERVICE_INSTANCE_CLR_THREAD=19, SRC_ENVOY_INSTANCE_METRIC=20, 
		SRC_BROWSER_APP_PERF=21, SRC_BROWSER_APP_PAGE_PERF=22, SRC_BROWSER_APP_SINGLE_VERSION_PERF=23, 
		SRC_BROWSER_APP_TRAFFIC=24, SRC_BROWSER_APP_PAGE_TRAFFIC=25, SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC=26, 
		SRC_SEGMENT=27, SRC_TOP_N_DB_STATEMENT=28, SRC_ENDPOINT_RELATION_SERVER_SIDE=29, 
		SRC_SERVICE_RELATION_SERVER_SIDE=30, SRC_SERVICE_RELATION_CLIENT_SIDE=31, 
		SRC_ALARM_RECORD=32, SRC_HTTP_ACCESS_LOG=33, SRC_ZIPKIN_SPAN=34, SRC_JAEGER_SPAN=35, 
		SRC_PROFILE_TASK=36, SRC_PROFILE_TASK_LOG=37, SRC_PROFILE_THREAD_SHANPSHOT=38, 
		SRC_BROWSER_ERROR_LOG=39, DOT=40, LR_BRACKET=41, RR_BRACKET=42, LS_BRACKET=43, 
		RS_BRACKET=44, COMMA=45, SEMI=46, EQUAL=47, DUALEQUALS=48, ALL=49, GREATER=50, 
		LESS=51, GREATER_EQUAL=52, LESS_EQUAL=53, NOT_EQUAL=54, LIKE=55, IN=56, 
		BOOL_LITERAL=57, NUMBER_LITERAL=58, CHAR_LITERAL=59, STRING_LITERAL=60, 
		DelimitedComment=61, LineComment=62, SPACE=63, IDENTIFIER=64;
	public static final int
		RULE_root = 0, RULE_aggregationStatement = 1, RULE_disableStatement = 2, 
		RULE_metricStatement = 3, RULE_filterStatement = 4, RULE_filterExpression = 5, 
		RULE_source = 6, RULE_disableSource = 7, RULE_sourceAttribute = 8, RULE_variable = 9, 
		RULE_aggregateFunction = 10, RULE_functionName = 11, RULE_funcParamExpression = 12, 
		RULE_literalExpression = 13, RULE_expression = 14, RULE_booleanMatch = 15, 
		RULE_stringMatch = 16, RULE_greaterMatch = 17, RULE_lessMatch = 18, RULE_greaterEqualMatch = 19, 
		RULE_lessEqualMatch = 20, RULE_booleanNotEqualMatch = 21, RULE_notEqualMatch = 22, 
		RULE_likeMatch = 23, RULE_inMatch = 24, RULE_multiConditionValue = 25, 
		RULE_conditionAttribute = 26, RULE_booleanConditionValue = 27, RULE_stringConditionValue = 28, 
		RULE_enumConditionValue = 29, RULE_numberConditionValue = 30;
	public static final String[] ruleNames = {
		"root", "aggregationStatement", "disableStatement", "metricStatement", 
		"filterStatement", "filterExpression", "source", "disableSource", "sourceAttribute", 
		"variable", "aggregateFunction", "functionName", "funcParamExpression", 
		"literalExpression", "expression", "booleanMatch", "stringMatch", "greaterMatch", 
		"lessMatch", "greaterEqualMatch", "lessEqualMatch", "booleanNotEqualMatch", 
		"notEqualMatch", "likeMatch", "inMatch", "multiConditionValue", "conditionAttribute", 
		"booleanConditionValue", "stringConditionValue", "enumConditionValue", 
		"numberConditionValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'from'", "'filter'", "'disable'", "'All'", "'Service'", "'ServiceInstance'", 
		"'Endpoint'", "'ServiceRelation'", "'ServiceInstanceRelation'", "'EndpointRelation'", 
		"'ServiceInstanceJVMCPU'", "'ServiceInstanceJVMMemory'", "'ServiceInstanceJVMMemoryPool'", 
		"'ServiceInstanceJVMGC'", "'ServiceInstanceJVMThread'", "'DatabaseAccess'", 
		"'ServiceInstanceCLRCPU'", "'ServiceInstanceCLRGC'", "'ServiceInstanceCLRThread'", 
		"'EnvoyInstanceMetric'", "'BrowserAppPerf'", "'BrowserAppPagePerf'", "'BrowserAppSingleVersionPerf'", 
		"'BrowserAppTraffic'", "'BrowserAppPageTraffic'", "'BrowserAppSingleVersionTraffic'", 
		"'segment'", "'top_n_database_statement'", "'endpoint_relation_server_side'", 
		"'service_relation_server_side'", "'service_relation_client_side'", "'alarm_record'", 
		"'http_access_log'", "'zipkin_span'", "'jaeger_span'", "'profile_task'", 
		"'profile_task_log'", "'profile_task_segment_snapshot'", "'browser_error_log'", 
		"'.'", "'('", "')'", "'['", "']'", "','", "';'", "'='", "'=='", "'*'", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'like'", "'in'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FROM", "FILTER", "DISABLE", "SRC_ALL", "SRC_SERVICE", "SRC_SERVICE_INSTANCE", 
		"SRC_ENDPOINT", "SRC_SERVICE_RELATION", "SRC_SERVICE_INSTANCE_RELATION", 
		"SRC_ENDPOINT_RELATION", "SRC_SERVICE_INSTANCE_JVM_CPU", "SRC_SERVICE_INSTANCE_JVM_MEMORY", 
		"SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL", "SRC_SERVICE_INSTANCE_JVM_GC", 
		"SRC_SERVICE_INSTANCE_JVM_THREAD", "SRC_DATABASE_ACCESS", "SRC_SERVICE_INSTANCE_CLR_CPU", 
		"SRC_SERVICE_INSTANCE_CLR_GC", "SRC_SERVICE_INSTANCE_CLR_THREAD", "SRC_ENVOY_INSTANCE_METRIC", 
		"SRC_BROWSER_APP_PERF", "SRC_BROWSER_APP_PAGE_PERF", "SRC_BROWSER_APP_SINGLE_VERSION_PERF", 
		"SRC_BROWSER_APP_TRAFFIC", "SRC_BROWSER_APP_PAGE_TRAFFIC", "SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC", 
		"SRC_SEGMENT", "SRC_TOP_N_DB_STATEMENT", "SRC_ENDPOINT_RELATION_SERVER_SIDE", 
		"SRC_SERVICE_RELATION_SERVER_SIDE", "SRC_SERVICE_RELATION_CLIENT_SIDE", 
		"SRC_ALARM_RECORD", "SRC_HTTP_ACCESS_LOG", "SRC_ZIPKIN_SPAN", "SRC_JAEGER_SPAN", 
		"SRC_PROFILE_TASK", "SRC_PROFILE_TASK_LOG", "SRC_PROFILE_THREAD_SHANPSHOT", 
		"SRC_BROWSER_ERROR_LOG", "DOT", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", 
		"RS_BRACKET", "COMMA", "SEMI", "EQUAL", "DUALEQUALS", "ALL", "GREATER", 
		"LESS", "GREATER_EQUAL", "LESS_EQUAL", "NOT_EQUAL", "LIKE", "IN", "BOOL_LITERAL", 
		"NUMBER_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "DelimitedComment", 
		"LineComment", "SPACE", "IDENTIFIER"
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

	@Override
	public String getGrammarFileName() { return "OALParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public List<AggregationStatementContext> aggregationStatement() {
			return getRuleContexts(AggregationStatementContext.class);
		}
		public AggregationStatementContext aggregationStatement(int i) {
			return getRuleContext(AggregationStatementContext.class,i);
		}
		public List<DisableStatementContext> disableStatement() {
			return getRuleContexts(DisableStatementContext.class);
		}
		public DisableStatementContext disableStatement(int i) {
			return getRuleContext(DisableStatementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISABLE || _la==IDENTIFIER) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(62);
					aggregationStatement();
					}
					break;
				case DISABLE:
					{
					setState(63);
					disableStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
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

	public static class AggregationStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OALParser.EQUAL, 0); }
		public MetricStatementContext metricStatement() {
			return getRuleContext(MetricStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OALParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(OALParser.EOF, 0); }
		public List<TerminalNode> SPACE() { return getTokens(OALParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(OALParser.SPACE, i);
		}
		public TerminalNode DelimitedComment() { return getToken(OALParser.DelimitedComment, 0); }
		public TerminalNode LineComment() { return getToken(OALParser.LineComment, 0); }
		public AggregationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAggregationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAggregationStatement(this);
		}
	}

	public final AggregationStatementContext aggregationStatement() throws RecognitionException {
		AggregationStatementContext _localctx = new AggregationStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_aggregationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			variable();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(70);
				match(SPACE);
				}
			}

			setState(73);
			match(EQUAL);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(74);
				match(SPACE);
				}
			}

			setState(77);
			metricStatement();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DelimitedComment) {
				{
				setState(78);
				match(DelimitedComment);
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineComment) {
				{
				setState(81);
				match(LineComment);
				}
			}

			setState(84);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
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

	public static class DisableStatementContext extends ParserRuleContext {
		public TerminalNode DISABLE() { return getToken(OALParser.DISABLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public DisableSourceContext disableSource() {
			return getRuleContext(DisableSourceContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public TerminalNode SEMI() { return getToken(OALParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(OALParser.EOF, 0); }
		public TerminalNode DelimitedComment() { return getToken(OALParser.DelimitedComment, 0); }
		public TerminalNode LineComment() { return getToken(OALParser.LineComment, 0); }
		public DisableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterDisableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitDisableStatement(this);
		}
	}

	public final DisableStatementContext disableStatement() throws RecognitionException {
		DisableStatementContext _localctx = new DisableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_disableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DISABLE);
			setState(87);
			match(LR_BRACKET);
			setState(88);
			disableSource();
			setState(89);
			match(RR_BRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DelimitedComment) {
				{
				setState(90);
				match(DelimitedComment);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineComment) {
				{
				setState(93);
				match(LineComment);
				}
			}

			setState(96);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
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

	public static class MetricStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OALParser.FROM, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(OALParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OALParser.DOT, i);
		}
		public SourceAttributeContext sourceAttribute() {
			return getRuleContext(SourceAttributeContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public List<FilterStatementContext> filterStatement() {
			return getRuleContexts(FilterStatementContext.class);
		}
		public FilterStatementContext filterStatement(int i) {
			return getRuleContext(FilterStatementContext.class,i);
		}
		public MetricStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterMetricStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitMetricStatement(this);
		}
	}

	public final MetricStatementContext metricStatement() throws RecognitionException {
		MetricStatementContext _localctx = new MetricStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metricStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FROM);
			setState(99);
			match(LR_BRACKET);
			setState(100);
			source();
			setState(101);
			match(DOT);
			setState(102);
			sourceAttribute();
			setState(103);
			match(RR_BRACKET);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
						filterStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(111);
			match(DOT);
			setState(112);
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

	public static class FilterStatementContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public TerminalNode FILTER() { return getToken(OALParser.FILTER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public FilterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFilterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFilterStatement(this);
		}
	}

	public final FilterStatementContext filterStatement() throws RecognitionException {
		FilterStatementContext _localctx = new FilterStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_filterStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(DOT);
			setState(115);
			match(FILTER);
			setState(116);
			match(LR_BRACKET);
			setState(117);
			filterExpression();
			setState(118);
			match(RR_BRACKET);
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

	public static class FilterExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFilterExpression(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expression();
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SRC_ALL() { return getToken(OALParser.SRC_ALL, 0); }
		public TerminalNode SRC_SERVICE() { return getToken(OALParser.SRC_SERVICE, 0); }
		public TerminalNode SRC_DATABASE_ACCESS() { return getToken(OALParser.SRC_DATABASE_ACCESS, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE() { return getToken(OALParser.SRC_SERVICE_INSTANCE, 0); }
		public TerminalNode SRC_ENDPOINT() { return getToken(OALParser.SRC_ENDPOINT, 0); }
		public TerminalNode SRC_SERVICE_RELATION() { return getToken(OALParser.SRC_SERVICE_RELATION, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_RELATION() { return getToken(OALParser.SRC_SERVICE_INSTANCE_RELATION, 0); }
		public TerminalNode SRC_ENDPOINT_RELATION() { return getToken(OALParser.SRC_ENDPOINT_RELATION, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_CPU() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_CPU, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_MEMORY() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_MEMORY, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_GC() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_GC, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_JVM_THREAD() { return getToken(OALParser.SRC_SERVICE_INSTANCE_JVM_THREAD, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_CPU() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_CPU, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_GC() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_GC, 0); }
		public TerminalNode SRC_SERVICE_INSTANCE_CLR_THREAD() { return getToken(OALParser.SRC_SERVICE_INSTANCE_CLR_THREAD, 0); }
		public TerminalNode SRC_ENVOY_INSTANCE_METRIC() { return getToken(OALParser.SRC_ENVOY_INSTANCE_METRIC, 0); }
		public TerminalNode SRC_BROWSER_APP_PERF() { return getToken(OALParser.SRC_BROWSER_APP_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_PAGE_PERF() { return getToken(OALParser.SRC_BROWSER_APP_PAGE_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_SINGLE_VERSION_PERF() { return getToken(OALParser.SRC_BROWSER_APP_SINGLE_VERSION_PERF, 0); }
		public TerminalNode SRC_BROWSER_APP_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_TRAFFIC, 0); }
		public TerminalNode SRC_BROWSER_APP_PAGE_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_PAGE_TRAFFIC, 0); }
		public TerminalNode SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC() { return getToken(OALParser.SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SRC_ALL) | (1L << SRC_SERVICE) | (1L << SRC_SERVICE_INSTANCE) | (1L << SRC_ENDPOINT) | (1L << SRC_SERVICE_RELATION) | (1L << SRC_SERVICE_INSTANCE_RELATION) | (1L << SRC_ENDPOINT_RELATION) | (1L << SRC_SERVICE_INSTANCE_JVM_CPU) | (1L << SRC_SERVICE_INSTANCE_JVM_MEMORY) | (1L << SRC_SERVICE_INSTANCE_JVM_MEMORY_POOL) | (1L << SRC_SERVICE_INSTANCE_JVM_GC) | (1L << SRC_SERVICE_INSTANCE_JVM_THREAD) | (1L << SRC_DATABASE_ACCESS) | (1L << SRC_SERVICE_INSTANCE_CLR_CPU) | (1L << SRC_SERVICE_INSTANCE_CLR_GC) | (1L << SRC_SERVICE_INSTANCE_CLR_THREAD) | (1L << SRC_ENVOY_INSTANCE_METRIC) | (1L << SRC_BROWSER_APP_PERF) | (1L << SRC_BROWSER_APP_PAGE_PERF) | (1L << SRC_BROWSER_APP_SINGLE_VERSION_PERF) | (1L << SRC_BROWSER_APP_TRAFFIC) | (1L << SRC_BROWSER_APP_PAGE_TRAFFIC) | (1L << SRC_BROWSER_APP_SINGLE_VERSION_TRAFFIC))) != 0)) ) {
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

	public static class DisableSourceContext extends ParserRuleContext {
		public TerminalNode SRC_SEGMENT() { return getToken(OALParser.SRC_SEGMENT, 0); }
		public TerminalNode SRC_TOP_N_DB_STATEMENT() { return getToken(OALParser.SRC_TOP_N_DB_STATEMENT, 0); }
		public TerminalNode SRC_ENDPOINT_RELATION_SERVER_SIDE() { return getToken(OALParser.SRC_ENDPOINT_RELATION_SERVER_SIDE, 0); }
		public TerminalNode SRC_SERVICE_RELATION_SERVER_SIDE() { return getToken(OALParser.SRC_SERVICE_RELATION_SERVER_SIDE, 0); }
		public TerminalNode SRC_SERVICE_RELATION_CLIENT_SIDE() { return getToken(OALParser.SRC_SERVICE_RELATION_CLIENT_SIDE, 0); }
		public TerminalNode SRC_ALARM_RECORD() { return getToken(OALParser.SRC_ALARM_RECORD, 0); }
		public TerminalNode SRC_HTTP_ACCESS_LOG() { return getToken(OALParser.SRC_HTTP_ACCESS_LOG, 0); }
		public TerminalNode SRC_ZIPKIN_SPAN() { return getToken(OALParser.SRC_ZIPKIN_SPAN, 0); }
		public TerminalNode SRC_JAEGER_SPAN() { return getToken(OALParser.SRC_JAEGER_SPAN, 0); }
		public TerminalNode SRC_PROFILE_TASK() { return getToken(OALParser.SRC_PROFILE_TASK, 0); }
		public TerminalNode SRC_PROFILE_TASK_LOG() { return getToken(OALParser.SRC_PROFILE_TASK_LOG, 0); }
		public TerminalNode SRC_PROFILE_THREAD_SHANPSHOT() { return getToken(OALParser.SRC_PROFILE_THREAD_SHANPSHOT, 0); }
		public DisableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterDisableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitDisableSource(this);
		}
	}

	public final DisableSourceContext disableSource() throws RecognitionException {
		DisableSourceContext _localctx = new DisableSourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_disableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SRC_SEGMENT) | (1L << SRC_TOP_N_DB_STATEMENT) | (1L << SRC_ENDPOINT_RELATION_SERVER_SIDE) | (1L << SRC_SERVICE_RELATION_SERVER_SIDE) | (1L << SRC_SERVICE_RELATION_CLIENT_SIDE) | (1L << SRC_ALARM_RECORD) | (1L << SRC_HTTP_ACCESS_LOG) | (1L << SRC_ZIPKIN_SPAN) | (1L << SRC_JAEGER_SPAN) | (1L << SRC_PROFILE_TASK) | (1L << SRC_PROFILE_TASK_LOG) | (1L << SRC_PROFILE_THREAD_SHANPSHOT))) != 0)) ) {
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

	public static class SourceAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public TerminalNode ALL() { return getToken(OALParser.ALL, 0); }
		public SourceAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterSourceAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitSourceAttribute(this);
		}
	}

	public final SourceAttributeContext sourceAttribute() throws RecognitionException {
		SourceAttributeContext _localctx = new SourceAttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sourceAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==IDENTIFIER) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENTIFIER);
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(OALParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(OALParser.RR_BRACKET, 0); }
		public List<FuncParamExpressionContext> funcParamExpression() {
			return getRuleContexts(FuncParamExpressionContext.class);
		}
		public FuncParamExpressionContext funcParamExpression(int i) {
			return getRuleContext(FuncParamExpressionContext.class,i);
		}
		public List<LiteralExpressionContext> literalExpression() {
			return getRuleContexts(LiteralExpressionContext.class);
		}
		public LiteralExpressionContext literalExpression(int i) {
			return getRuleContext(LiteralExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(OALParser.COMMA, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitAggregateFunction(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			functionName();
			setState(131);
			match(LR_BRACKET);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(132);
				funcParamExpression();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(133);
					match(COMMA);
					setState(134);
					funcParamExpression();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(137);
				literalExpression();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(138);
					match(COMMA);
					setState(139);
					literalExpression();
					}
				}

				}
				}
				break;
			}
			setState(144);
			match(RR_BRACKET);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IDENTIFIER);
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

	public static class FuncParamExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncParamExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterFuncParamExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitFuncParamExpression(this);
		}
	}

	public final FuncParamExpressionContext funcParamExpression() throws RecognitionException {
		FuncParamExpressionContext _localctx = new FuncParamExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcParamExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expression();
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

	public static class LiteralExpressionContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(OALParser.BOOL_LITERAL, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(OALParser.NUMBER_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLiteralExpression(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (BOOL_LITERAL - 57)) | (1L << (NUMBER_LITERAL - 57)) | (1L << (IDENTIFIER - 57)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanMatchContext booleanMatch() {
			return getRuleContext(BooleanMatchContext.class,0);
		}
		public StringMatchContext stringMatch() {
			return getRuleContext(StringMatchContext.class,0);
		}
		public GreaterMatchContext greaterMatch() {
			return getRuleContext(GreaterMatchContext.class,0);
		}
		public LessMatchContext lessMatch() {
			return getRuleContext(LessMatchContext.class,0);
		}
		public GreaterEqualMatchContext greaterEqualMatch() {
			return getRuleContext(GreaterEqualMatchContext.class,0);
		}
		public LessEqualMatchContext lessEqualMatch() {
			return getRuleContext(LessEqualMatchContext.class,0);
		}
		public NotEqualMatchContext notEqualMatch() {
			return getRuleContext(NotEqualMatchContext.class,0);
		}
		public BooleanNotEqualMatchContext booleanNotEqualMatch() {
			return getRuleContext(BooleanNotEqualMatchContext.class,0);
		}
		public LikeMatchContext likeMatch() {
			return getRuleContext(LikeMatchContext.class,0);
		}
		public InMatchContext inMatch() {
			return getRuleContext(InMatchContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				booleanMatch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				stringMatch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				greaterMatch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				lessMatch();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				greaterEqualMatch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				lessEqualMatch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				notEqualMatch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				booleanNotEqualMatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				likeMatch();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(161);
				inMatch();
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

	public static class BooleanMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode DUALEQUALS() { return getToken(OALParser.DUALEQUALS, 0); }
		public BooleanConditionValueContext booleanConditionValue() {
			return getRuleContext(BooleanConditionValueContext.class,0);
		}
		public BooleanMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanMatch(this);
		}
	}

	public final BooleanMatchContext booleanMatch() throws RecognitionException {
		BooleanMatchContext _localctx = new BooleanMatchContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			conditionAttribute();
			setState(165);
			match(DUALEQUALS);
			setState(166);
			booleanConditionValue();
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

	public static class StringMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode DUALEQUALS() { return getToken(OALParser.DUALEQUALS, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public EnumConditionValueContext enumConditionValue() {
			return getRuleContext(EnumConditionValueContext.class,0);
		}
		public StringMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterStringMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitStringMatch(this);
		}
	}

	public final StringMatchContext stringMatch() throws RecognitionException {
		StringMatchContext _localctx = new StringMatchContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			conditionAttribute();
			setState(169);
			match(DUALEQUALS);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(170);
				stringConditionValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(171);
				enumConditionValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GreaterMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(OALParser.GREATER, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public GreaterMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterGreaterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitGreaterMatch(this);
		}
	}

	public final GreaterMatchContext greaterMatch() throws RecognitionException {
		GreaterMatchContext _localctx = new GreaterMatchContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_greaterMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			conditionAttribute();
			setState(175);
			match(GREATER);
			setState(176);
			numberConditionValue();
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

	public static class LessMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode LESS() { return getToken(OALParser.LESS, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public LessMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLessMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLessMatch(this);
		}
	}

	public final LessMatchContext lessMatch() throws RecognitionException {
		LessMatchContext _localctx = new LessMatchContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lessMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			conditionAttribute();
			setState(179);
			match(LESS);
			setState(180);
			numberConditionValue();
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

	public static class GreaterEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(OALParser.GREATER_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public GreaterEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterGreaterEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitGreaterEqualMatch(this);
		}
	}

	public final GreaterEqualMatchContext greaterEqualMatch() throws RecognitionException {
		GreaterEqualMatchContext _localctx = new GreaterEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_greaterEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			conditionAttribute();
			setState(183);
			match(GREATER_EQUAL);
			setState(184);
			numberConditionValue();
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

	public static class LessEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode LESS_EQUAL() { return getToken(OALParser.LESS_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public LessEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLessEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLessEqualMatch(this);
		}
	}

	public final LessEqualMatchContext lessEqualMatch() throws RecognitionException {
		LessEqualMatchContext _localctx = new LessEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lessEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			conditionAttribute();
			setState(187);
			match(LESS_EQUAL);
			setState(188);
			numberConditionValue();
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

	public static class BooleanNotEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(OALParser.NOT_EQUAL, 0); }
		public BooleanConditionValueContext booleanConditionValue() {
			return getRuleContext(BooleanConditionValueContext.class,0);
		}
		public BooleanNotEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanNotEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanNotEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanNotEqualMatch(this);
		}
	}

	public final BooleanNotEqualMatchContext booleanNotEqualMatch() throws RecognitionException {
		BooleanNotEqualMatchContext _localctx = new BooleanNotEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanNotEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			conditionAttribute();
			setState(191);
			match(NOT_EQUAL);
			setState(192);
			booleanConditionValue();
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

	public static class NotEqualMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(OALParser.NOT_EQUAL, 0); }
		public NumberConditionValueContext numberConditionValue() {
			return getRuleContext(NumberConditionValueContext.class,0);
		}
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public EnumConditionValueContext enumConditionValue() {
			return getRuleContext(EnumConditionValueContext.class,0);
		}
		public NotEqualMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNotEqualMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNotEqualMatch(this);
		}
	}

	public final NotEqualMatchContext notEqualMatch() throws RecognitionException {
		NotEqualMatchContext _localctx = new NotEqualMatchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_notEqualMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			conditionAttribute();
			setState(195);
			match(NOT_EQUAL);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
				{
				setState(196);
				numberConditionValue();
				}
				break;
			case STRING_LITERAL:
				{
				setState(197);
				stringConditionValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(198);
				enumConditionValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LikeMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OALParser.LIKE, 0); }
		public StringConditionValueContext stringConditionValue() {
			return getRuleContext(StringConditionValueContext.class,0);
		}
		public LikeMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterLikeMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitLikeMatch(this);
		}
	}

	public final LikeMatchContext likeMatch() throws RecognitionException {
		LikeMatchContext _localctx = new LikeMatchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_likeMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			conditionAttribute();
			setState(202);
			match(LIKE);
			setState(203);
			stringConditionValue();
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

	public static class InMatchContext extends ParserRuleContext {
		public ConditionAttributeContext conditionAttribute() {
			return getRuleContext(ConditionAttributeContext.class,0);
		}
		public TerminalNode IN() { return getToken(OALParser.IN, 0); }
		public MultiConditionValueContext multiConditionValue() {
			return getRuleContext(MultiConditionValueContext.class,0);
		}
		public InMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterInMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitInMatch(this);
		}
	}

	public final InMatchContext inMatch() throws RecognitionException {
		InMatchContext _localctx = new InMatchContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			conditionAttribute();
			setState(206);
			match(IN);
			setState(207);
			multiConditionValue();
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

	public static class MultiConditionValueContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(OALParser.LS_BRACKET, 0); }
		public TerminalNode RS_BRACKET() { return getToken(OALParser.RS_BRACKET, 0); }
		public List<NumberConditionValueContext> numberConditionValue() {
			return getRuleContexts(NumberConditionValueContext.class);
		}
		public NumberConditionValueContext numberConditionValue(int i) {
			return getRuleContext(NumberConditionValueContext.class,i);
		}
		public List<StringConditionValueContext> stringConditionValue() {
			return getRuleContexts(StringConditionValueContext.class);
		}
		public StringConditionValueContext stringConditionValue(int i) {
			return getRuleContext(StringConditionValueContext.class,i);
		}
		public List<EnumConditionValueContext> enumConditionValue() {
			return getRuleContexts(EnumConditionValueContext.class);
		}
		public EnumConditionValueContext enumConditionValue(int i) {
			return getRuleContext(EnumConditionValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OALParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OALParser.COMMA, i);
		}
		public MultiConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterMultiConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitMultiConditionValue(this);
		}
	}

	public final MultiConditionValueContext multiConditionValue() throws RecognitionException {
		MultiConditionValueContext _localctx = new MultiConditionValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiConditionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LS_BRACKET);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
				{
				setState(210);
				numberConditionValue();
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211);
					match(COMMA);
					setState(212);
					numberConditionValue();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(218);
				stringConditionValue();
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219);
					match(COMMA);
					setState(220);
					stringConditionValue();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(226);
				enumConditionValue();
				{
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					enumConditionValue();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			match(RS_BRACKET);
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

	public static class ConditionAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OALParser.IDENTIFIER, 0); }
		public ConditionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterConditionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitConditionAttribute(this);
		}
	}

	public final ConditionAttributeContext conditionAttribute() throws RecognitionException {
		ConditionAttributeContext _localctx = new ConditionAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IDENTIFIER);
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

	public static class BooleanConditionValueContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(OALParser.BOOL_LITERAL, 0); }
		public BooleanConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterBooleanConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitBooleanConditionValue(this);
		}
	}

	public final BooleanConditionValueContext booleanConditionValue() throws RecognitionException {
		BooleanConditionValueContext _localctx = new BooleanConditionValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(BOOL_LITERAL);
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

	public static class StringConditionValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(OALParser.STRING_LITERAL, 0); }
		public StringConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterStringConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitStringConditionValue(this);
		}
	}

	public final StringConditionValueContext stringConditionValue() throws RecognitionException {
		StringConditionValueContext _localctx = new StringConditionValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(STRING_LITERAL);
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

	public static class EnumConditionValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OALParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OALParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(OALParser.DOT, 0); }
		public EnumConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterEnumConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitEnumConditionValue(this);
		}
	}

	public final EnumConditionValueContext enumConditionValue() throws RecognitionException {
		EnumConditionValueContext _localctx = new EnumConditionValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENTIFIER);
			setState(245);
			match(DOT);
			setState(246);
			match(IDENTIFIER);
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

	public static class NumberConditionValueContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(OALParser.NUMBER_LITERAL, 0); }
		public NumberConditionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberConditionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).enterNumberConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OALParserListener ) ((OALParserListener)listener).exitNumberConditionValue(this);
		}
	}

	public final NumberConditionValueContext numberConditionValue() throws RecognitionException {
		NumberConditionValueContext _localctx = new NumberConditionValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numberConditionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(NUMBER_LITERAL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\5\3J\n\3\3\3\3\3\5\3N\n\3\3\3\3\3"+
		"\5\3R\n\3\3\3\5\3U\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\5\4a\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5l\n\5\r\5\16\5m\5\5p\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\f\3\f\3\f\5\f\u008f\n\f\5\f"+
		"\u0091\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00af\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00ca\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u00d8\n\33\f\33\16\33\u00db\13\33\3\33\3\33\3\33"+
		"\7\33\u00e0\n\33\f\33\16\33\u00e3\13\33\3\33\3\33\3\33\7\33\u00e8\n\33"+
		"\f\33\16\33\u00eb\13\33\5\33\u00ed\n\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\3\3\60\60\3\2\6\34\3\2\35(\4"+
		"\2\63\63BB\4\2;<BB\2\u00fc\2D\3\2\2\2\4G\3\2\2\2\6X\3\2\2\2\bd\3\2\2\2"+
		"\nt\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u0084\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3"+
		"\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00aa\3\2\2\2$\u00b0\3\2\2\2"+
		"&\u00b4\3\2\2\2(\u00b8\3\2\2\2*\u00bc\3\2\2\2,\u00c0\3\2\2\2.\u00c4\3"+
		"\2\2\2\60\u00cb\3\2\2\2\62\u00cf\3\2\2\2\64\u00d3\3\2\2\2\66\u00f0\3\2"+
		"\2\28\u00f2\3\2\2\2:\u00f4\3\2\2\2<\u00f6\3\2\2\2>\u00fa\3\2\2\2@C\5\4"+
		"\3\2AC\5\6\4\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3"+
		"\2\2\2FD\3\2\2\2GI\5\24\13\2HJ\7A\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM"+
		"\7\61\2\2LN\7A\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\5\b\5\2PR\7?\2\2QP"+
		"\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7@\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW"+
		"\t\2\2\2W\5\3\2\2\2XY\7\5\2\2YZ\7+\2\2Z[\5\20\t\2[]\7,\2\2\\^\7?\2\2]"+
		"\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\7@\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2"+
		"bc\t\2\2\2c\7\3\2\2\2de\7\3\2\2ef\7+\2\2fg\5\16\b\2gh\7*\2\2hi\5\22\n"+
		"\2io\7,\2\2jl\5\n\6\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2"+
		"\2ok\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7*\2\2rs\5\26\f\2s\t\3\2\2\2tu\7*\2"+
		"\2uv\7\4\2\2vw\7+\2\2wx\5\f\7\2xy\7,\2\2y\13\3\2\2\2z{\5\36\20\2{\r\3"+
		"\2\2\2|}\t\3\2\2}\17\3\2\2\2~\177\t\4\2\2\177\21\3\2\2\2\u0080\u0081\t"+
		"\5\2\2\u0081\23\3\2\2\2\u0082\u0083\7B\2\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\5\30\r\2\u0085\u0090\7+\2\2\u0086\u0089\5\32\16\2\u0087\u0088\7/\2\2"+
		"\u0088\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091"+
		"\3\2\2\2\u008b\u008e\5\34\17\2\u008c\u008d\7/\2\2\u008d\u008f\5\34\17"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0086"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7,\2\2\u0093\27\3\2\2\2\u0094\u0095\7B\2\2\u0095\31\3\2\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\33\3\2\2\2\u0098\u0099\t\6\2\2\u0099\35\3\2\2\2"+
		"\u009a\u00a5\5 \21\2\u009b\u00a5\5\"\22\2\u009c\u00a5\5$\23\2\u009d\u00a5"+
		"\5&\24\2\u009e\u00a5\5(\25\2\u009f\u00a5\5*\26\2\u00a0\u00a5\5.\30\2\u00a1"+
		"\u00a5\5,\27\2\u00a2\u00a5\5\60\31\2\u00a3\u00a5\5\62\32\2\u00a4\u009a"+
		"\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7"+
		"\5\66\34\2\u00a7\u00a8\7\62\2\2\u00a8\u00a9\58\35\2\u00a9!\3\2\2\2\u00aa"+
		"\u00ab\5\66\34\2\u00ab\u00ae\7\62\2\2\u00ac\u00af\5:\36\2\u00ad\u00af"+
		"\5<\37\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af#\3\2\2\2\u00b0"+
		"\u00b1\5\66\34\2\u00b1\u00b2\7\64\2\2\u00b2\u00b3\5> \2\u00b3%\3\2\2\2"+
		"\u00b4\u00b5\5\66\34\2\u00b5\u00b6\7\65\2\2\u00b6\u00b7\5> \2\u00b7\'"+
		"\3\2\2\2\u00b8\u00b9\5\66\34\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\5> \2"+
		"\u00bb)\3\2\2\2\u00bc\u00bd\5\66\34\2\u00bd\u00be\7\67\2\2\u00be\u00bf"+
		"\5> \2\u00bf+\3\2\2\2\u00c0\u00c1\5\66\34\2\u00c1\u00c2\78\2\2\u00c2\u00c3"+
		"\58\35\2\u00c3-\3\2\2\2\u00c4\u00c5\5\66\34\2\u00c5\u00c9\78\2\2\u00c6"+
		"\u00ca\5> \2\u00c7\u00ca\5:\36\2\u00c8\u00ca\5<\37\2\u00c9\u00c6\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca/\3\2\2\2\u00cb\u00cc"+
		"\5\66\34\2\u00cc\u00cd\79\2\2\u00cd\u00ce\5:\36\2\u00ce\61\3\2\2\2\u00cf"+
		"\u00d0\5\66\34\2\u00d0\u00d1\7:\2\2\u00d1\u00d2\5\64\33\2\u00d2\63\3\2"+
		"\2\2\u00d3\u00ec\7-\2\2\u00d4\u00d9\5> \2\u00d5\u00d6\7/\2\2\u00d6\u00d8"+
		"\5> \2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00ed\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e1\5:"+
		"\36\2\u00dd\u00de\7/\2\2\u00de\u00e0\5:\36\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ed\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9\5<\37\2\u00e5\u00e6\7/\2\2\u00e6"+
		"\u00e8\5<\37\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00d4\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\7.\2\2\u00ef\65\3\2\2\2\u00f0\u00f1\7B\2\2\u00f1\67\3"+
		"\2\2\2\u00f2\u00f3\7;\2\2\u00f39\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5;\3\2"+
		"\2\2\u00f6\u00f7\7B\2\2\u00f7\u00f8\7*\2\2\u00f8\u00f9\7B\2\2\u00f9=\3"+
		"\2\2\2\u00fa\u00fb\7<\2\2\u00fb?\3\2\2\2\26BDIMQT]`mo\u0089\u008e\u0090"+
		"\u00a4\u00ae\u00c9\u00d9\u00e1\u00e9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}