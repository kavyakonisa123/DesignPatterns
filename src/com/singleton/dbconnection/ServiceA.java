package com.singleton.dbconnection;

public class ServiceA {

		    public void doSomething() {
	        DBConnection connection = DBConnection.INSTANCE;
	        connection.executeQuery("SELECT * FROM users;");
	    }

}
