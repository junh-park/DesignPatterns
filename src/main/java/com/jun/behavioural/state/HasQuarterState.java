package com.jun.behavioural.state;

import java.util.Random;

public class HasQuarterState implements State{
	Random randomWinner = new Random(System.currentTimeMillis()); 
	private GumballMachine gumballmachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballmachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballmachine.setState(gumballmachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt();
		if ((winner == 0) && (gumballmachine.getCount() > 1)) {
			gumballmachine.setState(gumballmachine.getWinnerState());
		} else {
			gumballmachine.setState(gumballmachine.getSoldState());
		}
	}

	@Override
	public void dispend() {
		System.out.println("No gumball dispended");
	}

}
