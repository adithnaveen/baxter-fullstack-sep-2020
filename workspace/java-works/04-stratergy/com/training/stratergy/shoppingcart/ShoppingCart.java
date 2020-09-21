package com.training.stratergy.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.training.stratergy.contract.IShoppingCart;
import com.training.stratergy.contract.PaymentStratergy;
import com.training.stratergy.entity.Item;
import com.training.stratergy.paymentmodes.CreditCard;
import com.training.stratergy.paymentmodes.UPI;
import com.training.stratergy.payments.BestPayment;

public class ShoppingCart implements IShoppingCart {

	private List<Item> items; 
	private BestPayment bestPayment; 
	
	public ShoppingCart() {
		items = new ArrayList<Item>(); 
	}
	
	@Override
	public void addItem(Item item) {
		items.add(item); 
		
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item); 
	}

	@Override
	public int calculateTotal(PaymentStratergy paymentStratergy) {
		int sum = 0; 
		for(Item item : items) {
			sum += item.getPrice() * item.getCount(); 
		}
		
		if(paymentStratergy instanceof CreditCard) {
			double charges = (CreditCard.getCharges() * sum)/100; 
			System.out.println("Credit Cart Payment Charges " + charges);
			sum += charges; 
		}else if(paymentStratergy instanceof UPI) {
			double charges = (UPI.getCharges() * sum)/100;
			System.out.println("UPI Charges " + charges);
			sum += charges; 
		}
		
		return sum;
	}

	// we can ask how the user wants to go about it 
	@Override
	public void checkOut() {
	
		PaymentStratergy ps = new BestPayment().bestPay(); 
		ps.pay(calculateTotal(ps));
	}

}








