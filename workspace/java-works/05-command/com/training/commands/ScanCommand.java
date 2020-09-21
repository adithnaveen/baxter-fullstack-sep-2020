package com.training.commands;

import com.training.devices.IElectronicDevice;

public class ScanCommand implements Command{
	private IElectronicDevice device;

	public ScanCommand(IElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.scan();
	}
}
