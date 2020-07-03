package test.calculator.custom;

import test.calculator.parser.CalculatorBaseVisitor;
import test.calculator.parser.CalculatorParser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalculatorBaseVisitor<Integer> {

    private Map<String, Integer> memory = new HashMap<>();


    @Override
    public Integer visitPrintExpr(CalculatorParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(ctx.expr().getText()+" => "+value);
        return 0;
    }

    @Override
    public Integer visitAssign(CalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + "=" + value);
        return value;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Integer value1 = visit(ctx.expr(0));
        Integer value2 = visit(ctx.expr(1));

        if (ctx.op.getType() == CalculatorParser.MUL) return value1 * value2;
        else return value1 / value2;
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        Integer value1 = visit(ctx.expr(0));
        Integer value2 = visit(ctx.expr(1));

        if (ctx.op.getType() == CalculatorParser.ADD) {
            return value1 + value2;
        } else {
            return value1 - value2;
        }
    }

    @Override
    public Integer visitId(CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitClear(CalculatorParser.ClearContext ctx) {
        memory.clear();
        System.out.println("clearing...");
        return 0;
    }
}
