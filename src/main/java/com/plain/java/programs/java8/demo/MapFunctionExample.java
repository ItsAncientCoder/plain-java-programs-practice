package com.plain.java.programs.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunctionExample {

	public static void main(String[] args) {

		List<String> prices = Arrays.asList(new String[] { "10", "20", "30", "40", "50", "60" });
		List<Integer> result = prices.stream().map(MapFunctionExample::convertToInt).collect(Collectors.toList());
		System.out.println(result);
	}

	static Integer convertToInt(String price) {
		return Integer.valueOf(price);
	}

}
