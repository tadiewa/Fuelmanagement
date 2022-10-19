package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.FuelRequisition;
import com.fuelmanagement.domain.FuelType;
import com.fuelmanagement.domain.RequisitionStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FuelRequisitionRepositoryTest {

    @Autowired
    private FuelRequisitionRepository fuelRequisitionRepository;


    @Test
    public void createRequisition(){
        FuelType fuelType = FuelType.builder()
                .fuelDescription("hahah")
                .fuelType("diseal50")
                .build();

        RequisitionStatus requisitionStatus = RequisitionStatus.builder()
                .requisitionStatusLevel("requested")
                .build();

        FuelRequisition fuelRequisition = FuelRequisition.builder()
                .amount(5l)
                .approvedBy("kk")
                .authorisedBy("hh")
                .fuelType(fuelType)
                .description("hhhg")
                //.requisitionStatus(requisitionStatus)
                .build();

        fuelRequisitionRepository.save(fuelRequisition);



    }

}