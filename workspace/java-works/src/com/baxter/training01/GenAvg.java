package com.baxter.training01;

public class GenAvg<T extends Number> {
	T [] nums;

	public GenAvg(T[] nums) {
		super();
		this.nums = nums;
	} 
	
	public double average() {
		double sum = 0.0; 
		for(int i=0; i<nums.length; i++) {
			sum += nums[i].doubleValue(); 
		}
		return sum /nums.length; 
	}
	 
}
