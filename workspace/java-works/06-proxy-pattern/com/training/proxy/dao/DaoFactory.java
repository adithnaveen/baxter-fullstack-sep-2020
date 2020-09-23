package com.training.proxy.dao;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public final class DaoFactory {
	private DaoFactory() {
	}
	
	public static IProductDao getProductDao() {
		// check if the prorxy is enable or disable 
		ResourceBundle rb = ResourceBundle.getBundle("application"); 
		String value = rb.getString("productDao.enable.proxy"); 
		
		// since its deprecated 
//		new Boolean("true"); 
		
		Boolean proxyEnabled = Boolean.valueOf(value); 
		
		if(proxyEnabled) {
			return (IProductDao) Proxy.newProxyInstance(
					DaoFactory.class.getClassLoader(),  	/// class loader 
					new Class[] {IProductDao.class},		// list of interfaces 
					new ProxyProductDao(new DummyProductDao()));	// proxy instance 
		}else  {
			return new DummyProductDao(); 
		}
	}
	
}
