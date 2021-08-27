package com.jun.behavioural.chain_of_responsibility;

public class DebugBasedLogger extends Logger {
	public DebugBasedLogger(int levels) {
		this.levels = levels;
	}

	protected void displayLoginfo(String msg) {
		System.out.println("Debug Logger Info: " + msg);
	}

}
