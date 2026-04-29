package com.design_patterns.behavioral.command;

public class Application {
    public static void main(String[] args) {
        Document document = new Document("readme.md");

        MenuItem open = new MenuItem("Open", new OpenCommand(document));
        MenuItem paste = new MenuItem("Paste", new PasteCommand(document));

        open.click();
        paste.click();

        MacroCommand macro = new MacroCommand();
        macro.add(new OpenCommand(document));
        macro.add(new PasteCommand(document));

        new MenuItem("Open and Paste", macro).click();
    }
}
