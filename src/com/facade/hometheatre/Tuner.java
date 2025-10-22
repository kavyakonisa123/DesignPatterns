package com.facade.hometheatre;

public class Tuner {
	Amplifier amplifier;
	String description;

	public Tuner(Amplifier amplifier, String description) {
		this.amplifier = amplifier;
		this.description = description;
	}

	public void on() {
		System.out.println(description + "Turn On Tuner");
	}

	public void off() {
		System.out.println(description + "Turn Off Tuner");
	}

	public void setFrequency(int frequency) {
		System.out.println(description + " setting frequency to " + frequency);
	}

	public void setAm() {
		System.out.println(description + " in Am mode");
	}

	public void setFm() {
		System.out.println(description + " in Fm mode");
	}

	@Override
	public String toString() {
		return "Tuner [Description=" + description + "]";
	}

}
