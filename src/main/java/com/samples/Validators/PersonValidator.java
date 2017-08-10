package com.samples.Validators;

import java.util.ArrayList;
import java.util.List;

public class PersonValidator {
	
	IRule[] rules = new IRule[]{
			PersonNotNullValidationRule.NAME_NOT_NULL,
			PersonNotNullValidationRule.AGE_NOT_NULL,
			PersonAgeRangeValidator.AGE_RANGE_CHECK
	};
  
	public List<String> validate(Person person){
		List<String> validations = new ArrayList<String>();
		for (IRule rule : rules){
			validations.addAll(rule.getValidationMessages(person));
		}
		return validations;
	}
}
