package com.example.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.example.domain.enums.Educational;


public class IsMatchEnumsValueValidator implements ConstraintValidator<IsMatchEnumsValue, Object>{
	
	private String enumProperty;
	private String ageProperty;
	
	@Override
	public void initialize(IsMatchEnumsValue annotation) {
		this.enumProperty = annotation.enumParam();
		this.ageProperty = annotation.age();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		
		BeanWrapper beanWrapper = new BeanWrapperImpl(value);
		var enumValue = (Educational)beanWrapper.getPropertyValue(enumProperty);
		var ageValue = (Integer)beanWrapper.getPropertyValue(ageProperty);
		
		int start = enumValue.getStart();
		int end = enumValue.getEnd();
		
		System.out.println("from  IsMatchEnumsValueValidator :");
		System.out.println("age : " + ageValue + ", start : " + start + ", end : " + end);
		return (ageValue >= start && ageValue <= end);
		
	}

}
