package com.jeng.calcite.parser;

import org.apache.calcite.config.CalciteConnectionConfigImpl;
import org.apache.calcite.jdbc.CalciteSchema;
import org.apache.calcite.prepare.CalciteCatalogReader;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.rel.type.RelDataTypeSystem;
import org.apache.calcite.rel.type.RelDataTypeSystemImpl;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.impl.AbstractTable;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.dialect.ClickHouseSqlDialect;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.type.BasicSqlType;
import org.apache.calcite.sql.type.SqlTypeFactoryImpl;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.calcite.tools.Frameworks;

import java.util.Properties;

public class Test {
    public static void main(String[] args) throws SqlParseException {
        SchemaPlus rootSchema = createSchema();

        // 解析SQL获取SqlNode
        String sql="select u.id as user_id, u.name as user_name, j.company as user_company, u.age as user_age \n" +
                "from users u join jobs j on u.name=j.name\n" +
                "where u.age > 30 and j.id>10\n" +
                "order by user_id";
        SqlParser sqlParser = SqlParser.create(sql,SqlParser.Config.DEFAULT);
        SqlNode sqlNode = sqlParser.parseStmt();

        System.out.println(sqlNode.toString());
        System.out.println();
        System.out.println(sqlNode.toSqlString(ClickHouseSqlDialect.DEFAULT));

        /*
        * 校验sqlNode
        * 1. 先通过Catalog获取相应的metadata和Namespace
        * 2. 校验（包括对表名，字段名，函数名，字段类型的校验）
        * */
        SqlTypeFactoryImpl sqlTypeFactory = new SqlTypeFactoryImpl(RelDataTypeSystem.DEFAULT);
        CalciteCatalogReader catalogReader = new CalciteCatalogReader(
                CalciteSchema.from(rootSchema),
                CalciteSchema.from(rootSchema).path(null),
                sqlTypeFactory,
                new CalciteConnectionConfigImpl(new Properties())
        );

        // 校验
//        SqlValidatorUtil.newValidator(SqlStdOperatorTable.instance(), catalogReader, sqlTypeFactory, conformance(frameworkConfig));

    }

    private static SchemaPlus createSchema() {
        // 生成schema
        SchemaPlus rootSchema = Frameworks.createRootSchema(true);

        // 往schema中添加 "USERS" table
        rootSchema.add("USERS", new AbstractTable() { // note: add a table
            @Override
            public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                RelDataTypeFactory.Builder builder = typeFactory.builder();

                builder.add("ID",new BasicSqlType(new RelDataTypeSystemImpl(){}, SqlTypeName.INTEGER));
                builder.add("NAME",new BasicSqlType(new RelDataTypeSystemImpl(){}, SqlTypeName.CHAR));
                builder.add("AGE",new BasicSqlType(new RelDataTypeSystemImpl(){}, SqlTypeName.INTEGER));
                return builder.build();
            }
        });

        // 往schema中添加 “JOBS” table
        rootSchema.add("JOBS", new AbstractTable() {
            @Override
            public RelDataType getRowType(RelDataTypeFactory typeFactory) {
                RelDataTypeFactory.Builder builder = typeFactory.builder();

                builder.add("ID",new BasicSqlType(new RelDataTypeSystemImpl() {},SqlTypeName.INTEGER));
                builder.add("NAME",new BasicSqlType(new RelDataTypeSystemImpl() {},SqlTypeName.VARCHAR));
                builder.add("COMPANY",new BasicSqlType(new RelDataTypeSystemImpl() {},SqlTypeName.VARCHAR));

                return null;
            }
        });
        return rootSchema;
    }
}
