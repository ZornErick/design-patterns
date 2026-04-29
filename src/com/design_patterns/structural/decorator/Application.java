package com.design_patterns.structural.decorator;

public class Application {
    public static void main(String[] args) {
        VisualComponent component = new BorderDecorator(new ScrollDecorator(new TextView()), 2);

        component.draw();
        component.resize();
    }
}
