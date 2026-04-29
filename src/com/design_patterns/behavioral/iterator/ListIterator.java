package com.design_patterns.behavioral.iterator;

public class ListIterator<T> implements Iterator<T> {
    private AbstractList<T> list;
    private int current;

    public ListIterator(AbstractList<T> list) {
        this.list = list;
        this.current = 0;
    }

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current++;
    }

    @Override
    public boolean isDone() {
        return current >= list.count();
    }

    @Override
    public T currentItem() {
        if (isDone()) {
            throw new IllegalStateException("Iterator out of bounds");
        }
        return list.get(current);
    }
}
