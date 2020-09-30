package com.training.productservice.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.training.productservice.bean.Product;

@Component
public interface IProductService {

	Product getProduct(Integer productId);

	Product insertProduct(Product product);

	public List<Product> getAllProducts();
}