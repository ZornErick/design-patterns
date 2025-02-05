package com.design_patterns.structural.bridge;

public class IconWindow implements Window {
    protected WindowImp windowImp;

    public IconWindow(WindowImp windowImp) {
        this.windowImp = windowImp;
    }

    public void drawBorder() {
        System.out.println("Drawing border");
    }

    @Override
    public void drawText() {
        windowImp.devDrawText();
    }

    @Override
    public void drawRect() {
        System.out.println("Drawing rect");
    }

    public void setWindowImp(WindowImp windowImp) {
        this.windowImp = windowImp;
    }
}
