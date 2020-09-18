package com.training.client;

import com.training.dao.DaoFactory;
import com.training.dao.IProductDao;

public class FactoryClient {
	public static void main(String[] args) {
		// is called tight coupling 
		IProductDao productDao ; 
		productDao = DaoFactory.getProductDao(); 
		
		productDao.save(); 
		productDao.delete();
	}
}
