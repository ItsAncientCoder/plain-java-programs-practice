package com.plain.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExamTest {
	
	static Map<String, ArrayList<String>> topsAndQueries = new HashMap<String, ArrayList<String>>();

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ac29019\\Desktop\\myinput.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		line = br.readLine();

		Map<String, Integer> map = new HashMap<>();

		while (line != null) {

			if (!line.contains("top")) {

				if (map.containsKey(line)) {
					map.put(line, map.get(line) + 1);
				} else {
					map.put(line, 1);
				}

			} else {
				topsAndQueries.put(line, new ArrayList<>(map.keySet()));
				// System.out.println(topsAndQueries);
				String[] arr = line.split(" ");
				Integer countOfPrint = Integer.parseInt(arr[1]);
				Map<String, Integer> sortedMap = sortByValues(map);
				printEle(countOfPrint, sortedMap);
				System.out.println();
				System.out.println(map);
			}

			line = br.readLine();
		}

	}

	private static Map<String, Integer> sortByValues(Map<String, Integer> unsortedMap) {

		Set<Map.Entry<String, Integer>> set = unsortedMap.entrySet();
		List<Map.Entry<String, Integer>> list = new ArrayList<>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> m : list) {
			sortedMap.put(m.getKey(), m.getValue());
		}

		return sortedMap;
	}

	private static void printEle(int noOfTimes, Map<String, Integer> map) {
		int count = 0;

		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			if (count >= noOfTimes) {
				break;
			}

			System.out.print(entry.getKey() + " ");
			++count;
		}
	}
}
