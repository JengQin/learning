// Generated from D:/software_develop/workspace/github_workspace/learning/datacenter-admin/src/main/java/com/tt/datacenter/antlr/bk/presto\SqlBase.g4 by ANTLR 4.8
package com.tt.datacenter.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		GLOBAL=10, SEMI=11, ANTI=12, ADD=13, ADMIN=14, ALL=15, ALTER=16, ANALYZE=17, 
		AND=18, ANY=19, ARRAY=20, AS=21, ASC=22, AT=23, BERNOULLI=24, BETWEEN=25, 
		BY=26, CALL=27, CALLED=28, CASCADE=29, CASE=30, CAST=31, CATALOGS=32, 
		COLUMN=33, COLUMNS=34, COMMENT=35, COMMIT=36, COMMITTED=37, CONSTRAINT=38, 
		CREATE=39, CROSS=40, CUBE=41, CURRENT=42, CURRENT_DATE=43, CURRENT_ROLE=44, 
		CURRENT_TIME=45, CURRENT_TIMESTAMP=46, CURRENT_USER=47, DATA=48, DATE=49, 
		DAY=50, DEALLOCATE=51, DELETE=52, DESC=53, DESCRIBE=54, DETERMINISTIC=55, 
		DISTINCT=56, DISTRIBUTED=57, DROP=58, ELSE=59, END=60, ESCAPE=61, EXCEPT=62, 
		EXCLUDING=63, EXECUTE=64, EXISTS=65, EXPLAIN=66, EXTRACT=67, EXTERNAL=68, 
		FALSE=69, FILTER=70, FIRST=71, FOLLOWING=72, FOR=73, FORMAT=74, FROM=75, 
		FULL=76, FUNCTION=77, FUNCTIONS=78, GRANT=79, GRANTED=80, GRANTS=81, GRAPHVIZ=82, 
		GROUP=83, GROUPING=84, HAVING=85, HOUR=86, IF=87, IGNORE=88, IN=89, INCLUDING=90, 
		INNER=91, INPUT=92, INSERT=93, INTERSECT=94, INTERVAL=95, INTO=96, IO=97, 
		IS=98, ISOLATION=99, JSON=100, JOIN=101, LANGUAGE=102, LAST=103, LATERAL=104, 
		LEFT=105, LEVEL=106, LIKE=107, LIMIT=108, LOCALTIME=109, LOCALTIMESTAMP=110, 
		LOGICAL=111, MAP=112, MINUTE=113, MONTH=114, NAME=115, NATURAL=116, NFC=117, 
		NFD=118, NFKC=119, NFKD=120, NO=121, NONE=122, NORMALIZE=123, NOT=124, 
		NULL=125, NULLIF=126, NULLS=127, ON=128, ONLY=129, OPTION=130, OR=131, 
		ORDER=132, ORDINALITY=133, OUTER=134, OUTPUT=135, OVER=136, PARTITION=137, 
		PARTITIONS=138, POSITION=139, PRECEDING=140, PREPARE=141, PRIVILEGES=142, 
		PROPERTIES=143, RANGE=144, READ=145, RECURSIVE=146, RENAME=147, REPEATABLE=148, 
		REPLACE=149, RESET=150, RESPECT=151, RESTRICT=152, RETURN=153, RETURNS=154, 
		REVOKE=155, RIGHT=156, ROLE=157, ROLES=158, ROLLBACK=159, ROLLUP=160, 
		ROW=161, ROWS=162, SCHEMA=163, SCHEMAS=164, SECOND=165, SELECT=166, SERIALIZABLE=167, 
		SESSION=168, SET=169, SETS=170, SHOW=171, SOME=172, SQL=173, START=174, 
		STATS=175, SUBSTRING=176, SYSTEM=177, TABLE=178, TABLES=179, TABLESAMPLE=180, 
		TEXT=181, THEN=182, TIME=183, TIMESTAMP=184, TO=185, TRANSACTION=186, 
		TRUE=187, TRY_CAST=188, TYPE=189, UESCAPE=190, UNBOUNDED=191, UNCOMMITTED=192, 
		UNION=193, UNNEST=194, USE=195, USER=196, USING=197, VALIDATE=198, VALUES=199, 
		VERBOSE=200, VIEW=201, WHEN=202, WHERE=203, WITH=204, WORK=205, WRITE=206, 
		YEAR=207, ZONE=208, EQ=209, NEQ=210, LT=211, LTE=212, GT=213, GTE=214, 
		PLUS=215, MINUS=216, ASTERISK=217, SLASH=218, PERCENT=219, CONCAT=220, 
		STRING=221, UNICODE_STRING=222, BINARY_LITERAL=223, INTEGER_VALUE=224, 
		DECIMAL_VALUE=225, DOUBLE_VALUE=226, IDENTIFIER=227, DIGIT_IDENTIFIER=228, 
		QUOTED_IDENTIFIER=229, BACKQUOTED_IDENTIFIER=230, TIME_WITH_TIME_ZONE=231, 
		TIMESTAMP_WITH_TIME_ZONE=232, DOUBLE_PRECISION=233, SIMPLE_COMMENT=234, 
		BRACKETED_COMMENT=235, WS=236, UNRECOGNIZED=237, DELIMITER=238;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standaloneRoutineBody = 2, 
		RULE_statement = 3, RULE_query = 4, RULE_with = 5, RULE_tableElement = 6, 
		RULE_columnDefinition = 7, RULE_likeClause = 8, RULE_properties = 9, RULE_property = 10, 
		RULE_sqlParameterDeclaration = 11, RULE_routineCharacteristics = 12, RULE_routineCharacteristic = 13, 
		RULE_alterRoutineCharacteristics = 14, RULE_alterRoutineCharacteristic = 15, 
		RULE_routineBody = 16, RULE_returnStatement = 17, RULE_externalBodyReference = 18, 
		RULE_language = 19, RULE_determinism = 20, RULE_nullCallClause = 21, RULE_externalRoutineName = 22, 
		RULE_queryNoWith = 23, RULE_queryTerm = 24, RULE_queryPrimary = 25, RULE_sortItem = 26, 
		RULE_querySpecification = 27, RULE_groupBy = 28, RULE_groupingElement = 29, 
		RULE_groupingSet = 30, RULE_namedQuery = 31, RULE_setQuantifier = 32, 
		RULE_selectItem = 33, RULE_relation = 34, RULE_joinType = 35, RULE_joinCriteria = 36, 
		RULE_sampledRelation = 37, RULE_sampleType = 38, RULE_aliasedRelation = 39, 
		RULE_columnAliases = 40, RULE_relationPrimary = 41, RULE_sourceTable = 42, 
		RULE_databaseName = 43, RULE_sourceTableName = 44, RULE_targetTable = 45, 
		RULE_targetTableName = 46, RULE_expression = 47, RULE_booleanExpression = 48, 
		RULE_predicate = 49, RULE_valueExpression = 50, RULE_primaryExpression = 51, 
		RULE_string = 52, RULE_nullTreatment = 53, RULE_timeZoneSpecifier = 54, 
		RULE_comparisonOperator = 55, RULE_comparisonQuantifier = 56, RULE_booleanValue = 57, 
		RULE_interval = 58, RULE_intervalField = 59, RULE_normalForm = 60, RULE_types = 61, 
		RULE_type = 62, RULE_typeParameter = 63, RULE_baseType = 64, RULE_whenClause = 65, 
		RULE_filter = 66, RULE_over = 67, RULE_windowFrame = 68, RULE_frameBound = 69, 
		RULE_explainOption = 70, RULE_transactionMode = 71, RULE_levelOfIsolation = 72, 
		RULE_callArgument = 73, RULE_privilege = 74, RULE_qualifiedName = 75, 
		RULE_grantor = 76, RULE_principal = 77, RULE_roles = 78, RULE_identifier = 79, 
		RULE_number = 80, RULE_nonReserved = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standaloneRoutineBody", "statement", 
			"query", "with", "tableElement", "columnDefinition", "likeClause", "properties", 
			"property", "sqlParameterDeclaration", "routineCharacteristics", "routineCharacteristic", 
			"alterRoutineCharacteristics", "alterRoutineCharacteristic", "routineBody", 
			"returnStatement", "externalBodyReference", "language", "determinism", 
			"nullCallClause", "externalRoutineName", "queryNoWith", "queryTerm", 
			"queryPrimary", "sortItem", "querySpecification", "groupBy", "groupingElement", 
			"groupingSet", "namedQuery", "setQuantifier", "selectItem", "relation", 
			"joinType", "joinCriteria", "sampledRelation", "sampleType", "aliasedRelation", 
			"columnAliases", "relationPrimary", "sourceTable", "databaseName", "sourceTableName", 
			"targetTable", "targetTableName", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "string", "nullTreatment", 
			"timeZoneSpecifier", "comparisonOperator", "comparisonQuantifier", "booleanValue", 
			"interval", "intervalField", "normalForm", "types", "type", "typeParameter", 
			"baseType", "whenClause", "filter", "over", "windowFrame", "frameBound", 
			"explainOption", "transactionMode", "levelOfIsolation", "callArgument", 
			"privilege", "qualifiedName", "grantor", "principal", "roles", "identifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "GLOBAL", 
			"SEMI", "ANTI", "ADD", "ADMIN", "ALL", "ALTER", "ANALYZE", "AND", "ANY", 
			"ARRAY", "AS", "ASC", "AT", "BERNOULLI", "BETWEEN", "BY", "CALL", "CALLED", 
			"CASCADE", "CASE", "CAST", "CATALOGS", "COLUMN", "COLUMNS", "COMMENT", 
			"COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_ROLE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_USER", "DATA", "DATE", "DAY", "DEALLOCATE", "DELETE", "DESC", 
			"DESCRIBE", "DETERMINISTIC", "DISTINCT", "DISTRIBUTED", "DROP", "ELSE", 
			"END", "ESCAPE", "EXCEPT", "EXCLUDING", "EXECUTE", "EXISTS", "EXPLAIN", 
			"EXTRACT", "EXTERNAL", "FALSE", "FILTER", "FIRST", "FOLLOWING", "FOR", 
			"FORMAT", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GRANT", "GRANTED", 
			"GRANTS", "GRAPHVIZ", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IGNORE", 
			"IN", "INCLUDING", "INNER", "INPUT", "INSERT", "INTERSECT", "INTERVAL", 
			"INTO", "IO", "IS", "ISOLATION", "JSON", "JOIN", "LANGUAGE", "LAST", 
			"LATERAL", "LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", 
			"LOGICAL", "MAP", "MINUTE", "MONTH", "NAME", "NATURAL", "NFC", "NFD", 
			"NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", 
			"ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", "OUTPUT", 
			"OVER", "PARTITION", "PARTITIONS", "POSITION", "PRECEDING", "PREPARE", 
			"PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", "RENAME", "REPEATABLE", 
			"REPLACE", "RESET", "RESPECT", "RESTRICT", "RETURN", "RETURNS", "REVOKE", 
			"RIGHT", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", 
			"SCHEMAS", "SECOND", "SELECT", "SERIALIZABLE", "SESSION", "SET", "SETS", 
			"SHOW", "SOME", "SQL", "START", "STATS", "SUBSTRING", "SYSTEM", "TABLE", 
			"TABLES", "TABLESAMPLE", "TEXT", "THEN", "TIME", "TIMESTAMP", "TO", "TRANSACTION", 
			"TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", 
			"UNNEST", "USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", 
			"WHEN", "WHERE", "WITH", "WORK", "WRITE", "YEAR", "ZONE", "EQ", "NEQ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"CONCAT", "STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE", 
			"DOUBLE_PRECISION", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
			"DELIMITER"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			statement();
			setState(165);
			match(EOF);
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

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expression();
			setState(168);
			match(EOF);
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

	public static class StandaloneRoutineBodyContext extends ParserRuleContext {
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneRoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRoutineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneRoutineBodyContext standaloneRoutineBody() throws RecognitionException {
		StandaloneRoutineBodyContext _localctx = new StandaloneRoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standaloneRoutineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			routineBody();
			setState(171);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TargetTableContext from;
		public TargetTableContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<TargetTableContext> targetTable() {
			return getRuleContexts(TargetTableContext.class);
		}
		public TargetTableContext targetTable(int i) {
			return getRuleContext(TargetTableContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateFunctionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ShowCreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TargetTableContext targetTable() {
			return getRuleContext(TargetTableContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public QualifiedNameContext functionName;
		public TypeContext returnType;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public RoutineCharacteristicsContext routineCharacteristics() {
			return getRuleContext(RoutineCharacteristicsContext.class,0);
		}
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public List<SqlParameterDeclarationContext> sqlParameterDeclaration() {
			return getRuleContexts(SqlParameterDeclarationContext.class);
		}
		public SqlParameterDeclarationContext sqlParameterDeclaration(int i) {
			return getRuleContext(SqlParameterDeclarationContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TargetTableContext targetTable() {
			return getRuleContext(TargetTableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterFunctionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AlterRoutineCharacteristicsContext alterRoutineCharacteristics() {
			return getRuleContext(AlterRoutineCharacteristicsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public AlterFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(USE);
				setState(175);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(USE);
				setState(177);
				((UseContext)_localctx).catalog = identifier();
				setState(178);
				match(T__0);
				setState(179);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(CREATE);
				setState(182);
				match(SCHEMA);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(183);
					match(IF);
					setState(184);
					match(NOT);
					setState(185);
					match(EXISTS);
					}
					break;
				}
				setState(188);
				qualifiedName();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(189);
					match(WITH);
					setState(190);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(DROP);
				setState(194);
				match(SCHEMA);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(195);
					match(IF);
					setState(196);
					match(EXISTS);
					}
					break;
				}
				setState(199);
				qualifiedName();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(200);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(ALTER);
				setState(204);
				match(SCHEMA);
				setState(205);
				qualifiedName();
				setState(206);
				match(RENAME);
				setState(207);
				match(TO);
				setState(208);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				match(CREATE);
				setState(211);
				match(TABLE);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(212);
					match(IF);
					setState(213);
					match(NOT);
					setState(214);
					match(EXISTS);
					}
					break;
				}
				setState(217);
				qualifiedName();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(218);
					columnAliases();
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(221);
					match(COMMENT);
					setState(222);
					string();
					}
				}

				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(225);
					match(WITH);
					setState(226);
					properties();
					}
				}

				setState(229);
				match(AS);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(230);
					query();
					}
					break;
				case 2:
					{
					setState(231);
					match(T__1);
					setState(232);
					query();
					setState(233);
					match(T__2);
					}
					break;
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(237);
					match(WITH);
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(238);
						match(NO);
						}
					}

					setState(241);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(CREATE);
				setState(245);
				match(TABLE);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(246);
					match(IF);
					setState(247);
					match(NOT);
					setState(248);
					match(EXISTS);
					}
					break;
				}
				setState(251);
				qualifiedName();
				setState(252);
				match(T__1);
				setState(253);
				tableElement();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(254);
					match(T__3);
					setState(255);
					tableElement();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__2);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(262);
					match(COMMENT);
					setState(263);
					string();
					}
				}

				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(266);
					match(WITH);
					setState(267);
					properties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				match(DROP);
				setState(271);
				match(TABLE);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(272);
					match(IF);
					setState(273);
					match(EXISTS);
					}
					break;
				}
				setState(276);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				match(INSERT);
				setState(278);
				match(INTO);
				setState(279);
				targetTable();
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(280);
					columnAliases();
					}
					break;
				}
				setState(283);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(285);
				match(DELETE);
				setState(286);
				match(FROM);
				setState(287);
				targetTable();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(288);
					match(WHERE);
					setState(289);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(292);
				match(ALTER);
				setState(293);
				match(TABLE);
				setState(294);
				((RenameTableContext)_localctx).from = targetTable();
				setState(295);
				match(RENAME);
				setState(296);
				match(TO);
				setState(297);
				((RenameTableContext)_localctx).to = targetTable();
				}
				break;
			case 13:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(299);
				match(ALTER);
				setState(300);
				match(TABLE);
				setState(301);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(302);
				match(RENAME);
				setState(303);
				match(COLUMN);
				setState(304);
				((RenameColumnContext)_localctx).from = identifier();
				setState(305);
				match(TO);
				setState(306);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 14:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(308);
				match(ALTER);
				setState(309);
				match(TABLE);
				setState(310);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(311);
				match(DROP);
				setState(312);
				match(COLUMN);
				setState(313);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 15:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(315);
				match(ALTER);
				setState(316);
				match(TABLE);
				setState(317);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(318);
				match(ADD);
				setState(319);
				match(COLUMN);
				setState(320);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 16:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(322);
				match(ANALYZE);
				setState(323);
				qualifiedName();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(324);
					match(WITH);
					setState(325);
					properties();
					}
				}

				}
				break;
			case 17:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(328);
				match(CREATE);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(329);
					match(OR);
					setState(330);
					match(REPLACE);
					}
				}

				setState(333);
				match(VIEW);
				setState(334);
				qualifiedName();
				setState(335);
				match(AS);
				setState(336);
				query();
				}
				break;
			case 18:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(338);
				match(DROP);
				setState(339);
				match(VIEW);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(340);
					match(IF);
					setState(341);
					match(EXISTS);
					}
					break;
				}
				setState(344);
				qualifiedName();
				}
				break;
			case 19:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(345);
				match(CREATE);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(346);
					match(OR);
					setState(347);
					match(REPLACE);
					}
				}

				setState(350);
				match(FUNCTION);
				setState(351);
				((CreateFunctionContext)_localctx).functionName = qualifiedName();
				setState(352);
				match(T__1);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EXPLAIN - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NAME - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPTION - 130)) | (1L << (ORDINALITY - 130)) | (1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(353);
					sqlParameterDeclaration();
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(354);
						match(T__3);
						setState(355);
						sqlParameterDeclaration();
						}
						}
						setState(360);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(363);
				match(T__2);
				setState(364);
				match(RETURNS);
				setState(365);
				((CreateFunctionContext)_localctx).returnType = type(0);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(366);
					match(COMMENT);
					setState(367);
					string();
					}
				}

				setState(370);
				routineCharacteristics();
				setState(371);
				routineBody();
				}
				break;
			case 20:
				_localctx = new AlterFunctionContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(373);
				match(ALTER);
				setState(374);
				match(FUNCTION);
				setState(375);
				qualifiedName();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(376);
					types();
					}
				}

				setState(379);
				alterRoutineCharacteristics();
				}
				break;
			case 21:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(381);
				match(DROP);
				setState(382);
				match(FUNCTION);
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(383);
					match(IF);
					setState(384);
					match(EXISTS);
					}
					break;
				}
				setState(387);
				qualifiedName();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(388);
					types();
					}
				}

				}
				break;
			case 22:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(391);
				match(CALL);
				setState(392);
				qualifiedName();
				setState(393);
				match(T__1);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(394);
					callArgument();
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(395);
						match(T__3);
						setState(396);
						callArgument();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(404);
				match(T__2);
				}
				break;
			case 23:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(406);
				match(CREATE);
				setState(407);
				match(ROLE);
				setState(408);
				((CreateRoleContext)_localctx).name = identifier();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(409);
					match(WITH);
					setState(410);
					match(ADMIN);
					setState(411);
					grantor();
					}
				}

				}
				break;
			case 24:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(414);
				match(DROP);
				setState(415);
				match(ROLE);
				setState(416);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 25:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(417);
				match(GRANT);
				setState(418);
				roles();
				setState(419);
				match(TO);
				setState(420);
				principal();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(421);
					match(T__3);
					setState(422);
					principal();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(428);
					match(WITH);
					setState(429);
					match(ADMIN);
					setState(430);
					match(OPTION);
					}
				}

				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(433);
					match(GRANTED);
					setState(434);
					match(BY);
					setState(435);
					grantor();
					}
				}

				}
				break;
			case 26:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(438);
				match(REVOKE);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(439);
					match(ADMIN);
					setState(440);
					match(OPTION);
					setState(441);
					match(FOR);
					}
					break;
				}
				setState(444);
				roles();
				setState(445);
				match(FROM);
				setState(446);
				principal();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(447);
					match(T__3);
					setState(448);
					principal();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(454);
					match(GRANTED);
					setState(455);
					match(BY);
					setState(456);
					grantor();
					}
				}

				}
				break;
			case 27:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(459);
				match(SET);
				setState(460);
				match(ROLE);
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(461);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(462);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(463);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 28:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(466);
				match(GRANT);
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(467);
					privilege();
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(468);
						match(T__3);
						setState(469);
						privilege();
						}
						}
						setState(474);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(475);
					match(ALL);
					setState(476);
					match(PRIVILEGES);
					}
					break;
				}
				setState(479);
				match(ON);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(480);
					match(TABLE);
					}
				}

				setState(483);
				qualifiedName();
				setState(484);
				match(TO);
				setState(485);
				((GrantContext)_localctx).grantee = principal();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(486);
					match(WITH);
					setState(487);
					match(GRANT);
					setState(488);
					match(OPTION);
					}
				}

				}
				break;
			case 29:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(491);
				match(REVOKE);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(492);
					match(GRANT);
					setState(493);
					match(OPTION);
					setState(494);
					match(FOR);
					}
					break;
				}
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(497);
					privilege();
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(498);
						match(T__3);
						setState(499);
						privilege();
						}
						}
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(505);
					match(ALL);
					setState(506);
					match(PRIVILEGES);
					}
					break;
				}
				setState(509);
				match(ON);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(510);
					match(TABLE);
					}
				}

				setState(513);
				qualifiedName();
				setState(514);
				match(FROM);
				setState(515);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 30:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(517);
				match(SHOW);
				setState(518);
				match(GRANTS);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(519);
					match(ON);
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(520);
						match(TABLE);
						}
					}

					setState(523);
					qualifiedName();
					}
				}

				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(526);
				match(EXPLAIN);
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(527);
					match(ANALYZE);
					}
					break;
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(530);
					match(VERBOSE);
					}
				}

				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(533);
					match(T__1);
					setState(534);
					explainOption();
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(535);
						match(T__3);
						setState(536);
						explainOption();
						}
						}
						setState(541);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(542);
					match(T__2);
					}
					break;
				}
				setState(546);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(547);
				match(SHOW);
				setState(548);
				match(CREATE);
				setState(549);
				match(TABLE);
				setState(550);
				qualifiedName();
				}
				break;
			case 33:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(551);
				match(SHOW);
				setState(552);
				match(CREATE);
				setState(553);
				match(VIEW);
				setState(554);
				qualifiedName();
				}
				break;
			case 34:
				_localctx = new ShowCreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(555);
				match(SHOW);
				setState(556);
				match(CREATE);
				setState(557);
				match(FUNCTION);
				setState(558);
				qualifiedName();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(559);
					types();
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(562);
				match(SHOW);
				setState(563);
				match(TABLES);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(565);
					qualifiedName();
					}
				}

				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(568);
					match(LIKE);
					setState(569);
					((ShowTablesContext)_localctx).pattern = string();
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(570);
						match(ESCAPE);
						setState(571);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 36:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(576);
				match(SHOW);
				setState(577);
				match(SCHEMAS);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(578);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(579);
					identifier();
					}
				}

				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(582);
					match(LIKE);
					setState(583);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(584);
						match(ESCAPE);
						setState(585);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 37:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(590);
				match(SHOW);
				setState(591);
				match(CATALOGS);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(592);
					match(LIKE);
					setState(593);
					((ShowCatalogsContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(596);
				match(SHOW);
				setState(597);
				match(COLUMNS);
				setState(598);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(599);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(600);
				match(SHOW);
				setState(601);
				match(STATS);
				setState(602);
				match(FOR);
				setState(603);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(604);
				match(SHOW);
				setState(605);
				match(STATS);
				setState(606);
				match(FOR);
				setState(607);
				match(T__1);
				setState(608);
				querySpecification();
				setState(609);
				match(T__2);
				}
				break;
			case 41:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(611);
				match(SHOW);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(612);
					match(CURRENT);
					}
				}

				setState(615);
				match(ROLES);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(616);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(617);
					identifier();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(620);
				match(SHOW);
				setState(621);
				match(ROLE);
				setState(622);
				match(GRANTS);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(623);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(624);
					identifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(627);
				match(DESCRIBE);
				setState(628);
				qualifiedName();
				}
				break;
			case 44:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(629);
				match(DESC);
				setState(630);
				qualifiedName();
				}
				break;
			case 45:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(631);
				match(SHOW);
				setState(632);
				match(FUNCTIONS);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(633);
					match(LIKE);
					setState(634);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(635);
						match(ESCAPE);
						setState(636);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 46:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(641);
				match(SHOW);
				setState(642);
				match(SESSION);
				}
				break;
			case 47:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(643);
				match(SET);
				setState(644);
				match(SESSION);
				setState(645);
				qualifiedName();
				setState(646);
				match(EQ);
				setState(647);
				expression();
				}
				break;
			case 48:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(649);
				match(RESET);
				setState(650);
				match(SESSION);
				setState(651);
				qualifiedName();
				}
				break;
			case 49:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(652);
				match(START);
				setState(653);
				match(TRANSACTION);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(654);
					transactionMode();
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(655);
						match(T__3);
						setState(656);
						transactionMode();
						}
						}
						setState(661);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 50:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(664);
				match(COMMIT);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(665);
					match(WORK);
					}
				}

				}
				break;
			case 51:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(668);
				match(ROLLBACK);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(669);
					match(WORK);
					}
				}

				}
				break;
			case 52:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(672);
				match(PREPARE);
				setState(673);
				identifier();
				setState(674);
				match(FROM);
				setState(675);
				statement();
				}
				break;
			case 53:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(677);
				match(DEALLOCATE);
				setState(678);
				match(PREPARE);
				setState(679);
				identifier();
				}
				break;
			case 54:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(680);
				match(EXECUTE);
				setState(681);
				identifier();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(682);
					match(USING);
					setState(683);
					expression();
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(684);
						match(T__3);
						setState(685);
						expression();
						}
						}
						setState(690);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 55:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(693);
				match(DESCRIBE);
				setState(694);
				match(INPUT);
				setState(695);
				identifier();
				}
				break;
			case 56:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(696);
				match(DESCRIBE);
				setState(697);
				match(OUTPUT);
				setState(698);
				identifier();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(701);
				with();
				}
			}

			setState(704);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(WITH);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(707);
				match(RECURSIVE);
				}
			}

			setState(710);
			namedQuery();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(711);
				match(T__3);
				setState(712);
				namedQuery();
				}
				}
				setState(717);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableElement);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				likeClause();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			identifier();
			setState(723);
			type(0);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(724);
				match(NOT);
				setState(725);
				match(NULL);
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(728);
				match(COMMENT);
				setState(729);
				string();
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(732);
				match(WITH);
				setState(733);
				properties();
				}
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(LIKE);
			setState(737);
			qualifiedName();
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(738);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(739);
				match(PROPERTIES);
				}
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(T__1);
			setState(743);
			property();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(744);
				match(T__3);
				setState(745);
				property();
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			match(T__2);
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

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			identifier();
			setState(754);
			match(EQ);
			setState(755);
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

	public static class SqlParameterDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SqlParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSqlParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSqlParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSqlParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParameterDeclarationContext sqlParameterDeclaration() throws RecognitionException {
		SqlParameterDeclarationContext _localctx = new SqlParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			identifier();
			setState(758);
			type(0);
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

	public static class RoutineCharacteristicsContext extends ParserRuleContext {
		public List<RoutineCharacteristicContext> routineCharacteristic() {
			return getRuleContexts(RoutineCharacteristicContext.class);
		}
		public RoutineCharacteristicContext routineCharacteristic(int i) {
			return getRuleContext(RoutineCharacteristicContext.class,i);
		}
		public RoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicsContext routineCharacteristics() throws RecognitionException {
		RoutineCharacteristicsContext _localctx = new RoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==DETERMINISTIC || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (LANGUAGE - 102)) | (1L << (NOT - 102)) | (1L << (RETURNS - 102)))) != 0)) {
				{
				{
				setState(760);
				routineCharacteristic();
				}
				}
				setState(765);
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

	public static class RoutineCharacteristicContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public DeterminismContext determinism() {
			return getRuleContext(DeterminismContext.class,0);
		}
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public RoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicContext routineCharacteristic() throws RecognitionException {
		RoutineCharacteristicContext _localctx = new RoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_routineCharacteristic);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(LANGUAGE);
				setState(767);
				language();
				}
				break;
			case DETERMINISTIC:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				determinism();
				}
				break;
			case CALLED:
			case RETURNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				nullCallClause();
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

	public static class AlterRoutineCharacteristicsContext extends ParserRuleContext {
		public List<AlterRoutineCharacteristicContext> alterRoutineCharacteristic() {
			return getRuleContexts(AlterRoutineCharacteristicContext.class);
		}
		public AlterRoutineCharacteristicContext alterRoutineCharacteristic(int i) {
			return getRuleContext(AlterRoutineCharacteristicContext.class,i);
		}
		public AlterRoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicsContext alterRoutineCharacteristics() throws RecognitionException {
		AlterRoutineCharacteristicsContext _localctx = new AlterRoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterRoutineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==RETURNS) {
				{
				{
				setState(772);
				alterRoutineCharacteristic();
				}
				}
				setState(777);
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

	public static class AlterRoutineCharacteristicContext extends ParserRuleContext {
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public AlterRoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicContext alterRoutineCharacteristic() throws RecognitionException {
		AlterRoutineCharacteristicContext _localctx = new AlterRoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterRoutineCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			nullCallClause();
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

	public static class RoutineBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExternalBodyReferenceContext externalBodyReference() {
			return getRuleContext(ExternalBodyReferenceContext.class,0);
		}
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_routineBody);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				returnStatement();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				externalBodyReference();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(RETURN);
			setState(785);
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

	public static class ExternalBodyReferenceContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public ExternalRoutineNameContext externalRoutineName() {
			return getRuleContext(ExternalRoutineNameContext.class,0);
		}
		public ExternalBodyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalBodyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalBodyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalBodyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalBodyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalBodyReferenceContext externalBodyReference() throws RecognitionException {
		ExternalBodyReferenceContext _localctx = new ExternalBodyReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_externalBodyReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(EXTERNAL);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(788);
				match(NAME);
				setState(789);
				externalRoutineName();
				}
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

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_language);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				identifier();
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

	public static class DeterminismContext extends ParserRuleContext {
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DeterminismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determinism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeterminism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeterminism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeterminism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeterminismContext determinism() throws RecognitionException {
		DeterminismContext _localctx = new DeterminismContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_determinism);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(DETERMINISTIC);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(NOT);
				setState(798);
				match(DETERMINISTIC);
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

	public static class NullCallClauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public List<TerminalNode> NULL() { return getTokens(SqlBaseParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(SqlBaseParser.NULL, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public NullCallClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCallClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullCallClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullCallClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullCallClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullCallClauseContext nullCallClause() throws RecognitionException {
		NullCallClauseContext _localctx = new NullCallClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nullCallClause);
		try {
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(RETURNS);
				setState(802);
				match(NULL);
				setState(803);
				match(ON);
				setState(804);
				match(NULL);
				setState(805);
				match(INPUT);
				}
				break;
			case CALLED:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(CALLED);
				setState(807);
				match(ON);
				setState(808);
				match(NULL);
				setState(809);
				match(INPUT);
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

	public static class ExternalRoutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalRoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalRoutineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalRoutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalRoutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalRoutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalRoutineNameContext externalRoutineName() throws RecognitionException {
		ExternalRoutineNameContext _localctx = new ExternalRoutineNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_externalRoutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			identifier();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			queryTerm();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(815);
				match(ORDER);
				setState(816);
				match(BY);
				setState(817);
				sortItem();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(818);
					match(T__3);
					setState(819);
					sortItem();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(827);
				match(LIMIT);
				setState(828);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public List<QueryPrimaryContext> queryPrimary() {
			return getRuleContexts(QueryPrimaryContext.class);
		}
		public QueryPrimaryContext queryPrimary(int i) {
			return getRuleContext(QueryPrimaryContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SqlBaseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SqlBaseParser.UNION, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(SqlBaseParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(SqlBaseParser.EXCEPT, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SqlBaseParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(SqlBaseParser.INTERSECT, i);
		}
		public List<SetQuantifierContext> setQuantifier() {
			return getRuleContexts(SetQuantifierContext.class);
		}
		public SetQuantifierContext setQuantifier(int i) {
			return getRuleContext(SetQuantifierContext.class,i);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		QueryTermContext _localctx = new QueryTermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_queryTerm);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new QueryTermDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				queryPrimary();
				}
				break;
			case 2:
				_localctx = new SetOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				queryPrimary();
				setState(833);
				_la = _input.LA(1);
				if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(834);
					setQuantifier();
					}
				}

				setState(837);
				queryPrimary();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCEPT || _la==INTERSECT || _la==UNION) {
					{
					{
					setState(838);
					_la = _input.LA(1);
					if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(839);
						setQuantifier();
						}
					}

					setState(842);
					queryPrimary();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_queryPrimary);
		int _la;
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				match(TABLE);
				setState(852);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(VALUES);
				setState(854);
				expression();
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(855);
					match(T__3);
					setState(856);
					expression();
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				match(T__1);
				setState(863);
				queryNoWith();
				setState(864);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			expression();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(869);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(872);
				match(NULLS);
				setState(873);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_querySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(SELECT);
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(877);
				setQuantifier();
				}
				break;
			}
			setState(880);
			selectItem();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(881);
				match(T__3);
				setState(882);
				selectItem();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(888);
				match(FROM);
				setState(889);
				relation(0);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(890);
					match(T__3);
					setState(891);
					relation(0);
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(899);
				match(WHERE);
				setState(900);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(903);
				match(GROUP);
				setState(904);
				match(BY);
				setState(905);
				groupBy();
				}
			}

			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(908);
				match(HAVING);
				setState(909);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_groupBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(912);
				setQuantifier();
				}
				break;
			}
			setState(915);
			groupingElement();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(916);
				match(T__3);
				setState(917);
				groupingElement();
				}
				}
				setState(922);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_groupingElement);
		int _la;
		try {
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(ROLLUP);
				setState(925);
				match(T__1);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(926);
					expression();
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(927);
						match(T__3);
						setState(928);
						expression();
						}
						}
						setState(933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(936);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(CUBE);
				setState(938);
				match(T__1);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(939);
					expression();
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(940);
						match(T__3);
						setState(941);
						expression();
						}
						}
						setState(946);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(949);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				match(GROUPING);
				setState(951);
				match(SETS);
				setState(952);
				match(T__1);
				setState(953);
				groupingSet();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(954);
					match(T__3);
					setState(955);
					groupingSet();
					}
					}
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(961);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupingSet);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				match(T__1);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(966);
					expression();
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(967);
						match(T__3);
						setState(968);
						expression();
						}
						}
						setState(973);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(976);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				expression();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_namedQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(T__1);
			setState(981);
			query();
			setState(982);
			match(T__2);
			setState(983);
			match(AS);
			setState(984);
			((NamedQueryContext)_localctx).name = identifier();
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(985);
				columnAliases();
				}
				break;
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selectItem);
		int _la;
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				expression();
				setState(995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(991);
						match(AS);
						}
					}

					setState(994);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				qualifiedName();
				setState(998);
				match(T__0);
				setState(999);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1005);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1007);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1021);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1008);
						match(CROSS);
						setState(1009);
						match(JOIN);
						setState(1010);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case 2:
						{
						setState(1011);
						joinType();
						setState(1012);
						match(JOIN);
						setState(1013);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(1014);
						joinCriteria();
						}
						break;
					case 3:
						{
						setState(1016);
						match(NATURAL);
						setState(1017);
						joinType();
						setState(1018);
						match(JOIN);
						setState(1019);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					}
					}
					} 
				}
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(1028);
				match(GLOBAL);
				}
			}

			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1031);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				{
				setState(1034);
				match(LEFT);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==ANTI || _la==OUTER) {
					{
					setState(1035);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==ANTI || _la==OUTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				{
				setState(1038);
				match(RIGHT);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==ANTI || _la==OUTER) {
					{
					setState(1039);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==ANTI || _la==OUTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				{
				setState(1042);
				match(FULL);
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==ANTI || _la==OUTER) {
					{
					setState(1043);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==ANTI || _la==OUTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 5:
				{
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CROSS) {
					{
					setState(1046);
					match(CROSS);
					}
				}

				}
				break;
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinCriteria);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				match(ON);
				setState(1052);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(USING);
				setState(1054);
				match(T__1);
				setState(1055);
				identifier();
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1056);
					match(T__3);
					setState(1057);
					identifier();
					}
					}
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1063);
				match(T__2);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			aliasedRelation();
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1068);
				match(TABLESAMPLE);
				setState(1069);
				sampleType();
				setState(1070);
				match(T__1);
				setState(1071);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1072);
				match(T__2);
				}
				break;
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			relationPrimary();
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1079);
					match(AS);
					}
				}

				setState(1082);
				identifier();
				setState(1084);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1083);
					columnAliases();
					}
					break;
				}
				}
				break;
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(T__1);
			setState(1089);
			identifier();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1090);
				match(T__3);
				setState(1091);
				identifier();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			match(T__2);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public SourceTableContext sourceTable() {
			return getRuleContext(SourceTableContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_relationPrimary);
		int _la;
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				sourceTable();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(T__1);
				setState(1101);
				query();
				setState(1102);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				match(UNNEST);
				setState(1105);
				match(T__1);
				setState(1106);
				expression();
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1107);
					match(T__3);
					setState(1108);
					expression();
					}
					}
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1114);
				match(T__2);
				setState(1117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1115);
					match(WITH);
					setState(1116);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1119);
				match(LATERAL);
				setState(1120);
				match(T__1);
				setState(1121);
				query();
				setState(1122);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1124);
				match(T__1);
				setState(1125);
				relation(0);
				setState(1126);
				match(T__2);
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

	public static class SourceTableContext extends ParserRuleContext {
		public SourceTableNameContext sourceTableName() {
			return getRuleContext(SourceTableNameContext.class,0);
		}
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public SourceTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSourceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSourceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSourceTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceTableContext sourceTable() throws RecognitionException {
		SourceTableContext _localctx = new SourceTableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sourceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1130);
				databaseName();
				setState(1131);
				match(T__0);
				}
				break;
			}
			setState(1135);
			sourceTableName();
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

	public static class DatabaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			identifier();
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

	public static class SourceTableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SourceTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceTableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSourceTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSourceTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSourceTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceTableNameContext sourceTableName() throws RecognitionException {
		SourceTableNameContext _localctx = new SourceTableNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sourceTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			identifier();
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

	public static class TargetTableContext extends ParserRuleContext {
		public TargetTableNameContext targetTableName() {
			return getRuleContext(TargetTableNameContext.class,0);
		}
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TargetTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTargetTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTargetTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTargetTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetTableContext targetTable() throws RecognitionException {
		TargetTableContext _localctx = new TargetTableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_targetTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1141);
				databaseName();
				setState(1142);
				match(T__0);
				}
				break;
			}
			setState(1146);
			targetTableName();
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

	public static class TargetTableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TargetTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetTableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTargetTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTargetTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTargetTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetTableNameContext targetTableName() throws RecognitionException {
		TargetTableNameContext _localctx = new TargetTableNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_targetTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			identifier();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1153);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1154);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1157);
				match(NOT);
				setState(1158);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1162);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1163);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1165);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1166);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 98, RULE_predicate);
		int _la;
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				comparisonOperator();
				setState(1173);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				comparisonOperator();
				setState(1176);
				comparisonQuantifier();
				setState(1177);
				match(T__1);
				setState(1178);
				query();
				setState(1179);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1181);
					match(NOT);
					}
				}

				setState(1184);
				match(BETWEEN);
				setState(1185);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1186);
				match(AND);
				setState(1187);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1189);
					match(NOT);
					}
				}

				setState(1192);
				match(IN);
				setState(1193);
				match(T__1);
				setState(1194);
				expression();
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1195);
					match(T__3);
					setState(1196);
					expression();
					}
					}
					setState(1201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1202);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(1204);
					match(GLOBAL);
					}
				}

				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1207);
					match(NOT);
					}
				}

				setState(1210);
				match(IN);
				setState(1211);
				match(T__1);
				setState(1212);
				query();
				setState(1213);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1215);
					match(NOT);
					}
				}

				setState(1218);
				match(LIKE);
				setState(1219);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1220);
					match(ESCAPE);
					setState(1221);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1224);
				match(IS);
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1225);
					match(NOT);
					}
				}

				setState(1228);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1229);
				match(IS);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1230);
					match(NOT);
					}
				}

				setState(1233);
				match(DISTINCT);
				setState(1234);
				match(FROM);
				setState(1235);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1239);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1240);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1241);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1244);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1245);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (ASTERISK - 217)) | (1L << (SLASH - 217)) | (1L << (PERCENT - 217)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1246);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1248);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1249);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1250);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1251);
						match(CONCAT);
						setState(1252);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1253);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1254);
						match(AT);
						setState(1255);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1262);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1263);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1264);
				identifier();
				setState(1265);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1267);
				match(DOUBLE_PRECISION);
				setState(1268);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1269);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1270);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1271);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1272);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1273);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1274);
				match(POSITION);
				setState(1275);
				match(T__1);
				setState(1276);
				valueExpression(0);
				setState(1277);
				match(IN);
				setState(1278);
				valueExpression(0);
				setState(1279);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1281);
				match(T__1);
				setState(1282);
				expression();
				setState(1285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1283);
					match(T__3);
					setState(1284);
					expression();
					}
					}
					setState(1287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1289);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1291);
				match(ROW);
				setState(1292);
				match(T__1);
				setState(1293);
				expression();
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1294);
					match(T__3);
					setState(1295);
					expression();
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1301);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				qualifiedName();
				setState(1304);
				match(T__1);
				setState(1305);
				match(ASTERISK);
				setState(1306);
				match(T__2);
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1307);
					filter();
					}
					break;
				}
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1310);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				qualifiedName();
				setState(1314);
				match(T__1);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(1316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1315);
						setQuantifier();
						}
						break;
					}
					setState(1318);
					expression();
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1319);
						match(T__3);
						setState(1320);
						expression();
						}
						}
						setState(1325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1328);
					match(ORDER);
					setState(1329);
					match(BY);
					setState(1330);
					sortItem();
					setState(1335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1331);
						match(T__3);
						setState(1332);
						sortItem();
						}
						}
						setState(1337);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1340);
				match(T__2);
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1341);
					filter();
					}
					break;
				}
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1344);
						nullTreatment();
						}
					}

					setState(1347);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1350);
				identifier();
				setState(1351);
				match(T__5);
				setState(1352);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1354);
				match(T__1);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EXPLAIN - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NAME - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPTION - 130)) | (1L << (ORDINALITY - 130)) | (1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1355);
					identifier();
					setState(1360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1356);
						match(T__3);
						setState(1357);
						identifier();
						}
						}
						setState(1362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1365);
				match(T__2);
				setState(1366);
				match(T__5);
				setState(1367);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1368);
				match(T__1);
				setState(1369);
				query();
				setState(1370);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1372);
				match(EXISTS);
				setState(1373);
				match(T__1);
				setState(1374);
				query();
				setState(1375);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1377);
				match(CASE);
				setState(1378);
				valueExpression(0);
				setState(1380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1379);
					whenClause();
					}
					}
					setState(1382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1384);
					match(ELSE);
					setState(1385);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1388);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1390);
				match(CASE);
				setState(1392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1391);
					whenClause();
					}
					}
					setState(1394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1396);
					match(ELSE);
					setState(1397);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1400);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1402);
				match(CAST);
				setState(1403);
				match(T__1);
				setState(1404);
				expression();
				setState(1405);
				match(AS);
				setState(1406);
				type(0);
				setState(1407);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1409);
				match(TRY_CAST);
				setState(1410);
				match(T__1);
				setState(1411);
				expression();
				setState(1412);
				match(AS);
				setState(1413);
				type(0);
				setState(1414);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1416);
				match(ARRAY);
				setState(1417);
				match(T__6);
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXISTS - 65)) | (1L << (EXPLAIN - 65)) | (1L << (EXTRACT - 65)) | (1L << (EXTERNAL - 65)) | (1L << (FALSE - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (GROUPING - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LANGUAGE - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOCALTIME - 65)) | (1L << (LOCALTIMESTAMP - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NAME - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NORMALIZE - 65)) | (1L << (NOT - 65)) | (1L << (NULL - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (PLUS - 195)) | (1L << (MINUS - 195)) | (1L << (STRING - 195)) | (1L << (UNICODE_STRING - 195)) | (1L << (BINARY_LITERAL - 195)) | (1L << (INTEGER_VALUE - 195)) | (1L << (DECIMAL_VALUE - 195)) | (1L << (DOUBLE_VALUE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
					{
					setState(1418);
					expression();
					setState(1423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1419);
						match(T__3);
						setState(1420);
						expression();
						}
						}
						setState(1425);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1428);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1429);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1430);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1431);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1432);
					match(T__1);
					setState(1433);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1434);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1437);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1438);
					match(T__1);
					setState(1439);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1440);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1443);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1444);
					match(T__1);
					setState(1445);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1446);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1449);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1450);
					match(T__1);
					setState(1451);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1452);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1455);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1456);
				match(SUBSTRING);
				setState(1457);
				match(T__1);
				setState(1458);
				valueExpression(0);
				setState(1459);
				match(FROM);
				setState(1460);
				valueExpression(0);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1461);
					match(FOR);
					setState(1462);
					valueExpression(0);
					}
				}

				setState(1465);
				match(T__2);
				}
				break;
			case 32:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1467);
				match(NORMALIZE);
				setState(1468);
				match(T__1);
				setState(1469);
				valueExpression(0);
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1470);
					match(T__3);
					setState(1471);
					normalForm();
					}
				}

				setState(1474);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1476);
				match(EXTRACT);
				setState(1477);
				match(T__1);
				setState(1478);
				identifier();
				setState(1479);
				match(FROM);
				setState(1480);
				valueExpression(0);
				setState(1481);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1483);
				match(T__1);
				setState(1484);
				expression();
				setState(1485);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1487);
				match(GROUPING);
				setState(1488);
				match(T__1);
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EXPLAIN - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NAME - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPTION - 130)) | (1L << (ORDINALITY - 130)) | (1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1489);
					qualifiedName();
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1490);
						match(T__3);
						setState(1491);
						qualifiedName();
						}
						}
						setState(1496);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1499);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1502);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1503);
						match(T__6);
						setState(1504);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1505);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1507);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1508);
						match(T__0);
						setState(1509);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_string);
		try {
			setState(1521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1516);
				match(UNICODE_STRING);
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1517);
					match(UESCAPE);
					setState(1518);
					match(STRING);
					}
					break;
				}
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

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nullTreatment);
		try {
			setState(1527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(IGNORE);
				setState(1524);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				match(RESPECT);
				setState(1526);
				match(NULLS);
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_timeZoneSpecifier);
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1529);
				match(TIME);
				setState(1530);
				match(ZONE);
				setState(1531);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				match(TIME);
				setState(1533);
				match(ZONE);
				setState(1534);
				string();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			_la = _input.LA(1);
			if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (EQ - 209)) | (1L << (NEQ - 209)) | (1L << (LT - 209)) | (1L << (LTE - 209)) | (1L << (GT - 209)) | (1L << (GTE - 209)))) != 0)) ) {
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(INTERVAL);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1544);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1547);
			string();
			setState(1548);
			((IntervalContext)_localctx).from = intervalField();
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1549);
				match(TO);
				setState(1550);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (HOUR - 86)) | (1L << (MINUTE - 86)) | (1L << (MONTH - 86)))) != 0) || _la==SECOND || _la==YEAR) ) {
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (NFC - 117)) | (1L << (NFD - 117)) | (1L << (NFKC - 117)) | (1L << (NFKD - 117)))) != 0)) ) {
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

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			match(T__1);
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EXPLAIN - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NAME - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPTION - 130)) | (1L << (ORDINALITY - 130)) | (1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (TIME_WITH_TIME_ZONE - 195)) | (1L << (TIMESTAMP_WITH_TIME_ZONE - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
				{
				setState(1558);
				type(0);
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1559);
					match(T__3);
					setState(1560);
					type(0);
					}
					}
					setState(1565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1568);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1571);
				match(ARRAY);
				setState(1572);
				match(LT);
				setState(1573);
				type(0);
				setState(1574);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1576);
				match(MAP);
				setState(1577);
				match(LT);
				setState(1578);
				type(0);
				setState(1579);
				match(T__3);
				setState(1580);
				type(0);
				setState(1581);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1583);
				match(ROW);
				setState(1584);
				match(T__1);
				setState(1585);
				identifier();
				setState(1586);
				type(0);
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1587);
					match(T__3);
					setState(1588);
					identifier();
					setState(1589);
					type(0);
					}
					}
					setState(1595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1596);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(1598);
				baseType();
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1599);
					match(T__1);
					setState(1600);
					typeParameter();
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1601);
						match(T__3);
						setState(1602);
						typeParameter();
						}
						}
						setState(1607);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1608);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1612);
				match(INTERVAL);
				setState(1613);
				((TypeContext)_localctx).from = intervalField();
				setState(1614);
				match(TO);
				setState(1615);
				((TypeContext)_localctx).to = intervalField();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1619);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1620);
					match(ARRAY);
					}
					} 
				}
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeParameter);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1627);
				type(0);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_baseType);
		try {
			setState(1634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1632);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1633);
				identifier();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(WHEN);
			setState(1637);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1638);
			match(THEN);
			setState(1639);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(FILTER);
			setState(1642);
			match(T__1);
			setState(1643);
			match(WHERE);
			setState(1644);
			booleanExpression(0);
			setState(1645);
			match(T__2);
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

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			match(OVER);
			setState(1648);
			match(T__1);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1649);
				match(PARTITION);
				setState(1650);
				match(BY);
				setState(1651);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1652);
					match(T__3);
					setState(1653);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1661);
				match(ORDER);
				setState(1662);
				match(BY);
				setState(1663);
				sortItem();
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1664);
					match(T__3);
					setState(1665);
					sortItem();
					}
					}
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1673);
				windowFrame();
				}
			}

			setState(1676);
			match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_windowFrame);
		try {
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1679);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1680);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1681);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1682);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1683);
				match(BETWEEN);
				setState(1684);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1685);
				match(AND);
				setState(1686);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1688);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1689);
				match(BETWEEN);
				setState(1690);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1691);
				match(AND);
				setState(1692);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_frameBound);
		int _la;
		try {
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				match(UNBOUNDED);
				setState(1697);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				match(UNBOUNDED);
				setState(1699);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1700);
				match(CURRENT);
				setState(1701);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1702);
				expression();
				setState(1703);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_explainOption);
		int _la;
		try {
			setState(1711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				match(FORMAT);
				setState(1708);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				match(TYPE);
				setState(1710);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (DISTRIBUTED - 57)) | (1L << (IO - 57)) | (1L << (LOGICAL - 57)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_transactionMode);
		int _la;
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				match(ISOLATION);
				setState(1714);
				match(LEVEL);
				setState(1715);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
				match(READ);
				setState(1717);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_levelOfIsolation);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(READ);
				setState(1721);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1722);
				match(READ);
				setState(1723);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
				match(REPEATABLE);
				setState(1725);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1726);
				match(SERIALIZABLE);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_callArgument);
		try {
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1730);
				identifier();
				setState(1731);
				match(T__8);
				setState(1732);
				expression();
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_privilege);
		try {
			setState(1740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1736);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1738);
				match(INSERT);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1739);
				identifier();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			identifier();
			setState(1747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1743);
					match(T__0);
					setState(1744);
					identifier();
					}
					} 
				}
				setState(1749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_grantor);
		try {
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1750);
				match(CURRENT_USER);
				}
				break;
			case 2:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				match(CURRENT_ROLE);
				}
				break;
			case 3:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1752);
				principal();
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_principal);
		try {
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				match(USER);
				setState(1756);
				identifier();
				}
				break;
			case 2:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				match(ROLE);
				setState(1758);
				identifier();
				}
				break;
			case 3:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1759);
				identifier();
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

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			identifier();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1763);
				match(T__3);
				setState(1764);
				identifier();
				}
				}
				setState(1769);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifier);
		try {
			setState(1775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1772);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1773);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1774);
				match(DIGIT_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_number);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1777);
				match(DECIMAL_VALUE);
				}
				break;
			case DOUBLE_VALUE:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(DOUBLE_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1779);
				match(INTEGER_VALUE);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (EXPLAIN - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NAME - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OPTION - 130)) | (1L << (ORDINALITY - 130)) | (1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 48:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 50:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 51:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 62:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f0\u06fb\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00bd\n\5\3\5\3\5\3\5\5\5\u00c2\n\5\3\5\3\5\3\5\3\5\5"+
		"\5\u00c8\n\5\3\5\3\5\5\5\u00cc\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00da\n\5\3\5\3\5\5\5\u00de\n\5\3\5\3\5\5\5\u00e2\n\5"+
		"\3\5\3\5\5\5\u00e6\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ee\n\5\3\5\3\5\5"+
		"\5\u00f2\n\5\3\5\5\5\u00f5\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fc\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u0103\n\5\f\5\16\5\u0106\13\5\3\5\3\5\3\5\5\5\u010b"+
		"\n\5\3\5\3\5\5\5\u010f\n\5\3\5\3\5\3\5\3\5\5\5\u0115\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u011c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0125\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0149\n"+
		"\5\3\5\3\5\3\5\5\5\u014e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0159"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u015f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0167\n"+
		"\5\f\5\16\5\u016a\13\5\5\5\u016c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0173\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u017c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0184\n\5\3\5\3\5\5\5\u0188\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0190\n\5"+
		"\f\5\16\5\u0193\13\5\5\5\u0195\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u019f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u01aa\n\5\f\5\16\5"+
		"\u01ad\13\5\3\5\3\5\3\5\5\5\u01b2\n\5\3\5\3\5\3\5\5\5\u01b7\n\5\3\5\3"+
		"\5\3\5\3\5\5\5\u01bd\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u01c4\n\5\f\5\16\5\u01c7"+
		"\13\5\3\5\3\5\3\5\5\5\u01cc\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u01d3\n\5\3\5"+
		"\3\5\3\5\3\5\7\5\u01d9\n\5\f\5\16\5\u01dc\13\5\3\5\3\5\5\5\u01e0\n\5\3"+
		"\5\3\5\5\5\u01e4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01ec\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u01f2\n\5\3\5\3\5\3\5\7\5\u01f7\n\5\f\5\16\5\u01fa\13\5\3\5\3"+
		"\5\5\5\u01fe\n\5\3\5\3\5\5\5\u0202\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u020c\n\5\3\5\5\5\u020f\n\5\3\5\3\5\5\5\u0213\n\5\3\5\5\5\u0216\n"+
		"\5\3\5\3\5\3\5\3\5\7\5\u021c\n\5\f\5\16\5\u021f\13\5\3\5\3\5\5\5\u0223"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0233"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0239\n\5\3\5\3\5\3\5\3\5\5\5\u023f\n\5\5\5\u0241"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0247\n\5\3\5\3\5\3\5\3\5\5\5\u024d\n\5\5\5\u024f"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u0255\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0268\n\5\3\5\3\5\3\5\5\5\u026d\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0274\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0280\n\5\5\5\u0282\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0294\n\5\f\5\16\5\u0297\13\5\5\5\u0299"+
		"\n\5\3\5\3\5\5\5\u029d\n\5\3\5\3\5\5\5\u02a1\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u02b1\n\5\f\5\16\5\u02b4\13\5\5"+
		"\5\u02b6\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u02be\n\5\3\6\5\6\u02c1\n\6\3"+
		"\6\3\6\3\7\3\7\5\7\u02c7\n\7\3\7\3\7\3\7\7\7\u02cc\n\7\f\7\16\7\u02cf"+
		"\13\7\3\b\3\b\5\b\u02d3\n\b\3\t\3\t\3\t\3\t\5\t\u02d9\n\t\3\t\3\t\5\t"+
		"\u02dd\n\t\3\t\3\t\5\t\u02e1\n\t\3\n\3\n\3\n\3\n\5\n\u02e7\n\n\3\13\3"+
		"\13\3\13\3\13\7\13\u02ed\n\13\f\13\16\13\u02f0\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\7\16\u02fc\n\16\f\16\16\16\u02ff\13\16\3\17"+
		"\3\17\3\17\3\17\5\17\u0305\n\17\3\20\7\20\u0308\n\20\f\20\16\20\u030b"+
		"\13\20\3\21\3\21\3\22\3\22\5\22\u0311\n\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\5\24\u0319\n\24\3\25\3\25\5\25\u031d\n\25\3\26\3\26\3\26\5\26\u0322"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u032d\n\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0337\n\31\f\31\16\31\u033a\13"+
		"\31\5\31\u033c\n\31\3\31\3\31\5\31\u0340\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u0346\n\32\3\32\3\32\3\32\5\32\u034b\n\32\3\32\7\32\u034e\n\32\f\32\16"+
		"\32\u0351\13\32\5\32\u0353\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u035c\n\33\f\33\16\33\u035f\13\33\3\33\3\33\3\33\3\33\5\33\u0365\n\33"+
		"\3\34\3\34\5\34\u0369\n\34\3\34\3\34\5\34\u036d\n\34\3\35\3\35\5\35\u0371"+
		"\n\35\3\35\3\35\3\35\7\35\u0376\n\35\f\35\16\35\u0379\13\35\3\35\3\35"+
		"\3\35\3\35\7\35\u037f\n\35\f\35\16\35\u0382\13\35\5\35\u0384\n\35\3\35"+
		"\3\35\5\35\u0388\n\35\3\35\3\35\3\35\5\35\u038d\n\35\3\35\3\35\5\35\u0391"+
		"\n\35\3\36\5\36\u0394\n\36\3\36\3\36\3\36\7\36\u0399\n\36\f\36\16\36\u039c"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u03a4\n\37\f\37\16\37\u03a7"+
		"\13\37\5\37\u03a9\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u03b1\n\37\f"+
		"\37\16\37\u03b4\13\37\5\37\u03b6\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u03bf\n\37\f\37\16\37\u03c2\13\37\3\37\3\37\5\37\u03c6\n\37\3"+
		" \3 \3 \3 \7 \u03cc\n \f \16 \u03cf\13 \5 \u03d1\n \3 \3 \5 \u03d5\n "+
		"\3!\3!\3!\3!\3!\3!\5!\u03dd\n!\3\"\3\"\3#\3#\5#\u03e3\n#\3#\5#\u03e6\n"+
		"#\3#\3#\3#\3#\3#\5#\u03ed\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0400\n$\7$\u0402\n$\f$\16$\u0405\13$\3%\5%\u0408\n%\3%"+
		"\5%\u040b\n%\3%\3%\5%\u040f\n%\3%\3%\5%\u0413\n%\3%\3%\5%\u0417\n%\3%"+
		"\5%\u041a\n%\5%\u041c\n%\3&\3&\3&\3&\3&\3&\3&\7&\u0425\n&\f&\16&\u0428"+
		"\13&\3&\3&\5&\u042c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0435\n\'\3(\3"+
		"(\3)\3)\5)\u043b\n)\3)\3)\5)\u043f\n)\5)\u0441\n)\3*\3*\3*\3*\7*\u0447"+
		"\n*\f*\16*\u044a\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0458\n+\f"+
		"+\16+\u045b\13+\3+\3+\3+\5+\u0460\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u046b"+
		"\n+\3,\3,\3,\5,\u0470\n,\3,\3,\3-\3-\3.\3.\3/\3/\3/\5/\u047b\n/\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u0486\n\62\3\62\3\62\5\62\u048a"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0492\n\62\f\62\16\62\u0495\13"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04a1\n\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04a9\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u04b0\n\63\f\63\16\63\u04b3\13\63\3\63\3\63\3\63\5\63\u04b8\n\63"+
		"\3\63\5\63\u04bb\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04c3\n\63\3"+
		"\63\3\63\3\63\3\63\5\63\u04c9\n\63\3\63\3\63\5\63\u04cd\n\63\3\63\3\63"+
		"\3\63\5\63\u04d2\n\63\3\63\3\63\3\63\5\63\u04d7\n\63\3\64\3\64\3\64\3"+
		"\64\5\64\u04dd\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\7\64\u04eb\n\64\f\64\16\64\u04ee\13\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\6\65\u0508\n\65\r\65\16\65\u0509\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\7\65\u0513\n\65\f\65\16\65\u0516\13\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u051f\n\65\3\65\5\65\u0522\n\65"+
		"\3\65\3\65\3\65\5\65\u0527\n\65\3\65\3\65\3\65\7\65\u052c\n\65\f\65\16"+
		"\65\u052f\13\65\5\65\u0531\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u0538\n"+
		"\65\f\65\16\65\u053b\13\65\5\65\u053d\n\65\3\65\3\65\5\65\u0541\n\65\3"+
		"\65\5\65\u0544\n\65\3\65\5\65\u0547\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u0551\n\65\f\65\16\65\u0554\13\65\5\65\u0556\n\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\6\65\u0567\n\65\r\65\16\65\u0568\3\65\3\65\5\65\u056d\n\65\3\65\3\65"+
		"\3\65\3\65\6\65\u0573\n\65\r\65\16\65\u0574\3\65\3\65\5\65\u0579\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0590\n\65\f\65\16\65\u0593\13"+
		"\65\5\65\u0595\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u059e\n\65"+
		"\3\65\3\65\3\65\3\65\5\65\u05a4\n\65\3\65\3\65\3\65\3\65\5\65\u05aa\n"+
		"\65\3\65\3\65\3\65\3\65\5\65\u05b0\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u05ba\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u05c3"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u05d7\n\65\f\65\16\65\u05da\13\65\5\65"+
		"\u05dc\n\65\3\65\5\65\u05df\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\7\65\u05e9\n\65\f\65\16\65\u05ec\13\65\3\66\3\66\3\66\3\66\5\66\u05f2"+
		"\n\66\5\66\u05f4\n\66\3\67\3\67\3\67\3\67\5\67\u05fa\n\67\38\38\38\38"+
		"\38\38\58\u0602\n8\39\39\3:\3:\3;\3;\3<\3<\5<\u060c\n<\3<\3<\3<\3<\5<"+
		"\u0612\n<\3=\3=\3>\3>\3?\3?\3?\3?\7?\u061c\n?\f?\16?\u061f\13?\5?\u0621"+
		"\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\7@\u063a\n@\f@\16@\u063d\13@\3@\3@\3@\3@\3@\3@\3@\7@\u0646\n@\f@\16"+
		"@\u0649\13@\3@\3@\5@\u064d\n@\3@\3@\3@\3@\3@\5@\u0654\n@\3@\3@\7@\u0658"+
		"\n@\f@\16@\u065b\13@\3A\3A\5A\u065f\nA\3B\3B\3B\3B\5B\u0665\nB\3C\3C\3"+
		"C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\7E\u0679\nE\fE\16E\u067c"+
		"\13E\5E\u067e\nE\3E\3E\3E\3E\3E\7E\u0685\nE\fE\16E\u0688\13E\5E\u068a"+
		"\nE\3E\5E\u068d\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\5F\u06a1\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u06ac\nG\3H\3H\3H\3H\5H"+
		"\u06b2\nH\3I\3I\3I\3I\3I\5I\u06b9\nI\3J\3J\3J\3J\3J\3J\3J\5J\u06c2\nJ"+
		"\3K\3K\3K\3K\3K\5K\u06c9\nK\3L\3L\3L\3L\5L\u06cf\nL\3M\3M\3M\7M\u06d4"+
		"\nM\fM\16M\u06d7\13M\3N\3N\3N\5N\u06dc\nN\3O\3O\3O\3O\3O\5O\u06e3\nO\3"+
		"P\3P\3P\7P\u06e8\nP\fP\16P\u06eb\13P\3Q\3Q\3Q\3Q\3Q\5Q\u06f2\nQ\3R\3R"+
		"\3R\5R\u06f7\nR\3S\3S\3S\2\7Fbfh~T\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\2\30\4\2\37\37\u009a\u009a\4\2MM[[\4\2"+
		"AA\\\\\4\2\21\21\u00e2\u00e2\5\2@@``\u00c3\u00c3\4\2\30\30\67\67\4\2I"+
		"Iii\4\2\21\21::\4\2\r\16\u0088\u0088\4\2\32\32\u00b3\u00b3\3\2\u00d9\u00da"+
		"\3\2\u00db\u00dd\3\2\u00d3\u00d8\5\2\21\21\25\25\u00ae\u00ae\4\2GG\u00bd"+
		"\u00bd\7\2\64\64XXst\u00a7\u00a7\u00d1\u00d1\3\2wz\4\2JJ\u008e\u008e\5"+
		"\2TTff\u00b7\u00b7\6\2;;ccqq\u00c8\u00c8\4\2\u0083\u0083\u00d0\u00d0\60"+
		"\2\17\21\23\23\25\26\30\32\35\37\"\',,..\62\64\67\6799;;AADDFFHJLLOTX"+
		"Z\\\\^^aaccefhjllnnquw|\u0080\u0081\u0083\u0084\u0087\u0087\u0089\u008e"+
		"\u0090\u0093\u0095\u009d\u009f\u00a1\u00a3\u00a7\u00a9\u00b3\u00b5\u00b7"+
		"\u00b9\u00bc\u00be\u00bf\u00c1\u00c2\u00c5\u00c6\u00c8\u00c8\u00ca\u00cb"+
		"\u00cf\u00d2\2\u0808\2\u00a6\3\2\2\2\4\u00a9\3\2\2\2\6\u00ac\3\2\2\2\b"+
		"\u02bd\3\2\2\2\n\u02c0\3\2\2\2\f\u02c4\3\2\2\2\16\u02d2\3\2\2\2\20\u02d4"+
		"\3\2\2\2\22\u02e2\3\2\2\2\24\u02e8\3\2\2\2\26\u02f3\3\2\2\2\30\u02f7\3"+
		"\2\2\2\32\u02fd\3\2\2\2\34\u0304\3\2\2\2\36\u0309\3\2\2\2 \u030c\3\2\2"+
		"\2\"\u0310\3\2\2\2$\u0312\3\2\2\2&\u0315\3\2\2\2(\u031c\3\2\2\2*\u0321"+
		"\3\2\2\2,\u032c\3\2\2\2.\u032e\3\2\2\2\60\u0330\3\2\2\2\62\u0352\3\2\2"+
		"\2\64\u0364\3\2\2\2\66\u0366\3\2\2\28\u036e\3\2\2\2:\u0393\3\2\2\2<\u03c5"+
		"\3\2\2\2>\u03d4\3\2\2\2@\u03d6\3\2\2\2B\u03de\3\2\2\2D\u03ec\3\2\2\2F"+
		"\u03ee\3\2\2\2H\u0407\3\2\2\2J\u042b\3\2\2\2L\u042d\3\2\2\2N\u0436\3\2"+
		"\2\2P\u0438\3\2\2\2R\u0442\3\2\2\2T\u046a\3\2\2\2V\u046f\3\2\2\2X\u0473"+
		"\3\2\2\2Z\u0475\3\2\2\2\\\u047a\3\2\2\2^\u047e\3\2\2\2`\u0480\3\2\2\2"+
		"b\u0489\3\2\2\2d\u04d6\3\2\2\2f\u04dc\3\2\2\2h\u05de\3\2\2\2j\u05f3\3"+
		"\2\2\2l\u05f9\3\2\2\2n\u0601\3\2\2\2p\u0603\3\2\2\2r\u0605\3\2\2\2t\u0607"+
		"\3\2\2\2v\u0609\3\2\2\2x\u0613\3\2\2\2z\u0615\3\2\2\2|\u0617\3\2\2\2~"+
		"\u0653\3\2\2\2\u0080\u065e\3\2\2\2\u0082\u0664\3\2\2\2\u0084\u0666\3\2"+
		"\2\2\u0086\u066b\3\2\2\2\u0088\u0671\3\2\2\2\u008a\u06a0\3\2\2\2\u008c"+
		"\u06ab\3\2\2\2\u008e\u06b1\3\2\2\2\u0090\u06b8\3\2\2\2\u0092\u06c1\3\2"+
		"\2\2\u0094\u06c8\3\2\2\2\u0096\u06ce\3\2\2\2\u0098\u06d0\3\2\2\2\u009a"+
		"\u06db\3\2\2\2\u009c\u06e2\3\2\2\2\u009e\u06e4\3\2\2\2\u00a0\u06f1\3\2"+
		"\2\2\u00a2\u06f6\3\2\2\2\u00a4\u06f8\3\2\2\2\u00a6\u00a7\5\b\5\2\u00a7"+
		"\u00a8\7\2\2\3\u00a8\3\3\2\2\2\u00a9\u00aa\5`\61\2\u00aa\u00ab\7\2\2\3"+
		"\u00ab\5\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\2\2\3\u00ae\7\3\2"+
		"\2\2\u00af\u02be\5\n\6\2\u00b0\u00b1\7\u00c5\2\2\u00b1\u02be\5\u00a0Q"+
		"\2\u00b2\u00b3\7\u00c5\2\2\u00b3\u00b4\5\u00a0Q\2\u00b4\u00b5\7\3\2\2"+
		"\u00b5\u00b6\5\u00a0Q\2\u00b6\u02be\3\2\2\2\u00b7\u00b8\7)\2\2\u00b8\u00bc"+
		"\7\u00a5\2\2\u00b9\u00ba\7Y\2\2\u00ba\u00bb\7~\2\2\u00bb\u00bd\7C\2\2"+
		"\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1"+
		"\5\u0098M\2\u00bf\u00c0\7\u00ce\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u02be\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4"+
		"\u00c7\7\u00a5\2\2\u00c5\u00c6\7Y\2\2\u00c6\u00c8\7C\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\5\u0098M\2"+
		"\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u02be"+
		"\3\2\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\7\u00a5\2\2\u00cf\u00d0\5\u0098"+
		"M\2\u00d0\u00d1\7\u0095\2\2\u00d1\u00d2\7\u00bb\2\2\u00d2\u00d3\5\u00a0"+
		"Q\2\u00d3\u02be\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d9\7\u00b4\2\2\u00d6"+
		"\u00d7\7Y\2\2\u00d7\u00d8\7~\2\2\u00d8\u00da\7C\2\2\u00d9\u00d6\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\5\u0098M\2\u00dc"+
		"\u00de\5R*\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2"+
		"\2\u00df\u00e0\7%\2\2\u00e0\u00e2\5j\66\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\7\u00ce\2\2\u00e4\u00e6\5\24"+
		"\13\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00ed\7\27\2\2\u00e8\u00ee\5\n\6\2\u00e9\u00ea\7\4\2\2\u00ea\u00eb\5"+
		"\n\6\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f1\7\u00ce\2\2\u00f0\u00f2"+
		"\7{\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\7\62\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u02be\3"+
		"\2\2\2\u00f6\u00f7\7)\2\2\u00f7\u00fb\7\u00b4\2\2\u00f8\u00f9\7Y\2\2\u00f9"+
		"\u00fa\7~\2\2\u00fa\u00fc\7C\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00fc\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5\u0098M\2\u00fe\u00ff\7\4\2\2\u00ff"+
		"\u0104\5\16\b\2\u0100\u0101\7\6\2\2\u0101\u0103\5\16\b\2\u0102\u0100\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010a\7\5\2\2\u0108\u0109\7%"+
		"\2\2\u0109\u010b\5j\66\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010d\7\u00ce\2\2\u010d\u010f\5\24\13\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u02be\3\2\2\2\u0110\u0111\7<\2\2\u0111"+
		"\u0114\7\u00b4\2\2\u0112\u0113\7Y\2\2\u0113\u0115\7C\2\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u02be\5\u0098M\2"+
		"\u0117\u0118\7_\2\2\u0118\u0119\7b\2\2\u0119\u011b\5\\/\2\u011a\u011c"+
		"\5R*\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\5\n\6\2\u011e\u02be\3\2\2\2\u011f\u0120\7\66\2\2\u0120\u0121\7"+
		"M\2\2\u0121\u0124\5\\/\2\u0122\u0123\7\u00cd\2\2\u0123\u0125\5b\62\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u02be\3\2\2\2\u0126\u0127\7\22"+
		"\2\2\u0127\u0128\7\u00b4\2\2\u0128\u0129\5\\/\2\u0129\u012a\7\u0095\2"+
		"\2\u012a\u012b\7\u00bb\2\2\u012b\u012c\5\\/\2\u012c\u02be\3\2\2\2\u012d"+
		"\u012e\7\22\2\2\u012e\u012f\7\u00b4\2\2\u012f\u0130\5\u0098M\2\u0130\u0131"+
		"\7\u0095\2\2\u0131\u0132\7#\2\2\u0132\u0133\5\u00a0Q\2\u0133\u0134\7\u00bb"+
		"\2\2\u0134\u0135\5\u00a0Q\2\u0135\u02be\3\2\2\2\u0136\u0137\7\22\2\2\u0137"+
		"\u0138\7\u00b4\2\2\u0138\u0139\5\u0098M\2\u0139\u013a\7<\2\2\u013a\u013b"+
		"\7#\2\2\u013b\u013c\5\u0098M\2\u013c\u02be\3\2\2\2\u013d\u013e\7\22\2"+
		"\2\u013e\u013f\7\u00b4\2\2\u013f\u0140\5\u0098M\2\u0140\u0141\7\17\2\2"+
		"\u0141\u0142\7#\2\2\u0142\u0143\5\20\t\2\u0143\u02be\3\2\2\2\u0144\u0145"+
		"\7\23\2\2\u0145\u0148\5\u0098M\2\u0146\u0147\7\u00ce\2\2\u0147\u0149\5"+
		"\24\13\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u02be\3\2\2\2\u014a"+
		"\u014d\7)\2\2\u014b\u014c\7\u0085\2\2\u014c\u014e\7\u0097\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\u00cb\2"+
		"\2\u0150\u0151\5\u0098M\2\u0151\u0152\7\27\2\2\u0152\u0153\5\n\6\2\u0153"+
		"\u02be\3\2\2\2\u0154\u0155\7<\2\2\u0155\u0158\7\u00cb\2\2\u0156\u0157"+
		"\7Y\2\2\u0157\u0159\7C\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u02be\5\u0098M\2\u015b\u015e\7)\2\2\u015c\u015d\7"+
		"\u0085\2\2\u015d\u015f\7\u0097\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7O\2\2\u0161\u0162\5\u0098M\2\u0162"+
		"\u016b\7\4\2\2\u0163\u0168\5\30\r\2\u0164\u0165\7\6\2\2\u0165\u0167\5"+
		"\30\r\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0163\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\5\2\2\u016e"+
		"\u016f\7\u009c\2\2\u016f\u0172\5~@\2\u0170\u0171\7%\2\2\u0171\u0173\5"+
		"j\66\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\5\32\16\2\u0175\u0176\5\"\22\2\u0176\u02be\3\2\2\2\u0177\u0178"+
		"\7\22\2\2\u0178\u0179\7O\2\2\u0179\u017b\5\u0098M\2\u017a\u017c\5|?\2"+
		"\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e"+
		"\5\36\20\2\u017e\u02be\3\2\2\2\u017f\u0180\7<\2\2\u0180\u0183\7O\2\2\u0181"+
		"\u0182\7Y\2\2\u0182\u0184\7C\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0187\5\u0098M\2\u0186\u0188\5|?\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u02be\3\2\2\2\u0189\u018a\7\35"+
		"\2\2\u018a\u018b\5\u0098M\2\u018b\u0194\7\4\2\2\u018c\u0191\5\u0094K\2"+
		"\u018d\u018e\7\6\2\2\u018e\u0190\5\u0094K\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u018c\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\7\5\2\2\u0197\u02be\3\2\2\2\u0198\u0199\7)"+
		"\2\2\u0199\u019a\7\u009f\2\2\u019a\u019e\5\u00a0Q\2\u019b\u019c\7\u00ce"+
		"\2\2\u019c\u019d\7\20\2\2\u019d\u019f\5\u009aN\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u02be\3\2\2\2\u01a0\u01a1\7<\2\2\u01a1\u01a2\7\u009f"+
		"\2\2\u01a2\u02be\5\u00a0Q\2\u01a3\u01a4\7Q\2\2\u01a4\u01a5\5\u009eP\2"+
		"\u01a5\u01a6\7\u00bb\2\2\u01a6\u01ab\5\u009cO\2\u01a7\u01a8\7\6\2\2\u01a8"+
		"\u01aa\5\u009cO\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b1\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\7\u00ce\2\2\u01af\u01b0\7\20\2\2\u01b0\u01b2\7\u0084\2\2\u01b1"+
		"\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b6\3\2\2\2\u01b3\u01b4\7R"+
		"\2\2\u01b4\u01b5\7\34\2\2\u01b5\u01b7\5\u009aN\2\u01b6\u01b3\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u02be\3\2\2\2\u01b8\u01bc\7\u009d\2\2\u01b9\u01ba"+
		"\7\20\2\2\u01ba\u01bb\7\u0084\2\2\u01bb\u01bd\7K\2\2\u01bc\u01b9\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5\u009eP\2\u01bf"+
		"\u01c0\7M\2\2\u01c0\u01c5\5\u009cO\2\u01c1\u01c2\7\6\2\2\u01c2\u01c4\5"+
		"\u009cO\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01cb\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9"+
		"\7R\2\2\u01c9\u01ca\7\34\2\2\u01ca\u01cc\5\u009aN\2\u01cb\u01c8\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u02be\3\2\2\2\u01cd\u01ce\7\u00ab\2\2\u01ce"+
		"\u01d2\7\u009f\2\2\u01cf\u01d3\7\21\2\2\u01d0\u01d3\7|\2\2\u01d1\u01d3"+
		"\5\u00a0Q\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d3\u02be\3\2\2\2\u01d4\u01df\7Q\2\2\u01d5\u01da\5\u0096L\2\u01d6"+
		"\u01d7\7\6\2\2\u01d7\u01d9\5\u0096L\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e0\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01de\7\21\2\2\u01de\u01e0\7\u0090\2\2\u01df\u01d5"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\7\u0082\2"+
		"\2\u01e2\u01e4\7\u00b4\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\5\u0098M\2\u01e6\u01e7\7\u00bb\2\2\u01e7\u01eb"+
		"\5\u009cO\2\u01e8\u01e9\7\u00ce\2\2\u01e9\u01ea\7Q\2\2\u01ea\u01ec\7\u0084"+
		"\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u02be\3\2\2\2\u01ed"+
		"\u01f1\7\u009d\2\2\u01ee\u01ef\7Q\2\2\u01ef\u01f0\7\u0084\2\2\u01f0\u01f2"+
		"\7K\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fd\3\2\2\2\u01f3"+
		"\u01f8\5\u0096L\2\u01f4\u01f5\7\6\2\2\u01f5\u01f7\5\u0096L\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fe\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7\21\2\2\u01fc\u01fe\7"+
		"\u0090\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\3\2\2\2"+
		"\u01ff\u0201\7\u0082\2\2\u0200\u0202\7\u00b4\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0098M\2\u0204\u0205"+
		"\7M\2\2\u0205\u0206\5\u009cO\2\u0206\u02be\3\2\2\2\u0207\u0208\7\u00ad"+
		"\2\2\u0208\u020e\7S\2\2\u0209\u020b\7\u0082\2\2\u020a\u020c\7\u00b4\2"+
		"\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f"+
		"\5\u0098M\2\u020e\u0209\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u02be\3\2\2"+
		"\2\u0210\u0212\7D\2\2\u0211\u0213\7\23\2\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\7\u00ca\2\2\u0215\u0214\3\2\2"+
		"\2\u0215\u0216\3\2\2\2\u0216\u0222\3\2\2\2\u0217\u0218\7\4\2\2\u0218\u021d"+
		"\5\u008eH\2\u0219\u021a\7\6\2\2\u021a\u021c\5\u008eH\2\u021b\u0219\3\2"+
		"\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\7\5\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0217\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u02be\5\b\5\2\u0225\u0226\7\u00ad\2\2\u0226\u0227\7)\2\2\u0227\u0228"+
		"\7\u00b4\2\2\u0228\u02be\5\u0098M\2\u0229\u022a\7\u00ad\2\2\u022a\u022b"+
		"\7)\2\2\u022b\u022c\7\u00cb\2\2\u022c\u02be\5\u0098M\2\u022d\u022e\7\u00ad"+
		"\2\2\u022e\u022f\7)\2\2\u022f\u0230\7O\2\2\u0230\u0232\5\u0098M\2\u0231"+
		"\u0233\5|?\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u02be\3\2\2"+
		"\2\u0234\u0235\7\u00ad\2\2\u0235\u0238\7\u00b5\2\2\u0236\u0237\t\3\2\2"+
		"\u0237\u0239\5\u0098M\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u0240\3\2\2\2\u023a\u023b\7m\2\2\u023b\u023e\5j\66\2\u023c\u023d\7?\2"+
		"\2\u023d\u023f\5j\66\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241"+
		"\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u02be\3\2\2\2\u0242"+
		"\u0243\7\u00ad\2\2\u0243\u0246\7\u00a6\2\2\u0244\u0245\t\3\2\2\u0245\u0247"+
		"\5\u00a0Q\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024e\3\2\2"+
		"\2\u0248\u0249\7m\2\2\u0249\u024c\5j\66\2\u024a\u024b\7?\2\2\u024b\u024d"+
		"\5j\66\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u0248\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u02be\3\2\2\2\u0250\u0251\7\u00ad"+
		"\2\2\u0251\u0254\7\"\2\2\u0252\u0253\7m\2\2\u0253\u0255\5j\66\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u02be\3\2\2\2\u0256\u0257\7\u00ad"+
		"\2\2\u0257\u0258\7$\2\2\u0258\u0259\t\3\2\2\u0259\u02be\5\u0098M\2\u025a"+
		"\u025b\7\u00ad\2\2\u025b\u025c\7\u00b1\2\2\u025c\u025d\7K\2\2\u025d\u02be"+
		"\5\u0098M\2\u025e\u025f\7\u00ad\2\2\u025f\u0260\7\u00b1\2\2\u0260\u0261"+
		"\7K\2\2\u0261\u0262\7\4\2\2\u0262\u0263\58\35\2\u0263\u0264\7\5\2\2\u0264"+
		"\u02be\3\2\2\2\u0265\u0267\7\u00ad\2\2\u0266\u0268\7,\2\2\u0267\u0266"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\7\u00a0\2"+
		"\2\u026a\u026b\t\3\2\2\u026b\u026d\5\u00a0Q\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u02be\3\2\2\2\u026e\u026f\7\u00ad\2\2\u026f\u0270"+
		"\7\u009f\2\2\u0270\u0273\7S\2\2\u0271\u0272\t\3\2\2\u0272\u0274\5\u00a0"+
		"Q\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u02be\3\2\2\2\u0275"+
		"\u0276\78\2\2\u0276\u02be\5\u0098M\2\u0277\u0278\7\67\2\2\u0278\u02be"+
		"\5\u0098M\2\u0279\u027a\7\u00ad\2\2\u027a\u0281\7P\2\2\u027b\u027c\7m"+
		"\2\2\u027c\u027f\5j\66\2\u027d\u027e\7?\2\2\u027e\u0280\5j\66\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027b\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u02be\3\2\2\2\u0283\u0284\7\u00ad\2\2\u0284"+
		"\u02be\7\u00aa\2\2\u0285\u0286\7\u00ab\2\2\u0286\u0287\7\u00aa\2\2\u0287"+
		"\u0288\5\u0098M\2\u0288\u0289\7\u00d3\2\2\u0289\u028a\5`\61\2\u028a\u02be"+
		"\3\2\2\2\u028b\u028c\7\u0098\2\2\u028c\u028d\7\u00aa\2\2\u028d\u02be\5"+
		"\u0098M\2\u028e\u028f\7\u00b0\2\2\u028f\u0298\7\u00bc\2\2\u0290\u0295"+
		"\5\u0090I\2\u0291\u0292\7\6\2\2\u0292\u0294\5\u0090I\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0290\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u02be\3\2\2\2\u029a\u029c\7&\2\2\u029b\u029d\7\u00cf\2\2\u029c"+
		"\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02be\3\2\2\2\u029e\u02a0\7\u00a1"+
		"\2\2\u029f\u02a1\7\u00cf\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02be\3\2\2\2\u02a2\u02a3\7\u008f\2\2\u02a3\u02a4\5\u00a0Q\2\u02a4\u02a5"+
		"\7M\2\2\u02a5\u02a6\5\b\5\2\u02a6\u02be\3\2\2\2\u02a7\u02a8\7\65\2\2\u02a8"+
		"\u02a9\7\u008f\2\2\u02a9\u02be\5\u00a0Q\2\u02aa\u02ab\7B\2\2\u02ab\u02b5"+
		"\5\u00a0Q\2\u02ac\u02ad\7\u00c7\2\2\u02ad\u02b2\5`\61\2\u02ae\u02af\7"+
		"\6\2\2\u02af\u02b1\5`\61\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02ac\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02be\3\2\2\2\u02b7"+
		"\u02b8\78\2\2\u02b8\u02b9\7^\2\2\u02b9\u02be\5\u00a0Q\2\u02ba\u02bb\7"+
		"8\2\2\u02bb\u02bc\7\u0089\2\2\u02bc\u02be\5\u00a0Q\2\u02bd\u00af\3\2\2"+
		"\2\u02bd\u00b0\3\2\2\2\u02bd\u00b2\3\2\2\2\u02bd\u00b7\3\2\2\2\u02bd\u00c3"+
		"\3\2\2\2\u02bd\u00cd\3\2\2\2\u02bd\u00d4\3\2\2\2\u02bd\u00f6\3\2\2\2\u02bd"+
		"\u0110\3\2\2\2\u02bd\u0117\3\2\2\2\u02bd\u011f\3\2\2\2\u02bd\u0126\3\2"+
		"\2\2\u02bd\u012d\3\2\2\2\u02bd\u0136\3\2\2\2\u02bd\u013d\3\2\2\2\u02bd"+
		"\u0144\3\2\2\2\u02bd\u014a\3\2\2\2\u02bd\u0154\3\2\2\2\u02bd\u015b\3\2"+
		"\2\2\u02bd\u0177\3\2\2\2\u02bd\u017f\3\2\2\2\u02bd\u0189\3\2\2\2\u02bd"+
		"\u0198\3\2\2\2\u02bd\u01a0\3\2\2\2\u02bd\u01a3\3\2\2\2\u02bd\u01b8\3\2"+
		"\2\2\u02bd\u01cd\3\2\2\2\u02bd\u01d4\3\2\2\2\u02bd\u01ed\3\2\2\2\u02bd"+
		"\u0207\3\2\2\2\u02bd\u0210\3\2\2\2\u02bd\u0225\3\2\2\2\u02bd\u0229\3\2"+
		"\2\2\u02bd\u022d\3\2\2\2\u02bd\u0234\3\2\2\2\u02bd\u0242\3\2\2\2\u02bd"+
		"\u0250\3\2\2\2\u02bd\u0256\3\2\2\2\u02bd\u025a\3\2\2\2\u02bd\u025e\3\2"+
		"\2\2\u02bd\u0265\3\2\2\2\u02bd\u026e\3\2\2\2\u02bd\u0275\3\2\2\2\u02bd"+
		"\u0277\3\2\2\2\u02bd\u0279\3\2\2\2\u02bd\u0283\3\2\2\2\u02bd\u0285\3\2"+
		"\2\2\u02bd\u028b\3\2\2\2\u02bd\u028e\3\2\2\2\u02bd\u029a\3\2\2\2\u02bd"+
		"\u029e\3\2\2\2\u02bd\u02a2\3\2\2\2\u02bd\u02a7\3\2\2\2\u02bd\u02aa\3\2"+
		"\2\2\u02bd\u02b7\3\2\2\2\u02bd\u02ba\3\2\2\2\u02be\t\3\2\2\2\u02bf\u02c1"+
		"\5\f\7\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\5\60\31\2\u02c3\13\3\2\2\2\u02c4\u02c6\7\u00ce\2\2\u02c5\u02c7"+
		"\7\u0094\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2"+
		"\2\u02c8\u02cd\5@!\2\u02c9\u02ca\7\6\2\2\u02ca\u02cc\5@!\2\u02cb\u02c9"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\r\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\5\20\t\2\u02d1\u02d3\5\22\n"+
		"\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\17\3\2\2\2\u02d4\u02d5"+
		"\5\u00a0Q\2\u02d5\u02d8\5~@\2\u02d6\u02d7\7~\2\2\u02d7\u02d9\7\177\2\2"+
		"\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02db"+
		"\7%\2\2\u02db\u02dd\5j\66\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02e0\3\2\2\2\u02de\u02df\7\u00ce\2\2\u02df\u02e1\5\24\13\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\21\3\2\2\2\u02e2\u02e3\7m\2\2\u02e3"+
		"\u02e6\5\u0098M\2\u02e4\u02e5\t\4\2\2\u02e5\u02e7\7\u0091\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\23\3\2\2\2\u02e8\u02e9\7\4\2\2\u02e9"+
		"\u02ee\5\26\f\2\u02ea\u02eb\7\6\2\2\u02eb\u02ed\5\26\f\2\u02ec\u02ea\3"+
		"\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7\5\2\2\u02f2\25\3\2\2"+
		"\2\u02f3\u02f4\5\u00a0Q\2\u02f4\u02f5\7\u00d3\2\2\u02f5\u02f6\5`\61\2"+
		"\u02f6\27\3\2\2\2\u02f7\u02f8\5\u00a0Q\2\u02f8\u02f9\5~@\2\u02f9\31\3"+
		"\2\2\2\u02fa\u02fc\5\34\17\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\33\3\2\2\2\u02ff\u02fd\3\2\2"+
		"\2\u0300\u0301\7h\2\2\u0301\u0305\5(\25\2\u0302\u0305\5*\26\2\u0303\u0305"+
		"\5,\27\2\u0304\u0300\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305"+
		"\35\3\2\2\2\u0306\u0308\5 \21\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2"+
		"\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\37\3\2\2\2\u030b\u0309"+
		"\3\2\2\2\u030c\u030d\5,\27\2\u030d!\3\2\2\2\u030e\u0311\5$\23\2\u030f"+
		"\u0311\5&\24\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2\2\2\u0311#\3\2\2\2"+
		"\u0312\u0313\7\u009b\2\2\u0313\u0314\5`\61\2\u0314%\3\2\2\2\u0315\u0318"+
		"\7F\2\2\u0316\u0317\7u\2\2\u0317\u0319\5.\30\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\'\3\2\2\2\u031a\u031d\7\u00af\2\2\u031b\u031d\5\u00a0"+
		"Q\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d)\3\2\2\2\u031e\u0322"+
		"\79\2\2\u031f\u0320\7~\2\2\u0320\u0322\79\2\2\u0321\u031e\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0322+\3\2\2\2\u0323\u0324\7\u009c\2\2\u0324\u0325\7\177"+
		"\2\2\u0325\u0326\7\u0082\2\2\u0326\u0327\7\177\2\2\u0327\u032d\7^\2\2"+
		"\u0328\u0329\7\36\2\2\u0329\u032a\7\u0082\2\2\u032a\u032b\7\177\2\2\u032b"+
		"\u032d\7^\2\2\u032c\u0323\3\2\2\2\u032c\u0328\3\2\2\2\u032d-\3\2\2\2\u032e"+
		"\u032f\5\u00a0Q\2\u032f/\3\2\2\2\u0330\u033b\5\62\32\2\u0331\u0332\7\u0086"+
		"\2\2\u0332\u0333\7\34\2\2\u0333\u0338\5\66\34\2\u0334\u0335\7\6\2\2\u0335"+
		"\u0337\5\66\34\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3"+
		"\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b"+
		"\u0331\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033e\7n"+
		"\2\2\u033e\u0340\t\5\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\61\3\2\2\2\u0341\u0353\5\64\33\2\u0342\u0343\5\64\33\2\u0343\u0345\t"+
		"\6\2\2\u0344\u0346\5B\"\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u034f\5\64\33\2\u0348\u034a\t\6\2\2\u0349\u034b\5"+
		"B\"\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034e\5\64\33\2\u034d\u0348\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3"+
		"\2\2\2\u034f\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0341\3\2\2\2\u0352\u0342\3\2\2\2\u0353\63\3\2\2\2\u0354\u0365\58\35"+
		"\2\u0355\u0356\7\u00b4\2\2\u0356\u0365\5\u0098M\2\u0357\u0358\7\u00c9"+
		"\2\2\u0358\u035d\5`\61\2\u0359\u035a\7\6\2\2\u035a\u035c\5`\61\2\u035b"+
		"\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035e\u0365\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361\7\4\2\2\u0361"+
		"\u0362\5\60\31\2\u0362\u0363\7\5\2\2\u0363\u0365\3\2\2\2\u0364\u0354\3"+
		"\2\2\2\u0364\u0355\3\2\2\2\u0364\u0357\3\2\2\2\u0364\u0360\3\2\2\2\u0365"+
		"\65\3\2\2\2\u0366\u0368\5`\61\2\u0367\u0369\t\7\2\2\u0368\u0367\3\2\2"+
		"\2\u0368\u0369\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u036b\7\u0081\2\2\u036b"+
		"\u036d\t\b\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\67\3\2\2"+
		"\2\u036e\u0370\7\u00a8\2\2\u036f\u0371\5B\"\2\u0370\u036f\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0377\5D#\2\u0373\u0374\7\6\2"+
		"\2\u0374\u0376\5D#\2\u0375\u0373\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0383\3\2\2\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037b\7M\2\2\u037b\u0380\5F$\2\u037c\u037d\7\6\2\2\u037d\u037f\5F$\2"+
		"\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u037a\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0386\7\u00cd\2\2\u0386\u0388"+
		"\5b\62\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038c\3\2\2\2\u0389"+
		"\u038a\7U\2\2\u038a\u038b\7\34\2\2\u038b\u038d\5:\36\2\u038c\u0389\3\2"+
		"\2\2\u038c\u038d\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038f\7W\2\2\u038f"+
		"\u0391\5b\62\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u03919\3\2\2\2"+
		"\u0392\u0394\5B\"\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u039a\5<\37\2\u0396\u0397\7\6\2\2\u0397\u0399\5<\37\2\u0398"+
		"\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b;\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u03c6\5> \2\u039e\u039f"+
		"\7\u00a2\2\2\u039f\u03a8\7\4\2\2\u03a0\u03a5\5`\61\2\u03a1\u03a2\7\6\2"+
		"\2\u03a2\u03a4\5`\61\2\u03a3\u03a1\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8"+
		"\u03a0\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03c6\7\5"+
		"\2\2\u03ab\u03ac\7+\2\2\u03ac\u03b5\7\4\2\2\u03ad\u03b2\5`\61\2\u03ae"+
		"\u03af\7\6\2\2\u03af\u03b1\5`\61\2\u03b0\u03ae\3\2\2\2\u03b1\u03b4\3\2"+
		"\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b5\u03ad\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2"+
		"\2\2\u03b7\u03c6\7\5\2\2\u03b8\u03b9\7V\2\2\u03b9\u03ba\7\u00ac\2\2\u03ba"+
		"\u03bb\7\4\2\2\u03bb\u03c0\5> \2\u03bc\u03bd\7\6\2\2\u03bd\u03bf\5> \2"+
		"\u03be\u03bc\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c4\7\5\2\2\u03c4"+
		"\u03c6\3\2\2\2\u03c5\u039d\3\2\2\2\u03c5\u039e\3\2\2\2\u03c5\u03ab\3\2"+
		"\2\2\u03c5\u03b8\3\2\2\2\u03c6=\3\2\2\2\u03c7\u03d0\7\4\2\2\u03c8\u03cd"+
		"\5`\61\2\u03c9\u03ca\7\6\2\2\u03ca\u03cc\5`\61\2\u03cb\u03c9\3\2\2\2\u03cc"+
		"\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d1\3\2"+
		"\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03c8\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d5\7\5\2\2\u03d3\u03d5\5`\61\2\u03d4\u03c7\3\2"+
		"\2\2\u03d4\u03d3\3\2\2\2\u03d5?\3\2\2\2\u03d6\u03d7\7\4\2\2\u03d7\u03d8"+
		"\5\n\6\2\u03d8\u03d9\7\5\2\2\u03d9\u03da\7\27\2\2\u03da\u03dc\5\u00a0"+
		"Q\2\u03db\u03dd\5R*\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03ddA\3"+
		"\2\2\2\u03de\u03df\t\t\2\2\u03dfC\3\2\2\2\u03e0\u03e5\5`\61\2\u03e1\u03e3"+
		"\7\27\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2"+
		"\u03e4\u03e6\5\u00a0Q\2\u03e5\u03e2\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03ed\3\2\2\2\u03e7\u03e8\5\u0098M\2\u03e8\u03e9\7\3\2\2\u03e9\u03ea"+
		"\7\u00db\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03ed\7\u00db\2\2\u03ec\u03e0\3"+
		"\2\2\2\u03ec\u03e7\3\2\2\2\u03ec\u03eb\3\2\2\2\u03edE\3\2\2\2\u03ee\u03ef"+
		"\b$\1\2\u03ef\u03f0\5L\'\2\u03f0\u0403\3\2\2\2\u03f1\u03ff\f\4\2\2\u03f2"+
		"\u03f3\7*\2\2\u03f3\u03f4\7g\2\2\u03f4\u0400\5L\'\2\u03f5\u03f6\5H%\2"+
		"\u03f6\u03f7\7g\2\2\u03f7\u03f8\5F$\2\u03f8\u03f9\5J&\2\u03f9\u0400\3"+
		"\2\2\2\u03fa\u03fb\7v\2\2\u03fb\u03fc\5H%\2\u03fc\u03fd\7g\2\2\u03fd\u03fe"+
		"\5L\'\2\u03fe\u0400\3\2\2\2\u03ff\u03f2\3\2\2\2\u03ff\u03f5\3\2\2\2\u03ff"+
		"\u03fa\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03f1\3\2\2\2\u0402\u0405\3\2"+
		"\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404G\3\2\2\2\u0405\u0403"+
		"\3\2\2\2\u0406\u0408\7\f\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u041b\3\2\2\2\u0409\u040b\7]\2\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2"+
		"\2\2\u040b\u041c\3\2\2\2\u040c\u040e\7k\2\2\u040d\u040f\t\n\2\2\u040e"+
		"\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u041c\3\2\2\2\u0410\u0412\7\u009e"+
		"\2\2\u0411\u0413\t\n\2\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u041c\3\2\2\2\u0414\u0416\7N\2\2\u0415\u0417\t\n\2\2\u0416\u0415\3\2"+
		"\2\2\u0416\u0417\3\2\2\2\u0417\u041c\3\2\2\2\u0418\u041a\7*\2\2\u0419"+
		"\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u040a\3\2"+
		"\2\2\u041b\u040c\3\2\2\2\u041b\u0410\3\2\2\2\u041b\u0414\3\2\2\2\u041b"+
		"\u0419\3\2\2\2\u041cI\3\2\2\2\u041d\u041e\7\u0082\2\2\u041e\u042c\5b\62"+
		"\2\u041f\u0420\7\u00c7\2\2\u0420\u0421\7\4\2\2\u0421\u0426\5\u00a0Q\2"+
		"\u0422\u0423\7\6\2\2\u0423\u0425\5\u00a0Q\2\u0424\u0422\3\2\2\2\u0425"+
		"\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429\u042a\7\5\2\2\u042a\u042c\3\2\2\2\u042b"+
		"\u041d\3\2\2\2\u042b\u041f\3\2\2\2\u042cK\3\2\2\2\u042d\u0434\5P)\2\u042e"+
		"\u042f\7\u00b6\2\2\u042f\u0430\5N(\2\u0430\u0431\7\4\2\2\u0431\u0432\5"+
		"`\61\2\u0432\u0433\7\5\2\2\u0433\u0435\3\2\2\2\u0434\u042e\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435M\3\2\2\2\u0436\u0437\t\13\2\2\u0437O\3\2\2\2\u0438"+
		"\u0440\5T+\2\u0439\u043b\7\27\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2"+
		"\2\2\u043b\u043c\3\2\2\2\u043c\u043e\5\u00a0Q\2\u043d\u043f\5R*\2\u043e"+
		"\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043a\3\2"+
		"\2\2\u0440\u0441\3\2\2\2\u0441Q\3\2\2\2\u0442\u0443\7\4\2\2\u0443\u0448"+
		"\5\u00a0Q\2\u0444\u0445\7\6\2\2\u0445\u0447\5\u00a0Q\2\u0446\u0444\3\2"+
		"\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\7\5\2\2\u044cS\3\2\2\2"+
		"\u044d\u046b\5V,\2\u044e\u044f\7\4\2\2\u044f\u0450\5\n\6\2\u0450\u0451"+
		"\7\5\2\2\u0451\u046b\3\2\2\2\u0452\u0453\7\u00c4\2\2\u0453\u0454\7\4\2"+
		"\2\u0454\u0459\5`\61\2\u0455\u0456\7\6\2\2\u0456\u0458\5`\61\2\u0457\u0455"+
		"\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u045c\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045f\7\5\2\2\u045d\u045e\7\u00ce"+
		"\2\2\u045e\u0460\7\u0087\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u046b\3\2\2\2\u0461\u0462\7j\2\2\u0462\u0463\7\4\2\2\u0463\u0464\5\n"+
		"\6\2\u0464\u0465\7\5\2\2\u0465\u046b\3\2\2\2\u0466\u0467\7\4\2\2\u0467"+
		"\u0468\5F$\2\u0468\u0469\7\5\2\2\u0469\u046b\3\2\2\2\u046a\u044d\3\2\2"+
		"\2\u046a\u044e\3\2\2\2\u046a\u0452\3\2\2\2\u046a\u0461\3\2\2\2\u046a\u0466"+
		"\3\2\2\2\u046bU\3\2\2\2\u046c\u046d\5X-\2\u046d\u046e\7\3\2\2\u046e\u0470"+
		"\3\2\2\2\u046f\u046c\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471"+
		"\u0472\5Z.\2\u0472W\3\2\2\2\u0473\u0474\5\u00a0Q\2\u0474Y\3\2\2\2\u0475"+
		"\u0476\5\u00a0Q\2\u0476[\3\2\2\2\u0477\u0478\5X-\2\u0478\u0479\7\3\2\2"+
		"\u0479\u047b\3\2\2\2\u047a\u0477\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c"+
		"\3\2\2\2\u047c\u047d\5^\60\2\u047d]\3\2\2\2\u047e\u047f\5\u00a0Q\2\u047f"+
		"_\3\2\2\2\u0480\u0481\5b\62\2\u0481a\3\2\2\2\u0482\u0483\b\62\1\2\u0483"+
		"\u0485\5f\64\2\u0484\u0486\5d\63\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u048a\3\2\2\2\u0487\u0488\7~\2\2\u0488\u048a\5b\62\5\u0489"+
		"\u0482\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u0493\3\2\2\2\u048b\u048c\f\4"+
		"\2\2\u048c\u048d\7\24\2\2\u048d\u0492\5b\62\5\u048e\u048f\f\3\2\2\u048f"+
		"\u0490\7\u0085\2\2\u0490\u0492\5b\62\4\u0491\u048b\3\2\2\2\u0491\u048e"+
		"\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"c\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0497\5p9\2\u0497\u0498\5f\64\2\u0498"+
		"\u04d7\3\2\2\2\u0499\u049a\5p9\2\u049a\u049b\5r:\2\u049b\u049c\7\4\2\2"+
		"\u049c\u049d\5\n\6\2\u049d\u049e\7\5\2\2\u049e\u04d7\3\2\2\2\u049f\u04a1"+
		"\7~\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a3\7\33\2\2\u04a3\u04a4\5f\64\2\u04a4\u04a5\7\24\2\2\u04a5\u04a6\5"+
		"f\64\2\u04a6\u04d7\3\2\2\2\u04a7\u04a9\7~\2\2\u04a8\u04a7\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7[\2\2\u04ab\u04ac\7\4"+
		"\2\2\u04ac\u04b1\5`\61\2\u04ad\u04ae\7\6\2\2\u04ae\u04b0\5`\61\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2"+
		"\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b5\7\5\2\2\u04b5"+
		"\u04d7\3\2\2\2\u04b6\u04b8\7\f\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2"+
		"\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04bb\7~\2\2\u04ba\u04b9\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7[\2\2\u04bd\u04be\7\4"+
		"\2\2\u04be\u04bf\5\n\6\2\u04bf\u04c0\7\5\2\2\u04c0\u04d7\3\2\2\2\u04c1"+
		"\u04c3\7~\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2"+
		"\2\2\u04c4\u04c5\7m\2\2\u04c5\u04c8\5f\64\2\u04c6\u04c7\7?\2\2\u04c7\u04c9"+
		"\5f\64\2\u04c8\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04d7\3\2\2\2\u04ca"+
		"\u04cc\7d\2\2\u04cb\u04cd\7~\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2"+
		"\2\u04cd\u04ce\3\2\2\2\u04ce\u04d7\7\177\2\2\u04cf\u04d1\7d\2\2\u04d0"+
		"\u04d2\7~\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04d4\7:\2\2\u04d4\u04d5\7M\2\2\u04d5\u04d7\5f\64\2\u04d6\u0496"+
		"\3\2\2\2\u04d6\u0499\3\2\2\2\u04d6\u04a0\3\2\2\2\u04d6\u04a8\3\2\2\2\u04d6"+
		"\u04b7\3\2\2\2\u04d6\u04c2\3\2\2\2\u04d6\u04ca\3\2\2\2\u04d6\u04cf\3\2"+
		"\2\2\u04d7e\3\2\2\2\u04d8\u04d9\b\64\1\2\u04d9\u04dd\5h\65\2\u04da\u04db"+
		"\t\f\2\2\u04db\u04dd\5f\64\6\u04dc\u04d8\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd"+
		"\u04ec\3\2\2\2\u04de\u04df\f\5\2\2\u04df\u04e0\t\r\2\2\u04e0\u04eb\5f"+
		"\64\6\u04e1\u04e2\f\4\2\2\u04e2\u04e3\t\f\2\2\u04e3\u04eb\5f\64\5\u04e4"+
		"\u04e5\f\3\2\2\u04e5\u04e6\7\u00de\2\2\u04e6\u04eb\5f\64\4\u04e7\u04e8"+
		"\f\7\2\2\u04e8\u04e9\7\31\2\2\u04e9\u04eb\5n8\2\u04ea\u04de\3\2\2\2\u04ea"+
		"\u04e1\3\2\2\2\u04ea\u04e4\3\2\2\2\u04ea\u04e7\3\2\2\2\u04eb\u04ee\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04edg\3\2\2\2\u04ee\u04ec"+
		"\3\2\2\2\u04ef\u04f0\b\65\1\2\u04f0\u05df\7\177\2\2\u04f1\u05df\5v<\2"+
		"\u04f2\u04f3\5\u00a0Q\2\u04f3\u04f4\5j\66\2\u04f4\u05df\3\2\2\2\u04f5"+
		"\u04f6\7\u00eb\2\2\u04f6\u05df\5j\66\2\u04f7\u05df\5\u00a2R\2\u04f8\u05df"+
		"\5t;\2\u04f9\u05df\5j\66\2\u04fa\u05df\7\u00e1\2\2\u04fb\u05df\7\7\2\2"+
		"\u04fc\u04fd\7\u008d\2\2\u04fd\u04fe\7\4\2\2\u04fe\u04ff\5f\64\2\u04ff"+
		"\u0500\7[\2\2\u0500\u0501\5f\64\2\u0501\u0502\7\5\2\2\u0502\u05df\3\2"+
		"\2\2\u0503\u0504\7\4\2\2\u0504\u0507\5`\61\2\u0505\u0506\7\6\2\2\u0506"+
		"\u0508\5`\61\2\u0507\u0505\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u0507\3\2"+
		"\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\5\2\2\u050c"+
		"\u05df\3\2\2\2\u050d\u050e\7\u00a3\2\2\u050e\u050f\7\4\2\2\u050f\u0514"+
		"\5`\61\2\u0510\u0511\7\6\2\2\u0511\u0513\5`\61\2\u0512\u0510\3\2\2\2\u0513"+
		"\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2"+
		"\2\2\u0516\u0514\3\2\2\2\u0517\u0518\7\5\2\2\u0518\u05df\3\2\2\2\u0519"+
		"\u051a\5\u0098M\2\u051a\u051b\7\4\2\2\u051b\u051c\7\u00db\2\2\u051c\u051e"+
		"\7\5\2\2\u051d\u051f\5\u0086D\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2"+
		"\2\u051f\u0521\3\2\2\2\u0520\u0522\5\u0088E\2\u0521\u0520\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u05df\3\2\2\2\u0523\u0524\5\u0098M\2\u0524\u0530"+
		"\7\4\2\2\u0525\u0527\5B\"\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u052d\5`\61\2\u0529\u052a\7\6\2\2\u052a\u052c\5`"+
		"\61\2\u052b\u0529\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0526\3\2"+
		"\2\2\u0530\u0531\3\2\2\2\u0531\u053c\3\2\2\2\u0532\u0533\7\u0086\2\2\u0533"+
		"\u0534\7\34\2\2\u0534\u0539\5\66\34\2\u0535\u0536\7\6\2\2\u0536\u0538"+
		"\5\66\34\2\u0537\u0535\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2"+
		"\u0539\u053a\3\2\2\2\u053a\u053d\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u0532"+
		"\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\7\5\2\2\u053f"+
		"\u0541\5\u0086D\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0546"+
		"\3\2\2\2\u0542\u0544\5l\67\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0545\3\2\2\2\u0545\u0547\5\u0088E\2\u0546\u0543\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u05df\3\2\2\2\u0548\u0549\5\u00a0Q\2\u0549\u054a\7\b\2"+
		"\2\u054a\u054b\5`\61\2\u054b\u05df\3\2\2\2\u054c\u0555\7\4\2\2\u054d\u0552"+
		"\5\u00a0Q\2\u054e\u054f\7\6\2\2\u054f\u0551\5\u00a0Q\2\u0550\u054e\3\2"+
		"\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u054d\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u0558\7\5\2\2\u0558\u0559\7\b\2\2\u0559"+
		"\u05df\5`\61\2\u055a\u055b\7\4\2\2\u055b\u055c\5\n\6\2\u055c\u055d\7\5"+
		"\2\2\u055d\u05df\3\2\2\2\u055e\u055f\7C\2\2\u055f\u0560\7\4\2\2\u0560"+
		"\u0561\5\n\6\2\u0561\u0562\7\5\2\2\u0562\u05df\3\2\2\2\u0563\u0564\7 "+
		"\2\2\u0564\u0566\5f\64\2\u0565\u0567\5\u0084C\2\u0566\u0565\3\2\2\2\u0567"+
		"\u0568\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056c\3\2"+
		"\2\2\u056a\u056b\7=\2\2\u056b\u056d\5`\61\2\u056c\u056a\3\2\2\2\u056c"+
		"\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\7>\2\2\u056f\u05df\3\2"+
		"\2\2\u0570\u0572\7 \2\2\u0571\u0573\5\u0084C\2\u0572\u0571\3\2\2\2\u0573"+
		"\u0574\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0578\3\2"+
		"\2\2\u0576\u0577\7=\2\2\u0577\u0579\5`\61\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\7>\2\2\u057b\u05df\3\2"+
		"\2\2\u057c\u057d\7!\2\2\u057d\u057e\7\4\2\2\u057e\u057f\5`\61\2\u057f"+
		"\u0580\7\27\2\2\u0580\u0581\5~@\2\u0581\u0582\7\5\2\2\u0582\u05df\3\2"+
		"\2\2\u0583\u0584\7\u00be\2\2\u0584\u0585\7\4\2\2\u0585\u0586\5`\61\2\u0586"+
		"\u0587\7\27\2\2\u0587\u0588\5~@\2\u0588\u0589\7\5\2\2\u0589\u05df\3\2"+
		"\2\2\u058a\u058b\7\26\2\2\u058b\u0594\7\t\2\2\u058c\u0591\5`\61\2\u058d"+
		"\u058e\7\6\2\2\u058e\u0590\5`\61\2\u058f\u058d\3\2\2\2\u0590\u0593\3\2"+
		"\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0595\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0594\u058c\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2"+
		"\2\2\u0596\u05df\7\n\2\2\u0597\u05df\5\u00a0Q\2\u0598\u05df\7-\2\2\u0599"+
		"\u059d\7/\2\2\u059a\u059b\7\4\2\2\u059b\u059c\7\u00e2\2\2\u059c\u059e"+
		"\7\5\2\2\u059d\u059a\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05df\3\2\2\2\u059f"+
		"\u05a3\7\60\2\2\u05a0\u05a1\7\4\2\2\u05a1\u05a2\7\u00e2\2\2\u05a2\u05a4"+
		"\7\5\2\2\u05a3\u05a0\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05df\3\2\2\2\u05a5"+
		"\u05a9\7o\2\2\u05a6\u05a7\7\4\2\2\u05a7\u05a8\7\u00e2\2\2\u05a8\u05aa"+
		"\7\5\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05df\3\2\2\2\u05ab"+
		"\u05af\7p\2\2\u05ac\u05ad\7\4\2\2\u05ad\u05ae\7\u00e2\2\2\u05ae\u05b0"+
		"\7\5\2\2\u05af\u05ac\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05df\3\2\2\2\u05b1"+
		"\u05df\7\61\2\2\u05b2\u05b3\7\u00b2\2\2\u05b3\u05b4\7\4\2\2\u05b4\u05b5"+
		"\5f\64\2\u05b5\u05b6\7M\2\2\u05b6\u05b9\5f\64\2\u05b7\u05b8\7K\2\2\u05b8"+
		"\u05ba\5f\64\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2"+
		"\2\2\u05bb\u05bc\7\5\2\2\u05bc\u05df\3\2\2\2\u05bd\u05be\7}\2\2\u05be"+
		"\u05bf\7\4\2\2\u05bf\u05c2\5f\64\2\u05c0\u05c1\7\6\2\2\u05c1\u05c3\5z"+
		">\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c5\7\5\2\2\u05c5\u05df\3\2\2\2\u05c6\u05c7\7E\2\2\u05c7\u05c8\7\4"+
		"\2\2\u05c8\u05c9\5\u00a0Q\2\u05c9\u05ca\7M\2\2\u05ca\u05cb\5f\64\2\u05cb"+
		"\u05cc\7\5\2\2\u05cc\u05df\3\2\2\2\u05cd\u05ce\7\4\2\2\u05ce\u05cf\5`"+
		"\61\2\u05cf\u05d0\7\5\2\2\u05d0\u05df\3\2\2\2\u05d1\u05d2\7V\2\2\u05d2"+
		"\u05db\7\4\2\2\u05d3\u05d8\5\u0098M\2\u05d4\u05d5\7\6\2\2\u05d5\u05d7"+
		"\5\u0098M\2\u05d6\u05d4\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2"+
		"\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05d3"+
		"\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05df\7\5\2\2\u05de"+
		"\u04ef\3\2\2\2\u05de\u04f1\3\2\2\2\u05de\u04f2\3\2\2\2\u05de\u04f5\3\2"+
		"\2\2\u05de\u04f7\3\2\2\2\u05de\u04f8\3\2\2\2\u05de\u04f9\3\2\2\2\u05de"+
		"\u04fa\3\2\2\2\u05de\u04fb\3\2\2\2\u05de\u04fc\3\2\2\2\u05de\u0503\3\2"+
		"\2\2\u05de\u050d\3\2\2\2\u05de\u0519\3\2\2\2\u05de\u0523\3\2\2\2\u05de"+
		"\u0548\3\2\2\2\u05de\u054c\3\2\2\2\u05de\u055a\3\2\2\2\u05de\u055e\3\2"+
		"\2\2\u05de\u0563\3\2\2\2\u05de\u0570\3\2\2\2\u05de\u057c\3\2\2\2\u05de"+
		"\u0583\3\2\2\2\u05de\u058a\3\2\2\2\u05de\u0597\3\2\2\2\u05de\u0598\3\2"+
		"\2\2\u05de\u0599\3\2\2\2\u05de\u059f\3\2\2\2\u05de\u05a5\3\2\2\2\u05de"+
		"\u05ab\3\2\2\2\u05de\u05b1\3\2\2\2\u05de\u05b2\3\2\2\2\u05de\u05bd\3\2"+
		"\2\2\u05de\u05c6\3\2\2\2\u05de\u05cd\3\2\2\2\u05de\u05d1\3\2\2\2\u05df"+
		"\u05ea\3\2\2\2\u05e0\u05e1\f\20\2\2\u05e1\u05e2\7\t\2\2\u05e2\u05e3\5"+
		"f\64\2\u05e3\u05e4\7\n\2\2\u05e4\u05e9\3\2\2\2\u05e5\u05e6\f\16\2\2\u05e6"+
		"\u05e7\7\3\2\2\u05e7\u05e9\5\u00a0Q\2\u05e8\u05e0\3\2\2\2\u05e8\u05e5"+
		"\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb"+
		"i\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f4\7\u00df\2\2\u05ee\u05f1\7\u00e0"+
		"\2\2\u05ef\u05f0\7\u00c0\2\2\u05f0\u05f2\7\u00df\2\2\u05f1\u05ef\3\2\2"+
		"\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05ed\3\2\2\2\u05f3\u05ee"+
		"\3\2\2\2\u05f4k\3\2\2\2\u05f5\u05f6\7Z\2\2\u05f6\u05fa\7\u0081\2\2\u05f7"+
		"\u05f8\7\u0099\2\2\u05f8\u05fa\7\u0081\2\2\u05f9\u05f5\3\2\2\2\u05f9\u05f7"+
		"\3\2\2\2\u05fam\3\2\2\2\u05fb\u05fc\7\u00b9\2\2\u05fc\u05fd\7\u00d2\2"+
		"\2\u05fd\u0602\5v<\2\u05fe\u05ff\7\u00b9\2\2\u05ff\u0600\7\u00d2\2\2\u0600"+
		"\u0602\5j\66\2\u0601\u05fb\3\2\2\2\u0601\u05fe\3\2\2\2\u0602o\3\2\2\2"+
		"\u0603\u0604\t\16\2\2\u0604q\3\2\2\2\u0605\u0606\t\17\2\2\u0606s\3\2\2"+
		"\2\u0607\u0608\t\20\2\2\u0608u\3\2\2\2\u0609\u060b\7a\2\2\u060a\u060c"+
		"\t\f\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060e\5j\66\2\u060e\u0611\5x=\2\u060f\u0610\7\u00bb\2\2\u0610\u0612\5"+
		"x=\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612w\3\2\2\2\u0613\u0614"+
		"\t\21\2\2\u0614y\3\2\2\2\u0615\u0616\t\22\2\2\u0616{\3\2\2\2\u0617\u0620"+
		"\7\4\2\2\u0618\u061d\5~@\2\u0619\u061a\7\6\2\2\u061a\u061c\5~@\2\u061b"+
		"\u0619\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0618\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\7\5\2\2\u0623}\3\2\2\2"+
		"\u0624\u0625\b@\1\2\u0625\u0626\7\26\2\2\u0626\u0627\7\u00d5\2\2\u0627"+
		"\u0628\5~@\2\u0628\u0629\7\u00d7\2\2\u0629\u0654\3\2\2\2\u062a\u062b\7"+
		"r\2\2\u062b\u062c\7\u00d5\2\2\u062c\u062d\5~@\2\u062d\u062e\7\6\2\2\u062e"+
		"\u062f\5~@\2\u062f\u0630\7\u00d7\2\2\u0630\u0654\3\2\2\2\u0631\u0632\7"+
		"\u00a3\2\2\u0632\u0633\7\4\2\2\u0633\u0634\5\u00a0Q\2\u0634\u063b\5~@"+
		"\2\u0635\u0636\7\6\2\2\u0636\u0637\5\u00a0Q\2\u0637\u0638\5~@\2\u0638"+
		"\u063a\3\2\2\2\u0639\u0635\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2"+
		"\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u063b\3\2\2\2\u063e"+
		"\u063f\7\5\2\2\u063f\u0654\3\2\2\2\u0640\u064c\5\u0082B\2\u0641\u0642"+
		"\7\4\2\2\u0642\u0647\5\u0080A\2\u0643\u0644\7\6\2\2\u0644\u0646\5\u0080"+
		"A\2\u0645\u0643\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647"+
		"\u0648\3\2\2\2\u0648\u064a\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064b\7\5"+
		"\2\2\u064b\u064d\3\2\2\2\u064c\u0641\3\2\2\2\u064c\u064d\3\2\2\2\u064d"+
		"\u0654\3\2\2\2\u064e\u064f\7a\2\2\u064f\u0650\5x=\2\u0650\u0651\7\u00bb"+
		"\2\2\u0651\u0652\5x=\2\u0652\u0654\3\2\2\2\u0653\u0624\3\2\2\2\u0653\u062a"+
		"\3\2\2\2\u0653\u0631\3\2\2\2\u0653\u0640\3\2\2\2\u0653\u064e\3\2\2\2\u0654"+
		"\u0659\3\2\2\2\u0655\u0656\f\b\2\2\u0656\u0658\7\26\2\2\u0657\u0655\3"+
		"\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a"+
		"\177\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u065f\7\u00e2\2\2\u065d\u065f\5"+
		"~@\2\u065e\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065f\u0081\3\2\2\2\u0660"+
		"\u0665\7\u00e9\2\2\u0661\u0665\7\u00ea\2\2\u0662\u0665\7\u00eb\2\2\u0663"+
		"\u0665\5\u00a0Q\2\u0664\u0660\3\2\2\2\u0664\u0661\3\2\2\2\u0664\u0662"+
		"\3\2\2\2\u0664\u0663\3\2\2\2\u0665\u0083\3\2\2\2\u0666\u0667\7\u00cc\2"+
		"\2\u0667\u0668\5`\61\2\u0668\u0669\7\u00b8\2\2\u0669\u066a\5`\61\2\u066a"+
		"\u0085\3\2\2\2\u066b\u066c\7H\2\2\u066c\u066d\7\4\2\2\u066d\u066e\7\u00cd"+
		"\2\2\u066e\u066f\5b\62\2\u066f\u0670\7\5\2\2\u0670\u0087\3\2\2\2\u0671"+
		"\u0672\7\u008a\2\2\u0672\u067d\7\4\2\2\u0673\u0674\7\u008b\2\2\u0674\u0675"+
		"\7\34\2\2\u0675\u067a\5`\61\2\u0676\u0677\7\6\2\2\u0677\u0679\5`\61\2"+
		"\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u0673\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u0689\3\2\2\2\u067f\u0680\7\u0086\2\2\u0680\u0681"+
		"\7\34\2\2\u0681\u0686\5\66\34\2\u0682\u0683\7\6\2\2\u0683\u0685\5\66\34"+
		"\2\u0684\u0682\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u067f\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u068d\5\u008aF\2\u068c\u068b"+
		"\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f\7\5\2\2\u068f"+
		"\u0089\3\2\2\2\u0690\u0691\7\u0092\2\2\u0691\u06a1\5\u008cG\2\u0692\u0693"+
		"\7\u00a4\2\2\u0693\u06a1\5\u008cG\2\u0694\u0695\7\u0092\2\2\u0695\u0696"+
		"\7\33\2\2\u0696\u0697\5\u008cG\2\u0697\u0698\7\24\2\2\u0698\u0699\5\u008c"+
		"G\2\u0699\u06a1\3\2\2\2\u069a\u069b\7\u00a4\2\2\u069b\u069c\7\33\2\2\u069c"+
		"\u069d\5\u008cG\2\u069d\u069e\7\24\2\2\u069e\u069f\5\u008cG\2\u069f\u06a1"+
		"\3\2\2\2\u06a0\u0690\3\2\2\2\u06a0\u0692\3\2\2\2\u06a0\u0694\3\2\2\2\u06a0"+
		"\u069a\3\2\2\2\u06a1\u008b\3\2\2\2\u06a2\u06a3\7\u00c1\2\2\u06a3\u06ac"+
		"\7\u008e\2\2\u06a4\u06a5\7\u00c1\2\2\u06a5\u06ac\7J\2\2\u06a6\u06a7\7"+
		",\2\2\u06a7\u06ac\7\u00a3\2\2\u06a8\u06a9\5`\61\2\u06a9\u06aa\t\23\2\2"+
		"\u06aa\u06ac\3\2\2\2\u06ab\u06a2\3\2\2\2\u06ab\u06a4\3\2\2\2\u06ab\u06a6"+
		"\3\2\2\2\u06ab\u06a8\3\2\2\2\u06ac\u008d\3\2\2\2\u06ad\u06ae\7L\2\2\u06ae"+
		"\u06b2\t\24\2\2\u06af\u06b0\7\u00bf\2\2\u06b0\u06b2\t\25\2\2\u06b1\u06ad"+
		"\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u008f\3\2\2\2\u06b3\u06b4\7e\2\2\u06b4"+
		"\u06b5\7l\2\2\u06b5\u06b9\5\u0092J\2\u06b6\u06b7\7\u0093\2\2\u06b7\u06b9"+
		"\t\26\2\2\u06b8\u06b3\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u0091\3\2\2\2"+
		"\u06ba\u06bb\7\u0093\2\2\u06bb\u06c2\7\u00c2\2\2\u06bc\u06bd\7\u0093\2"+
		"\2\u06bd\u06c2\7\'\2\2\u06be\u06bf\7\u0096\2\2\u06bf\u06c2\7\u0093\2\2"+
		"\u06c0\u06c2\7\u00a9\2\2\u06c1\u06ba\3\2\2\2\u06c1\u06bc\3\2\2\2\u06c1"+
		"\u06be\3\2\2\2\u06c1\u06c0\3\2\2\2\u06c2\u0093\3\2\2\2\u06c3\u06c9\5`"+
		"\61\2\u06c4\u06c5\5\u00a0Q\2\u06c5\u06c6\7\13\2\2\u06c6\u06c7\5`\61\2"+
		"\u06c7\u06c9\3\2\2\2\u06c8\u06c3\3\2\2\2\u06c8\u06c4\3\2\2\2\u06c9\u0095"+
		"\3\2\2\2\u06ca\u06cf\7\u00a8\2\2\u06cb\u06cf\7\66\2\2\u06cc\u06cf\7_\2"+
		"\2\u06cd\u06cf\5\u00a0Q\2\u06ce\u06ca\3\2\2\2\u06ce\u06cb\3\2\2\2\u06ce"+
		"\u06cc\3\2\2\2\u06ce\u06cd\3\2\2\2\u06cf\u0097\3\2\2\2\u06d0\u06d5\5\u00a0"+
		"Q\2\u06d1\u06d2\7\3\2\2\u06d2\u06d4\5\u00a0Q\2\u06d3\u06d1\3\2\2\2\u06d4"+
		"\u06d7\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u0099\3\2"+
		"\2\2\u06d7\u06d5\3\2\2\2\u06d8\u06dc\7\61\2\2\u06d9\u06dc\7.\2\2\u06da"+
		"\u06dc\5\u009cO\2\u06db\u06d8\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06da"+
		"\3\2\2\2\u06dc\u009b\3\2\2\2\u06dd\u06de\7\u00c6\2\2\u06de\u06e3\5\u00a0"+
		"Q\2\u06df\u06e0\7\u009f\2\2\u06e0\u06e3\5\u00a0Q\2\u06e1\u06e3\5\u00a0"+
		"Q\2\u06e2\u06dd\3\2\2\2\u06e2\u06df\3\2\2\2\u06e2\u06e1\3\2\2\2\u06e3"+
		"\u009d\3\2\2\2\u06e4\u06e9\5\u00a0Q\2\u06e5\u06e6\7\6\2\2\u06e6\u06e8"+
		"\5\u00a0Q\2\u06e7\u06e5\3\2\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06e7\3\2\2"+
		"\2\u06e9\u06ea\3\2\2\2\u06ea\u009f\3\2\2\2\u06eb\u06e9\3\2\2\2\u06ec\u06f2"+
		"\7\u00e5\2\2\u06ed\u06f2\7\u00e7\2\2\u06ee\u06f2\5\u00a4S\2\u06ef\u06f2"+
		"\7\u00e8\2\2\u06f0\u06f2\7\u00e6\2\2\u06f1\u06ec\3\2\2\2\u06f1\u06ed\3"+
		"\2\2\2\u06f1\u06ee\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f0\3\2\2\2\u06f2"+
		"\u00a1\3\2\2\2\u06f3\u06f7\7\u00e3\2\2\u06f4\u06f7\7\u00e4\2\2\u06f5\u06f7"+
		"\7\u00e2\2\2\u06f6\u06f3\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f5\3\2\2"+
		"\2\u06f7\u00a3\3\2\2\2\u06f8\u06f9\t\27\2\2\u06f9\u00a5\3\2\2\2\u00e2"+
		"\u00bc\u00c1\u00c7\u00cb\u00d9\u00dd\u00e1\u00e5\u00ed\u00f1\u00f4\u00fb"+
		"\u0104\u010a\u010e\u0114\u011b\u0124\u0148\u014d\u0158\u015e\u0168\u016b"+
		"\u0172\u017b\u0183\u0187\u0191\u0194\u019e\u01ab\u01b1\u01b6\u01bc\u01c5"+
		"\u01cb\u01d2\u01da\u01df\u01e3\u01eb\u01f1\u01f8\u01fd\u0201\u020b\u020e"+
		"\u0212\u0215\u021d\u0222\u0232\u0238\u023e\u0240\u0246\u024c\u024e\u0254"+
		"\u0267\u026c\u0273\u027f\u0281\u0295\u0298\u029c\u02a0\u02b2\u02b5\u02bd"+
		"\u02c0\u02c6\u02cd\u02d2\u02d8\u02dc\u02e0\u02e6\u02ee\u02fd\u0304\u0309"+
		"\u0310\u0318\u031c\u0321\u032c\u0338\u033b\u033f\u0345\u034a\u034f\u0352"+
		"\u035d\u0364\u0368\u036c\u0370\u0377\u0380\u0383\u0387\u038c\u0390\u0393"+
		"\u039a\u03a5\u03a8\u03b2\u03b5\u03c0\u03c5\u03cd\u03d0\u03d4\u03dc\u03e2"+
		"\u03e5\u03ec\u03ff\u0403\u0407\u040a\u040e\u0412\u0416\u0419\u041b\u0426"+
		"\u042b\u0434\u043a\u043e\u0440\u0448\u0459\u045f\u046a\u046f\u047a\u0485"+
		"\u0489\u0491\u0493\u04a0\u04a8\u04b1\u04b7\u04ba\u04c2\u04c8\u04cc\u04d1"+
		"\u04d6\u04dc\u04ea\u04ec\u0509\u0514\u051e\u0521\u0526\u052d\u0530\u0539"+
		"\u053c\u0540\u0543\u0546\u0552\u0555\u0568\u056c\u0574\u0578\u0591\u0594"+
		"\u059d\u05a3\u05a9\u05af\u05b9\u05c2\u05d8\u05db\u05de\u05e8\u05ea\u05f1"+
		"\u05f3\u05f9\u0601\u060b\u0611\u061d\u0620\u063b\u0647\u064c\u0653\u0659"+
		"\u065e\u0664\u067a\u067d\u0686\u0689\u068c\u06a0\u06ab\u06b1\u06b8\u06c1"+
		"\u06c8\u06ce\u06d5\u06db\u06e2\u06e9\u06f1\u06f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}