// Generated from D:/software_develop/workspace/github_workspace/learning/datacenter-admin/src/main/java/com/tt/datacenter/antlr\ClickHouse_bk.g4 by ANTLR 4.8
package com.tt.datacenter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseParser}.
 */
public interface ClickHouseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_statment}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statment(ClickHouseParser.Select_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_statment}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statment(ClickHouseParser.Select_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_expr_list(ClickHouseParser.Column_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_expr_list(ClickHouseParser.Column_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#from_stat}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stat(ClickHouseParser.From_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#from_stat}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stat(ClickHouseParser.From_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#table_lias}.
	 * @param ctx the parse tree
	 */
	void enterTable_lias(ClickHouseParser.Table_liasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#table_lias}.
	 * @param ctx the parse tree
	 */
	void exitTable_lias(ClickHouseParser.Table_liasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#where_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhere_stat(ClickHouseParser.Where_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#where_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhere_stat(ClickHouseParser.Where_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#prewhere_step}.
	 * @param ctx the parse tree
	 */
	void enterPrewhere_step(ClickHouseParser.Prewhere_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#prewhere_step}.
	 * @param ctx the parse tree
	 */
	void exitPrewhere_step(ClickHouseParser.Prewhere_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#where_step}.
	 * @param ctx the parse tree
	 */
	void enterWhere_step(ClickHouseParser.Where_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#where_step}.
	 * @param ctx the parse tree
	 */
	void exitWhere_step(ClickHouseParser.Where_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#join_stat}.
	 * @param ctx the parse tree
	 */
	void enterJoin_stat(ClickHouseParser.Join_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#join_stat}.
	 * @param ctx the parse tree
	 */
	void exitJoin_stat(ClickHouseParser.Join_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(ClickHouseParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(ClickHouseParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#join_on_expr}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_expr(ClickHouseParser.Join_on_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#join_on_expr}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_expr(ClickHouseParser.Join_on_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#group_by_stat}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_stat(ClickHouseParser.Group_by_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#group_by_stat}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_stat(ClickHouseParser.Group_by_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void enterHaving_expr(ClickHouseParser.Having_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void exitHaving_expr(ClickHouseParser.Having_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#order_by_stat}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_stat(ClickHouseParser.Order_by_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#order_by_stat}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_stat(ClickHouseParser.Order_by_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#order_by_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr_list(ClickHouseParser.Order_by_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#order_by_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr_list(ClickHouseParser.Order_by_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#expr_with_optional_alias}.
	 * @param ctx the parse tree
	 */
	void enterExpr_with_optional_alias(ClickHouseParser.Expr_with_optional_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#expr_with_optional_alias}.
	 * @param ctx the parse tree
	 */
	void exitExpr_with_optional_alias(ClickHouseParser.Expr_with_optional_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limit_stat}.
	 * @param ctx the parse tree
	 */
	void enterLimit_stat(ClickHouseParser.Limit_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limit_stat}.
	 * @param ctx the parse tree
	 */
	void exitLimit_stat(ClickHouseParser.Limit_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitby_step}.
	 * @param ctx the parse tree
	 */
	void enterLimitby_step(ClickHouseParser.Limitby_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitby_step}.
	 * @param ctx the parse tree
	 */
	void exitLimitby_step(ClickHouseParser.Limitby_stepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(ClickHouseParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(ClickHouseParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 */
	void enterClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 */
	void exitClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void enterInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void exitInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void enterEnum_entry(ClickHouseParser.Enum_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void exitEnum_entry(ClickHouseParser.Enum_entryContext ctx);
}