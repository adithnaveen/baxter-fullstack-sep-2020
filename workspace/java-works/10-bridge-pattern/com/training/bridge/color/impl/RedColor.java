package com.training.bridge.color.impl;

import com.training.bridge.contract.Color;

public class RedColor implements Color{

	@Override
	public void applyColor() {
		System.out.println("Applying red color... ");
	}

}
