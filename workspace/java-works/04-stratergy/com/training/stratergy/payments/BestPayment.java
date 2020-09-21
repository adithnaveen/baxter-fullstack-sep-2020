package com.training.stratergy.payments;

import com.training.stratergy.contract.PaymentStratergy;
import com.training.stratergy.paymentmodes.CreditCard;
import com.training.stratergy.paymentmodes.UPI;

public class BestPayment {
	public PaymentStratergy bestPay(String ... args) {
		// if you want credit card 
//		String name, String creditCardNo, int cvv, String dateOfExpiry 
		
//		if you want UPI 
//		String mobileNumber, int otp
		
		return CreditCard.getCharges() < UPI.getCharges() ? 
				new CreditCard(args[0], args[1], Integer.parseInt(args[2]), args[3]) : 
					new UPI(args[0], Integer.parseInt(args[1])); 
				
	}
	
	/// if we have already stored credit card information or UPI 
	public PaymentStratergy bestPay() {
		return CreditCard.getCharges() < UPI.getCharges() ? 
				new CreditCard() : new UPI(); 
	}
}
