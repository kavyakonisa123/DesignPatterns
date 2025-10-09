package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {


	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory= ingredientFactory;
		
	}


	void prepare() {
		System.out.println("Preparibg.."+ name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		clams= ingredientFactory.createClams();
		
	}
	

}
