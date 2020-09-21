package com.training.commands;

import com.training.devices.IElectronicDevice;

public class UpCommand implements Command {
	private IElectronicDevice device;

	public UpCommand(IElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.up();
	}

}
