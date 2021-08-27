package com.jun.creational.blackboard;

public abstract class AbstractBlackBoardObject implements BlackBoardObject{

	protected boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
}
