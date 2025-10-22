package com.facade.hometheatre;

public class Screen {

	public static final int DOWN = 0;
	public static final int UP = 1;
	int status;
	
	public void up() {
		status=1;
		System.out.println("Screen is UP");
		}
	
	public void down() {
		status=0;
		System.out.println("Screen is DOWN");
	}

	@Override
	public String toString() {
		return "Screen [status=" + status + "]";
	}
}
