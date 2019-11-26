package com.plain.java.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForEachLoopNulls {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("banglore");
		names.add("hyd");
		names.add(null);
		names.add("bihar");
		names.add("delhi");

		for (String name : names) {
			System.out.println(name);
		}
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("*************");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
