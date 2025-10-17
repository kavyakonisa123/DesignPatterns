package com.decorator.coffee;

//Decorator
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage; //composition
	@Override
	public abstract String getDescription();

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

}
