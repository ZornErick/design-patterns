package com.design_patterns.behavioral.iterator;

import java.util.ArrayList;

public class List<T> implements AbstractList<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void append(T item) {
        items.add(item);
    }

    @Override
    public int count() {
        return items.size();
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(this);
    }
}
