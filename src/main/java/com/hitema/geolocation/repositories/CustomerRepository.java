package com.hitema.geolocation.repositories;

import com.hitema.geolocation.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
