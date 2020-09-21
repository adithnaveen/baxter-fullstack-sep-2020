package com.training.command.remote;

import com.training.commands.Command;
import com.training.commands.DownCommand;
import com.training.commands.ScanCommand;
import com.training.commands.SwitchOffCommand;
import com.training.commands.SwitchOnCommand;
import com.training.commands.UpCommand;
import com.training.devices.IElectronicDevice;

public class RemoteControl {
	private Command upCommand; 
	private Command downCommand; 
	private Command switchOnCommand; 
	private Command switchOffCommand; 
	private Command scanCommand;
	
	public RemoteControl(IElectronicDevice device) {
		this.upCommand = new UpCommand(device); 
		this.downCommand = new DownCommand(device); 
		this.switchOnCommand = new SwitchOnCommand(device); 
		this.switchOffCommand = new SwitchOffCommand(device); 
		this.scanCommand = new ScanCommand(device); 
		
	}
	public void changeDevice (IElectronicDevice device) {
		this.upCommand = new UpCommand(device); 
		this.downCommand = new DownCommand(device); 
		this.switchOnCommand = new SwitchOnCommand(device); 
		this.switchOffCommand = new SwitchOffCommand(device); 
		this.scanCommand = new ScanCommand(device); 
	}
	
	public void on() {
		switchOnCommand.execute(); 
	} 
	public void off() {
		switchOffCommand.execute();
	} 
	public void up() {
		upCommand.execute(); 
	}	
	public void down() {
		downCommand.execute(); 
	}
	public void scan() {
		scanCommand.execute(); 
	}
	
	
}













