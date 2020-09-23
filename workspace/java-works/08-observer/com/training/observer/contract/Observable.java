package com.training.observer.contract;

public interface Observable {
	public void addUser(Observer observer);

	public void removeUser(Observer observer);

	public void notifyObserver();

}
