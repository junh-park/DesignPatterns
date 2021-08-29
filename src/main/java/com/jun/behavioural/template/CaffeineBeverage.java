package com.jun.behavioural.template;

public abstract class CaffeineBeverage {

	final void prepareRecipe () {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	};
	
	protected abstract void addCondiments();
	protected abstract void brew();

	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
	
}
