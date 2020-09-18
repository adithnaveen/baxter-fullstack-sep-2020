package com.training.java11;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class DeflateDemo {
	public static void main(String[] args) 
				throws UnsupportedEncodingException, DataFormatException {
		String message = "This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing This is for Testing ";
	
		System.out.println("Original Content : " +message.length());
		
		byte [] input = message.getBytes("UTF-8"); 
		
		// compressing the bytes 
		byte [] output= new byte[1024]; 
		
		Deflater deflater = new Deflater(); 
		deflater.setInput(input);
		deflater.finish();
		int compressedDataLength = deflater.deflate(output); 
		deflater.end();
		
		System.out.println("Compressed Message Length : " + compressedDataLength);
		
		// Decompress the bytes 
		Inflater inflater = new Inflater(); 
		inflater.setInput(output, 0, compressedDataLength);
		byte [] result = new byte[1024]; 
		int resultLength = inflater.inflate(result); 
		inflater.end(); 
		
		// Decode the bytes in to string 
		System.out.println("Inflated bytes: " + resultLength);
		String newMessage = new String(result, 0, resultLength, "UTF-8"); 
		System.out.println("Uncompressed Message : " + 
				newMessage);
		
	}
}















