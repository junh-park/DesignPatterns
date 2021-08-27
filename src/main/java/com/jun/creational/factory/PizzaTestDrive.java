package com.jun.creational.factory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Jun ordered a " + pizza.getName());
	}
}
