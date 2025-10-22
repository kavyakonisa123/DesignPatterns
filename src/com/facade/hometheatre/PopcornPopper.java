package com.facade.hometheatre;

public class PopcornPopper {
	public static final int OFF = 0;
	public static final int ON = 1;
	public static final int POP = 2;
	int status;
	
	public void on() {
		status=1;
		System.out.println("Turn On Popocorn Machine");
		}
	
	public void off() {
		status=0;
		System.out.println("Turn Off Popocorn Machine");
	}
	public void pop() {
		if(status==1) {
		status=2;
		System.out.println("started Popping the  popcorn");}
		else {
			System.out.println("First Turn on the  popcorn machine");}

		}

	@Override
	public String toString() {
		return "PopcornPopper [status=" + status + "]";
	}

	

}
