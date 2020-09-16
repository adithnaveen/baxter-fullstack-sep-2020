package com.training.java11;

import java.util.Arrays;
import java.util.List;
import static java.util.function.Predicate.*;
import java.util.stream.Collectors;

public class PredicatePerson03 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person(12),new Person(36),new Person(28)); 
		
		List<Person> adults = people.stream().filter(Person :: isAdult).collect(Collectors.toList()); 
		
		adults.forEach(System.out :: println);
		
//		 if we want non-adult, we can have negate of the predicate 
		
		List<Person> children = people.stream().filter(person -> !person.isAdult())
					.collect(Collectors.toList()); 
		
		System.out.println("------------------All Childrens-----------------------");
		System.out.println(children);
		
		
		
		List<Person> children1 = people.stream().filter(person -> person.isChild())
				.collect(Collectors.toList()); 
		
		System.out.println("***** All Children AGain*********");
		System.out.println(children1);
		
		// fromjava 11 onwards Predicate.not() 
		
		System.out.println("***** All Children AGain- second time*********");

		List<Person> children2 = people.stream().filter(not(Person :: isAdult))
					.collect(Collectors.toList()); 

		System.out.println(children2);
		
	}
}





