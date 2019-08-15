package com.plain.java.programs;

import java.util.HashMap;
import java.util.Map;

public class EnumExample {

	public static void main(String[] args) {
		
		Map<String, String> priorities = new HashMap<String, String>();
		
		String prio = "IMPAIRED";
		
		System.out.println(Priority.valueOf(prio).value);
		
	}

	enum Priority {
		OUT_OF_SERVICE("OOS"), IMPAIRED("IMP"), ALL("ALL");
		private String value;
		private Priority(String value) {
			this.value = value;
		}
	}
}
