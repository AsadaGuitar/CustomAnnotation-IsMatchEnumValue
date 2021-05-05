package com.example.domain.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.enums.Educational;
import com.example.validator.IsMatchEnumsValue;

@IsMatchEnumsValue(enumParam="incumbent", age="age")
public class CustomerJobForm extends CustomerForm{
	
	@NotNull
	private Educational educational;
	
	@NotNull
	@Size(min=3,max=55)
	private String educationalName;
	
	@NotNull
	@Size(min=2, max=10)
	private String educationType;
	
	@NotNull
	private Educational incumbent;
	
	@NotNull
	@Size(min=2, max=30)
	private String desired_occupation;
	

	public Educational getEducational() {
		return educational;
	}

	public void setEducational(Educational educational) {
		this.educational = educational;
	}

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}

	public Educational getIncumbent() {
		return incumbent;
	}

	public void setIncumbent(Educational incumbent) {
		this.incumbent = incumbent;
	}

	public String getDesired_occupation() {
		return desired_occupation;
	}

	public void setDesired_occupation(String desired_occupation) {
		this.desired_occupation = desired_occupation;
	}

	public String getEducationalName() {
		return educationalName;
	}

	public void setEducationalName(String educationalName) {
		this.educationalName = educationalName;
	}
}
