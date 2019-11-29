package com.plain.java.programs.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

	public static void main(String[] args) {
		List<String> prices = Arrays.asList(new String[] { "-10", "20", "30", "-40", "50", "60" });
		List<Integer> result = prices.stream().map((x)->Integer.valueOf(x)).collect(Collectors.toList());
		Stream<Integer> map = prices.parallelStream().map((x)->Integer.valueOf(x));
		System.out.println(result);
	}

}
