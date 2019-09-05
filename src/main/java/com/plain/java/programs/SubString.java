package com.plain.java.programs;

public class SubString {

	public static void main(String[] args) {
		
		String value = "TODO Auto-generated method stub";
		int index = value.indexOf("-");
		String valueNew = value.substring(index+1);
		System.out.println(valueNew);
		System.out.println(value.contains(null));
	}

}
