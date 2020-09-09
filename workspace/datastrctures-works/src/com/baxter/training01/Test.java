package com.baxter.training01;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(); 
		
		a.add(1); 
		a.add(1.1); 
		
		ArrayList<Integer> b = a; 
		for(Integer temp : b) {
			System.out.println(temp);
		}
	}
}
