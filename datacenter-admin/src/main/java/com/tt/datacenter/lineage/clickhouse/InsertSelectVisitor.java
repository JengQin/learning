package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.union.InsertTableNode;
import com.tt.datacenter.lineage.union.SelectTableNode;
import com.tt.datacenter.lineage.union.TableNode;
import com.tt.datacenter.lineage.union.VirtualColumn;
import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * insert select语句的解析器
 *
 */
public class InsertSelectVisitor extends SqlBaseBaseVisitor<Object> {

    private SelectVirtualTableWithColumnVisitor selectVisitor;

    private InsertTableNode targetTable;

    public InsertSelectVisitor(SelectVirtualTableWithColumnVisitor selectVisitor) {
        this.selectVisitor = selectVisitor;
    }

    /**
     * 将ParseTree转换成以InsertTable为跟节点的TableTree
     *
     * @param parseTree
     * @return
     */
    public InsertTableNode parseTreeToInsertTableTree(ParseTree parseTree) {
        SelectTableNode finalSelectTable = selectVisitor.parseTreeToSelectTableTree(parseTree);

        // 解析出targetTable
        visit(parseTree);

        // 设置targetTable的表级别依赖
        finalSelectTable.addParentTable(targetTable);
        targetTable.addDependencyTable(finalSelectTable);

        // 设置targetTable的列级别依赖
        if (targetTable.getColumnSize() > 0) { // 如果是inset into(id,name) select ... from 形式
            List<VirtualColumn> columns = targetTable.getColumns();
            for (VirtualColumn column : columns) {
                Integer columnIndex = column.getColumnIndex();
                VirtualColumn selectColumn = finalSelectTable.getColumnByIndex(columnIndex);
                column.setExpression(selectColumn.getExpression());
                column.getDependencyColumns().addAll(selectColumn.getDependencyColumns());
            }

        }
        return targetTable;
    }

    /**
     * 解析insertInto的语法节点
     *     | INSERT INTO targetTable columnAliases? query       #insertInto
     * @param ctx
     * @return
     */
    @Override
    public Object visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {

        // 获取数据名和表名
        SqlBaseParser.TargetTableContext targetTableContext = ctx.targetTable();
        String targetTableName = targetTableContext.targetTableName().getText();
        String dbName = null;
        if (targetTableContext.databaseName() != null) {
            dbName = targetTableContext.databaseName().getText();
        }

        targetTable = new InsertTableNode(TableNode.TableType.INSERT_TABLE, targetTableName, dbName);

        // 解析列名
        SqlBaseParser.ColumnAliasesContext columnAliasesContext = ctx.columnAliases();
        if (null != columnAliasesContext) {
            int childCount = columnAliasesContext.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ParseTree child = columnAliasesContext.getChild(i);
                if (child instanceof SqlBaseParser.IdentifierContext) {
                    VirtualColumn column = new VirtualColumn(child.getText(),targetTable.getColumnSize());
                    targetTable.addColumn(column);
                }
            }
        }

        return super.visitInsertInto(ctx);
    }



}
