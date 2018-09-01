package com.plain.java.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int n = 10;
		int t1 = 0;
		int t2 = 1;
		while (a < n) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			a++;
		}
	}
}
