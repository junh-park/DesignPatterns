package com.jun.structural.bridge;

public class BridgePattern {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	private static void testDevice(Device device) {
		BasicRemote basicRemote = new BasicRemote(device);
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		
		System.out.println("Testing basic remote");
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Testing advanced remote");
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
