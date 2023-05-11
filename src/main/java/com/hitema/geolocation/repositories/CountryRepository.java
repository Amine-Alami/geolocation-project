package com.hitema.geolocation.repositories;

import com.hitema.geolocation.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
