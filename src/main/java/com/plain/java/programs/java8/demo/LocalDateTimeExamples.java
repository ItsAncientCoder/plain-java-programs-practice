package com.plain.java.programs.java8.demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {

	public static void main(String[] args) {
		// localTimeZoneExamples();
		// zonedTimeAndDate();
		// periodAndDuration();
		chronoEnumExample();
	}

	static void chronoEnumExample() {
		LocalDate ld = LocalDate.now();
		LocalDate plus = ld.plus(2, ChronoUnit.YEARS);
		Period between = Period.between(ld, plus);
		System.out.println(between);
	}

	static void periodAndDuration() {
		// Period
		LocalDate currentDate = LocalDate.now();
		LocalDate previousDate = LocalDate.of(1994, Month.MARCH, 06);
		Period diff = Period.between(currentDate, previousDate);
		System.out.println("Period: " + diff);

		// Duration
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = lt1.plusHours(-10);
		Duration diffDuration = Duration.between(lt2, lt1);
		System.out.println("Duration: " + diffDuration);

	}

	static void zonedTimeAndDate() {
		ZonedDateTime zonedTime = ZonedDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ZZ");

		System.out.println(zonedTime.format(formatter));

		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		ZonedDateTime withZoneSameInstant = zonedTime.withZoneSameInstant(zoneId);
		System.out.println(withZoneSameInstant);
	}

	static void localTimeZoneExamples() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.format(formatter));

		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("the repulic day :" + date2);

		LocalDateTime specificDate = ldt.withDayOfMonth(24).withYear(2016);

		System.out.println("specfic date with " + "current time : " + specificDate);
	}
}
