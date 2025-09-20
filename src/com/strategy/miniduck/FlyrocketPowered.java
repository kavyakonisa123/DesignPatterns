package com.strategy.miniduck;

public class FlyrocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying with a rocket");
	}

}
