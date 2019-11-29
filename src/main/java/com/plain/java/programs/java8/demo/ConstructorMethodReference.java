package com.plain.java.programs.java8.demo;

public class ConstructorMethodReference {

	public static void main(String[] args) {
		TestFunctional3 t = Message::new;
		t.call("World of Internet");
	}
}

class Message {

	public Message(String name) {
		System.out.println("in constructor: " + name);
	}
}

interface TestFunctional3 {

	// The method return type should be VOID for Constructor reference
	void call(String name);
}