package com.factory.pizzafactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore= new NyStylePizza();
		PizzaStore chicagoStore= new ChicagoStylePizza();
		
		Pizza pizza= nyStore.orderPizza("cheese");
		System.out.println("Order For Etan is ready --" + pizza.getName());
		System.out.println(" ");
		pizza= chicagoStore.orderPizza("veggie");
		System.out.println("Order For Joel is ready --" + pizza.getName());
		
		
		

	}

}
