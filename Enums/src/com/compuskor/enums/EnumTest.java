package com.compuskor.enums;

public class EnumTest {
	public enum gpio {
		INPUT, OUTPUT
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gpio gp = gpio.INPUT;

		EnumTest et = new EnumTest();

		System.out.println(gp);
		System.out.println(et);

	}

}
