package com.example.miniduck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float even Decoy");
	}
	
	public void setFlybehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
	
}
