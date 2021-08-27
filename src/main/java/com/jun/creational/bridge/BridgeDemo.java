package com.jun.creational.bridge;

interface Gear {
	void handleGear();
}

class ManualGear implements Gear {
	public void handleGear() {
		System.out.println("Manual gear");
	}
}

class AutoGear implements Gear {
	public void handleGear() {
		System.out.println("Auto gear");
	}
}

abstract class Vehicle {
	Gear gear;

	public Vehicle(Gear gear) {
		this.gear = gear;
	}

	abstract void addGear();
}

class Car extends Vehicle {
//	If a constructor does not explicitly invoke a superclass constructor, 
//	the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
//	If the super class does not have a no-argument constructor, you will get a compile-time error. 
//	Object class does have such a constructor, so if Object is the only superclass, there is no problem.
	public Car(Gear gear) {
		super(gear);
	}

	void addGear() {
		System.out.println("Car handles");
		gear.handleGear();
	}
}

class Truck extends Vehicle {

	public Truck(Gear gear) {
		super(gear);
	}

	void addGear() {
		System.out.println("Truck handles");
		gear.handleGear();
	}

}

public class BridgeDemo {
	public static void main(String[] args) {
		Gear gear = new ManualGear();
		Vehicle vehicle = new Car(gear);
		vehicle.addGear();
		
		gear = new AutoGear();
		vehicle = new Car(gear);
		vehicle.addGear();
		
		gear = new ManualGear();
		vehicle = new Truck(gear);
		vehicle.addGear();
		
		gear = new AutoGear();
		vehicle = new Truck(gear);
		vehicle.addGear();
	}
}
