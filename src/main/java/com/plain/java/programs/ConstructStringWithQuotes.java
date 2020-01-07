package com.plain.java.programs;

public class ConstructStringWithQuotes {

	public static void main(String[] args) {

		String json = "{\"api_name\" : \"Outbound Service Inventory JSON Notifications\",\n"
				+ "\"api_version\" : \"1\",\n" + "\"version_expires\" : \"\",\n" + "\"new_version\" : \"\",\n"
				+ "\"new_version_starts\" : \"\",\n"
				+ "\"api_info\" : \"https://developer.centurylink.com/trouble-ticket-notification-service\",\n"
				+ "\"from\" : \"CenturyLink\",\n" + "\"service_inventory\" : \"\",\n"
				+ "\"legal_notice\" : \"The information in this communication is confidential and may not be disclosed to third parties or shared further without the express permission of CenturyLink.\"}";
		System.out.println(json);
	}

}
