package com.design_patterns.behavioral.iterator;

public interface AbstractList<T> {
    Iterator<T> createIterator();

    int count();

    T get(int index);
}
