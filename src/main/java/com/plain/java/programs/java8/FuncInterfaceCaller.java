package com.plain.java.programs.java8;

public class FuncInterfaceCaller implements FuncInterface {

	public static void main(String[] args) {

		FuncInterfaceCaller fic = new FuncInterfaceCaller();

		// Calling default method
		fic.defaultMethod("Calling default method");

		// Calling abstract method
		fic.abstractMethod("Calling abstract method");

		// Implementing abstract method of functinal interface
		FuncInterface fi = (String a) -> {
			System.out.println(a);
		};

		fi.abstractMethod("Implementing functional interface\'s method");

	}

	@Override
	public void abstractMethod(String a) {
		System.out.println(a);
	}

}

interface FuncInterface {

	void abstractMethod(String a);

	default void defaultMethod(String name) {

		System.out.println(name);

	}

}