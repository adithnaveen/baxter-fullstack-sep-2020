package com.training.stratergy.paymentmodes;

import com.training.stratergy.contract.PaymentStratergy;

public class UPI implements PaymentStratergy {
	private String mobileNumber;
	private int otp;
	private static double charges = 3.3;

	public static double getCharges() {
		return charges;
	}

	// assume this will be retrived from DB 
	public UPI() {
		this.mobileNumber = "9900524255";
		this.otp = 1234;
	}

	public UPI(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount : " + amount + " paid using UPI, Mobile Number :" + mobileNumber);
	}
}
