package com.training.abs.factory;

import com.training.abs.contracts.ICustomerDAO;
import com.training.abs.contracts.IEmployeeDAO;
import com.training.abs.contracts.IProductDAO;
import com.training.abs.customer.dao.CustomerDAOJPAImpl;
import com.training.abs.employee.dao.EmployeeDAOJPAImpl;

public class JpaDaoFactory extends DaoFactory {

	@Override
	public IEmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOJPAImpl(); 
	}

	@Override
	public ICustomerDAO getCustomerDAO() {
		return new CustomerDAOJPAImpl(); 
	}

	@Override
	public IProductDAO getProductDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
