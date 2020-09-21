package com.training.dao.impl;

import com.training.dao.IProductDao;

public class JDBCProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("JDC - Save ");
	}

	@Override
	public void delete() {
		System.out.println("JDBC - Delete");
	}

}
