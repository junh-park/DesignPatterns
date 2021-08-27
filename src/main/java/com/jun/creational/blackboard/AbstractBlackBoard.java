package com.jun.creational.blackboard;

import java.util.Observable;

public abstract class AbstractBlackBoard extends Observable implements BlackBoard {

	public void addBlackBoardObject(BlackBoardObject bbo) {
		setChanged();
		notifyController(bbo);
	}

	public void notifyController(BlackBoardObject bbo) {
		notifyObservers(bbo);
	}

}
