package com.jun.structural.decorator;

public class Mocha extends CondimentDecorator {
	public Mocha(BeverageType beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return "Mocha "  + beverage.getDescription();
	}

	protected double cost() {
		return beverage.cost() + 0.20;
	}
}
