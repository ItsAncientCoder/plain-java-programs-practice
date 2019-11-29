package com.plain.java.programs.java8.demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamApiDemo {

	public static void main(String[] args) throws IOException {

		// JAVA 1.7
		List<String> names = Arrays
				.asList(new String[] { "Arunachal", "Assam", "Bihar", "Chandigarh", "Chhattisgarh" });

		List<String> namesStartsWithC = new ArrayList<String>();
		for (String name : names) {
			if (name.startsWith("C")) {
				namesStartsWithC.add(name);
			}
		}
		System.out.println(namesStartsWithC);

		// Stream JAVA 1.8
		List<String> result = names.stream().filter(x -> x.startsWith("C")).collect(Collectors.toList());
		System.out.println(result);

		// Advanced collects
		String s = names.stream().filter(x -> x.startsWith("C")).collect(Collectors.joining(" & ")).toString();
		System.out.println(s);

		// Infinite Streams
		Stream.generate(Math::random).limit(10).forEach(System.out::println);

		Set<String> collect = names.stream().limit(2).collect(Collectors.toSet());
		System.out.println(collect);

		Path path = Paths.get("C:\\Users\\ac29019\\Desktop\\FILES_TO_TAKE_BACKUP.txt");
		Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
		System.out.println(streamWithCharset.collect(Collectors.toList()));
	}
}
