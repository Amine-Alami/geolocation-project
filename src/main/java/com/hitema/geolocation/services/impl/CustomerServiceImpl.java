package com.hitema.geolocation.services.impl;

import com.hitema.geolocation.entities.Customer;
import com.hitema.geolocation.repositories.CustomerRepository;
import com.hitema.geolocation.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(Long id) {
        repository.delete(read(id));
    }

    @Override
    public List<Customer> readAll() {
        return repository.findAll();
    }
}
