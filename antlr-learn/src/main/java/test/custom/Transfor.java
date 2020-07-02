package test.custom;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import test.parser.ArrayInitBaseListener;
import test.parser.ArrayInitParser;
import test.parser.ArrayInitParser.*;

import java.util.List;

public class Transfor extends ArrayInitBaseListener {

    @Override
    public void visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text.equals("{")) {
            System.out.print("[");
        } else if (text.equals("}")) {
            System.out.print("]");
        } else {
            System.out.print(text);
        }
    }
}
