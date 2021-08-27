package com.jun.creational.adapter;

public interface FrameworkLogger {
	void log(String message);

	void log(Throwable exception);
}
