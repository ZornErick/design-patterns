package com.design_patterns.creational.factory_method;

import com.design_patterns.creational.factory_method.document.Document;
import com.design_patterns.creational.factory_method.document.YourDocument;

public class YourDocumentEditor extends Editor {
    @Override
    public Document createDocument() {
        return new YourDocument();
    }
}
