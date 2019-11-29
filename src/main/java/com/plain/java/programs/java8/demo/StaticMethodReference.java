package com.plain.java.programs.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethodReference {

	public static void main(String[] args) {

		// Approach 1
		TestFunctional1 t = StaticMethodReference::staticMethod;
		t.cal("Bandham");

		// Approach 2
		List<String> prices = Arrays.asList(new String[] { "-10", "20", "30", "-40", "50", "60" });
		List<Integer> result = prices.stream().map(StaticMethodReference::convertToInt).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> result1 = result.stream().filter(StaticMethodReference::isGreaterThanZero)
				.collect(Collectors.toList());
		// result1.forEach(System.out::println);
		System.out.println(result1);
	}

	static Integer convertToInt(String price) {
		return Integer.valueOf(price);
	}

	static boolean isGreaterThanZero(int num) {
		return num > 0;
	}

	public static void staticMethod(String name) {
		System.out.println(name);
	}
}

@FunctionalInterface
interface TestFunctional1 {

	public default void testDefault() {
		// default method
	}

	public static void tt() {
		// Static method
	}

	void cal(String price);

}