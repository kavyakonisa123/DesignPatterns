package com.command.homeautomation;

public class Stereo {
	String location;
	int status;
	public static final int ON = 1;
	public static final int OFF = 0;

	public Stereo(String location) {
		this.location = location;
		status = OFF;

	}

	public void on() {
		status = ON;
		System.out.println("Stereo is ON");
	}

	public void off() {
		status = OFF;
		System.out.println("Stereo is OFF");
	}

	public void setCd() {
		System.out.println("Stereo is set for CD input");
	}
	public void setRadio() {
		System.out.println("Stereo is set for Radioinput");
	}
	public void volume(int volume) {
		System.out.println("Stereo is set for volume at "+volume);
	}





}
