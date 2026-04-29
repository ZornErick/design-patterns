package com.design_patterns.behavioral.mediator;

public abstract class Widget {
    protected DialogDirector director;

    public Widget(DialogDirector director) {
        this.director = director;
    }

    public void changed() {
        director.widgetChanged(this);
    }

    public abstract void handleMouse();
}
