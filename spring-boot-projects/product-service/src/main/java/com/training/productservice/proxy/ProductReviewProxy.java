package com.training.productservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.productservice.bean.ProductReview;

// this is registered with eureka 
@FeignClient("productreviewservice")
public interface ProductReviewProxy {

	@GetMapping("/review/{id}")
	public ProductReview getProductReviewById(@PathVariable Integer id);
}
