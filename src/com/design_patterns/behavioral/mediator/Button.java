package com.design_patterns.behavioral.mediator;

public class Button extends Widget {
    private boolean enabled = true;

    public Button(DialogDirector director) {
        super(director);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Button enabled: " + enabled);
    }

    public void press() {
        if (enabled) {
            changed();
        }
    }

    @Override
    public void handleMouse() {
        System.out.println("Button handles mouse");
    }
}
