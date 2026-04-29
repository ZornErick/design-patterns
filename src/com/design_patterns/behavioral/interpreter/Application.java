package com.design_patterns.behavioral.interpreter;

public class Application {
    public static void main(String[] args) {
        Context context = new Context();
        context.assign("x", true);
        context.assign("y", false);

        BooleanExp expression = new OrExp(
                new AndExp(new VariableExp("x"), new Constant(true)),
                new NotExp(new VariableExp("y"))
        );

        System.out.println("(x AND true) OR (NOT y) = " + expression.evaluate(context));
    }
}
