package com.design_patterns.structural.decorator;

public class BorderDecorator extends Decorator {
    private int width;

    public BorderDecorator(VisualComponent component, int width) {
        super(component);
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Drawing border with width " + width);
    }
}
