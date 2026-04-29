package com.design_patterns.behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {
    private List<Document> documents = new ArrayList<>();

    public final void openDocument(String name) {
        if (!canOpen(name)) {
            System.out.println("Cannot open " + name);
            return;
        }
        Document document = doCreateDocument(name);
        documents.add(document);
        aboutToOpen(document);
        document.read();
    }

    protected abstract boolean canOpen(String name);

    protected abstract Document doCreateDocument(String name);

    protected void aboutToOpen(Document document) {
        System.out.println("About to open " + document.getName());
    }
}
