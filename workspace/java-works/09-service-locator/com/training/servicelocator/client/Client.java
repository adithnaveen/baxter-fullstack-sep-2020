package com.training.servicelocator.client;

import com.training.servicelocator.contracts.Service;
import com.training.servicelocator.locator.ServiceLocator;

public class Client {
	public static void main(String[] args) {
		Service ms = ServiceLocator.getService("mysql"); 
		ms.executeService(); 
		
		System.out.println("--------------------------------------");
		ms = ServiceLocator.getService("mysql"); 
		ms.executeService(); 
		
		
		System.out.println("--------------------------------------");
		ms = ServiceLocator.getService("mysql"); 
		ms.executeService(); 
	}
}
