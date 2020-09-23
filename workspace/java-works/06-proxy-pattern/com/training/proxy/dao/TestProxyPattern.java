package com.training.proxy.dao;

public class TestProxyPattern {
	public static void main(String[] args) {
		IProductDao dao = DaoFactory.getProductDao(); 
		
		System.out.println("dao is instance of " + dao.getClass());
		
		dao.saveProduct(); 
		dao.deleteProduct(); 
		
		var count = dao.getProductCount();
		System.out.println("There are " + count +" number of product... ");
	}
}
