package com.jun.structural.proxy.remoteproxy;

import com.jun.behavioural.state.State;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	String location;

	State state = soldOutState;
	private int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispend();
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count > 0) {
			count = count - 1;
		}
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	public State getHasQuarterState() {
		return this.hasQuarterState;
	}
	
	public State getNoQuarterState() {
		return this.noQuarterState;
	}

	public State getSoldOutState() {
		return this.soldOutState;
	}

	public State getSoldState() {
		return this.soldState;
	}
	
	public State getWinnerState() {
		return this.winnerState;
	}

	public int getCount() {
		return this.count;
	}
	
	public void refill(int count) {
		System.out.println("Loaded a gumball machine with " + count + "gumballs");
		this.count = count;
		this.state = noQuarterState;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mighty Gumball, Inc.\n").append("Java-enabled StandingGumball Model #2004\n");
		builder.append("Inventory: ").append(getCount()).append(" gumballs");
		return builder.toString();
	}

	public String getLocation() {
		return location;
	}

	public State getState() {
		return state;
	}
}
