// Generated from C:/Users/bartw/OneDrive/Pulpit/Kompilator/Main/src/main/grammar\PythonG3.g4 by ANTLR 4.10.1
package com.demo.lexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonG3Parser}.
 */
public interface PythonG3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonG3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonG3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonG3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonG3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(PythonG3Parser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(PythonG3Parser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(PythonG3Parser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(PythonG3Parser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonG3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonG3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(PythonG3Parser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(PythonG3Parser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterInversion(PythonG3Parser.InversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitInversion(PythonG3Parser.InversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative}.
	 * @param ctx the parse tree
	 */
	void enterComparative(PythonG3Parser.ComparativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative}.
	 * @param ctx the parse tree
	 */
	void exitComparative(PythonG3Parser.ComparativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_tail}.
	 * @param ctx the parse tree
	 */
	void enterComparative_tail(PythonG3Parser.Comparative_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_tail}.
	 * @param ctx the parse tree
	 */
	void exitComparative_tail(PythonG3Parser.Comparative_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_less}.
	 * @param ctx the parse tree
	 */
	void enterComparative_less(PythonG3Parser.Comparative_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_less}.
	 * @param ctx the parse tree
	 */
	void exitComparative_less(PythonG3Parser.Comparative_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_eq_less}.
	 * @param ctx the parse tree
	 */
	void enterComparative_eq_less(PythonG3Parser.Comparative_eq_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_eq_less}.
	 * @param ctx the parse tree
	 */
	void exitComparative_eq_less(PythonG3Parser.Comparative_eq_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_more}.
	 * @param ctx the parse tree
	 */
	void enterComparative_more(PythonG3Parser.Comparative_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_more}.
	 * @param ctx the parse tree
	 */
	void exitComparative_more(PythonG3Parser.Comparative_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_eq_more}.
	 * @param ctx the parse tree
	 */
	void enterComparative_eq_more(PythonG3Parser.Comparative_eq_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_eq_more}.
	 * @param ctx the parse tree
	 */
	void exitComparative_eq_more(PythonG3Parser.Comparative_eq_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#comparative_eq}.
	 * @param ctx the parse tree
	 */
	void enterComparative_eq(PythonG3Parser.Comparative_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#comparative_eq}.
	 * @param ctx the parse tree
	 */
	void exitComparative_eq(PythonG3Parser.Comparative_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(PythonG3Parser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(PythonG3Parser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(PythonG3Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(PythonG3Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PythonG3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PythonG3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#increment_statement}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_statement(PythonG3Parser.Increment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#increment_statement}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_statement(PythonG3Parser.Increment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(PythonG3Parser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(PythonG3Parser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(PythonG3Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(PythonG3Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PythonG3Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PythonG3Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(PythonG3Parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(PythonG3Parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(PythonG3Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(PythonG3Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(PythonG3Parser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(PythonG3Parser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#list_of_variables}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variables(PythonG3Parser.List_of_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#list_of_variables}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variables(PythonG3Parser.List_of_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonG3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonG3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonG3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonG3Parser.BlockContext ctx);
}