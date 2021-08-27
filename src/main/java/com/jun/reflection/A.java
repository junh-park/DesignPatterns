package com.jun.reflection;

public class A {
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		b d = new b();
	}
}

class b extends A {
	public b() {
		setNum(5);;
		System.out.println(getNum());
	}
}