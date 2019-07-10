package com.plain.java.programs;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 1000; i++) {
			list.add(i);
		}
		System.out.println("added: " + list.size());
		list.parallelStream().map(i -> i + 1).toArray(Integer[]::new);
		System.out.println(System.currentTimeMillis() - start);
	}
}
