package com.training.criteria.multiplepattern;

import java.util.List;

import com.training.criteria.contract.Criteria;
import com.training.criteria.entity.Person;

public class OrCriteria implements Criteria{
	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	
	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaList = firstCriteria.meetCriteria(persons);
		List<Person> secondCriteriaList = secondCriteria.meetCriteria(persons);
		
		// to make sure the duplicates dont go 
		for(Person temp : secondCriteriaList){
			if(!firstCriteriaList.contains(temp)){
				firstCriteriaList.add(temp);
			}
		}
		
		return firstCriteriaList;
	} 
	
}
