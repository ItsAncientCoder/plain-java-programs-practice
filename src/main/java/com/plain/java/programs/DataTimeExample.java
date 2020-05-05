package com.plain.java.programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DataTimeExample {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		Calendar date1 = Calendar.getInstance();
		date1.add(Calendar.SECOND, 10);

		Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.SECOND, -10);

		Calendar date3 = Calendar.getInstance();

		if ((date1 != null && date2 != null && date3 != null)
				&& (date3.getTime().after(date2.getTime()) && date3.getTime().before(date1.getTime()))) {
			System.out.println("PASSED");

			System.out.println(date2.getTime());
			System.out.println(date3.getTime());
			System.out.println(date1.getTime());
		}

	}

}
