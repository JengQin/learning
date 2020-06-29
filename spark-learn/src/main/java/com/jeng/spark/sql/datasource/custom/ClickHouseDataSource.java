package com.jeng.spark.sql.datasource.custom;

import org.apache.spark.sql.sources.v2.DataSourceOptions;
import org.apache.spark.sql.sources.v2.DataSourceV2;
import org.apache.spark.sql.sources.v2.ReadSupport;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;

/**
 * The ClickHouseDataSource
 *
 * @author JiaZheng
 * @create 2020-06-29 22:05
 */
public class ClickHouseDataSource implements DataSourceV2, ReadSupport {

    @Override
    public DataSourceReader createReader(DataSourceOptions dataSourceOptions) {
        return null;
    }

}
