package com.design_patterns.behavioral.chain_of_responsibility;

public class Application extends HelpHandler {
    public Application(String topic) {
        super(null, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Application help: " + topic);
        }
    }

    public static void main(String[] args) {
        Application app = new Application("General application help");
        Dialog dialog = new Dialog(app, null);
        Widget widget = new Widget(dialog, null);

        widget.handleHelp();

        Widget widgetWithHelp = new Widget(dialog, "Print button");
        widgetWithHelp.handleHelp();
    }
}
