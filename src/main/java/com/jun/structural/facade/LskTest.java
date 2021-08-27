package com.jun.structural.facade;

class Bird {
}

class FlyingBirds extends Bird {
	public void fly() {
	}
}

class Duck extends FlyingBirds {
}

class Ostrich extends Bird {
}

public class LskTest {
	public static void main(String[] args) {
		Bird bird = new Duck();
//		bird.fly(); impossible
		
	}
}
