package com.baxter.training02;

public class MyClassDemo {
	public static void main(String[] args) {
		Integer intNums [] = {23,5,66,78,11,43};
		Character chars [] =  {'s', 'c', 'e', 'f' }; 
		
		MyClass<Integer> iobj = new MyClass<Integer>(intNums); 
		MyClass<Character> cobj = new MyClass<Character>(chars); 
		
		
		System.out.println("Min Value is " + iobj.min());
		System.out.println("Max Value is " + iobj.max());
		
		System.out.println("Min Char Value is : " + cobj.min());
		System.out.println("Max Char Value is " + cobj.max());
	}
}
