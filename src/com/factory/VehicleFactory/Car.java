package com.factory.VehicleFactory;

public class Car implements Vehicle {
	
	    public void drive()
	    { 
	    	System.out.println("Driving a standard Car..."); 
	    }
	    public String kind() 
	    { 
	    	return "Car";
	    }
}
