package com.training.abs.employee.dao;

import com.training.abs.contracts.IEmployeeDAO;

public class EmployeeDAOJPAImpl implements IEmployeeDAO {

	@Override
	public void saveEmployee() {
		System.out.println("Save Employee JPA Way... ");
	}

}
