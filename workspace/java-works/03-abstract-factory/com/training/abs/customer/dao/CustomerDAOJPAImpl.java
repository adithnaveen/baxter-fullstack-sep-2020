package com.training.abs.customer.dao;

import com.training.abs.contracts.ICustomerDAO;

public class CustomerDAOJPAImpl implements ICustomerDAO{

	@Override
	public void saveCustomer() {
		System.out.println("Saving customer using JPA API... ");
	}

}
