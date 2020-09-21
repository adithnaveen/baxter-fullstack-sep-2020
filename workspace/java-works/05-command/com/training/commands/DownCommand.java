package com.training.commands;

import com.training.devices.IElectronicDevice;

public class DownCommand implements Command{

	// a command object HAS-A electronic deivce 
	// upon which it operates 
	private IElectronicDevice device; 
	
	public DownCommand(IElectronicDevice device) {
		this.device = device; 
	}
	
	@Override
	public void execute() {
		device.down(); 
	}

}
