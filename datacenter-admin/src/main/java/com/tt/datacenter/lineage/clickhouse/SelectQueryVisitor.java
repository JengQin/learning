package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.lib.SelectQuery;
import com.tt.datacenter.parser.SqlBaseBaseListener;
import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class SelectQueryVisitor extends SqlBaseBaseVisitor<Object> {


    /**
     * 访问select查询
     * 每个querySpecification代表一层select
     * querySpecification
     * : SELECT setQuantifier? selectItem (',' selectItem)*
     * (FROM relation (',' relation)*)?
     * (WHERE where=booleanExpression)?
     * (GROUP BY groupBy)?
     * (HAVING having=booleanExpression)?
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        // 开始新的select
//        if (isSubQuery(ctx)) { //判断是否需要解析的子查询
//            // 获取子查询的别名
//            String alias = getSubQueryAlias(ctx);
//            SelectQuery selectQuery = new SelectQuery();
//        }

        ParserRuleContext parent1 = ctx.getParent().getParent().getParent().getParent().getParent();
        ParserRuleContext parent2 = getGrandparent(ctx, SqlBaseParser.SubqueryRelationContext.class, 5);
        ParserRuleContext parent3 = getGrandparent(ctx, SqlBaseParser.StatementContext.class, 5);
        System.out.println(parent1.getClass() + " ====== " + parent2 + " ====== " + parent3);
        System.out.println("parent1=parent2: " + (parent1 == parent2) + ", parent1=parent3: " + (parent1 == parent3));

        return super.visitQuerySpecification(ctx);
    }

    /**
     * 回溯到query规则的parent，去获取当前查询的别名
     *
     * @param ctx
     * @return
     */
    private String getSubQueryAlias(SqlBaseParser.QuerySpecificationContext ctx) {
        ParserRuleContext parentOfQuery = ctx.getParent().getParent().getParent().getParent().getParent();
//        ctx.getChild();
        return null;
    }


    /**
     * 访问select的字段
     * selectItem
     * : expression (AS? identifier)?  #selectSingle
     * | qualifiedName '.' ASTERISK    #selectAll
     * | ASTERISK                      #selectAll
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSelectSingle(SqlBaseParser.SelectSingleContext ctx) {
        return super.visitSelectSingle(ctx);
    }


    /**
     * 判断是否是真正的子查询
     * 被select结果依赖的subQuery才是真正的子查询
     *
     * @param ctx
     * @return
     */
    private boolean isSubQuery(SqlBaseParser.QuerySpecificationContext ctx) {
        ParserRuleContext parentOfQuery = getGrandparent(ctx, 5); //获取query的上层父节点（也就是querySpecification的第5层父节点）
        // 如果是where子句中的in (subQuery)，则返回false,因为select的结果不依赖于该subQuery
        if (parentOfQuery instanceof SqlBaseParser.InSubqueryContext) {
            return false;
        }
        return true;
    }


    /**
     * 获取指定类型的上层父节点，并且限定向上查找的层数
     *
     * @param ctx
     * @param parentType
     * @param level
     * @param <T>
     * @return
     */
    public <T extends ParseTree> T getGrandparent(ParserRuleContext ctx, Class<? extends T> parentType, int level) {
        if (ctx == null || level <= 0) {
            return null;
        }
        ParserRuleContext parent = ctx.getParent();

        while (null != parent && level > 0) {
            if (parentType.isInstance(parent)) {
                return parentType.cast(parent);
            } else {
                --level;
                parent = parent.getParent();
            }
        }
        return null;
    }

    /**
     * 向上查找指定层数的上层父节点
     *
     * @param ctx
     * @param level
     * @return
     */
    public ParserRuleContext getGrandparent(ParserRuleContext ctx, int level) {
        if (ctx == null || level <= 0) {
            return null;
        }
        ParserRuleContext parent = ctx.getParent();

        while (--level > 0) {
            parent = parent.getParent();
        }
        return parent;
    }
}
