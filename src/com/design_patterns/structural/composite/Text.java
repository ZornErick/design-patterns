package com.design_patterns.structural.composite;

public class Text implements Graphic {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("Drawing text: " + content);
    }
}
