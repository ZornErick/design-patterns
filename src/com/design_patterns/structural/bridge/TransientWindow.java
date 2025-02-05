package com.design_patterns.structural.bridge;

public class TransientWindow implements Window {
    protected WindowImp windowImp;

    public TransientWindow(WindowImp windowImp) {
        this.windowImp = windowImp;
    }

    public void drawCloseBox() {
        System.out.println("Drawing close box");
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
