package com.design_patterns.structural.adapter.object_adapter;

public class XMLToJSONAdapter implements ReportProvider {
    private XMLReport xmlReport;

    public XMLToJSONAdapter(XMLReport xmlReport) {
        this.xmlReport = xmlReport;
    }

    @Override
    public String generateReport() {
        String report = xmlReport.generateReport();

        return convertXMLToJSON(report);
    }

    private String convertXMLToJSON(String xml) {
        return "JSON from: " + xml;
    }
}
