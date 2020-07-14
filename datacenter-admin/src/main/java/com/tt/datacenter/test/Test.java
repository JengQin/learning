package com.tt.datacenter.test;


import com.alibaba.fastjson.JSON;
import com.tt.datacenter.lineage.clickhouse.InsertSelectVisitor;
import com.tt.datacenter.lineage.clickhouse.SelectVirtualTableVisitor;
import com.tt.datacenter.lineage.clickhouse.SelectVirtualTableWithColumnVisitor;
import com.tt.datacenter.lineage.lib.column.ColumnLineage;
import com.tt.datacenter.lineage.lib.column.LineageBuilder;
import com.tt.datacenter.lineage.lib.table.TableLineage;
import com.tt.datacenter.lineage.union.InsertTableNode;
import com.tt.datacenter.lineage.union.SelectTableNode;
import com.tt.datacenter.parser.SqlBaseLexer;
import com.tt.datacenter.parser.SqlBaseParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;


public class Test {

    public static void main(String[] args) {
        //        String sql = "select t1.id,t1.name from dw.t1";
//        String sql = "insert into dw.tb4(id,score,clz)\n" +
//                "select tb1.id,sum(t2.score) as score,count(t3.clz) as clz_cnt \n" +
//                "from dw.t1 tb1 " +
//                "join dw.t2 as tb2 on (t1.id=t2.id and t1.name=t2.name) " +
//                "join (select id,clz from tb3 where event_date>='2002-01-01' order  by id desc) t3 on (t1.id=t3.id)";
//        String sql = "insert into dw.tb4(id,score,clz)\n" +
//                "with (select id,clz from tab5 where event_date>='2002-01-01') as t5\n" +
//                "select t1.id,t3.id as uid,t1.score+t1.age as age,sum(t2.score) as score,count(t3.clz,t2.id) as clz_cnt \n" +
//                "from dw.t1 global join dw.t2 on (t1.id=t2.id and t1.name=t2.name) \n" +
//                "\tleft SEMI join (\n" +
//                "\tselect id,clz from tab3 where event_date>='2002-01-01' and id global in (select id from t1)\n" +
//                "\tunion all\n" +
//                "\tselect id,clz from tab4 where event_date>='2002-01-01'\n" +
//                "\tunion all\n" +
//                "\tselect id,clz from t5 where event_date>='2002-01-01'\n" +
//                "\t) t3 on (t1.id=t3.id)" +
//                "group by t1.id,t3.clz";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        ParseTree parseTree = parser.singleStatement();




//        iterParserTree(parseTree);
//        testSelectQueryVisitor(parseTree);
//        testVirtualTableVisitor(parseTree);
//        testVirtualColumnVisitor(parseTree);
        testInsertSelectVisitor(parseTree);
//        testColumnLineageBuilder(parseTree);

    }




    public static void testVirtualTableVisitor(ParseTree parseTree) {

        SelectVirtualTableVisitor visitor = new SelectVirtualTableVisitor();

        parseTree.accept(visitor);

        Map<String, SelectTableNode> visitedTable = visitor.getVisitedTable();
        String jsonString = JSON.toJSONString(visitedTable);
        System.out.println(jsonString);
    }


    public static void testVirtualColumnVisitor(ParseTree parseTree) {

        SelectVirtualTableWithColumnVisitor visitor = new SelectVirtualTableWithColumnVisitor();

        visitor.parseTreeToSelectTableTree(parseTree);
//        parseTree.accept(visitor);

        Map<String, SelectTableNode> visitedTable = visitor.getVisitedTable();
        String jsonString = JSON.toJSONString(visitedTable);
        System.out.println(jsonString);
        for (String key : visitedTable.keySet()) {
            System.out.println(key + " ==> " + visitedTable.get(key));
        }
    }

    public static void testInsertSelectVisitor(ParseTree parseTree) {

        InsertSelectVisitor visitor = new InsertSelectVisitor(new SelectVirtualTableWithColumnVisitor());

        InsertTableNode tableTree = visitor.parseTreeToInsertTableTree(parseTree);
//        parseTree.accept(visitor);

        System.out.println(JSON.toJSONString(tableTree));

        LineageBuilder lineageBuilder = new LineageBuilder();
        ColumnLineage columnLineage = lineageBuilder.buildColumnLineage(tableTree);
        String jsonString = JSON.toJSONString(columnLineage);
        System.out.println(jsonString);
        TableLineage tableLineage = lineageBuilder.buildTableLineage(tableTree);
        System.out.println(JSON.toJSONString(tableLineage));

    }


    public static void testColumnLineageBuilder(ParseTree parseTree) {

        SelectVirtualTableWithColumnVisitor visitor = new SelectVirtualTableWithColumnVisitor();

        SelectTableNode tableTree = visitor.parseTreeToSelectTableTree(parseTree);
//        parseTree.accept(visitor);

        LineageBuilder lineageBuilder = new LineageBuilder();
        ColumnLineage columnLineage = lineageBuilder.buildColumnLineage(tableTree);
        String jsonString = JSON.toJSONString(columnLineage);
        System.out.println(jsonString);

    }

