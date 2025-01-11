package com.design_patterns.creational.factory_method;

import com.design_patterns.creational.factory_method.document.Document;

public class Application {
    private static Editor editor;

    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows 11")) {
            Application.editor = new MyDocumentEditor();
        } else {
            Application.editor = new YourDocumentEditor();
        }

        Document document = editor.createDocument();
        document.open();
        document.close();
        document.save();
        document.revert();
    }
}
