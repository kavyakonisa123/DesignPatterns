package com.singleton.chocoboiler;

public enum ChocolateInstance {
	UNIQUE_INSTANCE;
	
	private boolean empty =true;
	private boolean boiled= false;
	
	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled= false;
			System.out.println("Filling with chocolate milk");	
		}	
		else System.out.println("Already filled with chocolate milk");	

	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("Draining the boiled chocolate milk");
			empty=true;
		}
		else System.out.println("Already drained the chocolate milk");	

	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("Boiling with chocolate milk");	
			boiled=true;
		}
		else System.out.println("already boiled with chocolate milk");	

		
	}
	
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}

}
