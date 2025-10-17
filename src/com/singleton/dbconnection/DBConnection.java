package com.singleton.dbconnection;

public enum DBConnection {
	INSTANCE;

	private DBConnection() {
        System.out.println("Database connection created!");

	}

	public void executeQuery(String query) {
		System.out.println("Executing query: .." + query);
	}

}
