package com.singleton.chocoboiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler unique_instance;

	private ChocolateBoiler() {
		empty=true;
		boiled=false;

	}

	public static ChocolateBoiler getInstance() {
		if(unique_instance == null) {
			unique_instance= new ChocolateBoiler();
		}
		return unique_instance;
	}

	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled= false;
			System.out.println("Filling with chocolate milk");
		} else {
			System.out.println("Already filled with chocolate milk");
		}

	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("Draining the boiled chocolate milk");
			empty=true;
		} else {
			System.out.println("Already drained the chocolate milk");
		}

	}

	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			System.out.println("Boiling with chocolate milk");
			boiled=true;
		} else {
			System.out.println("already boiled with chocolate milk");
		}


	}


	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
