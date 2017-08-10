package com.samples.Validators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public enum PersonNotNullValidationRule implements IRule{
	
	NAME_NOT_NULL(person -> person.getName() != null),
	AGE_NOT_NULL(person -> person.getAge() != 0);
	
	private final Predicate<Person> personPredicate;
	
	PersonNotNullValidationRule(Predicate<Person> personPredicate){
		this.personPredicate = personPredicate;
	}

	public List<String> getValidationMessages(Object obj) {
		
		Person info = (Person)obj;
    	List<String> strList = new ArrayList<String>();   	
    	
    	if (!personPredicate.test(info)){    	
    		strList.add("Name/Age cannot be null");
    	}
    	return strList;
	}

}
