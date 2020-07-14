package com.tt.datacenter.lineage.clickhouse;

import com.alibaba.fastjson.JSON;
import com.tt.datacenter.lineage.union.*;
import com.tt.datacenter.parser.SqlBaseParser;
import com.tt.datacenter.schema.base.Expression;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SelectVirtualTableWithColumnVisitor extends SelectVirtualTableVisitor {


    // 记录当前正在解析的列
    private Deque<VirtualColumn> columnStack = new LinkedList<>();


    /**
     * 遍历ParseTree，生成VirtualTable tree
     *
     * @param tree
     * @return
     */
    public SelectTableNode parseTreeToSelectTableTree(ParseTree tree) {
        // 1.生成VirtualTable tree
        visit(tree);

        // 找到finalTable
        SelectTableNode finalTable = findFinalTable();

        // 2. 生成SourceTable的列信息
        generateSourceTableColumn();

        System.out.println(JSON.toJSONString(finalTable));

        // 3. 生成Column的依赖信息
        dfsVirtualTableTree(finalTable);


        return finalTable;

    }

    private void dfsVirtualTableTree(SelectTableNode table) {
        // 递归结束条件
        if (table.getType() == SelectTableNode.TableType.SOURCE) {
            return;
        }

        // 处理
        List<VirtualColumn> columns = table.getColumns();
        int columnCount = columns.size();
        // 遍历当前表的所有列
        for (int i = 0; i < columnCount; i++) {
            VirtualColumn column = columns.get(i);
            processColumnDependency(table, column);
        }


        // 递归所有的子表
        for (TableNode childTable : table.getDependencyTable()) {
            dfsVirtualTableTree((SelectTableNode) childTable);
        }
    }

    /**
     * 处理列的依赖关系，
     * 如果columnRef的table不为空，则从指定的table中获取指定columnName的列
     * 如果columnRef的table为空，则遍历dependencyTable查找指定columnName的列
     * @param currentTable
     * @param currentColumn
     */
    private void processColumnDependency(SelectTableNode currentTable, VirtualColumn currentColumn) {
        Expression expression = currentColumn.getExpression();
        if (null == expression) {
            return;
        }
        List<ColumnReference> columnRes = expression.getColumnReferences();
        int columnRefCount = columnRes.size();
        // 遍历当前列表达式中所有引用的列
        for (int i = 0; i < columnRefCount; i++) {
            ColumnReference columnRef = columnRes.get(i);
            String tableName = columnRef.getTable();
            String columnName = columnRef.getColumnName();
            // 如果columnRef的table不为空，则从指定的table中获取指定columnName的列
            if (StringUtils.isNotBlank(tableName)) {
                TableNode depTable = currentTable.findDependencyTableByAlias(tableName);
                VirtualColumn depColumn = ((SelectTableNode)depTable).getColumnByName(columnName);
                if (null == depColumn) {
                    throw new RuntimeException(depTable + "中没有这个column: " + columnName);
                }
                currentColumn.addDependencyColumns(depColumn);
            } else {
                // 如果columnRef的table为空，则遍历dependencyTable查找指定columnName的列
                VirtualColumn depColumn = currentTable.findColumnInAllDependencyTable(columnName);
                currentColumn.addDependencyColumns(depColumn);
            }
        }
    }

    /**
     * 生成源表的列信息
     */
    private void generateSourceTableColumn() {
        Set<String> keySet = visitedTable.keySet();
        for (String tableAlias : keySet) {
            SelectTableNode virtualTable = visitedTable.get(tableAlias);
            if (virtualTable.getType() == SelectTableNode.TableType.SOURCE) {
                try {
                    // 生成列信息
                    ((SourceTableNode) virtualTable).generateColumns();
                } catch (Exception e) {
                    System.out.println(virtualTable.getTableAlias());
                    throw e;
                }
            }
        }
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
        if (!isInWhere) {
            // 进入SelectSingle，开始新的selectColumn
            isInSelectSingle = true;

            //获取列名的别名
            String columnName = null;
            SqlBaseParser.IdentifierContext alias = ctx.identifier();
            if (null != alias) {
                columnName = alias.getText();
            } else {
                // TODO: 2020/7/13/013 column的alias为空，则使用expression的column为列名

            }

            // 计算当前列的下标，通过判断当前table中已经已经添加的column数量size来计算当前列的下标
            int currentColumnIndex = tableStack.peek().getColumnSize();

            // 创建新的column
            VirtualColumn currentColumn = new VirtualColumn(columnName, currentColumnIndex);
            // 获取表达式
            SqlBaseParser.ExpressionContext expressionCtx = ctx.expression();
            Expression expression = new Expression(expressionCtx.getText());

            currentColumn.setExpression(expression);

            // SelectColumn入栈，
            columnStack.push(currentColumn);
            // 访问SelectSingleContext子节点
            visitChildren(ctx);


            // selectColumn出栈，并加入当前的virtualTable
            VirtualColumn topColumn = columnStack.pop();
            if (currentColumn != topColumn) {
                throw new RuntimeException("栈顶的Column不是当前的Column");
            }

            // 判断列名是否还为空，类似“select t1.id”形式列名为“id”，需要从表达式中解析出列名
            if (StringUtils.isBlank(currentColumn.getColumnName())) {
                int size = expression.getColumnReferences().size();
                if (1 != size) {
                    throw new RuntimeException("没有显示设置列名时，表达式必须为'table.field'的形式");
                } else {
                    currentColumn.setColumnName(expression.getColumnReferences().get(0).getColumnName());
                }
            }


            tableStack.peek().addColumn(currentColumn);


            // 退出SelectSingle
            isInSelectSingle = false;
        }

        return null;
    }


    /**
     * 访问列引用columnReference规则
     * identifier           #columnReference
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        if (!isInWhere && isInSelectSingle) {
            // 获取引用的列名
            ColumnReference columnReference = new ColumnReference(null, ctx.getText());

            // 将列引用加入当前列的表达式
            VirtualColumn currentColumn = columnStack.peek();
            currentColumn.getExpression().addColumnReferences(columnReference);
        }
        return null;
    }

    /**
     * 访问列引用dereference规则
     * base=primaryExpression '.' fieldName=identifier           #dereference
     * 注意：dereference不需要再进行递归其子节点
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitDereference(SqlBaseParser.DereferenceContext ctx) {
        if (!isInWhere && isInSelectSingle) {
            // 获取引用列的表名，列名
            String tableName = ctx.base.getText();
            String columnName = ctx.fieldName.getText();
            ColumnReference columnReference = new ColumnReference(tableName, columnName);

            // 将列引用加入当前列的表达式
            VirtualColumn currentColumn = columnStack.peek();
            currentColumn.getExpression().addColumnReferences(columnReference);
        }
        return null;
    }

}
