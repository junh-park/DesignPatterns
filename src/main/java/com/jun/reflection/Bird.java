package com.jun.reflection;

public class Bird extends Animal {
	private boolean walks;
	
	public Bird() {
		super("bird");
	}
	
	public Bird(String name) {
		super(name);
	}
	
	public Bird(String name, boolean walks) {
		super(name);
		setWalks(walks);
	}
	
	public boolean walks() {
		return walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}

	@Override
	public String eating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

}
