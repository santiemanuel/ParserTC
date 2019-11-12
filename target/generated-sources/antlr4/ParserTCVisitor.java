// Generated from ParserTC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#listStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStmt(ParserTCParser.ListStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ParserTCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParserTCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserTCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(ParserTCParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#textExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextExpr(ParserTCParser.TextExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#intTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTerm(ParserTCParser.IntTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ParserTCParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ParserTCParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ParserTCParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(ParserTCParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ParserTCParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(ParserTCParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ParserTCParser#intFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ParserTCParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(ParserTCParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#listExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(ParserTCParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listIdExpr}
	 * labeled alternative in {@link ParserTCParser#listTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIdExpr(ParserTCParser.ListIdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExtExpr}
	 * labeled alternative in {@link ParserTCParser#listTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExtExpr(ParserTCParser.ListExtExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(ParserTCParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#listExt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExt(ParserTCParser.ListExtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#setTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTerm(ParserTCParser.SetTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#setExt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExt(ParserTCParser.SetExtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ParserTCParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(ParserTCParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idBoolExpr}
	 * labeled alternative in {@link ParserTCParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBoolExpr(ParserTCParser.IdBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAtom}
	 * labeled alternative in {@link ParserTCParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(ParserTCParser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intBoolExpr}
	 * labeled alternative in {@link ParserTCParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntBoolExpr(ParserTCParser.IntBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#textTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTerm(ParserTCParser.TextTermContext ctx);
}