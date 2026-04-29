package com.design_patterns.structural.proxy;

public class Image implements Graphic {
    private String fileName;
    private int extent;

    public Image(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
        this.extent = fileName.length() * 100;
    }

    @Override
    public void draw() {
        System.out.println("Drawing image " + fileName);
    }

    @Override
    public int getExtent() {
        return extent;
    }
}
