package com.training.criteria.multiplepattern;

import java.util.List;

import com.training.criteria.contract.Criteria;
import com.training.criteria.entity.Person;

public class AndCriteria implements Criteria{

	private Criteria firstCriteria; 
	private Criteria secondCriteria;
	
	
	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// Filter first Criteria 
		List<Person> firstCriteriaList = this.firstCriteria.meetCriteria(persons);
		// filter second criteria 
		return secondCriteria.meetCriteria(firstCriteriaList);
		
	}

}