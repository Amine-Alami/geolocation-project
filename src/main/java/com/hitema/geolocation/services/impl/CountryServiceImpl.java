package com.hitema.geolocation.services.impl;

import com.hitema.geolocation.entities.Country;
import com.hitema.geolocation.repositories.CountryRepository;
import com.hitema.geolocation.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);
    @Override
    public Country create(Country country) {
        if ( country.getLastUpdate() == null )
            country.setLastUpdate(LocalDateTime.now());
        return repository.save(country);
    }

    @Override
    public Country read(Long id) {
        return null;
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Country> readAll() {
        return repository.findAll();
    }
}
