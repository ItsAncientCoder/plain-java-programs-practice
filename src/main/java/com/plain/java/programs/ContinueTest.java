package com.plain.java.programs;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i=0; i<8; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("abab" + i);
		}
	}

}
