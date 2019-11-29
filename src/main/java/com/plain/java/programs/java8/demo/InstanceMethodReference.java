package com.plain.java.programs.java8.demo;

import java.util.Arrays;

public class InstanceMethodReference {

	public static void main(String[] args) {

		// 1
		InstanceMethodReference i = new InstanceMethodReference();
		TestFunctional2 t = i::instanceMethod;
		String response = t.call("Communication");
		System.out.println(response);

		// 2
		TestFunctional2 t2 = new InstanceMethodReference()::instanceMethod;
		String resp = t2.call("Networks");
		System.out.println(resp);

		// Reference to an Instance Method of an Arbitrary Object of a Particular Type

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda", "Barbara" };
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.asList(names));

	}

	public String instanceMethod(String name) {
		System.out.println("inside instanceMethod..");
		return name;
	}
}

interface TestFunctional2 {
	String call(String name);
}