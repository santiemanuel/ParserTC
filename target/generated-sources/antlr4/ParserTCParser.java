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
		PRINT=10, SEMICOLON=11, DOT=12, COMMA=13, COLON=14, ASSIGN_OP=15, OP_PAREN=16, 
		CL_PAREN=17, OP_BRACE=18, CL_BRACE=19, OP_BRACK=20, CL_BRACK=21, IDENT=22, 
		NUM=23, TEXT=24, WS=25;
	public static final int
		RULE_listStmt = 0, RULE_stmt = 1, RULE_assign = 2, RULE_print = 3, RULE_expression = 4, 
		RULE_intExpr = 5, RULE_textExpr = 6, RULE_intTerm = 7, RULE_intFactor = 8, 
		RULE_setExpr = 9, RULE_listExpr = 10, RULE_listTerm = 11, RULE_index = 12, 
		RULE_listExt = 13, RULE_setTerm = 14, RULE_setExt = 15, RULE_exprList = 16, 
		RULE_textTerm = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"listStmt", "stmt", "assign", "print", "expression", "intExpr", "textExpr", 
			"intTerm", "intFactor", "setExpr", "listExpr", "listTerm", "index", "listExt", 
			"setTerm", "setExt", "exprList", "textTerm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'''", "'union'", "'intersection'", 
			"'difference'", "'print'", "';'", "'.'", "','", "':'", "'='", "'('", 
			"')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTI", "DIVI", "MOD", "QUOTE", "UNION", "INTER", 
			"DIFF", "PRINT", "SEMICOLON", "DOT", "COMMA", "COLON", "ASSIGN_OP", "OP_PAREN", 
			"CL_PAREN", "OP_BRACE", "CL_BRACE", "OP_BRACK", "CL_BRACK", "IDENT", 
			"NUM", "TEXT", "WS"
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
			setState(36);
			stmt();
			setState(37);
			match(SEMICOLON);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PRINT) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				{
				setState(38);
				stmt();
				setState(39);
				match(SEMICOLON);
				}
				}
				setState(45);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
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
			setState(51);
			match(IDENT);
			setState(52);
			match(ASSIGN_OP);
			setState(53);
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
			setState(55);
			match(PRINT);
			setState(56);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				intExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				setExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				listExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				textExpr();
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
			setState(64);
			((IntExprContext)_localctx).left = intTerm();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
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
					setState(66);
					((IntExprContext)_localctx).right = intExpr();
					}
					} 
				}
				setState(71);
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
			setState(72);
			((TextExprContext)_localctx).left = textTerm();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(DOT);
					setState(74);
					((TextExprContext)_localctx).right = textExpr();
					}
					} 
				}
				setState(79);
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
			setState(80);
			((IntTermContext)_localctx).left = intFactor();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
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
					setState(82);
					((IntTermContext)_localctx).right = intTerm();
					}
					} 
				}
				setState(87);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((IdExprContext)_localctx).id = match(IDENT);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BRACK) {
					{
					setState(89);
					((IdExprContext)_localctx).idpos = index();
					}
				}

				}
				break;
			case NUM:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((NumExprContext)_localctx).num = match(NUM);
				}
				break;
			case OP_PAREN:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(OP_PAREN);
				setState(94);
				((ParExprContext)_localctx).inparen = intExpr();
				setState(95);
				match(CL_PAREN);
				}
				break;
			case MINUS:
				_localctx = new UnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(MINUS);
				setState(98);
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
			setState(101);
			((SetExprContext)_localctx).left = setTerm();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTER) | (1L << DIFF))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(103);
					((SetExprContext)_localctx).right = setExpr();
					}
					} 
				}
				setState(108);
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
			setState(109);
			((ListExprContext)_localctx).left = listTerm();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					match(COLON);
					setState(111);
					((ListExprContext)_localctx).right = listExpr();
					}
					} 
				}
				setState(116);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new ListIdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((ListIdExprContext)_localctx).id = match(IDENT);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_BRACK) {
					{
					setState(118);
					((ListIdExprContext)_localctx).idpos = index();
					}
				}

				}
				break;
			case OP_BRACK:
				_localctx = new ListExtExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(124);
			match(OP_BRACK);
			setState(125);
			((IndexContext)_localctx).val = intExpr();
			setState(126);
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
			setState(128);
			match(OP_BRACK);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				setState(129);
				exprList();
				}
			}

			setState(132);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(IDENT);
				}
				break;
			case OP_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				setExt();
				}
				break;
			case OP_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(OP_PAREN);
				setState(137);
				setExpr();
				setState(138);
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
			setState(142);
			match(OP_BRACE);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OP_PAREN) | (1L << OP_BRACE) | (1L << OP_BRACK) | (1L << IDENT) | (1L << NUM) | (1L << TEXT))) != 0)) {
				{
				setState(143);
				exprList();
				}
			}

			setState(146);
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
			setState(148);
			expression();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				expression();
				}
				}
				setState(155);
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
		enterRule(_localctx, 34, RULE_textTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3"+
		"\7\7\7F\n\7\f\7\16\7I\13\7\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t"+
		"\3\t\7\tV\n\t\f\t\16\tY\13\t\3\n\3\n\5\n]\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nf\n\n\3\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\3\f\3\f"+
		"\7\fs\n\f\f\f\16\fv\13\f\3\r\3\r\5\rz\n\r\3\r\5\r}\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\5\17\u0085\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u008f\n\20\3\21\3\21\5\21\u0093\n\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u009a\n\22\f\22\16\22\u009d\13\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\3\4\3\2\5\7\3\2\t\13\2\u00a4"+
		"\2&\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2"+
		"\16J\3\2\2\2\20R\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30|\3\2\2"+
		"\2\32~\3\2\2\2\34\u0082\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u0096"+
		"\3\2\2\2$\u009e\3\2\2\2&\'\5\4\3\2\'-\7\r\2\2()\5\4\3\2)*\7\r\2\2*,\3"+
		"\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60"+
		"\64\5\6\4\2\61\64\5\n\6\2\62\64\5\b\5\2\63\60\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\5\3\2\2\2\65\66\7\30\2\2\66\67\7\21\2\2\678\5\n\6\28\7"+
		"\3\2\2\29:\7\f\2\2:;\5\n\6\2;\t\3\2\2\2<A\5\f\7\2=A\5\24\13\2>A\5\26\f"+
		"\2?A\5\16\b\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BG\5"+
		"\20\t\2CD\t\2\2\2DF\5\f\7\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r"+
		"\3\2\2\2IG\3\2\2\2JO\5$\23\2KL\7\16\2\2LN\5\16\b\2MK\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QO\3\2\2\2RW\5\22\n\2ST\t\3\2\2TV\5\20"+
		"\t\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\21\3\2\2\2YW\3\2\2\2Z\\"+
		"\7\30\2\2[]\5\32\16\2\\[\3\2\2\2\\]\3\2\2\2]f\3\2\2\2^f\7\31\2\2_`\7\22"+
		"\2\2`a\5\f\7\2ab\7\23\2\2bf\3\2\2\2cd\7\4\2\2df\5\22\n\2eZ\3\2\2\2e^\3"+
		"\2\2\2e_\3\2\2\2ec\3\2\2\2f\23\3\2\2\2gl\5\36\20\2hi\t\4\2\2ik\5\24\13"+
		"\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\25\3\2\2\2nl\3\2\2\2ot\5\30"+
		"\r\2pq\7\20\2\2qs\5\26\f\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27"+
		"\3\2\2\2vt\3\2\2\2wy\7\30\2\2xz\5\32\16\2yx\3\2\2\2yz\3\2\2\2z}\3\2\2"+
		"\2{}\5\34\17\2|w\3\2\2\2|{\3\2\2\2}\31\3\2\2\2~\177\7\26\2\2\177\u0080"+
		"\5\f\7\2\u0080\u0081\7\27\2\2\u0081\33\3\2\2\2\u0082\u0084\7\26\2\2\u0083"+
		"\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\27\2\2\u0087\35\3\2\2\2\u0088\u008f\7\30\2\2\u0089"+
		"\u008f\5 \21\2\u008a\u008b\7\22\2\2\u008b\u008c\5\24\13\2\u008c\u008d"+
		"\7\23\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2"+
		"\u008e\u008a\3\2\2\2\u008f\37\3\2\2\2\u0090\u0092\7\24\2\2\u0091\u0093"+
		"\5\"\22\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\7\25\2\2\u0095!\3\2\2\2\u0096\u009b\5\n\6\2\u0097\u0098\7"+
		"\17\2\2\u0098\u009a\5\n\6\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c#\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009e\u009f\7\32\2\2\u009f%\3\2\2\2\22-\63@GOW\\elty|\u0084\u008e\u0092"+
		"\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}