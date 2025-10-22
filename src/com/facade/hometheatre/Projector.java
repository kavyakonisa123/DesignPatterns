package com.facade.hometheatre;

public class Projector {
	StreamingPlayer player;
	String description;
	
	public Projector(StreamingPlayer player, String description) {
		this.player = player;
		this.description = description;
	}

	
	public void on() {
		System.out.println(description+ " Turn On ");
		}
	
	public void off() {
		System.out.println(description+" Turn Off ");
	}
	 public void wideScreenMode() {
		  System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
		 }

		 public void tvMode() {
		  System.out.println(description + " in tv mode (4x3 aspect ratio)");
		 }
	

	@Override
	public String toString() {
		return "Projector [Description=" + description + "]";
	}

}
