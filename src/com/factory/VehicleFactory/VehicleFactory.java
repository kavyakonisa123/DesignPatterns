package com.factory.VehicleFactory;

public interface VehicleFactory {
	Vehicle createVehicle(String type); // "car" | "bike" | "truck"
}
