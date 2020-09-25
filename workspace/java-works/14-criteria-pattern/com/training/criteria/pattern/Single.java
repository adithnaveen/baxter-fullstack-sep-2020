package com.training.criteria.pattern;

import java.util.List;
import java.util.stream.Collectors;

import com.training.criteria.contract.Criteria;
import com.training.criteria.entity.Person;

public class Single implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		return 
				persons.stream().filter
				(temp -> temp.getMartialStatus().
						equalsIgnoreCase("single"))
				 .collect(Collectors.toList());

	}
	
}