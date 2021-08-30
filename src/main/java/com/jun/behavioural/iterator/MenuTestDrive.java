package com.jun.behavioural.iterator;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(cafeMenu);
		menus.add(dinerMenu);
//		Waitress waitress = new Waitress(menus);
//		waitress.printMenu();
		}
}
