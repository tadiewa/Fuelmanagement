package com.fuelmanagement.convertor;

import com.fuelmanagement.Dto.FuelRequisitionDto;
import com.fuelmanagement.domain.FuelRequisition;
import org.springframework.stereotype.Component;

@Component
public class FuelRequisitionConv {

    public FuelRequisition getFuelRequisitionFromFuelRequisitionDto(FuelRequisitionDto fuelRequisitionDto){

        FuelRequisition fuelRequisition = new FuelRequisition();
        fuelRequisition.setRequestedBy(fuelRequisitionDto.getRequestedBy());
        fuelRequisition.setAmount(fuelRequisitionDto.getAmount());
        fuelRequisition.setReasonForRequest(fuelRequisitionDto.getReasonForRequest());
        fuelRequisition.setApprovedBy(fuelRequisitionDto.getApprovedBy());
        fuelRequisition.setAuthorisedBy(fuelRequisitionDto.getAuthorisedBy());
        fuelRequisition.setDateCreated(fuelRequisitionDto.getDateCreated());
        //fuelRequisition.setFuelType(fuelRequisitionDto.getFuelType());
        //fuelRequisition.setRequisitionStatus(fuelRequisitionDto.getRequisitionStatus());
        //fuelRequisition.setDateApproved(fuelRequisitionDto.getDateApproved());
        //fuelRequisition.setDateAuthorized(fuelRequisitionDto.getDateAuthorized());
        //fuelRequisition.setDescription(fuelRequisitionDto.getDescription());

        return fuelRequisition;
    }

    public FuelRequisitionDto getFuelRequisitionDtoFromFuelRequisition(FuelRequisition fuelRequisition){

        FuelRequisitionDto fuelRequisitionDto = new FuelRequisitionDto();
        fuelRequisitionDto.setRequestedBy(fuelRequisition.getRequestedBy());
        fuelRequisitionDto.setAmount(fuelRequisition.getAmount());
        fuelRequisitionDto.setApprovedBy(fuelRequisition.getApprovedBy());
        fuelRequisitionDto.setReasonForRequest(fuelRequisition.getReasonForRequest());
        fuelRequisitionDto.setDescription(fuelRequisition.getDescription());
        fuelRequisitionDto.setDateAuthorized(fuelRequisition.getDateAuthorized());
        fuelRequisitionDto.setAuthorisedBy(fuelRequisition.getAuthorisedBy());
        fuelRequisitionDto.setDateAuthorized(fuelRequisition.getDateAuthorized());
        fuelRequisitionDto.setDateCreated(fuelRequisition.getDateCreated());

        return fuelRequisitionDto;



    }
}
