package com.decorator.coffee;

//Decorator
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage; //composition
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}

}
