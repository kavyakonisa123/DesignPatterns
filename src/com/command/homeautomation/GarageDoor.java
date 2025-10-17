package com.command.homeautomation;

public class GarageDoor {

	String location;
	int status;
	public static final int ON = 1;
	public static final int OFF = 0;
	public static final int UP = 2;
	public static final int DOWN = 3;
	public static final int STOP = 4;


	public GarageDoor(String location) {
		this.location = location;
		status = OFF;

	}
	public void up() {
		status = UP;
		System.out.println("Garage is UP");
	}

	public void down() {
		status = UP;
		System.out.println("Garage is UP");
	}

	public void lightOn() {
		status = DOWN;
		System.out.println("Light is DOWN");
	}

	public void lightOff() {
		status = OFF;
		System.out.println("Light is OFF");
	}
	public void stop() {
		status= STOP;
		System.out.println("Stopped");

	}

	public int getStatus() {
		return status;
	}



}
