package com.design_patterns.structural.decorator;

public class TextView implements VisualComponent {
    @Override
    public void draw() {
        System.out.println("Drawing text view");
    }

    @Override
    public void resize() {
        System.out.println("Resizing text view");
    }
}
