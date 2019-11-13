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
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(ParserTCParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextExpr(ParserTCParser.TextExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ParserTCParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(ParserTCParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(ParserTCParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(ParserTCParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ParserTCParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(ParserTCParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOpExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOpExpr(ParserTCParser.SetOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinListExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinListExpr(ParserTCParser.JoinListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOrExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrExpr(ParserTCParser.AndOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAtomExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtomExpr(ParserTCParser.BoolAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(ParserTCParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(ParserTCParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(ParserTCParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(ParserTCParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ParserTCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ParserTCParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(ParserTCParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTCParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ParserTCParser.ExprListContext ctx);
}