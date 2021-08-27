package com.jun.behaviroural.chain_of_responsibility;

public class ConsoleBasedLogger extends Logger{

	public ConsoleBasedLogger(int levels) {
		this.levels = levels;
	}
	protected void displayLoginfo(String msg) {
		System.out.println("Console Logger Info: " + msg);
	}

}
