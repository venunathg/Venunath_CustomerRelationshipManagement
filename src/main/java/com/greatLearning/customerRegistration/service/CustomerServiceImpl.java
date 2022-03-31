package com.greatLearning.customerRegistration.service;



import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatLearning.customerRegistration.entity.Customer;
import com.greatLearning.customerRegistration.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;





@Service
public class CustomerServiceImpl implements CustomerService {


	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> customers=customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer findById(int theId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(theId).get();
	}

	@Override
	public void save(Customer theStudent) {
		// TODO Auto-generated method stub
		customerRepository.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(theId);
		
	}

	@Override
	public List<Customer> searchBy(String firstname, String lastname) {
		// TODO Auto-generated method stub
		List<Customer> customers=customerRepository.findByFirstnameContainsAndLastnameContainsAllIgnoreCase(firstname, lastname);
		
		
  		return customers;
	}





}