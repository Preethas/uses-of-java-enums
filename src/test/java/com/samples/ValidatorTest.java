package com.samples;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.samples.Validators.Person;
import com.samples.Validators.PersonValidator;

public class ValidatorTest {
	
  @Test
  public void testForNullValues(){
	  Person person = new Person();
	  PersonValidator validator = new PersonValidator();
	  List<String> validations = validator.validate(person);
	  assertEquals(validations.size(),3);
	  
  }
  
  @Test
  public void testForAgeRange(){
	  Person person = new Person();
	  person.setName("Wendy");
	  person.setAge(-1);
	  PersonValidator validator = new PersonValidator();
	  List<String> validations = validator.validate(person);
	  assertEquals(validations.size(),1);
	  
  }
}
