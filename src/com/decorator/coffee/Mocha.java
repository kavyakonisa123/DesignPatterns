package com.decorator.coffee;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost() +.20;

		if(beverage.getSize() == Size.TALL) {
			cost += .10;
		}
		else if(beverage.getSize() == Size.GRANDE) {
			cost += .20;
		}
		else if(beverage.getSize() == Size.VENTI) {
			cost += .30;
		}

		return cost;	}

}
