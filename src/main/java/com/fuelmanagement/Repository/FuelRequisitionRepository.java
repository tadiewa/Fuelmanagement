package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.FuelRequisition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuelRequisitionRepository extends JpaRepository<FuelRequisition,Long> {

   List<FuelRequisition> findFuelRequisitionByRequestedByAndAuthorisedByAndApprovedBy(String requester, String authorizer, String approver);
}
