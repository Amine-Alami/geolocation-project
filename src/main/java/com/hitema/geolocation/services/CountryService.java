package com.hitema.geolocation.services;

import com.hitema.geolocation.entities.Country;

import java.util.List;

/**
 * CRUD Interface
 */
public interface CountryService {
    Country create(Country country);
    Country read(Long id);
    Country update(Country country);
    void delete(Long id);
    List<Country> readAll();
}
