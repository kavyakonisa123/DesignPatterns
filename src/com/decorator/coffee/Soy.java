package com.decorator.coffee;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost() +.15;
		
		if(beverage.getSize() == Size.TALL) {
			cost += .10;
		}
		else if(beverage.getSize() == Size.GRANDE) {
			cost += .20;
		}
		else if(beverage.getSize() == Size.VENTI) {
			cost += .30;
		}
		
		return cost;
	}

}