// Generated from L.g4 by ANTLR 4.7
package ru.spbau.mit;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LParser}.
 */
public interface LListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(LParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(LParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#statementMode}.
	 * @param ctx the parse tree
	 */
	void enterStatementMode(LParser.StatementModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#statementMode}.
	 * @param ctx the parse tree
	 */
	void exitStatementMode(LParser.StatementModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(LParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(LParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(LParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(LParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(LParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(LParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(LParser.ReadStatementContext ctx);
}