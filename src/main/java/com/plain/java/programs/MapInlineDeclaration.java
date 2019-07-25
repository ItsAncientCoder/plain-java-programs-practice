package com.plain.java.programs;

import java.util.HashMap;
import java.util.Map;

public class MapInlineDeclaration {

	Map<String, String> myMap = new HashMap<String, String>() {
		
		private static final long serialVersionUID = 1L;
		{
			put("yes-yes-null", "yes");
			put("yes-yes-yes", "yes");
			put("yes-yes-no","yes"); //no should be yes
			put("no-yes-null","no");
			put("no-yes-yes","yes");
			put("no-yes-no","no");
			put("no-no-null","no");
			put("no-no-yes","no");
			put("no-no-no","no");
		}
	};

	public static void main(String[] args) {
		MapInlineDeclaration t = new MapInlineDeclaration();
		String protection = "yes";
		String offnet_protection = "yes";
		String user_protection = "null";
		String cond = protection + "-" + offnet_protection + "-" + user_protection;
		Map<String, String> conditions = t.myMap;
		System.out.println(conditions.get(cond));
		System.out.println(conditions.size());
	}

}
