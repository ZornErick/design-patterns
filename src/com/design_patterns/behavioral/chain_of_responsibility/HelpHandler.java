package com.design_patterns.behavioral.chain_of_responsibility;

public abstract class HelpHandler {
    protected HelpHandler successor;
    protected String topic;

    public HelpHandler(HelpHandler successor, String topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public boolean hasHelp() {
        return topic != null;
    }

    public void handleHelp() {
        if (successor != null) {
            successor.handleHelp();
        }
    }
}
