package com.training.productreviewservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.productreviewservice.bean.ProductReview;
import com.training.productreviewservice.repo.ProductReviewRepo;

@Service
public class ProductReviewService {
	
	@Autowired
	private ProductReviewRepo repo ; 
	
	
	public List<ProductReview> getAllReviews() {
		return repo.findAll(); 
	}
	
	public ProductReview getReview(Integer id) {
		return repo.findById(id).get(); 
	}
	
}
