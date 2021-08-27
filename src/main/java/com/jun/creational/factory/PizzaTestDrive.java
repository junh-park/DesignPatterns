package com.jun.creational.factory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		NYPizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Jun ordered a " + pizza.getName());
	}
}
