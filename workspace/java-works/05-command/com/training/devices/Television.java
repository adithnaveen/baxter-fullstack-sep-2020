package com.training.devices;

public class Television implements IElectronicDevice{

	@Override
	public void switchOn() {
		System.out.println("Television Switch On");
	}

	@Override
	public void switchOff() {
		System.out.println("Television switch OFff");
	}

	@Override
	public void scan() {
		System.out.println("Scan for channel");
	}

	@Override
	public void up() {
		System.out.println("up channel by 1");
	}

	@Override
	public void down() {
		System.out.println("Down channel by 1");
	}
	
}
