package com.training.servicelocator.db;

import com.training.servicelocator.contracts.Service;

public class OracleService implements Service {

	@Override
	public String getName() {
		return "Oracle";  
	}

	@Override
	public void executeService() {
		// they load the data from xml or prop 
		System.out.println("Oracle service loading .... ");
	}

}
