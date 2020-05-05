package com.plain.java.programs;

public class TryCatchExceptionThrowing {

	public static void main(String[] args) {

		try {
			try {
				throw new RuntimeException("Some Exception - nested try");
			} catch (Exception e) {
				//System.out.println("Nested Exception block");
				//System.out.println(e.getClass().getSimpleName().substring(0, 16));
				throw new RuntimeException("Some Exception - nested catch");
			}
		} catch (Exception e) {
			System.out.println(String.format("Parent Exception block %s", e));
		}
	}

}
