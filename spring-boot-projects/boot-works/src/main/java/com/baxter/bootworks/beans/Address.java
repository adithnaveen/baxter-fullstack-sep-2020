package com.baxter.bootworks.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
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

	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Integer getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getPin() {
		return pin;
	}


	public void setPin(Integer pin) {
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state + ", pin="
				+ pin + "]";
	}

	

}
