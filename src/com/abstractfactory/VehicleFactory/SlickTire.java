package com.abstractfactory.VehicleFactory;

public class SlickTire implements Tire {
    @Override
	public String tread() { return "SlickTire: maximum grip on track"; }
}