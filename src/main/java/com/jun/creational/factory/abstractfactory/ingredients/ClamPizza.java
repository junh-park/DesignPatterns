package com.jun.creational.factory.abstractfactory.ingredients;

import com.jun.creational.factory.Pizza;
import com.jun.creational.factory.abstractfactory.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
	private PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	protected void prepare() { 
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
