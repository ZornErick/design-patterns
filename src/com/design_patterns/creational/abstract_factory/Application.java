package com.design_patterns.creational.abstract_factory;

import com.design_patterns.creational.abstract_factory.motif.MotifWidgetFactory;
import com.design_patterns.creational.abstract_factory.pm.PMWidgetFactory;

public class Application {
    public static void main(String[] args) {
        Client client = configureClient();
        client.paint();
    }

    private static Client configureClient() {
        WidgetFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MotifWidgetFactory();
        } else {
            factory = new PMWidgetFactory();
        }

        return new Client(factory);
    }
}
