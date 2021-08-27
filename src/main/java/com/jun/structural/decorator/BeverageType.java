package com.jun.structural.decorator;

public abstract class BeverageType {
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}

	protected abstract double cost();
}
