package com.abstractfactory.VehicleFactory;

public class RoadTire implements Tire {
    @Override
	public String tread() { return "RoadTire: low rolling resistance"; }
}
