// Generated from D:/software_develop/workspace/github_workspace/learning/antlr-learn/gen\Hello.g4 by ANTLR 4.8
package hello;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#helloRule}.
	 * @param ctx the parse tree
	 */
	void enterHelloRule(HelloParser.HelloRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#helloRule}.
	 * @param ctx the parse tree
	 */
	void exitHelloRule(HelloParser.HelloRuleContext ctx);
}