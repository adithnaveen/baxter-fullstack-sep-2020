package com.training.productservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.training.productservice.bean.Product;

// not a mock 
// once the development is done we will test if the mock is valid 
// make sure DB is on 
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ProductHttpRequestTest {

	@LocalServerPort
	private int port; 
	
	@Autowired
	private TestRestTemplate testRestTemplate; 
	
	
	@Test
	void sanityCheckUriTest() {
		assertEquals("Working", testRestTemplate.getForObject(testRestTemplate.getRootUri() +"/", String.class)); 
	}

	@Test
	public void getProductWithIdTest() {
		Product product = testRestTemplate.getForObject(testRestTemplate.getRootUri() +"/product/102", Product.class); 
		
		System.out.println(product);
		
		assertEquals("Monitor", product.getProductName());
	}
	
}
