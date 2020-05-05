package com.plain.java.programs;

public class SubStringExample {

	public static void main(String[] args) {
		String countryCodeNum = "913";
		String phone = "9139493564675";
		System.out.println(phone.substring(0,countryCodeNum.length()));
	}

	static void testEndIndexPositions(String text) {
		System.out.println(text.substring(5));
		System.out.println(text.substring(0, 5));
		System.out.println(text.substring(0, 1) + " " + text.substring(0, 1).length());
		System.out.println(text.substring(0, 2) + " " + text.substring(0, 2).length());
		System.out.println(text.substring(0, 3) + " " + text.substring(0, 3).length());
	}

	static void testIndexPosition(String value) {
		String key = "\\|";
		int indexOf = value.indexOf(key);
		System.out.println(value.substring(0, indexOf));
	}

}
