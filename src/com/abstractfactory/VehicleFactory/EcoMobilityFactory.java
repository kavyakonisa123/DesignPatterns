package com.abstractfactory.VehicleFactory;

public class EcoMobilityFactory implements MobilityFactory {
	@Override
    public Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case CAR:   return new ElectricCar();
            case BIKE:  return new Bike();           // already eco
            case TRUCK: return new Truck();          // imagine hybrid in real life
            default:    throw new IllegalArgumentException("Unknown type");
        }
    }
    @Override
    public Engine createEngine()
    {
    	return new ElectricEngine();
    }
    @Override
    public Tire   createTire()
    {
    	return new RoadTire();
    }
}