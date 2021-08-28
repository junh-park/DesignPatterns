package com.jun.creational.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile ChocolateBoiler boiler;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public ChocolateBoiler getInstance() {
		if(boiler == null) {
			synchronized(Singleton.class) {
				if (boiler == null) {
					boiler = new ChocolateBoiler();
				}
			}
		}
		return boiler;
	}
	
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
	
	
}
