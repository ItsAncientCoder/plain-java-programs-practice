package com.plain.java.programs;

import java.util.Arrays;
import java.util.List;

public class StringFormatExample {

	public static void main(String[] args) {

		List<Integer> names = Arrays.asList(new Integer[] { 12, 34 });
		System.out.println(String.format("%s %s %s %s", 10, 3, 4, names));
		
		System.out.println("Indian/Mayotte");
		
		String text = "";
		
		if(text.isEmpty()) {
			System.out.println("is empty");
		}
		
		System.out.println(String.format("Outbound notification not sent for BusOrgId=%s, ObjId=%s, retries=%s", "1-OIT5", "1234576", "3"));
		
	}

}
