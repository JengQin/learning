package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.TableLineage;
import com.tt.datacenter.lineage.lib.SourceTable;
import com.tt.datacenter.lineage.lib.TargetTable;
import com.tt.datacenter.schema.base.Table;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * 使用Antlr的visitor解析table级别的血缘关系
 *
 */
public class CkTableLineageBuilder{

    /**
     * 从AST中解析出TableLineage
     * 每次调用都会生成新的tableLineage
     *
     * @param ast
     * @return 新的tableLineage
     */
    public TableLineage build(ParseTree ast) {

        // 遍历ast，获取所有的sourceTable和targetTable
        SourceAndTargetTableVisitor visitor = new SourceAndTargetTableVisitor();
        ast.accept(visitor);

        List<TargetTable> targetTables = visitor.getTargetTables();
        List<SourceTable> sourceTables = visitor.getSourceTables();
        return new TableLineage(targetTables, sourceTables);
    }

}
