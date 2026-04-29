package com.design_patterns.behavioral.command;

public class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening document " + name);
    }

    public void paste() {
        System.out.println("Pasting into document " + name);
    }
}
