package com.training.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.productservice.bean.Product;
import com.training.productservice.repo.ProductRepo;

@Service
public class ProductService implements IProductService {
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product getProduct(Integer productId) {
		return productRepo.findById(productId).get(); 
	}
	
	@Override
	public Product insertProduct(Product product) {
		return productRepo.insert(product); 
	}
	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll(); 
	}
}
