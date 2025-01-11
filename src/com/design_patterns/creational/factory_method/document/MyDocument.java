package com.design_patterns.creational.factory_method.document;

public class MyDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening MyDocument");
    }

    @Override
    public void close() {
        System.out.println("Closing MyDocument");
    }

    @Override
    public void save() {
        System.out.println("Saving MyDocument");
    }

    @Override
    public void revert() {
        System.out.println("Reverting MyDocument");
    }
}
