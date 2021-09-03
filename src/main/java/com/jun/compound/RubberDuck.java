package com.jun.compound;

public class RubberDuck implements Quackable {
	private Observable observable;

	public RubberDuck() {
		this.observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
}
