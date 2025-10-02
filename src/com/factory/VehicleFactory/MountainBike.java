package com.factory.VehicleFactory;

public class MountainBike extends Bike {
    @Override 
    public void drive() 
    { 
    	System.out.println("Climbing trails on a Mountain Bike...");
    }
    @Override
    public String kind() 
    { 
    	return "MountainBike";
    }
}