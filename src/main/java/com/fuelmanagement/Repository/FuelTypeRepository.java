package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTypeRepository extends JpaRepository<FuelType ,Long > {
}
