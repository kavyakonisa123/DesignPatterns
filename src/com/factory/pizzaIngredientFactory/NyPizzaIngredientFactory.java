package com.factory.pizzaIngredientFactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new Marinarasauce();
	}

	@Override
	public Cheese cretaecheese() {
		return new RegginoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies= { new Mushroom(), new Pineapple(), new Onions()};
		return veggies;
	}


	@Override
	public Pepporoni createPepporoni() {
		return new  SlicedPepporoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();

	}

}
