package com.design_patterns.creational.factory_method;

import com.design_patterns.creational.factory_method.document.Document;

public abstract class Editor {
    public abstract Document createDocument();

    public void openDocument() {
        Document document = this.createDocument();
        document.open();
    }
}
