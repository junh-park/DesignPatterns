package com.jun.reflection;

public class Goat extends Animal implements Locomotion {

	public Goat() {
		super("default goat");
	}

	public Goat(String name) {
		super(name);
	}

	@Override
	public String eating() {
		return "grass";
	}

	@Override
	public String getLocomotion() {
		return "walks";
	}

	@Override
	protected String getSound() {
		return "bleat";
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	public static void main(String[] args) {
		Animal goat = new Goat();
		System.out.println(goat.getName());
		
	}

}
