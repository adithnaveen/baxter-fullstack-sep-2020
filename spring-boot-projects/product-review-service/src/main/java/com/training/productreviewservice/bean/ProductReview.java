package com.training.productreviewservice.bean;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@AllArgsConstructor
@ToString
@NoArgsConstructor

// all one more field called product id 


public class ProductReview {
	@Id
	private Integer reviewId;
	private String reviewerName; 
	private String message;
	public ProductReview(Integer reviewId, String reviewerName, String message) {
		super();
		this.reviewId = reviewId;
		this.reviewerName = reviewerName;
		this.message = message;
	} 
	
	
	
}
