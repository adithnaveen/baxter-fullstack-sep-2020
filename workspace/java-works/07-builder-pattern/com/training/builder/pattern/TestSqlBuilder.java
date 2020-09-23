package com.training.builder.pattern;

public class TestSqlBuilder {
	public static void main(String[] args) {
		SQLBuilder sb = new SQLBuilder(); 
		
		String sql = sb.from("customers")
				.join("orders", "orders.cust_id=customers.cust_id")
				.where("email like ? ", "%gmail%")
				.whereOr("state like ", "%delhi%")
				.order("city", "asc")
				.order("name", "desc")
				.build(); 
		
		System.out.println(sql);
		System.out.println("--------------------------------------");
		System.out.println(sb.values());
	}
}
