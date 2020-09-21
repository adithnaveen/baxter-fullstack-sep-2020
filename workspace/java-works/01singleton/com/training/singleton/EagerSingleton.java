package com.training.singleton;

import java.io.Serializable;

// eager / lazy 
// any class as a singleton then 
// its constructor is made private 
public class EagerSingleton implements Serializable{
	
	// the reference of this is always there 
	// either it is used or not used 
	private static final EagerSingleton instance = new EagerSingleton(); 
	
	private EagerSingleton() {
		System.out.println("Object Created..");
	}
	
	public static EagerSingleton getInstance() {
		return instance; 
	}
	
	// to stop creating an object if already existing 
	// works only with ObjectInputStream 
	protected Object readResolve() {
		return getInstance(); 
	}
}
