package com.abstractfactory.VehicleFactory;

public class MultiFactoryDemo {
	public static void main(String[] args) {
        MobilityFactory factory = chooseFactory("eco");  // or "sport", "offroad"
        Vehicle car   = factory.createVehicle(VehicleType.CAR);
        Engine engine = factory.createEngine();
        Tire   tire   = factory.createTire();
        System.out.println("Vehicle: " + car.kind());
        car.drive();
        engine.start();
        System.out.println("Engine:  " + engine.spec());
        System.out.println("Tire:    " + tire.tread());
        // Swap family at runtime-policy change, tenant config, feature flag:
        factory = chooseFactory("sport");
        Vehicle sportCar = factory.createVehicle(VehicleType.CAR);
        System.out.println("Switched policy → " + sportCar.kind()); // SportsCar, slicks, sport engine
        Engine sportEngine = factory.createEngine();
        Tire   sporTire   = factory.createTire();
        System.out.println("Vehicle: " + sportCar.kind());
        sportCar.drive();
        sportEngine.start();
        System.out.println("Engine:  " + sportEngine.spec());
        System.out.println("Tire:    " + sporTire.tread());
    }
    private static MobilityFactory chooseFactory(String policy) {
        switch (policy.toLowerCase()) {
            case "eco":     return new EcoMobilityFactory();
            case "sport":   return new PerformanceMobilityFactory();
            case "offroad": return new OffroadMobilityFactory();
            default: throw new IllegalArgumentException("Unknown policy: " + policy);
        }
    }

}
