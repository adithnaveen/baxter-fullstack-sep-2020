package com.training.productservice.bean;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	@Id
	private Integer productId; 
	private String productName; 
	private Double productPrice; 
	private Double productDiscount;
	

	public Product(Integer productId, String productName, Double productPrice, 
			Double productDiscount 
			) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
	} 

	

}
