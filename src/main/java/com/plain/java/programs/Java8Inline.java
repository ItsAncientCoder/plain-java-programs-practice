package com.plain.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Inline {

	public static void main(String[] args) {

		List<String> yourList = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API",
				"Lambdas");

		yourList.stream().filter(name -> name.startsWith("L")).collect(Collectors.toSet()).forEach(n -> send(n));
	}

	static void send(String name) {
		System.out.println(name);
	}
}
