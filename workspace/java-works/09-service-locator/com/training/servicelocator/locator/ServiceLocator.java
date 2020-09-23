package com.training.servicelocator.locator;

import com.training.servicelocator.cache.Cache;
import com.training.servicelocator.contracts.Service;
import com.training.servicelocator.lookup.InitialContext;

// this class will locate for the object and return 
public class ServiceLocator {

	private static Cache cache; 
	
	static {
		cache = new Cache(); 
	}
	
	public static Service getService(String jndiName) {
		System.out.println("in ServiceLocator.getService-> " + jndiName);
		Service service = cache.getService(jndiName); 
		
		if(service != null) {
			return service; 
		}
		
		InitialContext context = new InitialContext(); 
		
		Service newService = (Service) context.lookup(jndiName); 
		// if you want to cache 
		cache.addService(newService);
		return newService; 
	}
	
	
}
