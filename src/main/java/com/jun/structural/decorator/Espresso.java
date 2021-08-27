package com.jun.structural.decorator;

public class Espresso extends BeverageType {

	public Espresso() {
		description = "Esspresso";
	}
	
	@Override
	protected double cost() {
		return 1.99;
	}

}
