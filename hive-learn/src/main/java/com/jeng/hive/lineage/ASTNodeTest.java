package com.jeng.hive.lineage;

import org.antlr.runtime.Token;
import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.*;

import java.util.ArrayList;

public class ASTNodeTest {


    public static void main(String[] args) throws ParseException {
        String sql = "SELECT zoneid AS zone_id,zonename AS zone_name, cityid AS city_id, cityname AS city_name  FROM dict_zoneinfo";
        ASTNode tree = ParseUtils.parse(sql, null);

        int level = 1;
        bfs(tree,level);
    }

    public static void bfs(ASTNode node,int level) {
        if (node == null) {
            return;
        }
        Token token = node.token;
        String name = node.getName();
        ASTNodeOrigin origin = node.getOrigin();
        StringBuilder sb = new StringBuilder();
        sb.append("level:"+level).append(" token=" + token)
                .append(", name=" + name)
                .append(", parent=" + node.parent)
        ;
//        if (origin != null) {
//            sb.append(", ObjectType=" + origin.getObjectType())
//                    .append(", ObjectName=" + origin.getObjectName())
//                    .append(", UsageAlias=" + origin.getUsageAlias())
//                    .append(", ObjectDefinition=" + origin.getObjectDefinition());
//        }
        System.out.println(sb.toString());
        ArrayList<Node> children = node.getChildren();
        if (null != children && !children.isEmpty()) {
            for (Node child : children) {
                bfs((ASTNode) child,++level);
            }
        }

        ParseDriver pd = new ParseDriver();
    }
}
