package com.training.dao;

import java.util.ResourceBundle;

import com.training.dao.impl.HibernateProductDao;
import com.training.dao.impl.JDBCProductDao;
import com.training.dao.impl.MongoProductDao;

// since we dont want any body to create an instance 
// make it private, no body should inherit 
public final class DaoFactory {
	// creating an object of this is resource intensive 
	private DaoFactory () {}
	
	
	public static IProductDao getProductDao() {
		ResourceBundle rb = ResourceBundle.getBundle("application"); 
		
		String dbSelect = rb.getString("productDao.impl"); 
		return getProductDao(dbSelect); 
	}
	
	private static IProductDao getProductDao(String db) {
		System.out.println("Db Selected is " + db);
		
		switch (db.toLowerCase()) {
		case "jdbc":
			return new JDBCProductDao(); 
		case "hibernate":
			return new  HibernateProductDao();  
		case "mongo":
			return new MongoProductDao(); 

		default:
			throw new RuntimeException("Invalid DB Selected"+  db); 
		}
		
	}
}
