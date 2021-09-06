package com.jun.behavioural.visitor;

public class VisitorDemo {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
