package com.jun.structural.decorator;

public abstract class CondimentDecorator extends BeverageType{
	BeverageType beverage;
	public abstract String getDescription();
}