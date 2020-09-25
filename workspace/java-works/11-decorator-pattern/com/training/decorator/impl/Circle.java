package com.training.decorator.impl;

import com.training.decorator.contract.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
 
	
}
