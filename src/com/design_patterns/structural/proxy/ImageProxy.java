package com.design_patterns.structural.proxy;

public class ImageProxy implements Graphic {
    private String fileName;
    private Image image;
    private int cachedExtent;

    public ImageProxy(String fileName, int cachedExtent) {
        this.fileName = fileName;
        this.cachedExtent = cachedExtent;
    }

    private Image getImage() {
        if (image == null) {
            image = new Image(fileName);
        }
        return image;
    }

    @Override
    public void draw() {
        getImage().draw();
    }

    @Override
    public int getExtent() {
        if (image != null) {
            return image.getExtent();
        }
        return cachedExtent;
    }
}
