package com.training.java11;

public class Person {
	private int age;
	private static final int ADULT_AGE = 18; 
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	} 
	
	public boolean isAdult () { 
		return age >= ADULT_AGE; 
	}	
	
	public boolean isChild () { 
		return !isAdult();  
	}
}
