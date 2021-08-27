package com.jun.creational.factory;

import com.jun.creational.factory.abstractfactory.ingredients.CheesePizza;
import com.jun.creational.factory.abstractfactory.ingredients.PepperoniPizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(null);
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(null);
		}
		return pizza;
	}

}
