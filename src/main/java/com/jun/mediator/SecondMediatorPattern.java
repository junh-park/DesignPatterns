package com.jun.mediator;

import java.util.ArrayList;
import java.util.List;

interface Mediator {
	void register(Colleague colleague);

	void unregister(Colleague colleague);
}

abstract class Colleague {
	private String name;

	public Colleague(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public abstract void receiveRegisterNotification(Colleague colleague);

	public abstract void receiveUnRegisterNotificaiton(Colleague colleague);
}

class ComputerColleague extends Colleague {

	public ComputerColleague(String name) {
		super(name);
	}

	@Override
	public void receiveRegisterNotification(Colleague colleague) {
		System.out.println("New Computer register event with name: " + colleague + " received: @" + this);
	}

	@Override
	public void receiveUnRegisterNotificaiton(Colleague colleague) {
		System.out.println("Computer left unregister event with name: " + colleague + " received: @" + this);

	}
}

class NetworkMediator implements Mediator {
	List<Colleague> colleagues;

	public NetworkMediator() {
		this.colleagues = new ArrayList<Colleague>();
	}

	@Override
	public void register(Colleague colleague) {
		colleagues.add(colleague);
		for (Colleague other : colleagues) {
			if (other != colleague)
				other.receiveRegisterNotification(colleague);
		}
	}

	@Override
	public void unregister(Colleague colleague) {
		colleagues.remove(colleague);
		for (Colleague other : colleagues) {
			if (other != colleague)
				other.receiveUnRegisterNotificaiton(colleague);
		}
	}
}

class Airplane {
	public int speed;

	public Airplane() {
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

class Jet extends Airplane {
	private static final int MULTIPLIER = 2;

	public Jet() {
		super();
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		super.setSpeed(speed*MULTIPLIER);
	}

	public void accelerate() {
		super.setSpeed(getSpeed() * 2); 
	}
}

public class SecondMediatorPattern {
	public static void main(String[] args) {
//		Mediator mediator = new NetworkMediator();
//		ComputerColleague colleague1 = new ComputerColleague("Eagle");
//		ComputerColleague colleague2 = new ComputerColleague("Ostrich");
//		ComputerColleague colleague3 = new ComputerColleague("Penguin");
//		mediator.register(colleague1);
//		mediator.register(colleague2);
//		mediator.register(colleague3);
//		mediator.unregister(colleague1);
		Airplane airplane = new Airplane();
		airplane.speed = 212;
		System.out.println(airplane.speed);

		Jet jet1 = new Jet();
		jet1.speed = 210;
		System.out.println(jet1.speed);

		Jet jet2 = new Jet();
		jet2.setSpeed(212);
		System.out.println(jet2.getSpeed());
	}
}
