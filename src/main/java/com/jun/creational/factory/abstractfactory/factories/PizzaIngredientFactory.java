package com.jun.creational.factory.abstractfactory.factories;

import com.jun.creational.factory.abstractfactory.ingredients.Cheese;
import com.jun.creational.factory.abstractfactory.ingredients.Clams;
import com.jun.creational.factory.abstractfactory.ingredients.Dough;
import com.jun.creational.factory.abstractfactory.ingredients.Pepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.Sauce;
import com.jun.creational.factory.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
