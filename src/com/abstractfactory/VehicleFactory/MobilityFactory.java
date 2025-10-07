package com.abstractfactory.VehicleFactory;

public interface MobilityFactory {
	Vehicle createVehicle(VehicleType type);
    Engine  createEngine();
    Tire    createTire();

}
