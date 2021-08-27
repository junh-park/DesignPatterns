package com.jun.structural.decorator;

public class HouseBlend extends BeverageType{
	public HouseBlend() {
		description = "House blend coffee";
	}
	
	protected double cost() {
		return 0.89;
	}

}
