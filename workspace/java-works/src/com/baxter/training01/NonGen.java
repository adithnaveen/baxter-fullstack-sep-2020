package com.baxter.training01;

public class NonGen {
	Object obj; 
	
	public NonGen(Object obj) {
		this.obj = obj; 
	}
	
	public Object getObj() {
		return obj; 
	}
	
	public void showType() {
		System.out.println("Type is : " + obj.getClass().getName());
	}
	
}
