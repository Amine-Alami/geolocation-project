package com.hitema.geolocation.services;

import com.hitema.geolocation.entities.Customer;

import java.util.List;

/**
 * CRUD Interface
 */
public interface CustomerService {
    Customer create(Customer customer);
    Customer read(Long id);
    Customer update(Customer customer);
    void delete(Long id);
    List<Customer> readAll();


}
