package com.baxter.training01;

public class NonGenDemo {
	public static void main(String[] args) {
		NonGen iObj = new NonGen(100); 
		System.out.println(iObj.getObj());
		iObj.showType();
		
		iObj = new NonGen("String"); 
		
		String myString = (String) iObj.getObj(); 
		System.out.println(myString);
		
		// Integer x = "String" ; 
		Integer myInteger = (Integer) iObj.getObj(); 
		System.out.println(myInteger);
	}
}
