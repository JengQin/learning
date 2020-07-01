package mathtest;

import math.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class MathTest {

    public static void main(String[] args) {
        CodePointCharStream input = CharStreams.fromString("12*2+12\r\n");
        MathLexer lexer = new MathLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MathParser parser = new MathParser(tokens);

//        ParserRuleContext ruleContext = parser.getRuleContext();
        //        MathBaseListener listener = new MathBaseListener();
//        listener.enterEveryRule(ruleContext);

        ParseTree tree = parser.prog();
        String stringTree = tree.toStringTree(parser);
        System.out.println(stringTree);

        MathVisitor<Object> visitor = new MathBaseVisitor<>();
        Object visit = visitor.visit(tree);
        System.out.println(visit);


    }
}
