package com.training.observer.observed;

import java.util.ArrayList;
import java.util.List;

import com.training.observer.contract.Observable;
import com.training.observer.contract.Observer;

public class IPhoneX implements Observable {

	private List<Observer> users;
	private boolean arrived;

	public IPhoneX() {
		users = new ArrayList<Observer>();
	}

	@Override
	public void addUser(Observer observer) {

		users.add(observer);

	}

	@Override
	public void removeUser(Observer observer) {
		users.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer user : users) {
			user.update();
		}
	}

	public boolean isArrived() {
		return arrived;
	}

	public void setArraived(boolean arrived) {
		this.arrived = arrived;
	}

	public void boughtIPhoneX(Observer observer) {
		
		System.out.println("Kudos you have bought the IPhone X...");
		removeUser(observer);
	}

}
