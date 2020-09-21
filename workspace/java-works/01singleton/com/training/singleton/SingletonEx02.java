package com.training.singleton;

// lazy singleton 
class Company {
	private Company() {
		System.out.println("object Created... ");
	}
	
	public static Company getInstance(Company company) {
		if(company == null) {
			return new Company(); 
		}
		
		return company; 
	}
}

public class SingletonEx02 {
	public static void main(String[] args) {
		// this does not work 
//		Company company = new Company();
		
		Company company = null; 
		company  = Company.getInstance(company); 
		System.out.println(company.hashCode());
		
		company  = Company.getInstance(company); 
		System.out.println(company.hashCode());
		
		
		company  = Company.getInstance(company); 
		System.out.println(company.hashCode());
		
		
		
	}
}
