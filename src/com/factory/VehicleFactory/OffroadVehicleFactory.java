package com.factory.VehicleFactory;

public class OffroadVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type))
		 {
			return new Car();         // think AWD, lifted
		}
        if ("bike".equalsIgnoreCase(type)) {
			return new MountainBike();
		}
        if ("truck".equalsIgnoreCase(type)) {
			return new Truck();
		}
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
