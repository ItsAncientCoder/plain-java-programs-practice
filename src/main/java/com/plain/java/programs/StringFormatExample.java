package com.plain.java.programs;

import java.util.Arrays;
import java.util.List;

public class StringFormatExample {

	public static void main(String[] args) {

		List<Integer> names = Arrays.asList(new Integer[] { 12, 34 });
		System.out.println(String.format("%s %s %s %s", 10, 3, 4, names));

	}

}
