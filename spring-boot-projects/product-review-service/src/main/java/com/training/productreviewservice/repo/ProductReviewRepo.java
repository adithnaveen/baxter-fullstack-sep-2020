package com.training.productreviewservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.productreviewservice.bean.ProductReview;

// This will give CRUD operations 
public interface ProductReviewRepo extends MongoRepository<ProductReview, Integer> {

}
