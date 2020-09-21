package com.training.stratergy.client;

import com.training.stratergy.contract.IShoppingCart;
import com.training.stratergy.entity.Item;
import com.training.stratergy.shoppingcart.ShoppingCart;

public class Client {
	public static void main(String[] args) {
		IShoppingCart cart = new ShoppingCart(); 
		cart.addItem(new Item("Mobile", 2000, 3));
		cart.addItem(new Item("Pen", 40	, 5));
		cart.addItem(new Item("KeyBoard", 500, 1));
		
		
		cart.checkOut(); 
		
	}
}
