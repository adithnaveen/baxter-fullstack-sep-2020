package com.training.abs.factory;

import com.training.abs.contracts.ICustomerDAO;
import com.training.abs.contracts.IEmployeeDAO;
import com.training.abs.contracts.IProductDAO;
import com.training.abs.customer.dao.CustomerDAOJDBCImpl;
import com.training.abs.employee.dao.EmployeeDAOJDBCImpl;

public class JdbcDaoFactory extends DaoFactory {

	@Override
	public IEmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOJDBCImpl();
	}

	@Override
	public ICustomerDAO getCustomerDAO() {
		return new CustomerDAOJDBCImpl();
	}

	@Override
	public IProductDAO getProductDAO() {
		// TODO Auto-generated method stub
		// TODO 
		return null;
	}

}
