// Generated from ParserTC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTI=3, DIVI=4, MOD=5, POW=6, QUOTE=7, UNION=8, INTER=9, 
		DIFF=10, PRINT=11, SEMICOLON=12, DOT=13, COMMA=14, COLON=15, ASSIGN_OP=16, 
		EQUALS=17, NOTEQ=18, AND=19, OR=20, LT=21, LTEQ=22, GT=23, GTEQ=24, OP_PAREN=25, 
		CL_PAREN=26, OP_BRACE=27, CL_BRACE=28, OP_BRACK=29, CL_BRACK=30, BOOLEAN=31, 
		IDENT=32, NUM=33, TEXT=34, WS=35;
	public static final int
		RULE_listStmt = 0, RULE_stmt = 1, RULE_assign = 2, RULE_print = 3, RULE_expression = 4, 
		RULE_index = 5, RULE_exprList = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"listStmt", "stmt", "assign", "print", "expression", "index", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'''", "'union'", "'intersection'", 
			"'difference'", "'print'", "';'", "'.'", "','", "':'", "'='", "'=='", 
			"'!='", "'&&'", "'||'", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTI", "DIVI", "MOD", "POW", "QUOTE", "UNION", 
			"INTER", "DIFF", "PRINT", "SEMICOLON", "DOT", "COMMA", "COLON", "ASSIGN_OP", 
			"EQUALS", "NOTEQ", "AND", "OR", "LT", "LTEQ", "GT", "GTEQ", "OP_PAREN", 
			"CL_PAREN", "OP_BRACE", "CL_BRACE", "OP_BRACK", "CL_BRACK", "BOOLEAN", 
			"IDENT", "NUM", "TEXT", "WS"
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
	public String getGrammarFileName() { return "ParserTC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ListStmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserTCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserTCParser.SEMICOLON, i);
		}
		public ListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStmtContext listStmt() throws RecognitionException {
		ListStmtContext _localctx = new ListStmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_listStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			stmt();
			setState(15);
			match(SEMICOLON);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PRINT) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				{
				setState(16);
				stmt();
				setState(17);
				match(SEMICOLON);
				}
				}
				setState(23);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				print();
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

	public static class AssignContext extends ParserRuleContext {
		public Token id;
		public IndexContext idpos;
		public TerminalNode ASSIGN_OP() { return getToken(ParserTCParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((AssignContext)_localctx).id = match(IDENT);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_BRACK) {
				{
				setState(30);
				((AssignContext)_localctx).idpos = index();
				}
			}

			setState(33);
			match(ASSIGN_OP);
			setState(34);
			expression(0);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTCParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(PRINT);
			setState(37);
			expression(0);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ParserTCParser.DOT, 0); }
		public StrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextExprContext extends ExpressionContext {
		public IndexContext idpos;
		public TerminalNode TEXT() { return getToken(ParserTCParser.TEXT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TextExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitTextExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(ParserTCParser.MULTI, 0); }
		public TerminalNode DIVI() { return getToken(ParserTCParser.DIVI, 0); }
		public TerminalNode MOD() { return getToken(ParserTCParser.MOD, 0); }
		public MultExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(ParserTCParser.NUM, 0); }
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExpressionContext {
		public ExpressionContext inparen;
		public TerminalNode OP_PAREN() { return getToken(ParserTCParser.OP_PAREN, 0); }
		public TerminalNode CL_PAREN() { return getToken(ParserTCParser.CL_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ParserTCParser.EQUALS, 0); }
		public TerminalNode NOTEQ() { return getToken(ParserTCParser.NOTEQ, 0); }
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode MINUS() { return getToken(ParserTCParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserTCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserTCParser.MINUS, 0); }
		public SumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOpExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UNION() { return getToken(ParserTCParser.UNION, 0); }
		public TerminalNode INTER() { return getToken(ParserTCParser.INTER, 0); }
		public TerminalNode DIFF() { return getToken(ParserTCParser.DIFF, 0); }
		public SetOpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSetOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinListExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode COLON() { return getToken(ParserTCParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public JoinListExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitJoinListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ParserTCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserTCParser.OR, 0); }
		public AndOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitAndOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAtomExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(ParserTCParser.BOOLEAN, 0); }
		public BoolAtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitBoolAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode POW() { return getToken(ParserTCParser.POW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(ParserTCParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(ParserTCParser.LTEQ, 0); }
		public TerminalNode GT() { return getToken(ParserTCParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(ParserTCParser.GTEQ, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExprContext extends ExpressionContext {
		public TerminalNode OP_BRACK() { return getToken(ParserTCParser.OP_BRACK, 0); }
		public TerminalNode CL_BRACK() { return getToken(ParserTCParser.CL_BRACK, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetExprContext extends ExpressionContext {
		public TerminalNode OP_BRACE() { return getToken(ParserTCParser.OP_BRACE, 0); }
		public TerminalNode CL_BRACE() { return getToken(ParserTCParser.CL_BRACE, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SetExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public Token id;
		public IndexContext idpos;
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				match(MINUS);
				setState(41);
				((UnaryExprContext)_localctx).expr = expression(17);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(NUM);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(BOOLEAN);
				}
				break;
			case TEXT:
				{
				_localctx = new TextExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(TEXT);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					((TextExprContext)_localctx).idpos = index();
					}
					break;
				}
				}
				break;
			case OP_PAREN:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(OP_PAREN);
				setState(49);
				((ParExprContext)_localctx).inparen = expression(0);
				setState(50);
				match(CL_PAREN);
				}
				break;
			case IDENT:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				((IdExprContext)_localctx).id = match(IDENT);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(53);
					((IdExprContext)_localctx).idpos = index();
					}
					break;
				}
				}
				break;
			case OP_BRACE:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(OP_BRACE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
					{
					setState(57);
					exprList();
					}
				}

				setState(60);
				match(CL_BRACE);
				}
				break;
			case OP_BRACK:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(OP_BRACK);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
					{
					setState(62);
					exprList();
					}
				}

				setState(65);
				match(CL_BRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExpressionContext(_parentctx, _parentState));
						((PowExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(69);
						match(POW);
						setState(70);
						((PowExprContext)_localctx).right = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new BoolExprContext(new ExpressionContext(_parentctx, _parentState));
						((BoolExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(72);
						((BoolExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
							((BoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((BoolExprContext)_localctx).right = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
						((MultExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(75);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIVI) | (1L << MOD))) != 0)) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						((MultExprContext)_localctx).right = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new SumExprContext(new ExpressionContext(_parentctx, _parentState));
						((SumExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(78);
						((SumExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((SumExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						((SumExprContext)_localctx).right = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						((EqExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(81);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOTEQ) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						((EqExprContext)_localctx).right = expression(13);
						}
						break;
					case 6:
						{
						_localctx = new AndOrExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndOrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(84);
						((AndOrExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((AndOrExprContext)_localctx).right = expression(12);
						}
						break;
					case 7:
						{
						_localctx = new StrExprContext(new ExpressionContext(_parentctx, _parentState));
						((StrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87);
						((StrExprContext)_localctx).op = match(DOT);
						setState(88);
						((StrExprContext)_localctx).right = expression(11);
						}
						break;
					case 8:
						{
						_localctx = new SetOpExprContext(new ExpressionContext(_parentctx, _parentState));
						((SetOpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						((SetOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTER) | (1L << DIFF))) != 0)) ) {
							((SetOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((SetOpExprContext)_localctx).right = expression(4);
						}
						break;
					case 9:
						{
						_localctx = new JoinListExprContext(new ExpressionContext(_parentctx, _parentState));
						((JoinListExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(93);
						match(COLON);
						setState(94);
						((JoinListExprContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(99);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext val;
		public TerminalNode OP_BRACK() { return getToken(ParserTCParser.OP_BRACK, 0); }
		public TerminalNode CL_BRACK() { return getToken(ParserTCParser.CL_BRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OP_BRACK);
			setState(101);
			((IndexContext)_localctx).val = expression(0);
			setState(102);
			match(CL_BRACK);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserTCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserTCParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expression(0);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(105);
				match(COMMA);
				setState(106);
				expression(0);
				}
				}
				setState(111);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%s\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\7\2\26\n"+
		"\2\f\2\16\2\31\13\2\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\5\4\"\n\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\69\n\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\6\5\6B\n\6\3\6\5\6E\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\2\3\n\t\2\4\6\b\n\f\16"+
		"\2\b\3\2\27\32\3\2\5\7\3\2\3\4\3\2\23\24\3\2\25\26\3\2\n\f\2\u0084\2\20"+
		"\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b&\3\2\2\2\nD\3\2\2\2\ff\3\2\2\2\16"+
		"j\3\2\2\2\20\21\5\4\3\2\21\27\7\16\2\2\22\23\5\4\3\2\23\24\7\16\2\2\24"+
		"\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\3\3\2\2\2\31\27\3\2\2\2\32\36\5\6\4\2\33\36\5\n\6\2\34\36\5\b\5\2\35"+
		"\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37!\7\"\2\2 \"\5"+
		"\f\7\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\22\2\2$%\5\n\6\2%\7\3\2\2\2"+
		"&\'\7\r\2\2\'(\5\n\6\2(\t\3\2\2\2)*\b\6\1\2*+\7\4\2\2+E\5\n\6\23,E\7#"+
		"\2\2-E\7!\2\2.\60\7$\2\2/\61\5\f\7\2\60/\3\2\2\2\60\61\3\2\2\2\61E\3\2"+
		"\2\2\62\63\7\33\2\2\63\64\5\n\6\2\64\65\7\34\2\2\65E\3\2\2\2\668\7\"\2"+
		"\2\679\5\f\7\28\67\3\2\2\289\3\2\2\29E\3\2\2\2:<\7\35\2\2;=\5\16\b\2<"+
		";\3\2\2\2<=\3\2\2\2=>\3\2\2\2>E\7\36\2\2?A\7\37\2\2@B\5\16\b\2A@\3\2\2"+
		"\2AB\3\2\2\2BC\3\2\2\2CE\7 \2\2D)\3\2\2\2D,\3\2\2\2D-\3\2\2\2D.\3\2\2"+
		"\2D\62\3\2\2\2D\66\3\2\2\2D:\3\2\2\2D?\3\2\2\2Ec\3\2\2\2FG\f\22\2\2GH"+
		"\7\b\2\2Hb\5\n\6\22IJ\f\21\2\2JK\t\2\2\2Kb\5\n\6\22LM\f\20\2\2MN\t\3\2"+
		"\2Nb\5\n\6\21OP\f\17\2\2PQ\t\4\2\2Qb\5\n\6\20RS\f\16\2\2ST\t\5\2\2Tb\5"+
		"\n\6\17UV\f\r\2\2VW\t\6\2\2Wb\5\n\6\16XY\f\f\2\2YZ\7\17\2\2Zb\5\n\6\r"+
		"[\\\f\5\2\2\\]\t\7\2\2]b\5\n\6\6^_\f\3\2\2_`\7\21\2\2`b\5\n\6\4aF\3\2"+
		"\2\2aI\3\2\2\2aL\3\2\2\2aO\3\2\2\2aR\3\2\2\2aU\3\2\2\2aX\3\2\2\2a[\3\2"+
		"\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fg\7"+
		"\37\2\2gh\5\n\6\2hi\7 \2\2i\r\3\2\2\2jo\5\n\6\2kl\7\20\2\2ln\5\n\6\2m"+
		"k\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\17\3\2\2\2qo\3\2\2\2\r\27\35"+
		"!\608<ADaco";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}