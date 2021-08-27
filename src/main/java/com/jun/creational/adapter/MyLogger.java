package com.jun.creational.adapter;

public interface MyLogger {
	void logMessage(String message);

	void logException(Throwable exception);
}
