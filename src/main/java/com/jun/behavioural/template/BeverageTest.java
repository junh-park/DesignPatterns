package com.jun.behavioural.template;

public class BeverageTest {

	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
