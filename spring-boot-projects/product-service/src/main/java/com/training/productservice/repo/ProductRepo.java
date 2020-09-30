package com.training.productservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.productservice.bean.Product;

// This will give CRUD operations 
public interface ProductRepo extends MongoRepository<Product, Integer> {

}
