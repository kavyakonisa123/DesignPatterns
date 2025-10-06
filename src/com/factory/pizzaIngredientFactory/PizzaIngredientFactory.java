package com.factory.pizzaIngredientFactory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese cretaecheese();
	public Veggies[] createVeggies();
	public Pepporoni createPepporoni();
	public Clams createClams();

}
