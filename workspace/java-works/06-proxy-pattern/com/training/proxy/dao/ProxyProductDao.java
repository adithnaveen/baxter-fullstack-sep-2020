package com.training.proxy.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyProductDao implements InvocationHandler{

	private Object target; 
	
	public ProxyProductDao(Object target) {
		this.target = target; 
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object retVal = null; 
		
		switch (method.getName()) {
		case "saveProduct":
		case "deleteProduct": 
		
			System.out.println("*** Begining Transaction*** ");
			// delegate the call to the actual target method (on DummyProdutDao)  
			retVal = method.invoke(target, args); 
			System.out.println("*** End Transaction*** ");
			System.out.println("--------------------------------------");
			break;

		case "getProductCount": 
			retVal = method.invoke(target, args); 
			break;
			
		default:
			throw new RuntimeException("Unknown method for proxy"); 
		}
		
		return retVal; 
	}

}
