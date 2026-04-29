package com.design_patterns.structural.composite;

public interface Graphic {
    void draw();

    default void add(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    default void remove(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    default Graphic getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
