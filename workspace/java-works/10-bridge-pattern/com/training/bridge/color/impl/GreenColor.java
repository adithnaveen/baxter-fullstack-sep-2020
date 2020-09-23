package com.training.bridge.color.impl;

import com.training.bridge.contract.Color;

public class GreenColor implements Color{

	@Override
	public void applyColor() {
		System.out.println("Applying green color... ");
	}

}
