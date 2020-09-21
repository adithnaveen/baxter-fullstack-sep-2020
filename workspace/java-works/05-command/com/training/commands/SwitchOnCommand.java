package com.training.commands;

import com.training.devices.IElectronicDevice;

public class SwitchOnCommand implements Command {
	private IElectronicDevice device;

	public SwitchOnCommand(IElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.switchOn(); 
	}
}
