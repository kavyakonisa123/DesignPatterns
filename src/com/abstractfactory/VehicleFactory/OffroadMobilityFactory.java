package com.abstractfactory.VehicleFactory;

public class OffroadMobilityFactory implements MobilityFactory {
	@Override
    public Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case CAR:   return new Car();
            case BIKE:  return new MountainBike();
            case TRUCK: return new Truck();
            default:    throw new IllegalArgumentException("Unknown type");
        }
    }
    @Override
    public Engine createEngine()
    {
    	return new OffroadEngine();
    }
    @Override
    public Tire   createTire()
    {
    	return new KnobbyTire();
    }
}
