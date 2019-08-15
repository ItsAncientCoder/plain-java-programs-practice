package com.plain.java.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindRepeatedNumbersCount {

	public static void main(String[] args) {

		Integer[] array_room_num = new Integer[] { 1, 2, 3, 6, 5, 4, 4, 2, 5, 3, 6, 1, 6, 5, 3, 2, 4, 1, 2, 5, 1, 4, 3,
				6, 8, 4, 3, 1, 5, 6, 2 };
		List<Integer> list_room_num = Arrays.stream(array_room_num).collect(Collectors.toList());
		
		Map<Object, Long> map = list_room_num.stream()
	            .collect(Collectors.groupingBy(c ->c , Collectors.counting())) ;
		System.out.println(map);
		System.out.println("******");
		
	    System.out.println("Count all with frequency");
	    Set<Integer> set = new HashSet<Integer>(list_room_num);
	    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
	    for (Integer r : set) {
	    	counts.put(r, Collections.frequency(list_room_num, r));
	    }
	    System.out.println(counts);
	}

}
