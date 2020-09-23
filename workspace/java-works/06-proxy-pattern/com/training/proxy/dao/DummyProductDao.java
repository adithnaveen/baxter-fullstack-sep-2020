package com.training.proxy.dao;

public class DummyProductDao implements IProductDao {

	@Override
	public void saveProduct() {
		System.out.println("Saving product... ");
	}

	@Override
	public void deleteProduct() {
		System.out.println("Deleting product... ");
	}

	@Override
	public int getProductCount() {
		System.out.println("Getting product count from DB ");
		return 88; 
	}

}
