package com.jun.creational.singleton;

public enum Boiler {
	UNIQUE_INSTANCE;
	
	private boolean empty;
	private boolean boiled;
	
	public void fill() {
		if (isEmpty()) { 
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled =  true;
		}
	}

	private boolean isBoiled() {
		return boiled;
	}

	private boolean isEmpty() {
		return empty;
	}
	
	public static void main(String[] args) {
		Boiler uniqueInstance = Boiler.UNIQUE_INSTANCE;
		
		uniqueInstance.isBoiled();
		
	}
}
