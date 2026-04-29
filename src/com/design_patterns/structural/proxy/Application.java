package com.design_patterns.structural.proxy;

public class Application {
    public static void main(String[] args) {
        Graphic image = new ImageProxy("photo.png", 1000);

        System.out.println("Extent (no load): " + image.getExtent());
        image.draw();
        image.draw();
    }
}
