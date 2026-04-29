package com.design_patterns.behavioral.template_method;

public class TextApplication extends Application {
    @Override
    protected boolean canOpen(String name) {
        return name.endsWith(".txt");
    }

    @Override
    protected Document doCreateDocument(String name) {
        return new TextDocument(name);
    }

    public static void main(String[] args) {
        TextApplication app = new TextApplication();
        app.openDocument("notes.txt");
        app.openDocument("image.png");
    }
}
