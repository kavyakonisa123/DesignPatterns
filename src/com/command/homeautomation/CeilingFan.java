package com.command.homeautomation;

public class CeilingFan {
	String location;
	int speed;
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;

	}
	public void high() {
		speed = HIGH;
		System.out.println("Turned up high at "+location);
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println("Turned up medium at "+location);
	}

	public void low() {
		speed = LOW;
		System.out.println("Turned up low at "+location);
	}

	public void off() {
		speed = OFF;
		System.out.println("Turned OFF at "+location);
	}
	public int getSpeed() {
		return speed;

	}


}
