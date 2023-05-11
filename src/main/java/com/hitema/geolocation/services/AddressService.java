package com.hitema.geolocation.services;

import com.hitema.geolocation.entities.Address;

import java.util.List;

/**
 * CRUD Interface
 */
public interface AddressService {
    Address create(Address address);
    Address read(Long id);
    Address update(Address address);
    void delete(Long id);
    List<Address> readAll();
}
