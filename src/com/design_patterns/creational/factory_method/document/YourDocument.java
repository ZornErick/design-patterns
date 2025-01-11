package com.design_patterns.creational.factory_method.document;

public class YourDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opining YourDocument");
    }

    @Override
    public void close() {
        System.out.println("Closing YourDocument");
    }

    @Override
    public void save() {
        System.out.println("Saving YourDocument");
    }

    @Override
    public void revert() {
        System.out.println("Reverting YourDocument");
    }
}
