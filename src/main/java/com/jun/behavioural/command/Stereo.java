package com.jun.behavioural.command;

public class Stereo {
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println("Stero on");
	}

	public void setCD() {
		System.out.println("CD set");
	}

	public void setVolume(int i) {
		System.out.println("Volume set to " + i);
	}

	public void off() {
		System.out.println("Stereo off");
	}

}
