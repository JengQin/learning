package com.jeng.spark.sql.datasource.custom;


import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.types.StructType;

import java.util.List;

/**
 * The ClickHouseDataSourceReader
 *
 * @author JiaZheng
 * @create 2020-06-29 22:07
 */
public class ClickHouseDataSourceReader implements DataSourceReader {
    // schema字段类型
    private String schemaString;

    public ClickHouseDataSourceReader(String schemaString) {
        this.schemaString = schemaString;
    }

    @Override
    public StructType readSchema() {
        return StructType.fromString(schemaString);
    }

    @Override
    public List<InputPartition<InternalRow>> planInputPartitions() {
        // TODO: 2020/6/29 实现分区功能
        return null;
    }
}
