package com.facade.hometheatre;

public class StreamingPlayer {
	
	 String description;
	 Amplifier amplifier;
	 String movie;
	 
	 public StreamingPlayer(String description, Amplifier amplifier) {
	  this.description = description;
	  this.amplifier = amplifier;
	 }
	 
	 public void on() {
	  System.out.println(description + " on");
	 }
	 
	 public void off() {
	  System.out.println(description + " off");
	 }

	 public void pause() {
		  System.out.println(description + " paused \"" + movie + "\"");
		 }
	      
	 public void play(String movie) {
	  this.movie = movie;
	  System.out.println(description + " playing \"" + movie + "\"");
	 }


	 public void stop() {
	  System.out.println(description + " stopped \"" + movie + "\"");
	 }
	 

	 public void setTwoChannelAudio() {
	  System.out.println(description + " set two channel audio");
	 }
	 
	 public void setSurroundAudio() {
	  System.out.println(description + " set surround audio");
	 }
	 
	 public String toString() {
	  return description;
	 }

}
