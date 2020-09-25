package com.baxter.bootworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.manipal.bootworks"})
public class BootWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWorksApplication.class, args);
	}
}
