package com.plain.java.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class EscapeSpecialCharacters {

	public static void main(String[] args) throws JSONException, FileNotFoundException {
		// Latency or Delay @Modified 112233445567890-=-----/////\\\\[]{}
		String originalString = "Latency or Delay @Modified 112233445567890-=-----/////\\\\\\\\[]{}";
		
		JSONObject jsonObject = new JSONObject();
		String convertedString = jsonObject.put("TEST", originalString).toString();
		
		System.out.println(originalString);
		System.out.println(convertedString.replaceAll("\\\\", ""));
		
	}

}
