package com.design_patterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<Memento> mementos = new ArrayDeque<>();

    public void push(Memento memento) {
        mementos.push(memento);
    }

    public Memento pop() {
        return mementos.pop();
    }

    public boolean isEmpty() {
        return mementos.isEmpty();
    }
}
