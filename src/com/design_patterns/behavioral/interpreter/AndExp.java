package com.design_patterns.behavioral.interpreter;

public class AndExp implements BooleanExp {
    private BooleanExp left;
    private BooleanExp right;

    public AndExp(BooleanExp left, BooleanExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate(Context context) {
        return left.evaluate(context) && right.evaluate(context);
    }
}
