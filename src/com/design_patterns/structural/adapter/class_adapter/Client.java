package com.design_patterns.structural.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        ReportProvider reportProvider = new XMLToJSONAdapter();

        System.out.println("Class Adapter");
        System.out.println(reportProvider.generateReport());
    }
}
