package com.baxter.training01;

public class GenDemo {
	public static void main(String[] args) {
		/// Gen for Integers 
		Gen<Integer> iObj; 
		
		
		iObj = new Gen<Integer>(100); 
		
		 iObj.showType(); 
		
		 
		 Gen<String> sObj = new Gen<String>("Welcome"); 
		 sObj.showType(); 
		 System.out.println(sObj.getObj());
		 
	}
}
