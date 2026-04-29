package com.design_patterns.structural.facade;

public class Application {
    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        String result = compiler.compile("class A {}");

        System.out.println("Result: " + result);
    }
}
