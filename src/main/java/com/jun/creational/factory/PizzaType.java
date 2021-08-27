package com.jun.creational.factory;

public enum PizzaType {
	CHEESE, PEPPERONI, CLAM;
	
	public String toString() {
		switch (this) {
		case CHEESE: return "Cheese";
		case PEPPERONI: return "Pepperoni";
		case CLAM: return "Clam";
		default: return null;
		}
	}
	
}
