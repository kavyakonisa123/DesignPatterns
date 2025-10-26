package com.template.dataparser;

public abstract class DataParser {
	
	    // Template Method
	    public final void processFile(String fileName) {
	        readData(fileName);
	        parseData();
	        if (shouldValidate()) { // Hook usage
	            validateData();
	        }
	        writeData();
	        postProcessingHook(); // Another hook
	    }

	    // Common steps
	    void readData(String fileName) {
	        System.out.println("Reading data from file: " + fileName);
	    }

	    void writeData() {
	        System.out.println("Writing data to database or output file");
	    }

	    // Steps that differ for each parser
	    abstract void parseData();
	    abstract void validateData();
	    
	    // --- Hooks ---
	    protected boolean shouldValidate() {
	        return true;  // by default, we validate
	    }

	    protected void postProcessingHook() {
	        // Default empty hook
	    }
	}

