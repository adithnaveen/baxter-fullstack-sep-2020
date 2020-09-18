package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EagerSingletonSerializedImpl04 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		EagerSingleton instanceOne = EagerSingleton.getInstance(); 
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample.ser")); 
		
		oos.writeObject(instanceOne);
		// to save 
		oos.close(); 
		System.out.println("Instance One - hashcode " + instanceOne.hashCode());
		System.out.println("Data Saved... ");
		////////////////////////////////////////////////////////////////////
		
		// deserialize from the file 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.ser")); 
		
		EagerSingleton instanceTwo = (EagerSingleton) ois.readObject(); 
		ois.close(); 
		System.out.println("Instance Two - hashcode " + instanceTwo.hashCode());
	}
}
