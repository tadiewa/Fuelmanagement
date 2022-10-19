package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.RequisitionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequisitionStatusRepository extends JpaRepository<RequisitionStatus ,Long> {

    List<RequisitionStatus>  findAll();
}
