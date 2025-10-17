package com.factory.pizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new AlfredoSauce();
	}

	@Override
	public Cheese cretaecheese() {
		return new PepperJackCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies= { new Pineapple(), new Onions(),new Tomatoes()};
		return veggies;
	}


	@Override
	public Pepporoni createPepporoni() {
		return new  SlicedPepporoni();
	}


	@Override
	public Clams createClams() {
		return new BakedClams();
	}
}
