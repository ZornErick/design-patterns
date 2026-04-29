package com.design_patterns.behavioral.command;

public class MenuItem {
    private Command command;
    private String label;

    public MenuItem(String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public void click() {
        System.out.println("Menu '" + label + "' clicked");
        command.execute();
    }
}
