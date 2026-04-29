package com.design_patterns.behavioral.chain_of_responsibility;

public class Widget extends HelpHandler {
    public Widget(HelpHandler parent, String topic) {
        super(parent, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Widget help: " + topic);
        } else {
            super.handleHelp();
        }
    }
}
