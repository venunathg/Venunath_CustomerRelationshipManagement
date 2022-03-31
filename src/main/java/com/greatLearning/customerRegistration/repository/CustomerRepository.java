package com.greatLearning.customerRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.customerRegistration.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {




	List<Customer> findByFirstnameContainsAndLastnameContainsAllIgnoreCase(String firstname, String lastname);

}
