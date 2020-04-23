package com.jeng.flink.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The RegularMatcherUtils
 *
 * @author JiaZheng
 * @create 2019 -04-09 11:06
 */
public class RegularMatcherUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegularMatcherUtils.class);

    public static final String DEFAULT_REGULAR_EXPR = "\\$\\{([\\w]+)\\}";

    /**
     * 解析SQL语句中引用的变量
     *
     * @param sqlText     the sql text
     * @param regularExpr the regular expr
     * @return scala.collection.immutable.Set<java.lang.String> set
     */
    public static Set<String> parseReferencedVariable(String sqlText, String regularExpr){
        Set<String> referencedVars = new HashSet<String>();
        if (StringUtils.isBlank(regularExpr)) {
            regularExpr = DEFAULT_REGULAR_EXPR;
        }
        Pattern pattern = Pattern.compile(regularExpr);
        Matcher matcher = pattern.matcher(sqlText);
        while (matcher.find()) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                referencedVars.add(matcher.group(i));
            }
        }
        return referencedVars;
    }


    /**
     * 替换所有的引用变量
     *
     * @param sqlText     the sql text
     * @param value       the value
     * @param regularExpr the regular expr
     * @return the string
     */
    public static String replaceReferencedVariable(String sqlText, String value, String regularExpr){
        if (StringUtils.isBlank(regularExpr)) {
            regularExpr = DEFAULT_REGULAR_EXPR;
        }
       return sqlText.replaceAll(regularExpr,value);
    }
}
