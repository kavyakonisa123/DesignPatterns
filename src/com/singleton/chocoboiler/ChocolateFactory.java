package com.singleton.chocoboiler;

public class ChocolateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateBoiler chocolateBoiler =  ChocolateBoiler.getInstance();
		ChocolateBoiler chocolateBoiler2 =  ChocolateBoiler.getInstance();

		System.out.println(chocolateBoiler);
		System.out.println(chocolateBoiler2);

		chocolateBoiler.fill();
		chocolateBoiler.boil();

		chocolateBoiler.drain();
		System.out.println("============================");
		System.out.println("Using ENUM");

		
		ChocolateInstance boiler1= ChocolateInstance.UNIQUE_INSTANCE;
		ChocolateInstance boiler2= ChocolateInstance.UNIQUE_INSTANCE;
		System.out.println(boiler1);
		System.out.println(boiler2);
		
		boiler1.fill();
		boiler2.fill();
		boiler1.boil();
		boiler2.boil();
		boiler1.drain();
		
		boiler2.drain();
		

		
		
		
		
	}

}
