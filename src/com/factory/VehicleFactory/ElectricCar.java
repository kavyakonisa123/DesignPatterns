package com.factory.VehicleFactory;

class ElectricCar extends Car {
    @Override
    public void drive()
    {
    	System.out.println("Gliding silently in an Electric Car...");
    }
    @Override
    public String kind()
    {
    	return "ElectricCar";
    }
}