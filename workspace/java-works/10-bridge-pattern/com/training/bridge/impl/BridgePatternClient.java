package com.training.bridge.impl;

import com.training.bridge.color.impl.BlueColor;
import com.training.bridge.color.impl.GreenColor;
import com.training.bridge.color.impl.RedColor;
import com.training.bridge.contract.Color;
import com.training.bridge.contract.Shape;
import com.training.bridge.shape.impl.Circle;
import com.training.bridge.shape.impl.Triangle;

public class BridgePatternClient {
	public static void main(String[] args) {
		Color blueColor = new BlueColor(); 
		GreenColor greenColor = new GreenColor();
		RedColor redColor = new RedColor();
		
		Shape triangle = new Triangle(blueColor); 
		triangle.applyColor(); 
		
		Shape circle = new Circle(redColor); 
		circle.applyColor(); 
	}
}
