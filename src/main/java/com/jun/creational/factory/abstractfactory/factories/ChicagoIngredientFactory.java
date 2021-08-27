package com.jun.creational.factory.abstractfactory.factories;

import com.jun.creational.factory.abstractfactory.ingredients.BlackOlives;
import com.jun.creational.factory.abstractfactory.ingredients.Cheese;
import com.jun.creational.factory.abstractfactory.ingredients.Clams;
import com.jun.creational.factory.abstractfactory.ingredients.Dough;
import com.jun.creational.factory.abstractfactory.ingredients.EggPlant;
import com.jun.creational.factory.abstractfactory.ingredients.FrozenClams;
import com.jun.creational.factory.abstractfactory.ingredients.MozzarellaCheese;
import com.jun.creational.factory.abstractfactory.ingredients.Pepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.PlumTomatoSauce;
import com.jun.creational.factory.abstractfactory.ingredients.Sauce;
import com.jun.creational.factory.abstractfactory.ingredients.SlicedPepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.Spinach;
import com.jun.creational.factory.abstractfactory.ingredients.ThickCrustDough;
import com.jun.creational.factory.abstractfactory.ingredients.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new EggPlant(), new Spinach(), new BlackOlives()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
