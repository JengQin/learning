package com.tt.datacenter.schema.base;

public class Expression {

    public static enum ExpressionType {

    }


    private String exprString;

    public Expression(String exprString) {
        this.exprString = exprString;
    }

    public String getExprString() {
        return exprString;
    }
}
