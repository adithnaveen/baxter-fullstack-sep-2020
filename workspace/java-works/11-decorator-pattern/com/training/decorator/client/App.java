package com.training.decorator.client;

import com.training.decorator.contract.Shape;
import com.training.decorator.decorate.impl.RedShapeDecorator;
import com.training.decorator.impl.Circle;

public class App {
	public static void main(String[] args) {
		// this is vanialla without any decorator.. 
		Shape shape = new Circle(); 
		
		shape.draw(); 
		System.out.println("-----------------------------------");
		Shape redCircle = new RedShapeDecorator(new Circle()); 
		redCircle.draw(); 
		
	}
}
