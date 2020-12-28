package com.plain.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		
		List<String> list = new ArrayList<String>();
		list.add("2");
		
		list.addAll(set);
		System.out.println(list);
	}

}
