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
		PLUS=1, MINUS=2, MULTI=3, DIVI=4, MOD=5, QUOTE=6, UNION=7, INTER=8, DIFF=9, 
		PRINT=10, SEMICOLON=11, DOT=12, COMMA=13, COLON=14, ASSIGN_OP=15, EQUALS=16, 
		NOTEQ=17, LT=18, LTEQ=19, GT=20, GTEQ=21, OP_PAREN=22, CL_PAREN=23, OP_BRACE=24, 
		CL_BRACE=25, OP_BRACK=26, CL_BRACK=27, BOOLEAN=28, IDENT=29, NUM=30, TEXT=31, 
		WS=32;
	public static final int
		RULE_listStmt = 0, RULE_stmt = 1, RULE_assign = 2, RULE_print = 3, RULE_expression = 4, 
		RULE_intExpr = 5, RULE_textExpr = 6, RULE_intTerm = 7, RULE_intFactor = 8, 
		RULE_setExpr = 9, RULE_listExpr = 10, RULE_listTerm = 11, RULE_index = 12, 
		RULE_listExt = 13, RULE_setTerm = 14, RULE_setExt = 15, RULE_exprList = 16, 
		RULE_boolExpr = 17, RULE_boolTerm = 18, RULE_textTerm = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"listStmt", "stmt", "assign", "print", "expression", "intExpr", "textExpr", 
			"intTerm", "intFactor", "setExpr", "listExpr", "listTerm", "index", "listExt", 
			"setTerm", "setExt", "exprList", "boolExpr", "boolTerm", "textTerm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'''", "'union'", "'intersection'", 
			"'difference'", "'print'", "';'", "'.'", "','", "':'", "'='", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTI", "DIVI", "MOD", "QUOTE", "UNION", "INTER", 
			"DIFF", "PRINT", "SEMICOLON", "DOT", "COMMA", "COLON", "ASSIGN_OP", "EQUALS", 
			"NOTEQ", "LT", "LTEQ", "GT", "GTEQ", "OP_PAREN", "CL_PAREN", "OP_BRACE", 
			"CL_BRACE", "OP_BRACK", "CL_BRACK", "BOOLEAN", "IDENT", "NUM", "TEXT", 
			"WS"
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
			setState(40);
			stmt();
			setState(41);
			match(SEMICOLON);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PRINT) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				{
				setState(42);
				stmt();
				setState(43);
				match(SEMICOLON);
				}
				}
				setState(49);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
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
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(ParserTCParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IDENT);
			setState(56);
			match(ASSIGN_OP);
			setState(57);
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
			setState(59);
			match(PRINT);
			setState(60);
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

	public static class ExpressionContext extends ParserRuleContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public TextExprContext textExpr() {
			return getRuleContext(TextExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				intExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				setExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				listExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				textExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				boolExpr();
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

	public static class IntExprContext extends ParserRuleContext {
		public IntTermContext left;
		public Token op;
		public IntExprContext right;
		public IntTermContext intTerm() {
			return getRuleContext(IntTermContext.class,0);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ParserTCParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ParserTCParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ParserTCParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ParserTCParser.MINUS, i);
		}
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		IntExprContext _localctx = new IntExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((IntExprContext)_localctx).left = intTerm();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					((IntExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((IntExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(71);
					((IntExprContext)_localctx).right = intExpr();
					}
					} 
				}
				setState(76);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TextExprContext extends ParserRuleContext {
		public TextTermContext left;
		public TextExprContext right;
		public TextTermContext textTerm() {
			return getRuleContext(TextTermContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserTCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserTCParser.DOT, i);
		}
		public List<TextExprContext> textExpr() {
			return getRuleContexts(TextExprContext.class);
		}
		public TextExprContext textExpr(int i) {
			return getRuleContext(TextExprContext.class,i);
		}
		public TextExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitTextExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextExprContext textExpr() throws RecognitionException {
		TextExprContext _localctx = new TextExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((TextExprContext)_localctx).left = textTerm();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(DOT);
					setState(79);
					((TextExprContext)_localctx).right = textExpr();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class IntTermContext extends ParserRuleContext {
		public IntFactorContext left;
		public Token op;
		public IntTermContext right;
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public List<IntTermContext> intTerm() {
			return getRuleContexts(IntTermContext.class);
		}
		public IntTermContext intTerm(int i) {
			return getRuleContext(IntTermContext.class,i);
		}
		public List<TerminalNode> MULTI() { return getTokens(ParserTCParser.MULTI); }
		public TerminalNode MULTI(int i) {
			return getToken(ParserTCParser.MULTI, i);
		}
		public List<TerminalNode> DIVI() { return getTokens(ParserTCParser.DIVI); }
		public TerminalNode DIVI(int i) {
			return getToken(ParserTCParser.DIVI, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ParserTCParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ParserTCParser.MOD, i);
		}
		public IntTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIntTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntTermContext intTerm() throws RecognitionException {
		IntTermContext _localctx = new IntTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intTerm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((IntTermContext)_localctx).left = intFactor();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					((IntTermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIVI) | (1L << MOD))) != 0)) ) {
						((IntTermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(87);
					((IntTermContext)_localctx).right = intTerm();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class IntFactorContext extends ParserRuleContext {
		public IntFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intFactor; }
	 
		public IntFactorContext() { }
		public void copyFrom(IntFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends IntFactorContext {
		public IntExprContext inparen;
		public TerminalNode OP_PAREN() { return getToken(ParserTCParser.OP_PAREN, 0); }
		public TerminalNode CL_PAREN() { return getToken(ParserTCParser.CL_PAREN, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public ParExprContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends IntFactorContext {
		public IntFactorContext inminus;
		public TerminalNode MINUS() { return getToken(ParserTCParser.MINUS, 0); }
		public IntFactorContext intFactor() {
			return getRuleContext(IntFactorContext.class,0);
		}
		public UnaryExprContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends IntFactorContext {
		public Token num;
		public TerminalNode NUM() { return getToken(ParserTCParser.NUM, 0); }
		public NumExprContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends IntFactorContext {
		public Token id;
		public IndexContext idpos;
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IdExprContext(IntFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntFactorContext intFactor() throws RecognitionException {
		IntFactorContext _localctx = new IntFactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intFactor);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((IdExprContext)_localctx).id = match(IDENT);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BRACK) {
					{
					setState(94);
					((IdExprContext)_localctx).idpos = index();
					}
				}

				}
				break;
			case NUM:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((NumExprContext)_localctx).num = match(NUM);
				}
				break;
			case OP_PAREN:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(OP_PAREN);
				setState(99);
				((ParExprContext)_localctx).inparen = intExpr();
				setState(100);
				match(CL_PAREN);
				}
				break;
			case MINUS:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(MINUS);
				setState(103);
				((UnaryExprContext)_localctx).inminus = intFactor();
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

	public static class SetExprContext extends ParserRuleContext {
		public SetTermContext left;
		public SetExprContext right;
		public SetTermContext setTerm() {
			return getRuleContext(SetTermContext.class,0);
		}
		public List<TerminalNode> UNION() { return getTokens(ParserTCParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(ParserTCParser.UNION, i);
		}
		public List<TerminalNode> INTER() { return getTokens(ParserTCParser.INTER); }
		public TerminalNode INTER(int i) {
			return getToken(ParserTCParser.INTER, i);
		}
		public List<TerminalNode> DIFF() { return getTokens(ParserTCParser.DIFF); }
		public TerminalNode DIFF(int i) {
			return getToken(ParserTCParser.DIFF, i);
		}
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((SetExprContext)_localctx).left = setTerm();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTER) | (1L << DIFF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(108);
					((SetExprContext)_localctx).right = setExpr();
					}
					} 
				}
				setState(113);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ListExprContext extends ParserRuleContext {
		public ListTermContext left;
		public ListExprContext right;
		public ListTermContext listTerm() {
			return getRuleContext(ListTermContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(ParserTCParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParserTCParser.COLON, i);
		}
		public List<ListExprContext> listExpr() {
			return getRuleContexts(ListExprContext.class);
		}
		public ListExprContext listExpr(int i) {
			return getRuleContext(ListExprContext.class,i);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((ListExprContext)_localctx).left = listTerm();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(COLON);
					setState(116);
					((ListExprContext)_localctx).right = listExpr();
					}
					} 
				}
				setState(121);
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

	public static class ListTermContext extends ParserRuleContext {
		public ListTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTerm; }
	 
		public ListTermContext() { }
		public void copyFrom(ListTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListExtExprContext extends ListTermContext {
		public ListExtContext list;
		public ListExtContext listExt() {
			return getRuleContext(ListExtContext.class,0);
		}
		public ListExtExprContext(ListTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListExtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListIdExprContext extends ListTermContext {
		public Token id;
		public IndexContext idpos;
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ListIdExprContext(ListTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTermContext listTerm() throws RecognitionException {
		ListTermContext _localctx = new ListTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listTerm);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new ListIdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((ListIdExprContext)_localctx).id = match(IDENT);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BRACK) {
					{
					setState(123);
					((ListIdExprContext)_localctx).idpos = index();
					}
				}

				}
				break;
			case OP_BRACK:
				_localctx = new ListExtExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((ListExtExprContext)_localctx).list = listExt();
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

	public static class IndexContext extends ParserRuleContext {
		public IntExprContext val;
		public TerminalNode OP_BRACK() { return getToken(ParserTCParser.OP_BRACK, 0); }
		public TerminalNode CL_BRACK() { return getToken(ParserTCParser.CL_BRACK, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
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
		enterRule(_localctx, 24, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(OP_BRACK);
			setState(130);
			((IndexContext)_localctx).val = intExpr();
			setState(131);
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

	public static class ListExtContext extends ParserRuleContext {
		public TerminalNode OP_BRACK() { return getToken(ParserTCParser.OP_BRACK, 0); }
		public TerminalNode CL_BRACK() { return getToken(ParserTCParser.CL_BRACK, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitListExt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExtContext listExt() throws RecognitionException {
		ListExtContext _localctx = new ListExtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listExt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OP_BRACK);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				setState(134);
				exprList();
				}
			}

			setState(137);
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

	public static class SetTermContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public SetExtContext setExt() {
			return getRuleContext(SetExtContext.class,0);
		}
		public TerminalNode OP_PAREN() { return getToken(ParserTCParser.OP_PAREN, 0); }
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public TerminalNode CL_PAREN() { return getToken(ParserTCParser.CL_PAREN, 0); }
		public SetTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSetTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTermContext setTerm() throws RecognitionException {
		SetTermContext _localctx = new SetTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_setTerm);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(IDENT);
				}
				break;
			case OP_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				setExt();
				}
				break;
			case OP_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(OP_PAREN);
				setState(142);
				setExpr();
				setState(143);
				match(CL_PAREN);
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

	public static class SetExtContext extends ParserRuleContext {
		public TerminalNode OP_BRACE() { return getToken(ParserTCParser.OP_BRACE, 0); }
		public TerminalNode CL_BRACE() { return getToken(ParserTCParser.CL_BRACE, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SetExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitSetExt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExtContext setExt() throws RecognitionException {
		SetExtContext _localctx = new SetExtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setExt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OP_BRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << BOOLEAN) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				setState(148);
				exprList();
				}
			}

			setState(151);
			match(CL_BRACE);
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
		enterRule(_localctx, 32, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expression();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				expression();
				}
				}
				setState(160);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolTermContext left;
		public Token op;
		public BoolTermContext right;
		public List<BoolTermContext> boolTerm() {
			return getRuleContexts(BoolTermContext.class);
		}
		public BoolTermContext boolTerm(int i) {
			return getRuleContext(BoolTermContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ParserTCParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ParserTCParser.EQUALS, i);
		}
		public List<TerminalNode> NOTEQ() { return getTokens(ParserTCParser.NOTEQ); }
		public TerminalNode NOTEQ(int i) {
			return getToken(ParserTCParser.NOTEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(ParserTCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ParserTCParser.LT, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(ParserTCParser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(ParserTCParser.LTEQ, i);
		}
		public List<TerminalNode> GT() { return getTokens(ParserTCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ParserTCParser.GT, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(ParserTCParser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(ParserTCParser.GTEQ, i);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((BoolExprContext)_localctx).left = boolTerm();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOTEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) {
				{
				{
				{
				setState(162);
				((BoolExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOTEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((BoolExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(163);
				((BoolExprContext)_localctx).right = boolTerm();
				}
				}
				setState(168);
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

	public static class BoolTermContext extends ParserRuleContext {
		public BoolTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolTerm; }
	 
		public BoolTermContext() { }
		public void copyFrom(BoolTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntBoolExprContext extends BoolTermContext {
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public IntBoolExprContext(BoolTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIntBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdBoolExprContext extends BoolTermContext {
		public Token id;
		public TerminalNode IDENT() { return getToken(ParserTCParser.IDENT, 0); }
		public IdBoolExprContext(BoolTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitIdBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAtomContext extends BoolTermContext {
		public TerminalNode BOOLEAN() { return getToken(ParserTCParser.BOOLEAN, 0); }
		public BoolAtomContext(BoolTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTermContext boolTerm() throws RecognitionException {
		BoolTermContext _localctx = new BoolTermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolTerm);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new IdBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((IdBoolExprContext)_localctx).id = match(IDENT);
				}
				break;
			case 2:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new IntBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				intExpr();
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

	public static class TextTermContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ParserTCParser.TEXT, 0); }
		public TextTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTCVisitor ) return ((ParserTCVisitor<? extends T>)visitor).visitTextTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextTermContext textTerm() throws RecognitionException {
		TextTermContext _localctx = new TextTermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_textTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(TEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\3\b\3\b\7\b"+
		"S\n\b\f\b\16\bV\13\b\3\t\3\t\3\t\7\t[\n\t\f\t\16\t^\13\t\3\n\3\n\5\nb"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\7\13p\n\13\f"+
		"\13\16\13s\13\13\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\5\r\177\n"+
		"\r\3\r\5\r\u0082\n\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008a\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21\5\21\u0098"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u009f\n\22\f\22\16\22\u00a2\13\22"+
		"\3\23\3\23\3\23\7\23\u00a7\n\23\f\23\16\23\u00aa\13\23\3\24\3\24\3\24"+
		"\5\24\u00af\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\6\3\2\3\4\3\2\5\7\3\2\t\13\3\2\22\27\2\u00b8\2*\3\2\2\2"+
		"\4\67\3\2\2\2\69\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16O\3\2\2\2"+
		"\20W\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26t\3\2\2\2\30\u0081\3\2\2\2\32\u0083"+
		"\3\2\2\2\34\u0087\3\2\2\2\36\u0093\3\2\2\2 \u0095\3\2\2\2\"\u009b\3\2"+
		"\2\2$\u00a3\3\2\2\2&\u00ae\3\2\2\2(\u00b0\3\2\2\2*+\5\4\3\2+\61\7\r\2"+
		"\2,-\5\4\3\2-.\7\r\2\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\648\5\6\4\2\658\5\n\6\2\668"+
		"\5\b\5\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\37\2"+
		"\2:;\7\21\2\2;<\5\n\6\2<\7\3\2\2\2=>\7\f\2\2>?\5\n\6\2?\t\3\2\2\2@F\5"+
		"\f\7\2AF\5\24\13\2BF\5\26\f\2CF\5\16\b\2DF\5$\23\2E@\3\2\2\2EA\3\2\2\2"+
		"EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GL\5\20\t\2HI\t\2\2\2IK\5\f"+
		"\7\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NL\3\2\2\2OT\5"+
		"(\25\2PQ\7\16\2\2QS\5\16\b\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U"+
		"\17\3\2\2\2VT\3\2\2\2W\\\5\22\n\2XY\t\3\2\2Y[\5\20\t\2ZX\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]\21\3\2\2\2^\\\3\2\2\2_a\7\37\2\2`b\5\32\16"+
		"\2a`\3\2\2\2ab\3\2\2\2bk\3\2\2\2ck\7 \2\2de\7\30\2\2ef\5\f\7\2fg\7\31"+
		"\2\2gk\3\2\2\2hi\7\4\2\2ik\5\22\n\2j_\3\2\2\2jc\3\2\2\2jd\3\2\2\2jh\3"+
		"\2\2\2k\23\3\2\2\2lq\5\36\20\2mn\t\4\2\2np\5\24\13\2om\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2r\25\3\2\2\2sq\3\2\2\2ty\5\30\r\2uv\7\20\2\2vx\5"+
		"\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3\2\2\2"+
		"|~\7\37\2\2}\177\5\32\16\2~}\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0082\5\34\17\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0084\7\34\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7\35\2\2\u0086\33\3\2"+
		"\2\2\u0087\u0089\7\34\2\2\u0088\u008a\5\"\22\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\35\2\2\u008c\35\3\2\2"+
		"\2\u008d\u0094\7\37\2\2\u008e\u0094\5 \21\2\u008f\u0090\7\30\2\2\u0090"+
		"\u0091\5\24\13\2\u0091\u0092\7\31\2\2\u0092\u0094\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0094\37\3\2\2\2\u0095"+
		"\u0097\7\32\2\2\u0096\u0098\5\"\22\2\u0097\u0096\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\33\2\2\u009a!\3\2\2\2\u009b\u00a0"+
		"\5\n\6\2\u009c\u009d\7\17\2\2\u009d\u009f\5\n\6\2\u009e\u009c\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1#\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a8\5&\24\2\u00a4\u00a5\t\5\2\2\u00a5"+
		"\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9%\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af"+
		"\7\37\2\2\u00ac\u00af\7\36\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ab\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\'\3\2\2\2\u00b0\u00b1\7"+
		"!\2\2\u00b1)\3\2\2\2\24\61\67ELT\\ajqy~\u0081\u0089\u0093\u0097\u00a0"+
		"\u00a8\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}