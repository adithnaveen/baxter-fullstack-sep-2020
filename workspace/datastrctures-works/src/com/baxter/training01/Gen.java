package com.baxter.training01;

public class Gen<T> {
	// is of object type 
	T obj; 
	
	// reference to Object type T 
	public Gen(T o) {
		this.obj = o; 
	}
	
	public T getObj() {
		return obj; 
	}
	
	public void showType() {
		System.out.println("Type of the T : " + obj.getClass().getTypeName());
	}
	
}
