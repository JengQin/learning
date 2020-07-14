package com.tt.datacenter.lineage.union;

/**
 * 虚表类，对应于查询过程中生成的临时中间表
 */
public class SelectTableNode extends TableNode{

    // 是否是最终的结果
    protected boolean isFinal = false;


    public SelectTableNode(TableNode.TableType type, String tableAlias) {
        super(type,tableAlias);
    }


    /**
     * 加入依赖的子查询
     *
     * @param virtualTable
     * @return
     */
    public boolean addDependencyTable(TableNode virtualTable) {
        return dependencyTable.add(virtualTable);
    }

    /**
     * 添加parent table
     * @param virtualTable
     * @return
     */
    public boolean addParentTable(TableNode virtualTable) {
        return parentTable.add(virtualTable);
    }

    /**
     * 加入列信息
     *
     * @param column
     * @return
     */
    public boolean addColumn(VirtualColumn column) {
        column.setVirtualTable(this);
        column.setTableAlias(tableAlias);

        return columns.add(column);
    }



    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    @Override
    public String toString() {
        return "VirtualTable{" +
                "type=" + type +
                ", isFinal=" + isFinal +
                ", tableAlias='" + tableAlias + '\'' +
                ", columns=" + columns +
                ", dependencyTable=" + dependencyTable +
                '}';
    }
}
