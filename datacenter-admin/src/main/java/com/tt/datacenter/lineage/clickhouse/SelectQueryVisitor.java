package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.lib.column.SelectColumn;
import com.tt.datacenter.lineage.lib.column.SelectQuery;
import com.tt.datacenter.lineage.lib.column.SelectType;
import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import com.tt.datacenter.schema.base.GroupBy;
import com.tt.datacenter.schema.base.Where;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SelectQueryVisitor extends SqlBaseBaseVisitor<Object> {

    // 使用栈来记录AST的遍历过程，每遇到一个新的子查询就入栈，栈顶元素永远保存着当前正在解析的select
    private Deque<SelectQuery> selectStack = new LinkedList<>();
    // 记录已经完成访问的select
    private Map<String, SelectQuery> visitedSelect = new HashMap<>();

    // 记录当前正在解析的select子查询的别名
    private Deque<String> selectAliasStack = new LinkedList<>();
    // 记录当前正在解析的select子查询的类型
    private Deque<SelectType> selectTypeStack = new LinkedList<>();
    // 记录当前正在解析的列
    private Deque<SelectColumn> selectColumnStack = new LinkedList<>();

    // 记录当前是否是正处于selectSingle解析阶段，只有处于selectSingle阶段才需要解析出列的依赖关系
    private boolean isInSelectSingle = false;





    /**
     * 采用先序遍历，访问select查询
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
        if (isSubQuery(ctx)) { //判断是否需要解析的子查询
            // 获取子查询的别名和类型
            String alias = selectAliasStack.pop();
            SelectType type = selectTypeStack.pop();
            SelectQuery selectQuery = new SelectQuery(type,alias);
            // 设置where和group by
            SqlBaseParser.BooleanExpressionContext where = ctx.where;
            if (null != where) {
                selectQuery.setWhere(new Where(where.getText()));
            }
            SqlBaseParser.GroupByContext groupByContext = ctx.groupBy();
            if (null != groupByContext) {
                selectQuery.setGroupBy(new GroupBy(groupByContext.getText()));
            }

            // 当前select入栈
            selectStack.push(selectQuery);

            // 继续访问当前select的所有子节点
            visitChildren(ctx);

            // 访问完当前select的所有子节点后，将当前select出栈并加入完成的select集合中，
            SelectQuery top = selectStack.pop();
            if (top == selectQuery) { //加一个判断机制，判断一下栈顶是不是当前的selectQuery
                visitedSelect.put(selectQuery.getTableName(), selectQuery);
            }else {
                // TODO: 2020/7/10/010 如果栈顶不是当前的selectQuery，则说明算法有bug，需要修改解析的算法
                throw new RuntimeException("栈顶不是当前的selectQuery");
            }
        }

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
        // 开始新的selectColumn

        //获取列名
        String columnName;
        SqlBaseParser.IdentifierContext alias = ctx.identifier();
        if (null != alias) {
            columnName = alias.getText();
        } else {

        }

        SelectColumn column = new SelectColumn();


        // SelectColumn入栈，
        selectColumnStack.push(column);

        // 访问SelectSingleContext子节点
        visitChildren(ctx);

        // selectColumn出栈，并加入当前的selectQuery




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
        if (parentOfQuery instanceof SqlBaseParser.StatementContext || parentOfQuery instanceof SqlBaseParser.SubqueryRelationContext) {
            return true;
        }
        return false;
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
