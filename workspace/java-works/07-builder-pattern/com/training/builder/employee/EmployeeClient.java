package com.training.builder.employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee employee = new Employee(10, "Kumar", "kumar@gmail.com", 0); 
		
		
		Employee employee1 = new EmployeeBuilder()
					.setEmpId(101)
					.setEmpEmail("kumar@gmail.com") 
					.setEmpSal(12345)
					.build(); 
	}
}
