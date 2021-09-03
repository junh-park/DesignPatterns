package com.jun.compound;

public class QuackCounter implements Quackable {
	Quackable duck;
	Observable observable;
	
	static int numberOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
		this.observable = new Observable(this);
	}

	public void quack() {
		duck.quack();
		numberOfQuacks++;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}
}
