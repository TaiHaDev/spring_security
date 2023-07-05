package com.learnsecurity.spring_security.repo;

import com.learnsecurity.spring_security.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findCustomerByEmail(String email);

}
