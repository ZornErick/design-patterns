package com.design_patterns.behavioral.iterator;

public interface Iterator<T> {
    void first();

    void next();

    boolean isDone();

    T currentItem();
}
