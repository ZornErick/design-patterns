package com.design_patterns.behavioral.command;

public class OpenCommand implements Command {
    private Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
