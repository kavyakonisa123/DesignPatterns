package com.strategy.miniduck;

public class MuteQueak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("...SILENCE...");
	}
	

}
