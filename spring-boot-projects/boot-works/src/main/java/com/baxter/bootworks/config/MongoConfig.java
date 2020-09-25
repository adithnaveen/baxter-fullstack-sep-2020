package com.baxter.bootworks.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.baxter.bootworks.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig {

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return string -> {
//			userRepository.insert(new User(101, "pranav", 34, "pranav@baxter.in",
//					new Address(66, "RR Nagar", "Bengaluru", "KA", 560098)));
//			userRepository.insert(new User(102, "Suhasini", 28, "Suhasini@baxter.in",
//					new Address(66, "RR Nagar", "Mangaluru", "KA", 580098)));
		};
	}

}
