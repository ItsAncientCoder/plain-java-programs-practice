package com.plain.java.programs.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllSpecialCharacters {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\W+");
		Matcher matcher = p.matcher("10/XHGS/214079    /UDOH/");

		List<Object> listOfSpcecialChars = new ArrayList<>();

		StringBuffer finalString = new StringBuffer();
		
		while (matcher.find()) {
			// System.out.println(String.format("start=%s, end=%s", matcher.start(), matcher.end()));
			listOfSpcecialChars.add(matcher.group(0));
			matcher.appendReplacement(finalString, "%");
		}
		System.out.println(listOfSpcecialChars);
		System.out.println(finalString);
	}
}
