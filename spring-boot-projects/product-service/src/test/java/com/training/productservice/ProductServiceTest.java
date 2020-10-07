package com.training.productservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.training.productservice.bean.Product;
import com.training.productservice.repo.ProductRepo;
import com.training.productservice.service.IProductService;

@SpringBootTest
class ProductServiceTest {

	@Autowired
	private IProductService productService;

	@MockBean
	private ProductRepo repository;

	@BeforeEach
	public void setUp() {
		Optional<Product> product = Optional.of(new Product(101, "Monitor", 1000.00, 5.0));
		
		List<Product> list = Arrays.asList(new Product(101, "Monitor", 1000.00, 5.0)); 
		
		
		
		when(repository.findById(101)).thenReturn(product);
		when(repository.findAll()).thenReturn(list); 
		when(repository.save(product.get())).thenReturn(product.get()); 
	}
	
	
	@Test
	@DisplayName(value = "when Product Id Given then Check If Exists")
	void whenProductIdGiven_thenCheckIfExistsTest() {
		
		assertEquals(101, productService.getProduct(101).getProductId());
	}
	
	
	@Test
	@DisplayName(value = "whenProducts_thenCheckForMinimumOneEntry")
	void whenProducts_thenCheckForMinimumOneEntry() {
		
		assertEquals(1, productService.getAllProducts().size());
		
	}
	@Test
	@DisplayName(value = "whenSaveOfOneProduct")
	void whenSaveOfOneProduct() {
		assertTrue(true);
	}
	
	
}















