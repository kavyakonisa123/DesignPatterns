package com.abstractfactory.VehicleFactory;

public class OffroadEngine implements Engine {
    public void start() { System.out.println("Offroad engine grunts with torque."); }
    public String spec() { return "OffroadEngine: low-end torque, ruggedized"; }
}