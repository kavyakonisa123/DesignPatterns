package com.template.barista;

public abstract class CaffineBeverage {
	public void prepareRecipie() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantscondiments()) {
			addCondiments();
		}
	}
	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling the water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring in Cup");

	}
	boolean customerWantscondiments() {
		return true;
	}

}
