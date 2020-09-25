package com.training.criteria.client;

import java.util.Arrays;
import java.util.List;

import com.training.criteria.contract.Criteria;
import com.training.criteria.entity.Person;
import com.training.criteria.multiplepattern.AndCriteria;
import com.training.criteria.multiplepattern.OrCriteria;
import com.training.criteria.pattern.Female;
import com.training.criteria.pattern.Male;
import com.training.criteria.pattern.Single;

public class CriteriaClient {
	public static void main(String[] args) {
		List<Person> persons = 
				Arrays.asList(

						new Person("Vivek", "single", "Male"),
						new Person("Seema", "married", "Female"),
						new Person("Leena", "single", "Female"),
						new Person("Vijay", "single", "Male"),
						new Person("Kumar", "married", "Male"),
						new Person("Peter", "single", "Male"),
						new Person("Tim", "married", "Male"),
						new Person("Zafrin", "single", "Female")
				);
		
		
		Criteria male = new Male(); 
		Criteria female = new Female(); 
		Criteria single = new Single(); 
		
		Criteria andCriteriea = new AndCriteria(female, single); 
		Criteria orCriteria = new OrCriteria(male, single); 
		
		System.out.println("-------Only Male---------");
		male.meetCriteria(persons).forEach(System.out :: println);
		
		System.out.println("------Only Female---------");
		female.meetCriteria(persons).forEach(System.out ::println);
		
		
		// multiple criterias 
		System.out.println("-----And (female & Single)-------");
		andCriteriea.meetCriteria(persons).forEach(System.out :: println);
		
		System.out.println("-------- Or(Male or Single)------------");
		orCriteria.meetCriteria(persons).forEach(System.out ::println);
	}
}











