package com.design_patterns.behavioral.template_method;

public class TextDocument extends Document {
    public TextDocument(String name) {
        super(name);
    }

    @Override
    public void read() {
        System.out.println("Reading text content from " + getName());
    }

    @Override
    public boolean canOpen() {
        return getName().endsWith(".txt");
    }
}
