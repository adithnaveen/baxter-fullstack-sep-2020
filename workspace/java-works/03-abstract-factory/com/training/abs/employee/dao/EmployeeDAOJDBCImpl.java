package com.training.abs.employee.dao;

import com.training.abs.contracts.IEmployeeDAO;

public class EmployeeDAOJDBCImpl implements IEmployeeDAO {

	@Override
	public void saveEmployee() {
		System.out.println("Save Employee JDBC Way... ");
	}

}
