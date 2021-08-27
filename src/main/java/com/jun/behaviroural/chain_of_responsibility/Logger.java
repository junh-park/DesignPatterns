package com.jun.behaviroural.chain_of_responsibility;

public abstract class Logger {
	public static int OUTPUTINFO = 1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;
	protected int levels;
	protected Logger nextLevelLogger;
	protected String a = "a";
	
	

	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}
	
	public void logMessage(int levels, String msg) {
		if(this.levels <= levels) {
			displayLoginfo(msg);
		}
		if(nextLevelLogger != null) {
			nextLevelLogger.logMessage(levels, msg);
		}
	}

	protected abstract void displayLoginfo(String msg);
	
}
