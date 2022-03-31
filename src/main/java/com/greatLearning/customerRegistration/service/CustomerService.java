package com.greatLearning.customerRegistration.service;

import java.util.List;

import com.greatLearning.customerRegistration.entity.Customer;


public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer theStudent);

	public void deleteById(int theId);

	public List<Customer> searchBy(String firstname, String lastname);

}
