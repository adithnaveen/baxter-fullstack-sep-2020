package com.baxter.bootworks.beans;

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
public class Address {
	public Integer houseNo;
	public String street;
	public String city;
	public String state;
	public Integer pin;
	public Address(Integer houseNo, String street, String city, String state, Integer pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	
}