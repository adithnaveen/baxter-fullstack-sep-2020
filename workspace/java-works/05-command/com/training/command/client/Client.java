package com.training.command.client;

import com.training.command.remote.RemoteControl;
import com.training.command.util.Operate;
import com.training.devices.CTScan;
import com.training.devices.Television;

public class Client {
	public static void main(String[] args) {
		Television tv = new Television(); 
		CTScan ct = new CTScan(); 
		
		RemoteControl rc = new RemoteControl(tv); 
		Operate.operate(rc);
		
		System.out.println("----------------------------");
		rc.changeDevice(ct);
		
		Operate.operate(rc);

		
	}
}
