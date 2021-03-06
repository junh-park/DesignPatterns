package com.jun.behavioural.command;

interface CommandInterface {
	void execute();
}

class Receiver {
	public void switchOn() {
		System.out.println("Switch on from: " + this.getClass().getSimpleName());
	}

	public void switchOff() {
		System.out.println("Switch off from: " + this.getClass().getSimpleName());
	}
}

class OnCommand implements CommandInterface {
	private Receiver receiver;

	public OnCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.switchOn();
	}
}

class OffCommand implements CommandInterface {
	private Receiver receiver;

	public OffCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.switchOff();
	}
}

class Invoker {
	private CommandInterface command;

	public Invoker(CommandInterface command) {
		this.command = command;
	}

	public void execute() {
		this.command.execute();
	}
	
	public void setCommand(CommandInterface command) {
		this.command = command;
	}
}

class TV extends Receiver {
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class DVDPlayer extends Receiver {
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

public class CommandDemo {
	public static void main(String args[]) {
// On command for TV with same invoker
		Receiver receiver = new TV();
		CommandInterface onCommand = new OnCommand(receiver);
		Invoker invoker = new Invoker(onCommand);
		invoker.execute();
// On command for DVDPlayer with same invoker
		receiver = new DVDPlayer();
		onCommand = new OnCommand(receiver);
		invoker = new Invoker(onCommand);
		invoker.execute();

		OffCommand offCommand = new OffCommand(receiver);
		invoker.setCommand(offCommand);
		invoker.execute();
	}
}