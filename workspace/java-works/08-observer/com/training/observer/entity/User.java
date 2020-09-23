package com.training.observer.entity;

import com.training.observer.contract.Observable;
import com.training.observer.contract.Observer;

public class User implements Observer{

	
	private Observable obs; 
	private String name; 
	
	public User(Observable obs, String name) {
		this.obs = obs; 
		this.name = name; 
	}
	
	@Override
	public void update() {
		buyIphoneX();
	}
	
	public void buyIphoneX() {
		System.out.println("Notifed to buy :" + name);
	}
	
	public void unsubscribe() {
		obs.removeUser(this);
	}
	
}
