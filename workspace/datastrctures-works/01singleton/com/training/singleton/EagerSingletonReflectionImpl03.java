package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonReflectionImpl03 {
	public static void main(String[] args) 
				throws InstantiationException, 
				IllegalAccessException, 
				IllegalArgumentException, 
				InvocationTargetException {
		
		EagerSingleton instanceOne = EagerSingleton.getInstance(); 
		
		EagerSingleton instanceTwo  =null;
		EagerSingleton instanceThree = null; 
		
		Constructor [] constrcutors = 
				EagerSingleton.class.getDeclaredConstructors(); 
		
		
		for(Constructor constructor : constrcutors) {
			// we can destroy singleton pattern 
			
			constructor.setAccessible(true);
			instanceTwo = (EagerSingleton) constructor.newInstance(); 
			instanceThree = (EagerSingleton)  constructor.newInstance(); 
			
		}
		
		System.out.println("instanceOne - hashCode " + instanceOne.hashCode());
		System.out.println("instanceTwo - hashCode " + instanceTwo.hashCode());
		System.out.println("instaceThree - hashCode " + instanceThree.hashCode());
		
	}
}












