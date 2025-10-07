package com.abstractfactory.VehicleFactory;

class Truck implements Vehicle {
    public void drive() 
    { 
    	System.out.println("Hauling with a standard Truck..."); 
    }
    public String kind()
    { 
    	return "Truck"; 
    }
}