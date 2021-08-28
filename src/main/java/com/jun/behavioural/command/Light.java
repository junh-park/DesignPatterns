package com.jun.behavioural.command;

public class Light {
	String name;
	
	public Light(String name) {
		this.name = name;
	}

	public Light() {
		// TODO Auto-generated constructor stub
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	};

}
