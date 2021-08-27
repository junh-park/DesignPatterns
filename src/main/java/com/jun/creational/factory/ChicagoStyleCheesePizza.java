package com.jun.creational.factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";

		toppings.add("Grate Reggiano Cheese");
	}
	
	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}
}
