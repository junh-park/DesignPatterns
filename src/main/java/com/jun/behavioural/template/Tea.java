package com.jun.behavioural.template;

public class Tea extends CaffeineBeverage {
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}

	protected void brew() {
		System.out.println("Steeping the tea");
	}

}
