package com.factory.VehicleFactory;

public class EcoVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
			return new ElectricCar();
		}
        if ("bike".equalsIgnoreCase(type))
		 {
			return new Bike();   // already eco
		}
        if ("truck".equalsIgnoreCase(type))
		 {
			return new Truck();  // imagine hybrid here
		}
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}