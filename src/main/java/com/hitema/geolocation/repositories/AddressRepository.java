package com.hitema.geolocation.repositories;

import com.hitema.geolocation.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
