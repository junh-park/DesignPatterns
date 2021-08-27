package com.jun.creational.factory;

public abstract class PizzaStore {
//	private SimplePizzaFactory factory;

	public PizzaStore() {
	}
	
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	protected abstract Pizza createPizza(PizzaType type);
}
