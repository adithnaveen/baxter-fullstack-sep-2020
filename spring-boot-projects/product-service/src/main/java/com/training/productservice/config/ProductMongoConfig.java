package com.training.productservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.training.productservice.bean.Product;
import com.training.productservice.repo.ProductRepo;

@Configuration
// is dependent on MongoRepo 
@EnableMongoRepositories(basePackageClasses = ProductRepo.class)
public class ProductMongoConfig {

	// insert few records in to the db 
	@Bean
	public CommandLineRunner commandLineRunner(ProductRepo repo) {
		return string -> {
//			repo.insert(new Product(101, "Monitor", 1234.0, 5.0)); 
//			repo.insert(new Product(102, "Mobile", 4444.0, 2.0)); 
//			repo.insert(new Product(103, "KeyBoard", 500.0, 10.0)); 
		}; 
	}
}
