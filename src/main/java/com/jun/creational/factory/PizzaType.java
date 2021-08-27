package com.jun.creational.factory;

public enum PizzaType {
	CHEESE, PEPPERONI;
	
	public String toString() {
		switch (this) {
		case CHEESE: return "Cheese";
		case PEPPERONI: return "Pepperoni";
		default: return null;
		}
	}
	
}
