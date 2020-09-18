package com.training.dao.impl;

import com.training.dao.IProductDao;

public class MongoProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("MongoDB - Save");
	}

	@Override
	public void delete() {
		System.out.println("MongoDB - Delete.. ");
	}

}
