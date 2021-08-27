package com.jun.creational.factory;

public class ChicagoPizzaStore extends PizzaStore{

	public ChicagoPizzaStore() {

	}

	protected Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		
		if (type.equals(PizzaType.CHEESE)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals(PizzaType.PEPPERONI)) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return pizza;
	}

}
