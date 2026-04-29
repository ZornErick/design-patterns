package com.design_patterns.behavioral.interpreter;

public class VariableExp implements BooleanExp {
    private String name;

    public VariableExp(String name) {
        this.name = name;
    }

    @Override
    public boolean evaluate(Context context) {
        return context.lookup(name);
    }
}
