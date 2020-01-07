package com.plain.java.programs.java8.demo;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceIntroDemo {
	public static void main(String[] args) {
		Person[] personsCopy = new Person[] { new Person("Suresh","10011994"), new Person("Mahesh","20011889"), new Person("Lokesh","01111997") };

		//
		Person[] persons = personsCopy.clone();
		Arrays.sort(persons, new PersonComparatorImpl());
		System.out.println(Arrays.asList(persons));
		//
		persons = personsCopy.clone();
		Arrays.sort(persons, (a, b) -> {
			return a.getBirthDay().compareTo(b.getBirthDay());
		});
		System.out.println(Arrays.asList(persons));

		//
		persons = personsCopy.clone();
		Arrays.sort(persons, (a, b) -> {
			return Person.comparebyDay(a, b);
		});
		System.out.println(Arrays.asList(persons));
	}
}

class Person {

	private String birthDay;
	private String name;
	
	public static int comparebyDay(Person a, Person b) {
		return a.getBirthDay().compareTo(b.getBirthDay());
	}

	Person(String name, String birthDay) {
		this.birthDay = birthDay;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDay=" + birthDay + "]";
	}

}

class PersonComparatorImpl implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {
		return a.getBirthDay().compareTo(b.getBirthDay());
	}

}