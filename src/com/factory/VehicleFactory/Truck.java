package com.factory.VehicleFactory;

class Truck implements Vehicle {
    @Override
	public void drive()
    {
    	System.out.println("Hauling with a standard Truck...");
    }
    @Override
	public String kind()
    {
    	return "Truck";
    }
}