package com.template.barista;

public class BeverageMaker {

	public static void main(String[] args) {
		Tea myTea = new Tea();
		System.out.println("............Ordered Tea ..........");

		myTea.prepareRecipie();
		System.out.println("Ready for Pickup");

		
		Coffee myCoffee = new Coffee();
		System.out.println("\n................Ordered Coffee ...........");
		myCoffee.prepareRecipie();
		System.out.println("Ready for Pickup");


	}

}
