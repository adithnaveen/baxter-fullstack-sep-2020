package com.training.decorator.decorate;

import com.training.decorator.contract.Shape;

public abstract class ShapeDecorator implements Shape{
	protected Shape decorateShape; 
	
	public ShapeDecorator(Shape shape) {
		decorateShape = shape; 
	}
	
	public void draw() {
		decorateShape.draw(); 
	}
	
}
