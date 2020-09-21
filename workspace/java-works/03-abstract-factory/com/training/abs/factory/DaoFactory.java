package com.training.abs.factory;

import java.util.ResourceBundle;

import com.training.abs.contracts.ICustomerDAO;
import com.training.abs.contracts.IEmployeeDAO;
import com.training.abs.contracts.IProductDAO;

// should not create an object of this as this will be 
// resource intensive 
public abstract class DaoFactory {

	// lazy
	// will get invoked only once when the application loads

	static class Holder {

		private static DaoFactory instance = null;
		static {
			// look for application.properties 
			ResourceBundle rb = ResourceBundle.getBundle("application");
			try {
			String factoryImplClass = rb.getString("dao.factory"); 
			instance = (DaoFactory) Class.forName(factoryImplClass).getDeclaredConstructor().newInstance();
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		}
	}
	
	public static DaoFactory getInstance() {
		return Holder.instance; 
	}
	
	public abstract IEmployeeDAO getEmployeeDAO(); 
	public abstract ICustomerDAO getCustomerDAO(); 
	
	// this is still not implemented 
	public abstract IProductDAO getProductDAO(); 
	
	
	
}
