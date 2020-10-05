package com.baxter.bootworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.manipal.bootworks"})
public class BootWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWorksApplication.class, args);
	}
}
