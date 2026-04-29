package com.design_patterns.behavioral.memento;

public class Memento {
    private final String state;

    Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}
