package test.demo.custom;

import test.demo.parser.ArrayInitBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

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
