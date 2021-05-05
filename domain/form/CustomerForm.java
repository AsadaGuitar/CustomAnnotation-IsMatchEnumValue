package com.example.domain.form;

import java.util.Optional;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.example.domain.enums.Gender;

//@Data
public class CustomerForm {

	@Id
	protected Integer id;
	
	@Size(min=1,max=10)
	@NotNull
	protected String firstNameF;
	
	@Size(min=1,max=10)
	@NotNull
	protected String lastNameF;
	
	public Optional<String> getFullNameF(){
		var fullName = this.lastNameF + this.firstNameF;
		return Optional.ofNullable(fullName);
	}
	
	@Size(min=1,max=6)
	@NotNull
	protected String firstName;
	
	@Size(min=1,max=10)
	@NotNull
	protected String lastName;
	
	public Optional<String> getFullName(){
		var fullName = this.lastName + this.firstName;
		return Optional.ofNullable(fullName);
	}
	
	@Min(1)
	@Max(100)
	@NotNull
	protected int age;
	
	@NotNull
	protected Gender gender;
	
	//--------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstNameF() {
		return firstNameF;
	}

	public void setFirstNameF(String firstNameF) {
		this.firstNameF = firstNameF;
	}

	public String getLastNameF() {
		return lastNameF;
	}

	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}



