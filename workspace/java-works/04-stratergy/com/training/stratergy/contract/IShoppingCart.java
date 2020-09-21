package com.training.stratergy.contract;

import com.training.stratergy.entity.Item;

public interface IShoppingCart {
	// add item to cart 
	void addItem(Item item); 
	
	void removeItem(Item item); 
	
	// either the developer can pass or be choosen from 
	// the computer 
	int calculateTotal(PaymentStratergy paymentStratergy); 
	
	void checkOut(); 
	
	
}
