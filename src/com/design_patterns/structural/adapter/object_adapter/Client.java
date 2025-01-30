package com.design_patterns.structural.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        ReportProvider reportProvider = new XMLToJSONAdapter(new XMLReport());

        System.out.println("Object Adapter");
        System.out.println(reportProvider.generateReport());
    }
}
