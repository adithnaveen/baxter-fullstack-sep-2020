package com.training.command.util;

import com.training.command.remote.RemoteControl;

public class Operate {
	public static void operate(RemoteControl rc) {
		rc.on(); 
		rc.off(); 
		rc.down();
		rc.up();
		rc.scan();
	}
}
