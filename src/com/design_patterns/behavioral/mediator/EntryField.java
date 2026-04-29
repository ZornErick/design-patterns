package com.design_patterns.behavioral.mediator;

public class EntryField extends Widget {
    private String text = "";

    public EntryField(DialogDirector director) {
        super(director);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("EntryField text set to: " + text);
    }

    @Override
    public void handleMouse() {
        System.out.println("EntryField handles mouse");
    }
}
