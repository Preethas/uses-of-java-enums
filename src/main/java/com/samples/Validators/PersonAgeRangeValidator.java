package com.samples.Validators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public enum PersonAgeRangeValidator implements IRule {
	AGE_RANGE_CHECK(person -> person.getAge() > 0 && person.getAge() < 100);

	Predicate<Person> personPredicate;

	PersonAgeRangeValidator(Predicate<Person> personPredicate) {
		this.personPredicate = personPredicate;
	}

	public List<String> getValidationMessages(Object obj) {
		Person info = (Person) obj;
		List<String> strList = new ArrayList<String>();

		if (!personPredicate.test(info)) {
			strList.add("Age has to be greater than 0 and less than 100");
		}
		return strList;
	}

}
