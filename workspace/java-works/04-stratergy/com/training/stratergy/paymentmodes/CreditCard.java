package com.training.stratergy.paymentmodes;

import com.training.stratergy.contract.PaymentStratergy;

public class CreditCard implements PaymentStratergy {

	private String name; 
	private String creditCardNo; 
	private int cvv; 
	private String dateOfExpiry; 
	private static double charges = 1.5; 
	
	
	public static double getCharges() {
		return charges;
	}
	// assume this will be retrived from DB 

	public CreditCard() {
		this.name = "Pranav"; 
		this.creditCardNo="12345645454"; 
		this.cvv = 123; 
		this.dateOfExpiry ="10/25"; 
		
	}

	
	public CreditCard(String name, String creditCardNo, int cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.creditCardNo = creditCardNo;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount " + amount +" paid with Creditcard No : " + creditCardNo);
	}

}
