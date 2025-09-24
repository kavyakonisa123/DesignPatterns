package com.decorator.coffee;

import com.decorator.coffee.Beverage.Size;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {
double cost = beverage.cost() +.10;
		
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