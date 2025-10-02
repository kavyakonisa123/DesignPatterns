package com.factory.VehicleFactory;

public class PerformanceVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type))   return new SportsCar();
        if ("bike".equalsIgnoreCase(type))  return new Bike();   // imagine carbon road bike
        if ("truck".equalsIgnoreCase(type)) return new Truck();  // tuned in real life
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}