package com.abstractfactory.VehicleFactory;

public class ElectricEngine implements Engine {
    public void start() { System.out.println("Electric engine hums to life."); }
    public String spec() { return "ElectricEngine: high efficiency, instant torque"; }
}
