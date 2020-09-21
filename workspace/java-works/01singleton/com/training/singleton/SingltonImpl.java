package com.training.singleton;

public class SingltonImpl {
	public static void main(String[] args) {
		EagerSingleton es = EagerSingleton.getInstance(); 
		
		System.out.println(es.hashCode());
		
		EagerSingleton es1 = EagerSingleton.getInstance(); 
		System.out.println(es1.hashCode());
		
	}
}
