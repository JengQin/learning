// Generated from D:/software_develop/workspace/github_workspace/learning/datacenter-admin/src/main/java/com/tt/datacenter/antlr\ClickHouse_bk.g4 by ANTLR 4.8
package com.tt.datacenter.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClickHouseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClickHouseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statment(ClickHouseParser.Select_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_expr_list(ClickHouseParser.Column_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#from_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stat(ClickHouseParser.From_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#table_lias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_lias(ClickHouseParser.Table_liasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#where_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stat(ClickHouseParser.Where_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#prewhere_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrewhere_step(ClickHouseParser.Prewhere_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#where_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_step(ClickHouseParser.Where_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#join_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stat(ClickHouseParser.Join_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(ClickHouseParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#join_on_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_expr(ClickHouseParser.Join_on_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#group_by_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_stat(ClickHouseParser.Group_by_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#having_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_expr(ClickHouseParser.Having_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#order_by_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_stat(ClickHouseParser.Order_by_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#order_by_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr_list(ClickHouseParser.Order_by_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#expr_with_optional_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_with_optional_alias(ClickHouseParser.Expr_with_optional_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#limit_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_stat(ClickHouseParser.Limit_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#limitby_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitby_step(ClickHouseParser.Limitby_stepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(ClickHouseParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_entry(ClickHouseParser.Enum_entryContext ctx);
}