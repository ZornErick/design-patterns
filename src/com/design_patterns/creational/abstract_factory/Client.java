package com.design_patterns.creational.abstract_factory;

public class Client {
    private final ScrollBar scrollBar;
    private final Window window;

    public Client(WidgetFactory factory) {
        this.scrollBar = factory.createScrollBar();
        this.window = factory.createWindow();
    }

    public void paint() {
        this.scrollBar.paint();
        this.window.paint();
    }
}
