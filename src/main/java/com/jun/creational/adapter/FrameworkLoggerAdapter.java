package com.jun.creational.adapter;


//By defining an adapter class that implements the FrameworkLogger interface and accepts a MyLoggerimplementation 
//the functionality can be mapped between the different interfaces. 
public class FrameworkLoggerAdapter implements FrameworkLogger {
	private MyLogger logger;

	public FrameworkLoggerAdapter(MyLogger logger) {
		this.logger = logger;
	}

	public void log(String message) {
		this.logger.logMessage(message);
	}

	public void log(Throwable exception) {
		this.logger.logException(exception);
	}

	//Now it is possible to use the BluetoothManager with all of the MyLogger implementations like so:
	public static void main(String[] args) {
		FrameworkLoggerAdapter fileLogger = new FrameworkLoggerAdapter(new myFileLogger());
		BluetoothManager manager = new BluetoothManager(fileLogger);
	}

}
