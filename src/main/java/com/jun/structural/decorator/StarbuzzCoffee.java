package com.jun.structural.decorator;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		BeverageType espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		BeverageType houseblend = new HouseBlend();
		houseblend = new Whip(new Mocha(houseblend));
		System.out.println(houseblend.getDescription() + " $" + houseblend.cost());
		
	}
}
