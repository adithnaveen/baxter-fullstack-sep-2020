package com.training.servicelocator.cache;

import java.util.ArrayList;
import java.util.List;

import com.training.servicelocator.contracts.Service;

public class Cache {
	
	private List<Service> services; 
	
	public Cache() {
		services = new ArrayList<Service>(); 
	}
	// get the cached service 
	public Service getService(String serviceName) {
		for(Service service : services) {
			if(service.getName().equalsIgnoreCase("mysql")) {
				System.out.println("Service returned from the cache " + service.getName());
				// we are not creating an object of any service 
				return service; 
			}
		}
		return null; 
	}
	
	// we dont have to cache all the services rather 
	// cache only the required one 
	public void addService(Service newService) {
		boolean exists = false; 
		for(Service service : services) {
			if(service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true; 
			}
		}
		
		// you have to load it 
		if(!exists) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		services.add(newService); 
	}
	
}









