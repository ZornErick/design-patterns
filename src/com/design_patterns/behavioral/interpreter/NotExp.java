package com.design_patterns.behavioral.interpreter;

public class NotExp implements BooleanExp {
    private BooleanExp operand;

    public NotExp(BooleanExp operand) {
        this.operand = operand;
    }

    @Override
    public boolean evaluate(Context context) {
        return !operand.evaluate(context);
    }
}
