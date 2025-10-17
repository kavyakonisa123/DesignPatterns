package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.Cheese;
import com.factory.pizzaIngredientFactory.Clams;
import com.factory.pizzaIngredientFactory.Dough;
import com.factory.pizzaIngredientFactory.Pepporoni;
import com.factory.pizzaIngredientFactory.Sauce;
import com.factory.pizzaIngredientFactory.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Pepporoni pepporoni;
	Clams clams;
	Veggies veggies[];

	abstract void prepare();

//	{
//		System.out.println("preparing..."+ name);
//		System.out.println("Tossing dough..." + dough);
//		System.out.println("Adding sauce..."+ sauce);
//		System.out.println("Adding Toppings..");
//		for(String topping: toppings) {
//			System.out.println("Added "+ topping);
//		}

//	}
	public void bake() {
		System.out.println("bake for 20 min at 200");

	}
	public void cut() {
		System.out.println("Cutting the pizza into square pieces");

	}
	public void box() {
		System.out.println("WRAPPPING PIZZA in a offical Pizzastore Box");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




}
