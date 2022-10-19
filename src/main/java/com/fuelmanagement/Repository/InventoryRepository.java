package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory , Long> {
}
