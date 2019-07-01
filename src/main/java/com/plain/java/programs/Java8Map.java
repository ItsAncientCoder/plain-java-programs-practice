package com.plain.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Map {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> squares = names.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println(squares);
	}
}
