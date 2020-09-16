package com.training.java11;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Matcher02 {
	public static void main(String[] args) {
		var companNames = Arrays.asList("Baxter", "Baxter India", "Baxter USA", "Manipal Bengaluru"); 
		
		var predicate = Pattern.compile("Baxter", Pattern.CASE_INSENSITIVE).asPredicate(); 
		
		
		companNames.forEach((company) -> {
			if(predicate.test(company)) {
				System.out.println("Matches in the list " + company);
			}else {
				System.out.println("Does Not Match in the list "+ company);
			}
		});
	}
}
