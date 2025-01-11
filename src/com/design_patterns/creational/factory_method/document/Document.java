package com.design_patterns.creational.factory_method.document;

public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
