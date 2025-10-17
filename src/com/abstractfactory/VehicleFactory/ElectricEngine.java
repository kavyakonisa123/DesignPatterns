package com.abstractfactory.VehicleFactory;

public class ElectricEngine implements Engine {
    @Override
	public void start() { System.out.println("Electric engine hums to life."); }
    @Override
	public String spec() { return "ElectricEngine: high efficiency, instant torque"; }
}
