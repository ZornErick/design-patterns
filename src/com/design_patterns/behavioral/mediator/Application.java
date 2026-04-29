package com.design_patterns.behavioral.mediator;

public class Application {
    public static void main(String[] args) {
        FontDialogDirector director = new FontDialogDirector();
        director.showDialog();

        director.getFontList().setSelection("Times");
        director.getOkButton().press();
    }
}
