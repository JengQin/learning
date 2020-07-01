package com.jeng.hive.lineage;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;
import org.apache.hadoop.hive.ql.parse.ParseUtils;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.tools.LineageInfo;

import java.io.IOException;

public class TableLineageTest {

    public static void main(String[] args) throws ParseException, SemanticException, IOException {
        tableLineage();
    }

    private static void tableLineage() throws ParseException, SemanticException {
                String sql = "INSERT OVERWRITE TABLE tt_dw.tmp_zone_info PARTITION (dt='20171109') SELECT z.zoneid AS zone_id,z.zonename AS zone_name, c.cityid AS city_id, c.cityname AS city_name FROM dict_zoneinfo z LEFT JOIN dict_cityinfo c ON z.cityid = c.cityid AND z.dt='20171109' AND c.dt='20171109' WHERE z.dt='20171109' AND c.dt='20171109'";
//        String sql = "INSERT OVERWRITE TABLE tt_dw.tmp_zone_info SELECT zoneid AS zone_id,zonename AS zone_name, cityid AS city_id, cityname AS city_name  FROM dict_zoneinfo";

        LineageInfo lep = new LineageInfo();

        lep.getLineageInfo(sql);

        for (String tab : lep.getInputTableList()) {
            System.out.println("InputTable=" + tab);
        }

        for (String tab : lep.getOutputTableList()) {
            System.out.println("OutputTable=" + tab);
        }
    }

}
