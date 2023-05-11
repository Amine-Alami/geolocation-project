package com.hitema.geolocation.repositories;

import com.hitema.geolocation.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findAllByCityContainingIgnoreCase(String str);
   List<City> readCitiesByCityContainingIgnoreCase(String str);

   List<City> readCitiesByCapitalIsTrue();


}
