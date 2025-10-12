package com.command.homeautomation;

public class Light {
	String location;
	int status;
	public static final int ON = 1;
	public static final int OFF = 0;

	public Light(String location) {
		this.location = location;
		status = OFF;

	}

	public void on() {
		status = ON;
		System.out.println("Light is ON at "+location);
	}

	public void off() {
		status = OFF;
		System.out.println("Light is OFF at "+location);
	}

}
