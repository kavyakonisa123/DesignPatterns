package com.abstractfactory.VehicleFactory;

public class OffroadEngine implements Engine {
    @Override
	public void start() { System.out.println("Offroad engine grunts with torque."); }
    @Override
	public String spec() { return "OffroadEngine: low-end torque, ruggedized"; }
}