package com.baxter.training01;

public class GenAvgDemo {
	public static void main(String[] args) {
		Integer inums[] = {1,2,3,4,5}; 

		GenAvg<Integer> iObjs = new GenAvg<Integer>(inums); 
		
		double avgOfInts = iObjs.average(); 
		System.out.println(avgOfInts);
		
		String sarr[] = new String[] {"hello", "how", "are", "you" }; 
		
		//since string is not a child of number 
		// we cannot pass the data 
//		GenAvg<String> strobj = ÷new GenAvg<String>(); 
		
		
		
	}
}
 
