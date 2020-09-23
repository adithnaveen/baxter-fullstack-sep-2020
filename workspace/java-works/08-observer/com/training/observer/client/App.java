package com.training.observer.client;

import com.training.observer.contract.Observable;
import com.training.observer.contract.Observer;
import com.training.observer.entity.User;
import com.training.observer.observed.IPhoneX;

public class App {
	public static void main(String[] args) {
		Observable obs = new IPhoneX(); 
		
		Observer user1 = new User(obs, "Saudamini"); 
		Observer user2 = new User(obs, "Krishna"); 
		Observer user3 = new User(obs, "Samrudhi"); 
		Observer user4 = new User(obs, "Shreyansh"); 
		Observer user5 = new User(obs, "Vithoba"); 
		
		obs.addUser(user1);
		obs.addUser(user2);
		obs.addUser(user3);
		obs.addUser(user4);
		obs.addUser(user5);
		
		System.out.println("---------------------------------------------");
		obs.notifyObserver();
		
		obs.removeUser(user3);
		
		System.out.println("---------------------------------------------");
		obs.notifyObserver();
		
		((IPhoneX)obs).boughtIPhoneX(user5);
		
		System.out.println("---------------------------------------------");
		obs.notifyObserver();
		
	}
}
