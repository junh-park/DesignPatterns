package com.jun.behavioural.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");

		remote.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
		remote.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
		remote.setCommand(2, () -> {
			stereo.on();
			stereo.setCD();
			stereo.setVolume(1);
		}, () -> stereo.off());

		System.out.println(remote);

		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
	}
}
