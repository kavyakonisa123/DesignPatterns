package com.abstractfactory.VehicleFactory;

public class SportEngine implements Engine {
    public void start() { System.out.println("Sport engine roars!"); }
    public String spec() { return "SportEngine: high RPM, aggressive tuning"; }
}
