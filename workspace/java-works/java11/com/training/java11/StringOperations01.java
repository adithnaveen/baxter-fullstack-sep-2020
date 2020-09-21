package com.training.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringOperations01 {
	public static void main(String[] args) {
		// strOperations();
				
		lambdaWorks();
	}

	private static void lambdaWorks() {
		Function<String, String> performOperation = (string) ->  "Hello " + string.toUpperCase() ;
		
		String name ="Pranav"; 
		
		System.out.println(performOperation.apply(name));
		
		List<Integer> numbers = Arrays.asList(23, 45, 5, 77, 12, 6); 
//		numbers.forEach(System.out :: println);
		
		numbers.forEach((t) -> System.out.println(t));
		
		// an error in java 8, with java 11 it works fine 
		System.out.println("---------------------------------------");
		numbers.forEach((temp) -> System.out.println(temp));
	}

	private static void strOperations() {
		var word = "Welcome";

		System.out.println(word);

		System.out.println(word.repeat(5) +"\n");

		var word2 = "\tHello World\t"; 
		System.out.println(word + word2 + word);
		System.out.println("strip Trailing -> " + word + word2.stripTrailing() + word);
		System.out.println("Strip Leading ->"+ word + word2.stripLeading() + word);
		System.out.println("Strip -> " + word + word2.strip() + word);
		
		var word3="    "; 
		System.out.println("is word3 empty " + word3.isEmpty());
		System.out.println("is word3 blank " + word3.isBlank());
		
		var words ="welcome\nto\nlearning\njava11";
		words.lines().forEach(System.out :: println);
		
		System.out.println("---------------------------");
		
		words.lines().map(String::toUpperCase).forEach(System.out :: println);
	}
}
