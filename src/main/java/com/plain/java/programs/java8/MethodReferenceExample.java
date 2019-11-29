package com.plain.java.programs.java8;

public class MethodReferenceExample {

	public static void staticMethod(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Sayable sayable = MethodReferenceExample::staticMethod;
		sayable.say("bandham");
	}
}

interface Sayable {
	void say(String name);
}
