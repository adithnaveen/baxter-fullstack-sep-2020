package com.training.servicelocator.db;

import com.training.servicelocator.contracts.Service;

public class MysqlService implements Service {

	@Override
	public String getName() {
		return "MySql";  
	}

	@Override
	public void executeService() {
		// they load the data from xml or prop 
		System.out.println("MySql service loading .... ");
	}

}
