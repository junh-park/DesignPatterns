package com.jun.behavioural.state;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	public void dispend() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("You are a winner! You got two gumballs for your quarter");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
			
		}
	}

}