    private static String sql = "insert into default.dwd_user_wide_all(totalDate, active, uid, nickName, ageRange, gender, ttId, phone, regTime, platform, ver, deviceId, source, imei, idfa, idfv, invitecode, level, glamourLevel, wealthLevel, isConsume, firstConTime, firstConFee, lastConTime, lastConFee, sumConFee, firstLoginDay, lastLoginDay, sumLoginDay, cpId, chId, chName, pid, pname, tgUid, tgUser, tgChnlType, tgChnlTypeName, depId, depName, syncTime, appId, mainId, birthday, age, province, city, brand, md, ip, ua, androidid, imei2, oaid, channelFrom, nobility_level)\n" +
            "select '${date}' totalDate, '1' active, u.uid as _uid, nickName, ageRange, gender, ttId, phone, regTime, platform, ver, deviceId, source, imei, idfa, idfv, invitecode, if(level='', '1', level) level, glamourLevel, wealthLevel,\n" +
            "\t   if(isConsume='', '0', isConsume) isConsume, firstConTime, firstConFee, lastConTime, lastConFee, sumConFee, firstLoginDay, lastLoginDay, sumLoginDay,\n" +
            "\t   ifNull(cpId, '') cpId,\n" +
            "\t   if(c.channelId=0, 1003001, c.channelId) chId,\n" +
            "\t   if(c.channelId=0, '自然流量', channelName) chName,\n" +
            "\t   if(c.channelId=0, 1003, pid) pid,\n" +
            "\t   if(c.channelId=0, '自然流量', pname) pname,\n" +
            "\t   ifNull(tgUid, '') tgUid,\n" +
            "\t   ifNull(tgUser, '') tgUser,\n" +
            "\t   ifNull(tgChnlType, '') tgChnlType,\n" +
            "\t   ifNull(tgChnlTypeName, '') tgChnlTypeName,\n" +
            "\t   if(c.channelId=0, 'OTH', departmentId) depId,\n" +
            "\t   if(c.channelId=0, '自然流量', departmentName) depName,\n" +
            "\t   now() syncTime, appId, mainId,\n" +
            "\t   uli.birthday birthday,\n" +
            "\t   if(uli.age is not null and uli.age>=0, toString(uli.age), '') age,\n" +
            "\t   ifNull(f.province, '') as province,\n" +
            "\t   ifNull(f.city, '') as city,\n" +
            "\t   brand, md, ip, ua, androidid, imei2, oaid,\n" +
            "\t\tchannelIdFromTable as channelFrom,\n" +
            "\t\ttoInt64(nobility_level) as nobility_level\n" +
            "from (\n" +
            "\t-- 用户表\n" +
            "\tselect uid, regTime, ttId, source, multiIf(platform='1', '1', platform='', '', '2') platform, invitecode, lower(replaceAll(deviceId, '-', '')) deviceId, imei, idfv, idfa, ver, appId, mainId, province, city, brand, md, ip, ua, androidid, imei2, oaid\n" +
            "\tfrom dwd_user_tt_all where regTime<='${date} 23:59:59') u\n" +
            "\n" +
            "\t-- 用户基本信息\n" +
            "\tglobal any left join\n" +
            "\t(select uid, argMax(nickName, totalDate) nickName, argMax(gender, totalDate) gender, argMax(phone, totalDate) phone from ods_user_log_all where totalDate<='${date} 23:59:59' group by uid ) ug on ug.uid = u.uid\n" +
            "\n" +
            "\t-- 用户年龄段、年龄、生日\n" +
            "\tglobal any left join\n" +
            "\t(\n" +
            "\t\tselect uid,\n" +
            "\t\t\textract(argMax(tagName, totalDate), '[0-9]{2}后') as               ageRange,\n" +
            "\t\t\targMax(toDateOrZero(birthDay), totalDate) as         birthday,\n" +
            "\t\t\tif(birthday > '0000-00-00', dateDiff('year', birthday, toDate('${date}')), 0) as age\n" +
            "\t\tfrom ods_user_label_info_all\n" +
            "\t\twhere totalDate <= '${date} 23:59:59'\n" +
            "\t\tgroup by uid\n" +
            "\t ) uli on uli.uid = u.uid\n" +
            "\n" +
            "\t-- 用户等级\n" +
            "\tglobal any left join\n" +
            "\t(select uid,\n" +
            "\t\t\tifNull(argMax(case when level!='' and level is not null then level END, createTime), '1') level,\n" +
            "\t\t\tifNull(argMax(case when glamourLevel!='' and glamourLevel is not null then glamourLevel END, createTime), '0') glamourLevel,\n" +
            "\t\t\tifNull(argMax(case when wealthLevel!='' and wealthLevel is not null then wealthLevel END, createTime), '0') wealthLevel\n" +
            "\t\tfrom ods_user_level_all\n" +
            "\t\twhere createTime<='${date} 23:59:59'\n" +
            "\t\tgroup by uid\n" +
            "\t) lv on lv.uid = u.uid\n" +
            "\n" +
            "\t-- 首消,最后消费,累计消费\n" +
            "\tglobal any left join\n" +
            "\t(select uid, min(totalDate) firstConTime, argMin(cashAmount, totalDate) firstConFee, max(totalDate) lastConTime, argMax(cashAmount, totalDate) lastConFee, sum(cashAmount) sumConFee, '1' isConsume from dw.dwd_crg_consume_all where cashAmount!=0 and totalDate<='${date} 23:59:59' group by uid) fc on fc.uid = u.uid\n" +
            "\n" +
            "\t-- 首登、最后登录、累积登录天数\n" +
            "\tglobal any left join\n" +
            "\t(select uid, min(totalDate) firstLoginDay, max(totalDate) lastLoginDay, count(distinct totalDate) sumLoginDay from dw.dwd_tt_uid_day_all where totalDate <= '${date}' group by uid) fl on fl.uid = u.uid\n" +
            "\n" +
            "\t-- 渠道信息\n" +
            "\tglobal any left join\n" +
            "\t(    -- 取用户的渠道归属，首先从买量用户表里找渠道ID和cpId，找不到再用用户注册表的cpId关联渠道总表获取渠道ID和cpId，\n" +
            "\t\t -- 如果上面2步都找不到的渠道，就设置为自然流量渠道\n" +
            "\t\tselect d1.uid                                                 as uid,\n" +
            "\t\t\t\t\tif(d2.channelId > 0, 'ods_buying_user_info', 'dwd_channel') as channelIdFromTable,\n" +
            "\t\t\t\t\tif(d2.channelId > 0, d2.channelId, d3.channelId)       as channelId,\n" +
            "\t\t\t\t\tifNull(if(d2.channelId > 0, d2.cpId, d3.cpId), '')     as cpId\n" +
            "\t\t\t from (\n" +
            "\t\t\t\t\t   select uid, cpId\n" +
            "\t\t\t\t\t   from dwd_user_tt_all\n" +
            "\t\t\t\t\t   where regTime <= '${date} 23:59:59'\n" +
            "\t\t\t\t   ) d1\n" +
            "\t\t\t\t   global any left join (\n" +
            "\t\t\t\t\t  select user_id as uid, argMin(cp_id, reg_time) cpId, argMin(toInt64OrNull(ch_id), reg_time) channelId\n" +
            "\t\t\t\t\t  from ods_buying_user_info_all\n" +
            "\t\t\t\t\t  group by uid\n" +
            "\t\t\t\t  ) d2 on toInt64(d1.uid) = d2.uid\n" +
            "\t\t\t\t  global any left join (\n" +
            "\t\t\t\t\t  select id channelId, cpId\n" +
            "\t\t\t\t\t  from v_dwd_channel\n" +
            "\t\t\t\t\t  where level=2\n" +
            "\t\t\t\t\t  and cpId!=''\n" +
            "\t\t\t\t  ) d3 on d3.cpId = d1.cpId\n" +
            "\n" +
            "\t) c on c.uid = u.uid\n" +
            "\n" +
            "\tglobal any left join (\n" +
            "\t\tselect id channelId, ifNull(name, '') channelName, pid, ifNull(pname, '') pname, ifNull(tg_uid, '') tgUid, ifNull(tg_realname, '') tgUser, ifNull(tg_chnl_type, '') tgChnlType, ifNull(tg_chnl_type_name, '') tgChnlTypeName, ifNull(departmentId, '') departmentId, ifNull(departmentName, '') departmentName\n" +
            "\t\tfrom v_dwd_channel dd1\n" +
            "\t\tglobal any left join (\n" +
            "\t\t\tselect code, name departmentName from v_dc_dict where pcode='chDepartment'\n" +
            "\t\t) d2 on d2.code = dd1.chnlType\n" +
            "\t\twhere dd1.level=2\n" +
            "\t) d on d.channelId = c.channelId\n" +
            "\n" +
            "\t-- 贵族等级，因为有cycle_begin_ts相同的记录，所以要另外用order_id判断最大的nobility_level\n" +
            "\tglobal any left join (\n" +
            "\t\tselect uid,\n" +
            "\t\t\t   if(nobility_level_order > nobility_level_ts, nobility_level_order, nobility_level_ts) as nobility_level\n" +
            "\t\tfrom (\n" +
            "\t\t\tselect uid,\n" +
            "\t\t\t\targMax(nobility_level, order_id) as nobility_level_order,\n" +
            "\t\t\t\targMax(nobility_level, cycle_begin_ts) as nobility_level_ts\n" +
            "\t\t\tfrom ods_nobility_all\n" +
            "\t\t\tgroup by uid\n" +
            "\t\t) tmp1\n" +
            "\t) e on e.uid = u.uid\n" +
            "\n" +
            "\t-- 获取spark分析后的省市\n" +
            "\tglobal any left join (\n" +
            "\t\tselect uid,\n" +
            "\t\t\tprovince,\n" +
            "\t\t\tcity\n" +
            "\t\tfrom dw.dwd_tt_mbr_user_area_di_all\n" +
            "\t\twhere reg_time <= '${date} 23:59:59'\n" +
            "\t) f on f.uid = u.uid";
}
