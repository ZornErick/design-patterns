package com.design_patterns.behavioral.memento;

public class Editor {
    private String content = "";

    public void type(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public Memento createMemento() {
        return new Memento(content);
    }

    public void setMemento(Memento memento) {
        this.content = memento.getState();
    }
}
