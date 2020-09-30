package com.training.productreviewservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.training.productreviewservice.bean.ProductReview;
import com.training.productreviewservice.repo.ProductReviewRepo;

@Configuration
// is dependent on MongoRepo 
@EnableMongoRepositories(basePackageClasses = ProductReviewRepo.class)
public class ProductMongoConfig {

	// insert few records in to the db 
	@Bean
	public CommandLineRunner commandLineRunner(ProductReviewRepo repo) {
		return string -> {

			// all one more field called product id 
//			repo.insert(new ProductReview(101, "Harry", "Nice Product")); 
//			repo.insert(new ProductReview(102, "Ravi", "Good Product")); 
//			repo.insert(new ProductReview(103, "Prashanth", "Can be better Product")); 
		}; 
	}
}
