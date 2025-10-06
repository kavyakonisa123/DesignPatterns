package com.factory.pizzaIngredientFactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new Marinarasauce();
	}

	public Cheese cretaecheese() {
		return new RegginoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies= { new Mushroom(), new Pineapple(), new Onions()};
		return veggies;
	}

	
	public Pepporoni createPepporoni() {
		return new  SlicedPepporoni();
	}

	public Clams createClams() {
		return new FreshClams();

	}

}
