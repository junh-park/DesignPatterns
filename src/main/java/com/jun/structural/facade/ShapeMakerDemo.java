package com.jun.structural.facade;

import static java.util.logging.LogManager.getLogManager;

import java.util.logging.LogManager;

import org.apache.log4j.Logger;

interface Shape {
	public void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");

	}

}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");

	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

}

class ShapeMaker {
	private Circle circle;
	private Square square;
	private Rectangle rec;

	public ShapeMaker() {
		this.circle = new Circle();
		this.square = new Square();
		this.rec = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rec.draw();
	}
	
	public void drawSquare() {
		rec.draw();
	}
}

public class ShapeMakerDemo {
	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
	}
}
