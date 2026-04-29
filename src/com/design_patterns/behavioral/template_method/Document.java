package com.design_patterns.behavioral.template_method;

public abstract class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void read();

    public abstract boolean canOpen();
}
