package com.baxter.bootworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//@AllArgsConstructor
@Document
public class User { //  extends RepresentationModel<User>{
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
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAge=" + userAge + ", userEmail=" + userEmail
				+ ", address=" + address + "]";
	}
	
	
	
}
