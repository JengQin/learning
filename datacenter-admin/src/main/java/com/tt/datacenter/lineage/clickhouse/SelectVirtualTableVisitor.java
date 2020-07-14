package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.lineage.union.*;
import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class SelectVirtualTableVisitor extends SqlBaseBaseVisitor<Object> {

    // 使用栈来记录AST的遍历过程，每遇到一个新的临时表就入栈，栈顶元素永远保存着当前正在解析的virtual table
    protected Deque<SelectTableNode> tableStack = new LinkedList<>();

    // 记录已经完成访问的select
    protected Map<String, SelectTableNode> visitedTable = new HashMap<>();

    // 记录当前正在解析的table的别名
    protected Deque<String> tableAliasStack = new LinkedList<>();

    protected boolean isInSelectSingle = false;  // 记录当前是否是正处于selectSingle解析阶段，只有处于selectSingle阶段才需要解析出列的依赖关系
    protected boolean isInWhere = false; // 记录当前是否正处于where子句解析阶段
    protected boolean isInWith = false; // 记录当前是否正处于with子句阶段

    // alias后缀，每调用一次就加1
    private int unionAliasSuffix = 0;
    private int unionSelectAliasSuffix = 0;
    private String unionAliasPrefix = "union_virtual_table_";
    private String unionSelectAliasPrefix = "union_select_virtual_table_";
    private String finalSelectVirtualTable = "final_select_virtual_table";

    /**
     * 获取到新的子查询别名
     * aliasedRelation
     * : relationPrimary (AS? identifier columnAliases?)?
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitAliasedRelationDefault(SqlBaseParser.AliasedRelationDefaultContext ctx) {
        SqlBaseParser.IdentifierContext identifier = ctx.identifier();
        if (null != identifier) {
            tableAliasStack.push(identifier.getText());
        }
        return super.visitAliasedRelationDefault(ctx);
    }

    /**
     * 获取到新的子查询别名
     * namedQuery
     *     : '(' query ')' AS name=identifier (columnAliases)?
     *     ;
     * @param ctx
     * @return
     */
    @Override
    public Object visitNamedQuery(SqlBaseParser.NamedQueryContext ctx) {
        SqlBaseParser.IdentifierContext identifierContext = ctx.name;
        if (null != identifierContext) {
            tableAliasStack.push(identifierContext.getText());
        }
        return super.visitNamedQuery(ctx);
    }


    /**
     * 遇到union时，需要做几件事：
     * 1.判断一下是否存在可用的alias，如果没有则生成一个新的，并且为union的每个select生成一个alias, 因为union的select子句没有alias
     * 2.创建新的VirtualTable,表示进入新的VirtualTable解析阶段
     * <p>
     * queryTerm
     * : queryPrimary                                                             #queryTermDefault
     * | queryPrimary
     * (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary
     * ( (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary )*  #setOperation //INTERSECT取交集，union取并集，EXCEPT取差集
     * ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSetOperation(SqlBaseParser.SetOperationContext ctx) {
        if (!isInWhere) {
            // 1.设置别名
            String currentAlias = tableAliasStack.poll();
            if (StringUtils.isBlank(currentAlias)) {
                currentAlias = generateUnionAlias(); // 如果当前没有可用的alias则生成一个
            }
            pushUnionSelectAlias(ctx); // 为union的每个select生成一个alias

            // 2.生成新的VirtualTable
            UnionTableNode currentTable = new UnionTableNode(SelectTableNode.TableType.UNION_RESULT, currentAlias);

            tableStack.push(currentTable); // 3.将当前VirtualTable入栈

            /** 4.访问ctx的子节点 */
            visitChildren(ctx);

            // 5.将当前VirtualTable出栈,并从它的第一个select的virtualTable设置其column信息
            SelectTableNode topTable = tableStack.pop();
            if (currentTable != topTable) {
                throw new RuntimeException("栈顶的table不是当前的union VirtualTable");
            }
            currentTable.generateColumns(); //设置column信息

            // 6.将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
            SelectTableNode parent = tableStack.peek();
            if (null == parent) {
                System.out.println("没有父节点,当前union的结果就是最终结果集");
                topTable.setFinal(true); //栈内没有table，说明当前的table是最终的结果集
            } else {
                parent.addDependencyTable(currentTable);
                currentTable.addParentTable(parent);
                // 当前VirtualTable构建完毕
                visitedTable.put(currentTable.getTableAlias(), currentTable);
            }
        }
        return null;
    }


    /**
     * 遇到select, 新建一个新的VirtualTable,表示进入新的VirtualTable解析阶段
     * 1. 如果当前没有可用的别名，则判断当前Select是否是最终的结果（tableStack是否为空），
     * 如果是，则生成新的final_select_alias，否则说明之前没有设置好alias（存在bug）
     *
     * querySpecification
     *      * : SELECT setQuantifier? selectItem (',' selectItem)*
     *      * (FROM relation (',' relation)*)?
     *      * (WHERE where=booleanExpression)?
     *      * (GROUP BY groupBy)?
     *      * (HAVING having=booleanExpression)?
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx) {
        // 不是在where子句才进行解析
        if (!isInWhere) {
            // 1.设置别名
            String currentAlias = tableAliasStack.poll();
            if (StringUtils.isBlank(currentAlias)) {
                // 如果当前没有可用的alias则生成一个
                if (tableStack.peek() == null) {
                    currentAlias = finalSelectVirtualTable;
                } else {
                    throw new RuntimeException("当前栈顶不为空，但是没有可用的alias");
                }
            }

            // 2.生成新的VirtualTable
            SelectTableNode currentTable = new SelectTableNode(SelectTableNode.TableType.SELECT_RESULT, currentAlias);

            tableStack.push(currentTable); // 3.将当前VirtualTable入栈

            /** 4.访问ctx的子节点 */
            visitChildren(ctx);

            // 5.将当前VirtualTable出栈
            SelectTableNode topTable = tableStack.pop();
            if (currentTable != topTable) {
                throw new RuntimeException("栈顶的table不是当前的VirtualTable");
            }

            // 6.将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
            SelectTableNode parent = tableStack.peek();
            if (null == parent) {
                if (!isInWith) {
                    System.out.println("没有父节点，而且也不在with子句内,当前Select的结果就是最终结果集");
                    currentTable.setFinal(true); //栈内没有table，说明当前的table是最终的结果集
                }
            } else {
                parent.addDependencyTable(currentTable);
                currentTable.addParentTable(parent);
            }
            // 当前VirtualTable构建完毕
            visitedTable.put(currentTable.getTableAlias(), currentTable);
        }

        return null;
    }


    /**
     * 遇到tableName规则，需要解析出源表
     * 1.生成源表的VirtualTable，如果当前没有可用的alias,说明from子句是“from dw.tab1”形式，而不是“from dw.tab1 as t1”,此时需要将alias设置为sourceTableName
     * 2.从parent的column中获取sourceTable的列信息
     *
     * aliasedRelation
     *     : relationPrimary (AS? identifier columnAliases?)?      # aliasedRelationDefault
     *     | sourceTable (AS? identifier)?                         # tableName // from的最终子句：源表
     *     ;
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitTableName(SqlBaseParser.TableNameContext ctx) {
        if (!isInWhere) {
            SqlBaseParser.SourceTableContext sourceTableContext = ctx.sourceTable();

            //  获取数据库名和表名
            String sourceTableName = sourceTableContext.sourceTableName().getText();
            String dbName = null;
            SqlBaseParser.DatabaseNameContext databaseNameContext = sourceTableContext.databaseName();
            if (null != databaseNameContext) {
                dbName = databaseNameContext.getText();
            }

            // 1.设置别名
            String currentAlias = null;
            if (ctx.identifier() != null) {
                currentAlias = ctx.identifier().getText();
            } else {
                // 如果当前没有设置alias,将alias设置为sourceTableName
                currentAlias = sourceTableName;
            }

            // 创建新的TableNode, 先判断是否已经存在同名的with子句，如果存在，那么这个sourceTableName不是真正的源表
            SelectTableNode currentTable = null;
            SelectTableNode selectTableNode = visitedTable.get(sourceTableName);
            if (null != selectTableNode) {
                currentTable = selectTableNode;
            } else {
                // 生成新的SourceTableNode
                currentTable = new SourceTableNode(dbName, sourceTableName, currentAlias);
            }


            // 将当前VirtualTable加入其父VirtualTable（当前栈顶的VirtualTable）
            SelectTableNode parent = tableStack.peek();
            if (null == parent) {
                throw new RuntimeException("SourceVirtualTable: '" + ctx.getText() + "'没有parent table");
            } else {
                parent.addDependencyTable(currentTable);
                currentTable.addParentTable(parent);

                // 当前VirtualTable构建完毕
                visitedTable.put(currentTable.getTableAlias(), currentTable);
            }
        }
        return null;
    }

    /**
     * 进入with子句
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitWith(SqlBaseParser.WithContext ctx) {
        // 进入with子句
        isInWith = true;
        // 访问子节点
        visitChildren(ctx);

        // 退出with子句
        isInWith = false;
        return null;
    }

    /**
     * 访问whereClause子句
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitWhereClause(SqlBaseParser.WhereClauseContext ctx) {
        // 进入where子句
        isInWhere = true;
        // 访问子节点
        visitChildren(ctx);

        // 退出where子句
        isInWhere = false;
        return null;
    }



    /**
     * 生成union select子句的别名，并压入栈
     *
     * @param ctx
     */
    private void pushUnionSelectAlias(SqlBaseParser.SetOperationContext ctx) {
        int childCount = ctx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (ctx.getChild(i) instanceof SqlBaseParser.QueryPrimaryContext) {
                String alias = generateUnionSelectAlias();
                tableAliasStack.push(alias);
            }
        }
    }

    /**
     * 生成union结果集的alias
     *
     * @return
     */
    private synchronized String generateUnionAlias() {
        return unionAliasPrefix + unionAliasSuffix++;
    }

    /**
     * 生成union的select子句的alias
     *
     * @return
     */
    private synchronized String generateUnionSelectAlias() {
        return unionSelectAliasPrefix + unionSelectAliasSuffix++;
    }

    /**
     * 获取最终结果的select结果表
     *
     * @return
     */
    protected SelectTableNode findFinalTable() {
        SelectTableNode finalTable = null;
        Set<String> keySet = visitedTable.keySet();
        for (String tableAlias : keySet) {
            SelectTableNode virtualTable = visitedTable.get(tableAlias);
            if (virtualTable.isFinal()) {
                finalTable = virtualTable;
            }
        }
        return finalTable;
    }

    /**
     * 获取构建完成的VirtualTable
     *
     * @return
     */
    public Map<String, SelectTableNode> getVisitedTable() {
        return visitedTable;
    }
}
