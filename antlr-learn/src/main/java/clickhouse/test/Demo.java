package clickhouse.test;

import clickhouse.parser.ClickHouseLexer;
import clickhouse.parser.ClickHouseParser;
import clickhouse.parser.ClickHouseParserBaseVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;

public class Demo {


    public static void parseTest() {
        String sql = "insert into dw.t3 select t1.id,t2.name from dw.t1 join dw.t2 on t1.id=t2.id";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        ClickHouseLexer lexer = new ClickHouseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClickHouseParser clickhouseParser = new ClickHouseParser(tokens);
        ParseTree tree = clickhouseParser.parse();

        String[] tokenNames = ClickHouseParser.tokenNames;
        Vocabulary literalNames = ClickHouseParser.VOCABULARY;
        tokens.fill();
        System.out.println(tokens.size()+"," + tokens.getTokens().size());
        for (Token token : tokens.getTokens()) {
            int type = token.getType();
            System.out.println(token+">>> "+tokenNames[type]+" >>>> "+literalNames.getSymbolicName(type)+" >>> "+type);
        }
    }

    public static void iterParseTree() {
        String sql = "insert into dw.t3 select t1.id,t2.name from dw.t1 join dw.t2 on t1.id=t2.id";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        ClickHouseLexer lexer = new ClickHouseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClickHouseParser clickhouseParser = new ClickHouseParser(tokens);
        ClickHouseParser.ParseContext parseTree = clickhouseParser.parse();

        ClickHouseParserBaseVisitor<Object> visitor = new ClickHouseParserBaseVisitor<>();
        visitor.visit(parseTree);
    }

    public static void main(String[] args) {


    }
}
