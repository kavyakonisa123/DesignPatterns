package com.facade.hometheatre;

public class TheatreLights {
	public static final int OFF = 0;
	public static final int ON = 1;
	public static final int DIM = 2;
	int status;
	
	public void on() {
		status=1;
		System.out.println("Turned On lights "+ status);
		}
	
	public void off() {
		status=0;
		System.out.println("Turned Off lights "+status);
	}
	public void dim(int number) {
		if(status==0) {
		status=2;
		System.out.println("started dimming the  lights at "+ number);}
		else {
			System.out.println("First Turn off the  lights");
			}

		}

	public String toString() {
		return "Lights [status=" + status + "]";
	}

}
