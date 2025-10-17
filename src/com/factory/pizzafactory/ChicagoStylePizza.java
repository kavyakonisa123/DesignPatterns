package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import com.factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoStylePizza  extends PizzaStore{
	 Pizza pizza;

	 @Override
	protected Pizza createPizza(String type) {
		 Pizza pizza= null;
		 PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		 if(type.equals("cheese")){
			pizza= new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Sauce and Cheese Pizza");

		}
		 else if(type.equals("pepporoni")){
				pizza= new PepporoniPizza(ingredientFactory);
				pizza.setName("Chicago Style Sauce and Pepporoni Pizza");

		}
		 else if(type.equals("clam")){
				pizza= new ClamPizza(ingredientFactory);
				pizza.setName("Chicago Style Sauce and Clam Pizza");


		}
		 else if(type.equals("veggie")){
				pizza= new VeggiePizza(ingredientFactory);
				pizza.setName("Chicago Style Sauce and Veggie Pizza");

		} else {
			return null;
		}

		 return pizza;


}

}
