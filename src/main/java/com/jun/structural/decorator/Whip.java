package com.jun.structural.decorator;

public class Whip extends CondimentDecorator {
	public Whip(BeverageType beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " with Whip";
	}

	@Override
	protected double cost() {
		return beverage.cost() + 0.5;
	}

}
