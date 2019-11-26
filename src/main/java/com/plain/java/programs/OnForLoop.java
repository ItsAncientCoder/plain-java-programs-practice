package com.plain.java.programs;

public class OnForLoop {

	public static void main(String[] args) {

		String[] names = new String[] { "A", "B", "C", "D", "E" };
		String finalString = "";
		int counter = 0;

		for (String name : names) {
			counter++;
			finalString = finalString + name;
			if (counter != names.length) {
				finalString = finalString + "." + System.getProperty("line.separator");
			}
		}
		System.out.println(finalString);

	}

}
