package com.decorator.coffee;

//Component class
public abstract class Beverage {
	public enum Size {TALL, GRANDE, VENTI}
	Size size=Size.TALL;

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	String description ="Unknown Beverage";
	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
