package hellotest;

import hello.HelloLexer;
import hello.HelloParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class HelloTest {

    public static void main(String[] args) {
        String[] testStr={
                "Hello world",
                "hello world",
                "hi world"
        };
        for(String s : testStr){
            System.out.println("Input: " + s);
            run(s);
        }
    }

    public static void run(String line) {
        ANTLRInputStream input = new ANTLRInputStream(line);
//        new ANTLRStringStream();
        HelloLexer lexer = new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HelloParser parser = new HelloParser(tokens);

        parser.helloRule(); //调用规则


    }
}
