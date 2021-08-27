package com.jun.reflection;

public abstract class Animal implements Eating {
	public static String CATEGORY = "domestic";
	protected String name;

	public Animal() {	}

	public Animal(String name) {
		this.name = name;
	}

	protected abstract String getSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
