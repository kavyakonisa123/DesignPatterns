package com.factory.pizzafactory;

public class NyStylePizza extends PizzaStore{
	 Pizza pizza;
	
	 protected Pizza createPizza(String type) {
		 if(type.equals("cheese")){
			pizza= new NyStyleCheesePizza();
		}
		 else if(type.equals("pepporoni")){
				pizza= new NyStylePepporoniPizza();
		}
		 else if(type.equals("clam")){
				pizza= new NyStyleClamPizza();
		}
		 else if(type.equals("Veggie")){
				pizza= new NyStyleVeggiePizza();
		}
		 else
			 return null;
		 
		 return pizza;

		
	
}
}

