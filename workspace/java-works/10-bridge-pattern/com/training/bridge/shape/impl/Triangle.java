package com.training.bridge.shape.impl;

import com.training.bridge.contract.Color;
import com.training.bridge.contract.Shape;

public class Triangle extends Shape{

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle filled with color.");
		color.applyColor();
	}
	
}
