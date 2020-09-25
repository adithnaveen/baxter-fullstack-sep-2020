package com.training.decorator.decorate.impl;

import com.training.decorator.contract.Shape;
import com.training.decorator.decorate.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		decorateShape.draw();
		setRedColor(decorateShape); 
	}
	
	private void setRedColor(Shape decoratedShape) {
		System.out.println("Its pained in Red Color");
	}

}
