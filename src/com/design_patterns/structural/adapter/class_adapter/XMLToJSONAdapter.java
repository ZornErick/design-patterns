package com.design_patterns.structural.adapter.class_adapter;

public class XMLToJSONAdapter extends XMLReport implements ReportProvider {
    @Override
    public String generateReport() {
        String report = super.generateReport();

        return convertXMLToJSON(report);
    }

    private String convertXMLToJSON(String xml) {
        return "JSON from: " + xml;
    }
}
