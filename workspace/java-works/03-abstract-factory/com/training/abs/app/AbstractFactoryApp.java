package com.training.abs.app;

import com.training.abs.contracts.ICustomerDAO;
import com.training.abs.contracts.IEmployeeDAO;
import com.training.abs.factory.DaoFactory;

public class AbstractFactoryApp {
	public static void main(String[] args) {
		DaoFactory daoFactory = DaoFactory.getInstance(); 
		
		System.out.println("Factory is instance of " + daoFactory.getClass());
		
		ICustomerDAO customerDao = daoFactory.getCustomerDAO(); 
		IEmployeeDAO employeeDAO = daoFactory.getEmployeeDAO(); 
		
		
		customerDao.saveCustomer(); 
		employeeDAO.saveEmployee(); 
		
	}
}
