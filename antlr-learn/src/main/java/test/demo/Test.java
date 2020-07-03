package test.demo;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import test.demo.custom.Transfor;
import test.demo.parser.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = reader.readLine()) != null) {
            ANTLRInputStream inputStream = new ANTLRInputStream(line);
            ArrayInitLexer lexer = new ArrayInitLexer(inputStream);

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            ArrayInitParser parser = new ArrayInitParser(tokenStream);

            ArrayInitParser.InitContext parseTree = parser.init();

            System.out.println(parseTree.toStringTree(parser));

            Transfor transfor = new Transfor();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(transfor,parseTree);
        }
    }
}
