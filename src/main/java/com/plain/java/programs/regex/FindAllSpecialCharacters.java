package com.plain.java.programs.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class FindAllSpecialCharacters {

	public static void main(String[] args) {

		// String inputString = "10/XHGS/214079    /UDOH/";
		String inputString = "TEst_12324&*567\t89?";
		String reg = "\\W+";
		
		Pattern p = Pattern.compile(reg);
		Matcher matcher = p.matcher(inputString.trim());

		List<Object> listOfSpcecialChars = new ArrayList<>();

		StringBuffer finalString = new StringBuffer();
		
		while (matcher.find()) {
			listOfSpcecialChars.add(matcher.group(0));
			matcher.appendReplacement(finalString, "%");
		}
		// System.out.println(listOfSpcecialChars); LIST OF SPECIAL CHARACTERS
		// System.out.println(finalString);
		
		System.out.println(inputString.replaceAll("[\\W_]+", "%"));
		
		//System.out.println(!StringUtils.isAlphanumeric(Character.toString("=".charAt(0))));
	}
}
