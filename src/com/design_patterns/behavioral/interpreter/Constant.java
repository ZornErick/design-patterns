package com.design_patterns.behavioral.interpreter;

public class Constant implements BooleanExp {
    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(Context context) {
        return value;
    }
}
