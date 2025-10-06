package com.factory.pizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new AlfredoSauce();
	}

	public Cheese cretaecheese() {
		return new PepperJackCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies= { new Pineapple(), new Onions(),new Tomatoes()};
		return veggies;
	}

	
	public Pepporoni createPepporoni() {
		return new  SlicedPepporoni();
	}


	public Clams createClams() {
		return new BakedClams();
	}
}
