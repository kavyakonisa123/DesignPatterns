package com.template.dataparser;

public class XMLParser extends DataParser {

    void parseData() {
        System.out.println("Parsing data as XML format");
    }

    void validateData() {
        System.out.println("Validating XML structure and tags");
    }
    
    protected void postProcessingHook() {
        System.out.println("XML parsing completed. Logging summary...");
    }
}

