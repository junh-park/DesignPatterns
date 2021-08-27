package com.jun.creational.factory;

import com.jun.creational.factory.abstractfactory.factories.NYPizzaIngredientFactory;
import com.jun.creational.factory.abstractfactory.factories.PizzaIngredientFactory;
import com.jun.creational.factory.abstractfactory.ingredients.CheesePizza;
import com.jun.creational.factory.abstractfactory.ingredients.ClamPizza;
import com.jun.creational.factory.abstractfactory.ingredients.PepperoniPizza;

public class NYPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals(PizzaType.CHEESE)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals(PizzaType.CLAM)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals(PizzaType.PEPPERONI)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}
