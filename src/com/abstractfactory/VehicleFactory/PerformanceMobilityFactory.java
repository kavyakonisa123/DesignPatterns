package com.abstractfactory.VehicleFactory;

public class PerformanceMobilityFactory implements MobilityFactory {
	@Override
    public Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case CAR:   return new SportsCar();
            case BIKE:  return new Bike();           // think carbon road bike
            case TRUCK: return new Truck();          // tuned suspension in real life
            default:    throw new IllegalArgumentException("Unknown type");
        }
    }
    @Override 
    public Engine createEngine()
    { 
    	return new SportEngine();
    }
    @Override 
    public Tire createTire()  
    { 
    	return new SlickTire(); 
    }
}
