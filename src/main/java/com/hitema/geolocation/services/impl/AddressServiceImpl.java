package com.hitema.geolocation.services.impl;

import com.hitema.geolocation.entities.Address;
import com.hitema.geolocation.repositories.AddressRepository;
import com.hitema.geolocation.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

    private final AddressRepository repository;

    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Address create(Address address) {
        return repository.save(address);
    }

    @Override
    public Address read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Address update(Address address) {
        return repository.save(address);
    }

    @Override
    public void delete(Long id) {
        repository.delete(read(id));
    }

    @Override
    public List<Address> readAll() {
        return repository.findAll();
    }
}
