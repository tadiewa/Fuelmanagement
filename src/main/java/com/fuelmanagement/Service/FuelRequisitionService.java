package com.fuelmanagement.Service;

import com.fuelmanagement.Dto.FuelRequisitionDto;
import com.fuelmanagement.domain.FuelRequisition;
import com.fuelmanagement.domain.FuelType;

import java.util.List;

public interface FuelRequisitionService {

    public FuelRequisitionDto createFuelRequisition(FuelRequisitionDto fuelRequisitionDto) ;

   public FuelRequisition editFuelRequisition(Long Id , FuelRequisition fuelRequisition);

    List<FuelRequisition> getRequisitionByUserz(String requester, String authorizer, String approver);

    List<FuelRequisition> getAllRequisitions();

    void changeRequistionStatus(Long id, FuelRequisition fuelRequisition);
}
