package com.strategy.miniduck;

public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("I can't Fly");
	}

}
