package com.factory.VehicleFactory;

class Bike implements Vehicle {
    public void drive() 
    { 
    	System.out.println("Riding a standard Bike...");
    }
    public String kind() 
    { 
    	return "Bike"; 
    }
}