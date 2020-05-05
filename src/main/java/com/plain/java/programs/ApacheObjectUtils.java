package com.plain.java.programs;

import org.apache.commons.lang.ObjectUtils;

public class ApacheObjectUtils {

	public static void main(String[] args) {

		System.out.println(ObjectUtils.toString(new Car("MARUTHI","MODEL-1")));

	}
}

class Car {
	private String name;
	private String model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + "]";
	}
}