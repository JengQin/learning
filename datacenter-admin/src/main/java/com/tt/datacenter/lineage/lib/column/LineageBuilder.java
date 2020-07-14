package com.tt.datacenter.lineage.lib.column;

import com.tt.datacenter.lineage.lib.table.TableLineage;
import com.tt.datacenter.lineage.union.SourceTableNode;
import com.tt.datacenter.lineage.union.TableNode;
import com.tt.datacenter.lineage.union.VirtualColumn;
import com.tt.datacenter.schema.base.Table;

import java.util.List;

public class LineageBuilder {


    public TableLineage buildTableLineage(TableNode tableTree) {
        TableLineage tableLineage = new TableLineage();
        String dbName = tableTree.getDbName();
        String tableName = tableTree.getTableAlias();
        tableLineage.setTargetTable(new Table(dbName, tableName));

        dfsTableNode(tableTree, tableLineage);

        return tableLineage;
    }

    /**
     * 递归遍历每个TableNode，叶子节点就是原始输入表
     *
     * @param tableNode
     * @param tableLineage
     */
    private void dfsTableNode(TableNode tableNode, TableLineage tableLineage) {
        // 递归结束条件：遇到SourceTable
        if (tableNode.getType() == TableNode.TableType.SOURCE) {
            String dbName = tableNode.getDbName();
            String tableName = ((SourceTableNode) tableNode).getSourceTableName();
            tableLineage.addSourceTable(new Table(dbName, tableName));
        }

        // 递归子节点
        for (TableNode table : tableNode.getDependencyTable()) {
            dfsTableNode(table, tableLineage);
        }
    }

    /**
     * 根据VirtualTable树，构建出列的血缘关系
     *
     * @param tableTree
     * @return
     */
    public ColumnLineage buildColumnLineage(TableNode tableTree) {
        ColumnLineage columnLineage = new ColumnLineage();
        List<VirtualColumn> columns = tableTree.getColumns();
        for (VirtualColumn column : columns) {
            TargetColumn targetColumn = new TargetColumn(column.getTableAlias(),
                    column.getVirtualTable().getDbName(),
                    column.getColumnName(),
                    column.getExpression().getExprString()
            );

            dfsVirtualColumn(column, targetColumn);

            columnLineage.addTargetColumn(targetColumn);
        }

        return columnLineage;

    }

    /**
     * 递归遍历每个column的所有子节点，每个column子树的叶子节点就是该column的原始依赖列
     *
     * @param column
     * @param targetColumn
     */
    private void dfsVirtualColumn(VirtualColumn column, TargetColumn targetColumn) {
        // 递归结束条件：如果是sourceTable的列，就加入targetColumn的依赖列
        if (column.getVirtualTable().getType() == TableNode.TableType.SOURCE) {
            SourceColumn sourceColumn = new SourceColumn(column.getTableAlias(), column.getVirtualTable().getDbName(), column.getColumnName());
            targetColumn.addSourceColumns(sourceColumn);
            return;
        }

        // 递归子节点
        List<VirtualColumn> dependencyColumns = column.getDependencyColumns();
        for (VirtualColumn dependencyColumn : dependencyColumns) {
            dfsVirtualColumn(dependencyColumn, targetColumn);
        }

    }
}
