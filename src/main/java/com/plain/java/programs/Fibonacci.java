package com.plain.java.programs;

public class Fibonacci {

	public static void main(String[] args) {
		fibi(10);
	}

	static void fibi(int n) {
		int z1 = 0;
		int z2 = 1;
		int o = 0;
		while (o < n) {
			System.out.print(z1 + " ");
			int sum = z1 + z2;
			z1 = z2;
			z2 = sum;
			o++;
		}
	}
}
