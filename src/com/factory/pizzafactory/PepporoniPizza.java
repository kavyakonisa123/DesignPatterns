package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class PepporoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepporoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory= ingredientFactory;
		
	}


	void prepare() {
		System.out.println("Preparibg.."+ name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		pepporoni= ingredientFactory.createPepporoni();
		
	}

}
