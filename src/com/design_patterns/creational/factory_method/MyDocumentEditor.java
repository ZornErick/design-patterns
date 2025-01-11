package com.design_patterns.creational.factory_method;

import com.design_patterns.creational.factory_method.document.Document;
import com.design_patterns.creational.factory_method.document.MyDocument;

public class MyDocumentEditor extends Editor {
    @Override
    public Document createDocument() {
        return new MyDocument();
    }
}
