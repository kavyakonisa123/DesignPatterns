package com.strategy.miniduck;

public class MiniDucksimulator {

	public static void main(String[] args) {
		Duck mallard= new MallardDuck();
		
		mallard.performQuack();
		mallard.performFly();
		
		
		Duck model= new ModelDuck();
		model.performFly();
		model.setFlybehavior(new FlyrocketPowered());
		model.performFly();
		model.performQuack();
		
	}

}
