package com.plain.java.programs;

public class Incrementors {
	
	public static void main(String[] args) throws InterruptedException {
		int a = 0;
		Thread.sleep(1000000);
		System.out.println(a++);
		System.out.println(a--);
	}
}
