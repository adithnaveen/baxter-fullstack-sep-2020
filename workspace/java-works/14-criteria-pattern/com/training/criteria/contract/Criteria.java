package com.training.criteria.contract;

import java.util.List;

import com.training.criteria.entity.Person;


public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}