package com.jun.creational.singleton;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		} 
		return uniqueInstance;
	}
}
