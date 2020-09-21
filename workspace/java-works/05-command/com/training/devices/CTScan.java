package com.training.devices;

public class CTScan implements IElectronicDevice{

	@Override
	public void switchOn() {
		System.out.println("CT Scan on.. ");
	}

	@Override
	public void switchOff() {

		System.out.println("CT Scan off.. ");
	}

	@Override
	public void scan() {
		System.out.println("Scanning in CT Scan... ");
	}

	@Override
	public void up() {
		System.out.println("Up- CT Scan");
	}

	@Override
	public void down() {
		System.out.println("Down - CT Scan s");
		
	}

}
