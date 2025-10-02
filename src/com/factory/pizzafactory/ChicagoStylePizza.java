package com.factory.pizzafactory;

public class ChicagoStylePizza  extends PizzaStore{
	 Pizza pizza;
		
	 protected Pizza createPizza(String type) {
		 if(type.equals("cheese")){
			pizza= new ChicagoStyleCheesePizza();
		}
		 else if(type.equals("pepporoni")){
				pizza= new ChicagoStylePepporoniPizza();
		}
		 else if(type.equals("clam")){
				pizza= new ChicagoStyleClamPizza();
		}
		 else if(type.equals("veggie")){
				pizza= new ChicagoStyleVeggiePizza();
		}
		 else
			 return null;
		 
		 return pizza;
		
	
}

}
