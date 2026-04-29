package com.design_patterns.behavioral.chain_of_responsibility;

public class Dialog extends HelpHandler {
    public Dialog(HelpHandler parent, String topic) {
        super(parent, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Dialog help: " + topic);
        } else {
            super.handleHelp();
        }
    }
}
