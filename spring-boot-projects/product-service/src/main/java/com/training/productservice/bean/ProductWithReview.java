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
public class ProductWithReview {
	private Product product; 
	private ProductReview productReview; 
	
	
	public ProductWithReview( Product product,  ProductReview productReview) {
		this.product  = product; 
		this.productReview = productReview; 
	} 

	

}
