package com.command.homeautomation;

public class Television {
	String location;
	int status;
	public static final int ON = 1;
	public static final int OFF = 0;

	public Television(String location) {
		this.location = location;
		status = OFF;

	}

	public void on() {
		status = ON;
		System.out.println("Television is ON at "+location);
	}

	public void off() {
		status = OFF;
		System.out.println("Television is OFF at "+location);
	}

}


