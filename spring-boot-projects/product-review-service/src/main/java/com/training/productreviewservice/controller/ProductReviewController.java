package com.training.productreviewservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.productreviewservice.bean.ProductReview;
import com.training.productreviewservice.service.ProductReviewService;

@RestController
public class ProductReviewController {
	
	@Autowired
	private ProductReviewService service; 
	
	
	@GetMapping("/reviews")
	public List<ProductReview> getAllReviews() {
		return service.getAllReviews(); 
	}
	
	@GetMapping("/review/{id}")
	public ProductReview getReview(@PathVariable Integer id) {
		return service.getReview(id); 
	}
	
}
