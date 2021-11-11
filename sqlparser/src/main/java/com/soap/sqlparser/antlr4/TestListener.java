// Generated from /Users/soapy/IdeaProjects/study/sqlparser/src/main/resources/Test.g4 by ANTLR 4.9.1
package com.soap.sqlparser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TestParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(TestParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(TestParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TestParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TestParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(TestParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(TestParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(TestParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(TestParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(TestParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(TestParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(TestParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(TestParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(TestParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(TestParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(TestParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(TestParser.IntContext ctx);
}