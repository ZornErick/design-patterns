package com.design_patterns.structural.decorator;

public class ScrollDecorator extends Decorator {
    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollBar();
    }

    private void drawScrollBar() {
        System.out.println("Drawing scroll bar");
    }
}
