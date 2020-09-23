package com.training.builder.pattern;

import java.util.ArrayList;
import java.util.List;

// 	select * from employe where empname like "%harry%" 
// or empcity like "%bengaluru%" order by empname asc, city desc; 	
public class SQLBuilder {

	public SQLBuilder() {
	}

	private StringBuilder sb = new StringBuilder(1000);
	private boolean orderSpecified = false;
	private boolean conditionSpecified = false;
	private List<Object> values = new ArrayList<>();

	public SQLBuilder from(String table) {
		sb.append("select * from ").append(table);
		return this;
	}

	public SQLBuilder where(String condition, Object value) {
		sb.append(conditionSpecified == false ? " where " : " and ").append(condition);
		values.add(value);

		conditionSpecified = true;
		return this;
	}
	
	public SQLBuilder join(String table, String onCondition) {
		sb.append(" join ") 
		.append(table) .append(" on " ).append( onCondition); 
		return this; 
	}

	public SQLBuilder whereOr(String condition, Object value) {
		sb.append(conditionSpecified == false ? " where " : " or ").append(condition);
		values.add(value);

		conditionSpecified = true;
		return this;
	}

	public SQLBuilder order(String orderBy, String dir) {
		sb.append(orderSpecified==false ? " order by " : ", ")
		.append(orderBy)
		.append(" ")
		.append(dir); 
		
		orderSpecified = true; 
		return this; 
	}
	
	public String build() {
		return sb.toString(); 
	}
	
	public List<Object> values() {
		return values; 
	}
}















