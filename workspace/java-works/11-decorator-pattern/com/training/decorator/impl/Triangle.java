package com.training.decorator.impl;
 
import com.training.decorator.contract.Shape;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Triangle... ");
	}
 
	
}
