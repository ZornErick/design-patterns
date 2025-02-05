package com.design_patterns.structural.bridge;

public class XWindowImp implements WindowImp {
    @Override
    public void devDrawText() {
        System.out.println("Drawing text on X");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Drawing line on X");
    }
}
