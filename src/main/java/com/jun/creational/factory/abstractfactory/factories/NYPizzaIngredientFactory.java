package com.jun.creational.factory.abstractfactory.factories;

import com.jun.creational.factory.abstractfactory.ingredients.Cheese;
import com.jun.creational.factory.abstractfactory.ingredients.Clams;
import com.jun.creational.factory.abstractfactory.ingredients.Dough;
import com.jun.creational.factory.abstractfactory.ingredients.FreshClams;
import com.jun.creational.factory.abstractfactory.ingredients.Garlic;
import com.jun.creational.factory.abstractfactory.ingredients.MarinaraSauce;
import com.jun.creational.factory.abstractfactory.ingredients.Mushroom;
import com.jun.creational.factory.abstractfactory.ingredients.Onion;
import com.jun.creational.factory.abstractfactory.ingredients.Pepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.RedPepper;
import com.jun.creational.factory.abstractfactory.ingredients.ReggianoCheese;
import com.jun.creational.factory.abstractfactory.ingredients.Sauce;
import com.jun.creational.factory.abstractfactory.ingredients.SlicedPepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.ThinCrustDough;
import com.jun.creational.factory.abstractfactory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
