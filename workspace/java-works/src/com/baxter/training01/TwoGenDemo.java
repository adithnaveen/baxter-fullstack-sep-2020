package com.baxter.training01;

public class TwoGenDemo {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(100, "Baxter"); 
		
		tgObj.showTypes(); 
		
	}
}
