package com.training.commands;

import com.training.devices.IElectronicDevice;

public class SwitchOffCommand  implements Command{
	private IElectronicDevice device;

	public SwitchOffCommand(IElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.switchOff();
	}
}
