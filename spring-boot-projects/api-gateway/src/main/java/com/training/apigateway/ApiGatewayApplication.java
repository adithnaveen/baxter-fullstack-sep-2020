package com.training.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
 import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.training.apigateway.filters.PostFilter;
import com.training.apigateway.filters.PreFilter;

import brave.sampler.Sampler;
 

@Configuration
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter(); 
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter(); 
	}

	@Bean
	public Sampler defualSampler() {
		return Sampler.ALWAYS_SAMPLE; 
	}
}
