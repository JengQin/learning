package com.jeng.calcite.planner;

import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.plan.RelOptUtil;
import org.apache.calcite.prepare.PlannerImpl;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.rel.type.RelDataTypeSystemImpl;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.impl.AbstractTable;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.type.BasicSqlType;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.calcite.tools.FrameworkConfig;
import org.apache.calcite.tools.Frameworks;
import org.apache.calcite.tools.ValidationException;

public class PlannerTest {
    public static void main(String[] args) throws SqlParseException, ValidationException {
        final SchemaPlus rootSchema = createSchema();
        String sql="select u.id as user_id, u.name as user_name, j.company as user_company, u.age as user_age \n" +
                "from users u join jobs j on u.name=j.name\n" +
                "where u.age > 30 and j.id>10\n" +
                "order by user_id";
        final FrameworkConfig config = Frameworks.newConfigBuilder()
                .defaultSchema(rootSchema).build();
        PlannerImpl planner = new PlannerImpl(config);//执行计划需要进行解析，验证，转换三步
        SqlNode parse = planner.parse(sql);
        SqlNode validate = planner.validate(parse);
        RelNode convert = planner.convert(validate);//
        String s = RelOptUtil.toString(convert);//输出可读的关系表达式
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
