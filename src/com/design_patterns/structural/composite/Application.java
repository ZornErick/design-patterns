package com.design_patterns.structural.composite;

public class Application {
    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.add(new Line());
        picture.add(new Rectangle());
        picture.add(new Text("Hello"));

        Picture nested = new Picture();
        nested.add(new Line());
        nested.add(new Text("Inside nested"));

        picture.add(nested);

        picture.draw();
    }
}
