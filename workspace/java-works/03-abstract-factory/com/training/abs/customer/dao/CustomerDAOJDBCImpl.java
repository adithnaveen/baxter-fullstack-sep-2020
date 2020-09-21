package com.training.abs.customer.dao;

import com.training.abs.contracts.ICustomerDAO;

public class CustomerDAOJDBCImpl implements ICustomerDAO{

	@Override
	public void saveCustomer() {
		System.out.println("Saving customer using JDBC API... ");
	}

}
