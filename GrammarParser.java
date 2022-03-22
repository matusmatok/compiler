// Generated from Grammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RETURN=2, IF=3, THEN=4, ELSE=5, WHILE=6, SC=7, COMMA=8, LParen=9, 
		RParen=10, LCurBracket=11, RCurBracket=12, LBracket=13, RBracket=14, DCIS=15, 
		KCIS=16, BOOL=17, CHAR=18, STR=19, TRUE=20, FALSE=21, ASSIGN=22, AND=23, 
		OR=24, ADD=25, SUB=26, MUL=27, DIV=28, SQR=29, NEG=30, EQ=31, NEQ=32, 
		LEQ=33, GEQ=34, LT=35, GT=36, ID=37, NUM=38, CHARACTER=39, STRING=40, 
		WS=41, NL=42, BlockComment=43;
	public static final int
		RULE_init = 0, RULE_stat = 1, RULE_procDef = 2, RULE_body = 3, RULE_statbody = 4, 
		RULE_internalbody = 5, RULE_elsebody = 6, RULE_logicalExpr = 7, RULE_expr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_power = 11, RULE_params = 12, RULE_defParams = 13, 
		RULE_functionDef = 14, RULE_varType = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "stat", "procDef", "body", "statbody", "internalbody", "elsebody", 
			"logicalExpr", "expr", "term", "factor", "power", "params", "defParams", 
			"functionDef", "varType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funkcia'", "'vrat'", "'ak'", "'tak'", "'inak'", "'kym'", "';'", 
			"','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'dcis'", "'kcis'", 
			"'ph'", "'znak'", "'retaz'", "'prauda'", "'loz'", "'='", "'&'", "'|'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'=='", "'!='", "'<='", "'>='", 
			"'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "RETURN", "IF", "THEN", "ELSE", "WHILE", "SC", "COMMA", "LParen", 
			"RParen", "LCurBracket", "RCurBracket", "LBracket", "RBracket", "DCIS", 
			"KCIS", "BOOL", "CHAR", "STR", "TRUE", "FALSE", "ASSIGN", "AND", "OR", 
			"ADD", "SUB", "MUL", "DIV", "SQR", "NEG", "EQ", "NEQ", "LEQ", "GEQ", 
			"LT", "GT", "ID", "NUM", "CHARACTER", "STRING", "WS", "NL", "BlockComment"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			stat();
			setState(33);
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

	public static class StatContext extends ParserRuleContext {
		public List<ProcDefContext> procDef() {
			return getRuleContexts(ProcDefContext.class);
		}
		public ProcDefContext procDef(int i) {
			return getRuleContext(ProcDefContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << LParen) | (1L << DCIS) | (1L << KCIS) | (1L << BOOL) | (1L << CHAR) | (1L << STR) | (1L << SUB) | (1L << ID) | (1L << NUM) | (1L << CHARACTER) | (1L << STRING))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(35);
					procDef();
					}
					break;
				case RETURN:
				case IF:
				case WHILE:
				case LParen:
				case DCIS:
				case KCIS:
				case BOOL:
				case CHAR:
				case STR:
				case SUB:
				case ID:
				case NUM:
				case CHARACTER:
				case STRING:
					{
					setState(36);
					body();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
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

	public static class ProcDefContext extends ParserRuleContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public DefParamsContext defParams() {
			return getRuleContext(DefParamsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public TerminalNode LCurBracket() { return getToken(GrammarParser.LCurBracket, 0); }
		public TerminalNode RCurBracket() { return getToken(GrammarParser.RCurBracket, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProcDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProcDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProcDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			functionDef();
			setState(43);
			varType();
			setState(44);
			match(ID);
			setState(45);
			match(LParen);
			setState(46);
			defParams();
			setState(47);
			match(RParen);
			setState(48);
			match(LCurBracket);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << LParen) | (1L << DCIS) | (1L << KCIS) | (1L << BOOL) | (1L << CHAR) | (1L << STR) | (1L << SUB) | (1L << ID) | (1L << NUM) | (1L << CHARACTER) | (1L << STRING))) != 0)) {
				{
				{
				setState(49);
				body();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RCurBracket);
			setState(56);
			match(SC);
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

	public static class BodyContext extends ParserRuleContext {
		public StatbodyContext statbody() {
			return getRuleContext(StatbodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			statbody();
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

	public static class StatbodyContext extends ParserRuleContext {
		public StatbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statbody; }
	 
		public StatbodyContext() { }
		public void copyFrom(StatbodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignContext extends StatbodyContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBracket() { return getToken(GrammarParser.LBracket, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBracket() { return getToken(GrammarParser.RBracket, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public ArrayAssignContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefContext extends StatbodyContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public VarDefContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDefContext extends StatbodyContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBracket() { return getToken(GrammarParser.LBracket, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(GrammarParser.RBracket, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public ArrayDefContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArrayDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArrayDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArrayDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatbodyContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public TerminalNode LCurBracket() { return getToken(GrammarParser.LCurBracket, 0); }
		public InternalbodyContext internalbody() {
			return getRuleContext(InternalbodyContext.class,0);
		}
		public TerminalNode RCurBracket() { return getToken(GrammarParser.RCurBracket, 0); }
		public WhileContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatbodyContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public TerminalNode LCurBracket() { return getToken(GrammarParser.LCurBracket, 0); }
		public InternalbodyContext internalbody() {
			return getRuleContext(InternalbodyContext.class,0);
		}
		public TerminalNode RCurBracket() { return getToken(GrammarParser.RCurBracket, 0); }
		public ElsebodyContext elsebody() {
			return getRuleContext(ElsebodyContext.class,0);
		}
		public IfContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAssignContext extends StatbodyContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public VarAssignContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatbodyContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public ReturnContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectExprContext extends StatbodyContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public DirectExprContext(StatbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDirectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDirectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDirectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatbodyContext statbody() throws RecognitionException {
		StatbodyContext _localctx = new StatbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statbody);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(IF);
				setState(61);
				match(LParen);
				setState(62);
				logicalExpr(0);
				setState(63);
				match(RParen);
				setState(64);
				match(THEN);
				setState(65);
				match(LCurBracket);
				setState(66);
				internalbody();
				setState(67);
				match(RCurBracket);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(68);
					elsebody();
					}
				}

				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(WHILE);
				setState(72);
				match(LParen);
				setState(73);
				logicalExpr(0);
				setState(74);
				match(RParen);
				setState(75);
				match(LCurBracket);
				setState(76);
				internalbody();
				setState(77);
				match(RCurBracket);
				}
				break;
			case 3:
				_localctx = new ArrayDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				varType();
				setState(80);
				match(ID);
				setState(81);
				match(LBracket);
				setState(82);
				expr(0);
				setState(83);
				match(RBracket);
				setState(84);
				match(SC);
				}
				break;
			case 4:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				varType();
				setState(87);
				match(ID);
				setState(88);
				match(SC);
				}
				break;
			case 5:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(ID);
				setState(91);
				match(LBracket);
				setState(92);
				expr(0);
				setState(93);
				match(RBracket);
				setState(94);
				match(ASSIGN);
				setState(95);
				expr(0);
				setState(96);
				match(SC);
				}
				break;
			case 6:
				_localctx = new VarAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(ID);
				setState(99);
				match(ASSIGN);
				setState(100);
				expr(0);
				setState(101);
				match(SC);
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				match(RETURN);
				setState(104);
				expr(0);
				setState(105);
				match(SC);
				}
				break;
			case 8:
				_localctx = new DirectExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				expr(0);
				setState(108);
				match(SC);
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

	public static class InternalbodyContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public InternalbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInternalbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInternalbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInternalbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalbodyContext internalbody() throws RecognitionException {
		InternalbodyContext _localctx = new InternalbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_internalbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << LParen) | (1L << DCIS) | (1L << KCIS) | (1L << BOOL) | (1L << CHAR) | (1L << STR) | (1L << SUB) | (1L << ID) | (1L << NUM) | (1L << CHARACTER) | (1L << STRING))) != 0)) {
				{
				{
				setState(112);
				body();
				}
				}
				setState(117);
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

	public static class ElsebodyContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public TerminalNode LCurBracket() { return getToken(GrammarParser.LCurBracket, 0); }
		public InternalbodyContext internalbody() {
			return getRuleContext(InternalbodyContext.class,0);
		}
		public TerminalNode RCurBracket() { return getToken(GrammarParser.RCurBracket, 0); }
		public ElsebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElsebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElsebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElsebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsebodyContext elsebody() throws RecognitionException {
		ElsebodyContext _localctx = new ElsebodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elsebody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ELSE);
			setState(119);
			match(LCurBracket);
			setState(120);
			internalbody();
			setState(121);
			match(RCurBracket);
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

	public static class LogicalExprContext extends ParserRuleContext {
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	 
		public LogicalExprContext() { }
		public void copyFrom(LogicalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationContext extends LogicalExprContext {
		public TerminalNode NEG() { return getToken(GrammarParser.NEG, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public NegationContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends LogicalExprContext {
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public ParensContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOpContext extends LogicalExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(GrammarParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(GrammarParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(GrammarParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public LogicalOpContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends LogicalExprContext {
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TrueContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends LogicalExprContext {
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public FalseContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrContext extends LogicalExprContext {
		public Token op;
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public AndOrContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprToLogicContext extends LogicalExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprToLogicContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprToLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprToLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExprToLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		return logicalExpr(0);
	}

	private LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logicalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExprToLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new LogicalOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				expr(0);
				setState(126);
				((LogicalOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LEQ) | (1L << GEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((LogicalOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LParen);
				setState(130);
				logicalExpr(0);
				setState(131);
				match(RParen);
				}
				break;
			case 4:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(NEG);
				setState(134);
				logicalExpr(4);
				}
				break;
			case 5:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrContext(new LogicalExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
					setState(139);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(140);
					((AndOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(141);
					logicalExpr(4);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveOpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public AdditiveOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdditiveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public GetTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GetTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(148);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveOpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					((AdditiveOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AdditiveOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(152);
					term(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeOpContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public MultiplicativeOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiplicativeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public GetFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GetFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(159);
			factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeOpContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					((MultiplicativeOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
						((MultiplicativeOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(163);
					factor(0);
					}
					} 
				}
				setState(168);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetPowerContext extends FactorContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public GetPowerContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerOpContext extends FactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode SQR() { return getToken(GrammarParser.SQR, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerOpContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPowerOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPowerOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPowerOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new GetPowerContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(170);
			power();
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowerOpContext(new FactorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_factor);
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					match(SQR);
					setState(174);
					power();
					}
					} 
				}
				setState(179);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	 
		public PowerContext() { }
		public void copyFrom(PowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends PowerContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LBracket() { return getToken(GrammarParser.LBracket, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(GrammarParser.RBracket, 0); }
		public ArrayContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends PowerContext {
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public NumberContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends PowerContext {
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public BracketsContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterContext extends PowerContext {
		public TerminalNode CHARACTER() { return getToken(GrammarParser.CHARACTER, 0); }
		public CharacterContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends PowerContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public VarContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends PowerContext {
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PowerContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LParen() { return getToken(GrammarParser.LParen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(GrammarParser.RParen, 0); }
		public FunctionCallContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends PowerContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public StringContext(PowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_power);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				match(LParen);
				setState(182);
				params();
				setState(183);
				match(RParen);
				}
				break;
			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(ID);
				setState(187);
				match(LBracket);
				setState(188);
				expr(0);
				setState(189);
				match(RBracket);
				}
				break;
			case 4:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(NUM);
				}
				break;
			case 5:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(SUB);
				setState(193);
				expr(0);
				}
				break;
			case 6:
				_localctx = new BracketsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(LParen);
				setState(195);
				expr(0);
				setState(196);
				match(RParen);
				}
				break;
			case 7:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(STRING);
				}
				break;
			case 8:
				_localctx = new CharacterContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				match(CHARACTER);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(202);
				match(ID);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					match(ID);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class DefParamsContext extends ParserRuleContext {
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public DefParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDefParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDefParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDefParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefParamsContext defParams() throws RecognitionException {
		DefParamsContext _localctx = new DefParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DCIS) | (1L << KCIS) | (1L << BOOL) | (1L << CHAR) | (1L << STR))) != 0)) {
				{
				setState(212);
				varType();
				setState(213);
				match(ID);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					varType();
					setState(216);
					match(ID);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FunctionDefContext extends ParserRuleContext {
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode DCIS() { return getToken(GrammarParser.DCIS, 0); }
		public TerminalNode LBracket() { return getToken(GrammarParser.LBracket, 0); }
		public TerminalNode RBracket() { return getToken(GrammarParser.RBracket, 0); }
		public TerminalNode KCIS() { return getToken(GrammarParser.KCIS, 0); }
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public TerminalNode STR() { return getToken(GrammarParser.STR, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varType);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(DCIS);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBracket) {
					{
					setState(228);
					match(LBracket);
					setState(229);
					match(RBracket);
					}
				}

				}
				break;
			case KCIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(KCIS);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBracket) {
					{
					setState(233);
					match(LBracket);
					setState(234);
					match(RBracket);
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(BOOL);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBracket) {
					{
					setState(238);
					match(LBracket);
					setState(239);
					match(RBracket);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(CHAR);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBracket) {
					{
					setState(243);
					match(LBracket);
					setState(244);
					match(RBracket);
					}
				}

				}
				break;
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(STR);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBracket) {
					{
					setState(248);
					match(LBracket);
					setState(249);
					match(RBracket);
					}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return term_sempred((TermContext)_localctx, predIndex);
		case 10:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\7\7t\n\7\f\7\16\7w\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u008c\n\t\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00b2\n\f\f\f\16\f\u00b5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\16"+
		"\3\16\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3\13\16\5\16\u00d5\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00dd\n\17\f\17\16\17\u00e0\13\17\5\17"+
		"\u00e2\n\17\3\20\3\20\3\21\3\21\3\21\5\21\u00e9\n\21\3\21\3\21\3\21\5"+
		"\21\u00ee\n\21\3\21\3\21\3\21\5\21\u00f3\n\21\3\21\3\21\3\21\5\21\u00f8"+
		"\n\21\3\21\3\21\3\21\5\21\u00fd\n\21\5\21\u00ff\n\21\3\21\2\6\20\22\24"+
		"\26\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2!&\3\2\31\32\3\2"+
		"\33\34\3\2\35\36\2\u0119\2\"\3\2\2\2\4)\3\2\2\2\6,\3\2\2\2\b<\3\2\2\2"+
		"\np\3\2\2\2\fu\3\2\2\2\16x\3\2\2\2\20\u008b\3\2\2\2\22\u0095\3\2\2\2\24"+
		"\u00a0\3\2\2\2\26\u00ab\3\2\2\2\30\u00ca\3\2\2\2\32\u00d4\3\2\2\2\34\u00e1"+
		"\3\2\2\2\36\u00e3\3\2\2\2 \u00fe\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2"+
		"\2%(\5\6\4\2&(\5\b\5\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\5\36\20\2-.\5 \21\2./\7\'\2\2/\60\7\13\2"+
		"\2\60\61\5\34\17\2\61\62\7\f\2\2\62\66\7\r\2\2\63\65\5\b\5\2\64\63\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29"+
		":\7\16\2\2:;\7\t\2\2;\7\3\2\2\2<=\5\n\6\2=\t\3\2\2\2>?\7\5\2\2?@\7\13"+
		"\2\2@A\5\20\t\2AB\7\f\2\2BC\7\6\2\2CD\7\r\2\2DE\5\f\7\2EG\7\16\2\2FH\5"+
		"\16\b\2GF\3\2\2\2GH\3\2\2\2Hq\3\2\2\2IJ\7\b\2\2JK\7\13\2\2KL\5\20\t\2"+
		"LM\7\f\2\2MN\7\r\2\2NO\5\f\7\2OP\7\16\2\2Pq\3\2\2\2QR\5 \21\2RS\7\'\2"+
		"\2ST\7\17\2\2TU\5\22\n\2UV\7\20\2\2VW\7\t\2\2Wq\3\2\2\2XY\5 \21\2YZ\7"+
		"\'\2\2Z[\7\t\2\2[q\3\2\2\2\\]\7\'\2\2]^\7\17\2\2^_\5\22\n\2_`\7\20\2\2"+
		"`a\7\30\2\2ab\5\22\n\2bc\7\t\2\2cq\3\2\2\2de\7\'\2\2ef\7\30\2\2fg\5\22"+
		"\n\2gh\7\t\2\2hq\3\2\2\2ij\7\4\2\2jk\5\22\n\2kl\7\t\2\2lq\3\2\2\2mn\5"+
		"\22\n\2no\7\t\2\2oq\3\2\2\2p>\3\2\2\2pI\3\2\2\2pQ\3\2\2\2pX\3\2\2\2p\\"+
		"\3\2\2\2pd\3\2\2\2pi\3\2\2\2pm\3\2\2\2q\13\3\2\2\2rt\5\b\5\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3\2\2\2wu\3\2\2\2xy\7\7\2\2yz\7\r\2"+
		"\2z{\5\f\7\2{|\7\16\2\2|\17\3\2\2\2}~\b\t\1\2~\u008c\5\22\n\2\177\u0080"+
		"\5\22\n\2\u0080\u0081\t\2\2\2\u0081\u0082\5\22\n\2\u0082\u008c\3\2\2\2"+
		"\u0083\u0084\7\13\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7\f\2\2\u0086\u008c"+
		"\3\2\2\2\u0087\u0088\7 \2\2\u0088\u008c\5\20\t\6\u0089\u008c\7\26\2\2"+
		"\u008a\u008c\7\27\2\2\u008b}\3\2\2\2\u008b\177\3\2\2\2\u008b\u0083\3\2"+
		"\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u0092\3\2\2\2\u008d\u008e\f\5\2\2\u008e\u008f\t\3\2\2\u008f\u0091\5\20"+
		"\t\6\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\n\1"+
		"\2\u0096\u0097\5\24\13\2\u0097\u009d\3\2\2\2\u0098\u0099\f\4\2\2\u0099"+
		"\u009a\t\4\2\2\u009a\u009c\5\24\13\2\u009b\u0098\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\23\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\b\13\1\2\u00a1\u00a2\5\26\f\2\u00a2\u00a8\3"+
		"\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\t\5\2\2\u00a5\u00a7\5\26\f\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\25\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\f\1\2\u00ac\u00ad"+
		"\5\30\r\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\f\4\2\2\u00af\u00b0\7\37\2\2"+
		"\u00b0\u00b2\5\30\r\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7\'\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba"+
		"\7\f\2\2\u00ba\u00cb\3\2\2\2\u00bb\u00cb\7\'\2\2\u00bc\u00bd\7\'\2\2\u00bd"+
		"\u00be\7\17\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7\20\2\2\u00c0\u00cb"+
		"\3\2\2\2\u00c1\u00cb\7(\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00cb\5\22\n\2"+
		"\u00c4\u00c5\7\13\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7\f\2\2\u00c7\u00cb"+
		"\3\2\2\2\u00c8\u00cb\7*\2\2\u00c9\u00cb\7)\2\2\u00ca\u00b6\3\2\2\2\u00ca"+
		"\u00bb\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2"+
		"\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\31\3\2\2\2\u00cc\u00d1\7\'\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d0\7\'\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\5 \21\2\u00d7\u00de\7\'\2"+
		"\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\5 \21\2\u00da\u00db\7\'\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d6\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\37"+
		"\3\2\2\2\u00e5\u00e8\7\21\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e9\7\20\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ff\3\2\2\2\u00ea\u00ed"+
		"\7\22\2\2\u00eb\u00ec\7\17\2\2\u00ec\u00ee\7\20\2\2\u00ed\u00eb\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ff\3\2\2\2\u00ef\u00f2\7\23\2\2\u00f0"+
		"\u00f1\7\17\2\2\u00f1\u00f3\7\20\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f7\7\24\2\2\u00f5\u00f6\7\17\2\2\u00f6"+
		"\u00f8\7\20\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00ff\3"+
		"\2\2\2\u00f9\u00fc\7\25\2\2\u00fa\u00fb\7\17\2\2\u00fb\u00fd\7\20\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00e5"+
		"\3\2\2\2\u00fe\u00ea\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00ff!\3\2\2\2\30\')\66Gpu\u008b\u0092\u009d\u00a8\u00b3"+
		"\u00ca\u00d1\u00d4\u00de\u00e1\u00e8\u00ed\u00f2\u00f7\u00fc\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}