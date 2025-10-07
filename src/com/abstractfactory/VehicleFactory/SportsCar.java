package com.abstractfactory.VehicleFactory;

public class SportsCar extends Car {
    @Override
    public void drive() 
    { 
    	System.out.println("Roaring in a Sports Car!"); 
    }
    @Override
    public String kind() 
    { 
    	return "SportsCar"; 
    }
}