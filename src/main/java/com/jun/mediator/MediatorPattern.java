package com.jun.mediator;

public class MediatorPattern {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		robert.sendMessage("Hi");
		john.sendMessage("How are you?");
	}
}
