package com.training.java11;

public class Emp {
	private int empId; 
	private String empName;
	 public Emp() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	} 
	
}
