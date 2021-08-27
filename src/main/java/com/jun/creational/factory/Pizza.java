package com.jun.creational.factory;

import java.util.ArrayList;
import java.util.List;

import com.jun.creational.factory.abstractfactory.ingredients.Cheese;
import com.jun.creational.factory.abstractfactory.ingredients.Clams;
import com.jun.creational.factory.abstractfactory.ingredients.Dough;
import com.jun.creational.factory.abstractfactory.ingredients.Pepperoni;
import com.jun.creational.factory.abstractfactory.ingredients.Sauce;
import com.jun.creational.factory.abstractfactory.ingredients.Veggies;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	List<String> toppings = new ArrayList<String>();

	protected abstract void prepare();;
	
	protected void bake() {
		System.out.println("Bake for 25 minutes at 350");
	};
	
	protected void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	};
	
	protected void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	
}
