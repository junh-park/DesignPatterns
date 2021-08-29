package com.jun.behavioural.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan(0);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		remote.setCommand(0,ceilingFanHigh, ceilingFanOffCommand);

		System.out.println(remote);

		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
	}
}
