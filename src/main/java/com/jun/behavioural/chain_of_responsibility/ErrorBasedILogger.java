package com.jun.behavioural.chain_of_responsibility;

public class ErrorBasedILogger extends Logger {
	public ErrorBasedILogger(int levels) {
		this.levels = levels;
	}

	protected void displayLoginfo(String msg) {
		System.out.println("Error Logger Info: " + msg);
	}

}
