package com.jun.behavioural.state;

public class SoldOutState implements State{

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}	

	public void insertQuarter() {
		System.out.println("Sorry, we run out of gumballs");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, we run out of gumballs");
	}

	@Override
	public void turnCrank() {
		System.out.println("Sorry, we run out of gumballs");
	}

	@Override
	public void dispend() {
		System.out.println("Sorry, we run out of gumballs");
	}

}
