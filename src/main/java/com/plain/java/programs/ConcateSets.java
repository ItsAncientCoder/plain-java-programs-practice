package com.plain.java.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConcateSets {

	public static void main(String[] args) {
		Set<String> a = new HashSet<String>(Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE"));
		Set<String> b = new HashSet<String>(Arrays.asList("SIX", "SEVEN", "EIGHT", "NINE", "TEN"));
		a.addAll(b);
		System.out.println(a);
	}

}
