package com.jun.structural.decorator;

abstract class Beverage {
	protected String name;
	protected int price;

	public Beverage() {
	}

	public Beverage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	protected abstract void decorateBeverage();
}

class Tea extends Beverage {

	public Tea(String name) {
		super(name);
		setPrice(10);
	}

	protected void decorateBeverage() {
		System.out.println("Cost of " + name + " : $" + price);
	}
}

class Coffee extends Beverage {

	public Coffee(String name) {
		super(name);
		setPrice(15);
	}

	@Override
	protected void decorateBeverage() {
		System.out.println("Cost of " + name + " : $" + price);
	}

}

abstract class BeverageDecorator extends Beverage {
	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
		setName(beverage.getName() + " + " + getDecorateName());
		setPrice(beverage.getPrice() + getIncrementPrice());
	}

	protected void decorateBeverage() {
		beverage.decorateBeverage();
		System.out.println("Cost of " + getName() + " : $" + getPrice());
	}

	protected abstract int getIncrementPrice();

	protected abstract String getDecorateName();

}

class SugarDecorator extends BeverageDecorator {

	public SugarDecorator(Beverage beverage) {
		super(beverage);
	}

	protected void decorateBeverage() {
		super.decorateBeverage();
		decorateSugar();
	}

	private void decorateSugar() {
		System.out.println("Added Sugar to:" + beverage.getName());
	}

	protected int getIncrementPrice() {
		return 5;
	}

	@Override
	protected String getDecorateName() {
		return "Sugar";
	}

}

class LemonDecorator extends BeverageDecorator {

	public LemonDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	protected void decorateBeverage() {
		super.decorateBeverage();
		decorateLemon();
	}

	private void decorateLemon() {
		System.out.println("Added Lemon to:" + beverage.getName());
	}

	protected int getIncrementPrice() {
		return 3;
	}

	protected String getDecorateName() {
		return "Lemon";
	}
}

public class DecoratorDemo {
	public static void main(String[] args) {
		SugarDecorator beverage = new SugarDecorator(new LemonDecorator(new Tea("Assam Tea")));
		beverage.decorateBeverage();
		beverage = new SugarDecorator(new LemonDecorator(new Coffee("Cappuccino")));
		beverage.decorateBeverage();
	}
}
