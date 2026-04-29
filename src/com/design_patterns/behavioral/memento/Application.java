package com.design_patterns.behavioral.memento;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.type("Hello");
        history.push(editor.createMemento());

        editor.type(", world");
        history.push(editor.createMemento());

        editor.type("!");
        System.out.println("Current: " + editor.getContent());

        editor.setMemento(history.pop());
        System.out.println("After undo: " + editor.getContent());

        editor.setMemento(history.pop());
        System.out.println("After undo: " + editor.getContent());
    }
}
