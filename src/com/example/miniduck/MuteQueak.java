package com.example.miniduck;

public class MuteQueak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("...SILENCE...");
	}
	

}
