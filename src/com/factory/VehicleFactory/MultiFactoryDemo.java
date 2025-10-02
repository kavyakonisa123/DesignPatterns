package com.factory.VehicleFactory;

public class MultiFactoryDemo {
	public static void main(String[] args) {
        VehicleFactory factory = chooseFactory("eco"); // "eco" | "sport" | "offroad"
        Vehicle v1 = factory.createVehicle("car");
        Vehicle v2 = factory.createVehicle("bike");
        System.out.println("Created: " + v1.kind());
        v1.drive();
        System.out.println("Created: " + v2.kind());
        v2.drive();
        // Policy switch later (config change, user selection, tenant rule, etc.)
        factory = chooseFactory("sport");
        Vehicle v3 = factory.createVehicle("car");
        System.out.println("Switched policy; created: " + v3.kind());
        v3.drive();
    }
    private static VehicleFactory chooseFactory(String policy) {
        switch (policy.toLowerCase()) {
            case "eco":     return new EcoVehicleFactory();
            case "sport":   return new PerformanceVehicleFactory();
            case "offroad": return new OffroadVehicleFactory();
            default: throw new IllegalArgumentException("Unknown policy: " + policy);
        }
    }

}
