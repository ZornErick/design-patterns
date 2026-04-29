package com.design_patterns.behavioral.strategy;

public class Application {
    public static void main(String[] args) {
        Composition composition = new Composition(new SimpleCompositor(), 50);
        for (int width : new int[]{10, 20, 15, 30, 5, 25, 10}) {
            composition.insert(width);
        }
        composition.repair();

        composition.setCompositor(new TeXCompositor());
        composition.repair();

        composition.setCompositor(new ArrayCompositor(2));
        composition.repair();
    }
}
