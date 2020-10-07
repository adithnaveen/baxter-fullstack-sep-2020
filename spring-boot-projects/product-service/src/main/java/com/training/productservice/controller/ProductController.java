package com.training.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.productservice.bean.Product;
import com.training.productservice.bean.ProductWithReview;
import com.training.productservice.proxy.ProductReviewProxy;
import com.training.productservice.service.IProductService;

@RestController
public class ProductController {
	@Autowired
	private IProductService service;

//	@Autowired
//	private ProductReviewProxy proxy;

	@GetMapping("/")
	public String working() {
		return "Working"; 
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		return service.getProduct(id);
	}

	@GetMapping("/product-rest/{id}")
	public Product getProductRestTemplate(@PathVariable Integer id) {

		ResponseEntity<String> entity = new RestTemplate().getForEntity("http://localhost:9200/review/" + id,
				String.class);

		System.out.println("Response from RestTemplate -> " + entity);

		return service.getProduct(id);
	}

//	@GetMapping("/product-feign/{id}")
//	public ProductWithReview getProductFeign(@PathVariable Integer id) {
//
//		System.out.println("Response from Feign -> " + proxy.getProductReviewById(id));
//		ProductWithReview pwr = new ProductWithReview(); 
//		pwr.setProduct(service.getProduct(id));
//		pwr.setProductReview(proxy.getProductReviewById(id));
//		return pwr; 
//	}

	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		return service.insertProduct(product);
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/fault-tolenrance")
	@HystrixCommand( fallbackMethod =  "fallBackHystrixMethod")
	public String hystrixExcample() {
		
		String str = "Some String" ;
		if(str.equals("Hello")) {
			return str; 
		}else {
			throw new RuntimeException("Sorry wrong data"); 
		}
	}
	
	
	
	public String fallBackHystrixMethod() {
		return "Hello Returened Default"; 
	}
	
	
}
