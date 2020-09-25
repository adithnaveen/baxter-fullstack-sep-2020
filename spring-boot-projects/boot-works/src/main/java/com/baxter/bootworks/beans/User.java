package com.baxter.bootworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
//@AllArgsConstructor
@Document
public class User {
	@Id
	private Integer id; 
	private String userName; 
	private Integer userAge; 
	private String userEmail;
	
	private Address address;

	public User(Integer id, String userName, Integer userAge, String userEmail, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.address = address;
	} 
	
	
}
