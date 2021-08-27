package com.jun.creational.factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grate Reggiano Cheese");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
