package com.plain.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PassByValueJava {

	public static void main(String[] args) {

		Student joe = new Student("joe");
		Student jack = new Student("jack");

		bar2(joe, jack);

		System.out.println(joe);
		
		final List list = new ArrayList();
		
		list.add("df");
		list.add("df");
		list.add("df");
		list.add("df");
		
		List unmodifiableList = Collections.unmodifiableList(list);

	}

	static void bar2(Student s1, Student s2) {
		s1.setName("Chuck");
		s1 = new Student("Norris");
	}
}

class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
