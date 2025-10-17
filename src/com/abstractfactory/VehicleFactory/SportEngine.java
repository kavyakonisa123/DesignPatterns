package com.abstractfactory.VehicleFactory;

public class SportEngine implements Engine {
    @Override
	public void start() { System.out.println("Sport engine roars!"); }
    @Override
	public String spec() { return "SportEngine: high RPM, aggressive tuning"; }
}
