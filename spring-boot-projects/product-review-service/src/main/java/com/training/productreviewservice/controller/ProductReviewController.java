package com.training.productreviewservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.productreviewservice.bean.ProductReview;
import com.training.productreviewservice.service.ProductReviewService;

@RestController
public class ProductReviewController {
	
	@Autowired
	private ProductReviewService service; 

	@Autowired
	private Environment environment; 
	
	
	
	@GetMapping("/reviews")
	public List<ProductReview> getAllReviews() {
		System.out.println("invoked with "+ environment.getProperty("local.server.port"));
		return service.getAllReviews(); 
	}
	
	@GetMapping("/review/{id}")
	public ProductReview getReview(@PathVariable Integer id) {
		System.out.println("invoked with "+ environment.getProperty("local.server.port"));

		 ProductReview review = service.getReview(id);
		 review.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		 return review; 
	}
	
}
