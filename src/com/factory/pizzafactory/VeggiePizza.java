package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory= ingredientFactory;

	}


	@Override
	void prepare() {
		System.out.println("Preparibg.."+ name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		veggies= ingredientFactory.createVeggies();

	}


}
