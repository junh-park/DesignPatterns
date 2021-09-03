package com.jun.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	List<Quackable> quackers = new ArrayList<Quackable>();
	private Observable observable;

	public void add(Quackable quacker) {
		quackers.add(quacker);
		observable = new Observable(this);
	}

	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
			notifyObservers();
		}
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
