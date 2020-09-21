package com.training.dao.impl;

import com.training.dao.IProductDao;

public class HibernateProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("Save with Hibernate... ");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete with Hibernate... ");
	}

}
