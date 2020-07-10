package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.union.UnionTable;
import com.tt.datacenter.lineage.union.VirtualColumn;
import com.tt.datacenter.lineage.union.VirtualSourceTable;
import com.tt.datacenter.lineage.union.VirtualTable;
import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class VirtualTableVisitor extends SqlBaseBaseVisitor<Object> {

    // 使用栈来记录AST的遍历过程，每遇到一个新的临时表就入栈，栈顶元素永远保存着当前正在解析的virtual table
    private Deque<VirtualTable> tableStack = new LinkedList<>();
    // 记录已经完成访问的select
    private Map<String, VirtualTable> visitedTable = new HashMap<>();

    // 记录当前正在解析的table的别名
    private Deque<String> tableAliasStack = new LinkedList<>();
    // 记录当前正在解析的select子查询的类型
    private Deque<VirtualTable.TableType> tableTypeStack = new LinkedList<>();
    // 记录当前正在解析的列
    private Deque<VirtualColumn> columnStack = new LinkedList<>();

    // 记录当前是否是正处于selectSingle解析阶段，只有处于selectSingle阶段才需要解析出列的依赖关系
    private boolean isInSelectSingle = false;

    // alias后缀，每调用一次就加1
    private int unionAliasSuffix = 0;
    private String unionAliasPrefix = "union_virtual_table_";
    private int unionSelectAliasSuffix = 0;
    private String unionSelectAliasPrefix = "union_select_virtual_table_";
    private String finalSelectVirtualTable = "final_select_virtual_table";


    /**
     * 获取到新的子查询别名
     * aliasedRelation
     * : relationPrimary (AS? identifier columnAliases?)?
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx) {
        SqlBaseParser.IdentifierContext identifier = ctx.identifier();
        if (null != identifier) {
            tableAliasStack.push(identifier.getText());
        }
        return super.visitAliasedRelation(ctx);
    }

    /**
     * 遇到union时，需要做几件事：
     * 1.判断一下是否存在可用的alias，如果没有则生成一个新的，并且为union的每个select生成一个alias, 因为union的select子句没有alias
     * 2.创建新的VirtualTable,表示进入新的VirtualTable解析阶段
     * <p>
     * queryTerm
     * : queryPrimary                                                             #queryTermDefault
     * | queryPrimary
     * (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary
     * ( (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary )*  #setOperation //INTERSECT取交集，union取并集，EXCEPT取差集
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        // 1.设置别名
        String currentAlias = tableAliasStack.poll();
        if (StringUtils.isBlank(currentAlias)) {
            currentAlias = generateUnionAlias(); // 如果当前没有可用的alias则生成一个
        }
        pushUnionSelectAlias(ctx); // 为union的每个select生成一个alias

        // 2.生成新的VirtualTable
        UnionTable currentTable = new UnionTable(VirtualTable.TableType.UNION_RESULT, currentAlias);

        tableStack.push(currentTable); // 3.将当前VirtualTable入栈

        /** 4.访问ctx的子节点 */
        visitChildren(ctx);

        // 5.将当前VirtualTable出栈,并从它的第一个select的virtualTable设置其column信息
        VirtualTable topTable = tableStack.pop();
        if (currentTable != topTable) {
            throw new RuntimeException("栈顶的table不是当前的union VirtualTable");
        }
        currentTable.generateColumns(); //设置column信息

        // 6.将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
        VirtualTable parent = tableStack.peek();
        if (null == parent) {
            System.out.println("没有父节点,当前union的结果就是最终结果集");
            topTable.setFinal(true); //栈内没有table，说明当前的table是最终的结果集
        } else {
            parent.addDependencyTable(currentTable);
            currentTable.addParentTable(parent);
        }
        return null;
    }


    /**
     * 遇到select, 新建一个新的VirtualTable,表示进入新的VirtualTable解析阶段
     * 1. 如果当前没有可用的别名，则判断当前Select是否是最终的结果（tableStack是否为空），
     * 如果是，则生成新的final_select_alias，否则说明之前没有设置好alias（存在bug）
     *
     * querySpecification
     *      * : SELECT setQuantifier? selectItem (',' selectItem)*
     *      * (FROM relation (',' relation)*)?
     *      * (WHERE where=booleanExpression)?
     *      * (GROUP BY groupBy)?
     *      * (HAVING having=booleanExpression)?
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        // 1.设置别名
        String currentAlias = tableAliasStack.poll();
        if (StringUtils.isBlank(currentAlias)) {
            // 如果当前没有可用的alias则生成一个
            if (tableStack.peek() == null) {
                currentAlias = finalSelectVirtualTable;
            } else {
                throw new RuntimeException("当前栈顶不为空，但是没有可用的alias");
            }
        }

        // 2.生成新的VirtualTable
        VirtualTable currentTable = new VirtualTable(VirtualTable.TableType.SELECT_RESULT, currentAlias);

        tableStack.push(currentTable); // 3.将当前VirtualTable入栈

        /** 4.访问ctx的子节点 */
        visitChildren(ctx);

        // 5.将当前VirtualTable出栈
        VirtualTable topTable = tableStack.pop();
        if (currentTable != topTable) {
            throw new RuntimeException("栈顶的table不是当前的VirtualTable");
        }

        // 6.将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
        VirtualTable parent = tableStack.peek();
        if (null == parent) {
            System.out.println("没有父节点,当前Select的结果就是最终结果集");
            topTable.setFinal(true); //栈内没有table，说明当前的table是最终的结果集
        } else {
            parent.addDependencyTable(currentTable);
            currentTable.addParentTable(parent);
        }
        return null;
    }


    /**
     * 遇到sourceTable规则，需要解析出源表
     * 1.生成源表的VirtualTable，如果当前没有可用的alias,说明from子句是“from dw.tab1”形式，而不是“from dw.tab1 as t1”,此时需要将alias设置为sourceTableName
     * 2.从parent的column中获取sourceTable的列信息
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSourceTable(SqlBaseParser.SourceTableContext ctx) {
        String sourceTableName = ctx.sourceTableName().getText();
        String dbName = ctx.databaseName().getText();
        // 1.设置别名
        String currentAlias = tableAliasStack.poll();
        if (StringUtils.isBlank(currentAlias)) {
            // 如果当前没有可用的alias,将alias设置为sourceTableName
            currentAlias = sourceTableName;
        }

        // 2.生成新的VirtualTable
        VirtualSourceTable currentTable = new VirtualSourceTable(dbName, sourceTableName, currentAlias);

        tableStack.push(currentTable); // 3.将当前VirtualTable入栈

        /** 4.访问ctx的子节点 */
        visitChildren(ctx);

        // 5.将当前VirtualTable出栈
        VirtualTable topTable = tableStack.pop();
        if (currentTable != topTable) {
            throw new RuntimeException("栈顶的table不是当前的source VirtualTable");
        }

        // 6.将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
        VirtualTable parent = tableStack.peek();
        if (null == parent) {
            throw new RuntimeException("SourceVirtualTable: '" + ctx.getText() + "'没有parent table");
        } else {
            parent.addDependencyTable(currentTable);
            currentTable.addParentTable(parent);
            // 生成列信息
            currentTable.generateColumns();
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

//        //获取列名
//        String columnName;
//        SqlBaseParser.IdentifierContext alias = ctx.identifier();
//        if (null != alias) {
//            columnName = alias.getText();
//        } else {
//
//        }
//
//        VirtualColumn column = new VirtualColumn();
//
//
//        // SelectColumn入栈，
//        columnStack.push(column);
//
//        // 访问SelectSingleContext子节点
//        visitChildren(ctx);
//
//        // selectColumn出栈，并加入当前的selectQuery


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

    /**
     * 生成union select子句的别名，并压入栈
     *
     * @param ctx
     */
    private void pushUnionSelectAlias(SqlBaseParser.SetOperationContext ctx) {
        int childCount = ctx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            String alias = generateUnionSelectAlias();
            tableAliasStack.push(alias);
        }
    }

    /**
     * 生成union结果集的alias
     *
     * @return
     */
    private synchronized String generateUnionAlias() {
        return unionAliasPrefix + unionAliasSuffix++;
    }

    /**
     * 生成union的select子句的alias
     *
     * @return
     */
    private synchronized String generateUnionSelectAlias() {
        return unionSelectAliasPrefix + unionSelectAliasSuffix++;
    }

}
