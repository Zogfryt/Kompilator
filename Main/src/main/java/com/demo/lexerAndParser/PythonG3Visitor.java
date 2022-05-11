// Generated from C:/Users/bartw/OneDrive/Pulpit/Kompilator/Main/src/main/grammar\PythonG3.g4 by ANTLR 4.10.1
package com.demo.lexerAndParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonG3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonG3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PythonG3Parser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonG3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(PythonG3Parser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(PythonG3Parser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PythonG3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(PythonG3Parser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversion(PythonG3Parser.InversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative(PythonG3Parser.ComparativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_tail(PythonG3Parser.Comparative_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_less(PythonG3Parser.Comparative_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_eq_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_eq_less(PythonG3Parser.Comparative_eq_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_more(PythonG3Parser.Comparative_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_eq_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_eq_more(PythonG3Parser.Comparative_eq_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#comparative_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparative_eq(PythonG3Parser.Comparative_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(PythonG3Parser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(PythonG3Parser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PythonG3Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#increment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_statement(PythonG3Parser.Increment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(PythonG3Parser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(PythonG3Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PythonG3Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(PythonG3Parser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(PythonG3Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(PythonG3Parser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#list_of_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variables(PythonG3Parser.List_of_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonG3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonG3Parser.BlockContext ctx);
}