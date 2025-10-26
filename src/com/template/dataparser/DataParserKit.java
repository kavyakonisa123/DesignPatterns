package com.template.dataparser;

public class DataParserKit {
		    public static void main(String[] args) {
	        DataParser csvParser = new CSVParser();
	        csvParser.processFile("data.csv");

	        System.out.println("\n----------------\n");

	        DataParser xmlParser = new XMLParser();
	        xmlParser.processFile("data.xml");

	        System.out.println("\n----------------\n");

	        DataParser jsonParser = new JsonParser();
	        jsonParser.processFile("data.json");
	    }
	}

