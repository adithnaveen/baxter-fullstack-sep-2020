package com.training.productreviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient("productreviewservice")
public class ProductReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductReviewServiceApplication.class, args);
	}

}
