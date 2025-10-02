package com.factory.pizzafactory;

import java.util.*;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings= new ArrayList<String>();
	public void prepare() {
		System.out.println("preparing..."+ name);
		System.out.println("Tossing dough..." + dough);
		System.out.println("Adding sauce..."+ sauce);
		System.out.println("Adding Toppings..");
		for(String topping: toppings) {
			System.out.println("Added "+ topping);
		}
		
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
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
