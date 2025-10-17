package com.abstractfactory.VehicleFactory;

class Bike implements Vehicle {
    @Override
	public void drive()
    {
    	System.out.println("Riding a standard Bike...");
    }
    @Override
	public String kind()
    {
    	return "Bike";
    }
}