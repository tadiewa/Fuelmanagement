package com.fuelmanagement.Controller;

import com.fuelmanagement.Dto.FuelRequisitionDto;
import com.fuelmanagement.Service.FuelRequisitionService;
import com.fuelmanagement.domain.FuelRequisition;
import com.fuelmanagement.domain.FuelType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fuel-requisition")
@Slf4j
public class FuelRequisitionController{
    @Autowired
    private FuelRequisitionService fuelRequistionService;

    @PostMapping("/createFuelRequisition")
    public FuelRequisitionDto createFuelRequisition(@RequestBody FuelRequisitionDto fuelRequisitionDto){
        log.info("fuelRequisitionDto ---------->" , fuelRequisitionDto);
        return fuelRequistionService.createFuelRequisition(fuelRequisitionDto);
    }

    @PutMapping("/edit/{id}")
    public FuelRequisition editFuelRequisition(@PathVariable ("id")  Long Id,
                                                           @RequestBody FuelRequisition fuelRequisition ){

        return fuelRequistionService.editFuelRequisition(Id ,fuelRequisition);
    }


    @GetMapping(path = "/getAllRequisitions")
    public List<FuelRequisition> getAllRequisitions(){
        return fuelRequistionService.getAllRequisitions();

    }

    @GetMapping(path = "/getRequisitionsByUser")
    public List<FuelRequisition> getRequisitionByUserz(String requester , String authorizer ,String approver){
        return fuelRequistionService.getRequisitionByUserz( requester , authorizer , approver);
    }

    @PutMapping("/alterstatus/{id}")
    public void changRequistionStatus(@PathVariable("id") Long Id , @RequestBody FuelRequisition fuelRequisition){

        fuelRequistionService.changeRequistionStatus(Id , fuelRequisition);
    }
}
