package com.factory.pizzafactory;

import com.factory.pizzaIngredientFactory.NyPizzaIngredientFactory;
import com.factory.pizzaIngredientFactory.PizzaIngredientFactory;

public class NyStylePizza extends PizzaStore{
	 Pizza pizza;
	
	 protected Pizza createPizza(String type) {
		 Pizza pizza= null;
		 PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

		 if(type.equals("cheese")){
				pizza= new CheesePizza(ingredientFactory);
				pizza.setName("NY Style Sauce and Cheese Pizza");

			}
			 else if(type.equals("pepporoni")){
					pizza= new PepporoniPizza(ingredientFactory);
					pizza.setName("NY Style Sauce and Pepporoni Pizza");

			}
			 else if(type.equals("clam")){
					pizza= new ClamPizza(ingredientFactory);
					pizza.setName("NY Style Sauce and Clam Pizza");


			}
			 else if(type.equals("veggie")){
					pizza= new VeggiePizza(ingredientFactory);
					pizza.setName("NY Style Sauce and Veggie Pizza");

			}
			 else
				 return null;
			 
			 return pizza;
			
		
}
}

