package com.training.servicelocator.lookup;

import com.training.servicelocator.db.MysqlService;
import com.training.servicelocator.db.OracleService;

public class InitialContext {
	
	public Object lookup(String jndiName) {
		if(jndiName.equalsIgnoreCase("mysql")) {
			System.out.println("Look up for mysql called... getting the service>>>> ");
			return new MysqlService(); 
		}else if (jndiName.equalsIgnoreCase("oracle")) {
			System.out.println("Look up for Oarcle called... getting the service>>>> ");
			return new OracleService(); 
		}
		
		return null; 
	}
	
}
