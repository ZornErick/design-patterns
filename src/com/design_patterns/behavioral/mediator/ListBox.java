package com.design_patterns.behavioral.mediator;

public class ListBox extends Widget {
    private String selection;

    public ListBox(DialogDirector director) {
        super(director);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        changed();
    }

    @Override
    public void handleMouse() {
        System.out.println("ListBox handles mouse");
    }
}
