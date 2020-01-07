package com.plain.java.programs.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

	public static void main(String[] args) {
		// test();
		test_else_null();
	}

	static void test() {
		List<String> prices = Arrays.asList(new String[] { "-10", "20", "30", "-40", "50", "60" });
		List<Integer> result = prices.stream().map((x) -> Integer.valueOf(x)).collect(Collectors.toList());
		Stream<Integer> map = prices.parallelStream().map((x) -> Integer.valueOf(x));
		System.out.println(map);
		System.out.println(result);
	}

	static void test_else_null() {
		Integer[] empIds = { 1, 2, 3, 4 };

		String employee = Stream.of(empIds).map(x -> String.valueOf(x)).filter(e -> e != null)
				.filter(x -> x.startsWith("a")).findFirst().orElse(null);
		System.out.println(employee);
	}

}
