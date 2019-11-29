package com.plain.java.programs.java8;

public class FuncInterfaceGuide implements FuncInterface {

	public static void main(String[] args) {

		FuncInterfaceGuide fic = new FuncInterfaceGuide();

		// Calling default method
		fic.defaultMethod("It will call default method of FuncInterface");

		// Calling abstract method
		fic.abstractMethod("It will call implemented method of FuncInterfaceGuide");

		// Implementing abstract method of functional interface
		FuncInterface fi = (String a) -> {
			// this is implementation ==>
			System.out.println("Lambda style functional interface method implementation: " + a);
		};
		// Invoking <==
		fi.abstractMethod("It will call Lambda style functional interface method implementation");

	}

	@Override
	public void abstractMethod(String a) {
		System.out.println(a);
	}

}

@FunctionalInterface
interface FuncInterface {

	void abstractMethod(String a);

	default void defaultMethod(String name) {
		System.out.println(name);
	}

	default void defaultMethod2(String name) {
		System.out.println(name);
	}
	
	// Object class's methods >>>>> Functional interfaces can Object class's methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}