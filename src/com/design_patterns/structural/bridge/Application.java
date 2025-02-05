package com.design_patterns.structural.bridge;

public class Application {
    public static void main(String[] args) {
        WindowImp xWindow = new XWindowImp();
        WindowImp pmWindow = new PMWindowImp();

        IconWindow iconWindow = new IconWindow(xWindow);
        TransientWindow transientWindow = new TransientWindow(xWindow);

        iconWindow.drawText();
        iconWindow.drawRect();

        transientWindow.drawText();
        transientWindow.drawRect();

        System.out.println("-".repeat(26));

        iconWindow.setWindowImp(pmWindow);
        transientWindow.setWindowImp(pmWindow);

        iconWindow.drawText();
        iconWindow.drawRect();

        transientWindow.drawText();
        transientWindow.drawRect();
    }
}
