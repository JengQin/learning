package test.calculator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import test.calculator.custom.EvalVisitor;
import test.calculator.parser.CalculatorBaseVisitor;
import test.calculator.parser.CalculatorLexer;
import test.calculator.parser.CalculatorParser;
import test.calculator.parser.CalculatorVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {


    private static void loop() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = reader.readLine()) != null) {
            ANTLRInputStream inputStream = new ANTLRInputStream(line);
            CalculatorLexer lexer = new CalculatorLexer(inputStream);

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            CalculatorParser parser = new CalculatorParser(tokenStream);

            CalculatorParser.ProgContext prog = parser.prog();
            System.out.println(prog.toStringTree(parser));

            CalculatorVisitor<Object> visitor = new CalculatorBaseVisitor<>();


        }
    }


    public static void testCalculate() {
        String line = "2020\n" +
                "a=30000\n" +
                "b=16\n" +
                "a*b\n"+
                "c=a*b\n"+
                "a*8/100*12\n"+
                "!clear\n"+
                "a=40000\n"+
                "b=17\n"+
                "a*b\n"+
                "c=a*b\n"+
                "a*8/100*12\n"
                ;

        ANTLRInputStream inputStream = new ANTLRInputStream(line);
        CalculatorLexer lexer = new CalculatorLexer(inputStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokenStream);

        CalculatorParser.ProgContext prog = parser.prog();

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(prog);

    }

    public static void main(String[] args) throws IOException {
//        loop();
        testCalculate();
    }

}
