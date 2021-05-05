package com.example.domain.form;


public class BindingCustomerForm {

	private CustomerJobForm customerJobForm;
	
	private CustomerForm customerForm;

	public CustomerJobForm getCustomerJobForm() {
		return customerJobForm;
	}

	public void setCustomerJobForm(CustomerJobForm customerJobForm) {
		this.customerJobForm = customerJobForm;
	}

	public CustomerForm getCustomerForm() {
		return customerForm;
	}

	public void setCustomerForm(CustomerForm customerForm) {
		this.customerForm = customerForm;
	}
}
