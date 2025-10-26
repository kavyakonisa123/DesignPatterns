package com.template.dataparser;

public class CSVParser extends DataParser {

    void parseData() {
        System.out.println("Parsing data as CSV format");
    }

    void validateData() {
        System.out.println("Validating CSV columns and records");
    }
    // Override hook to skip validation
    protected boolean shouldValidate() {
        return false;
    }

    protected void postProcessingHook() {
        System.out.println("CSV parsing completed. Logging summary...");
    }
}

