package com.training.bridge.shape.impl;

import com.training.bridge.contract.Color;
import com.training.bridge.contract.Shape;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Circle filled with color.");
		color.applyColor();
	}
	
}
