package com.training.productservice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import com.training.productservice.bean.Product;
import com.training.productservice.service.IProductService;

@WebMvcTest
class ProductWebLayerTest {

	@Autowired
	private MockMvc mockMvc; 
	
	@MockBean
	private IProductService productService;  
	
	@BeforeEach
	public void setUp() {
		 Product product = new Product(101, "Monitor", 1000.00, 5.0); 
		 when(productService.getProduct(101)).thenReturn(product); 
	}
	
	@Test
	void shouldReturnDefaultMessage() throws Exception {
		String uri="/product/101"; 
		 mockMvc
		 	.perform(get(uri))
		 	.andDo(print())
		 	.andExpect(status().isOk())
		 	.andExpect(content()
		 		.string(containsString("Monitor")));
	}

}













