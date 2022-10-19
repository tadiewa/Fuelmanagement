package com.fuelmanagement.Service.Imp;

import com.fuelmanagement.Dto.FuelRequisitionDto;
import com.fuelmanagement.Repository.FuelRequisitionRepository;
import com.fuelmanagement.Repository.FuelTypeRepository;
import com.fuelmanagement.Repository.RequisitionStatusRepository;
import com.fuelmanagement.Service.FuelRequisitionService;
import com.fuelmanagement.constants.FuelTypes;
import com.fuelmanagement.constants.RequistionStatus;
import com.fuelmanagement.convertor.FuelRequisitionConv;
import com.fuelmanagement.domain.FuelRequisition;
import com.fuelmanagement.domain.FuelType;
import com.fuelmanagement.domain.RequisitionStatus;
import com.fuelmanagement.exceptions.FuelManagementResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
@Service
public class FuelRequisitionServiceImp implements FuelRequisitionService {
    @Autowired
    public FuelRequisitionRepository fuelRequisitionRepository;
    @Autowired
    private RequisitionStatusRepository requisitionStatusRepository;
    @Autowired
    private FuelTypeRepository fuelTypeRepository;
    @Override
    public FuelRequisitionDto createFuelRequisition(FuelRequisitionDto fuelRequisitionDto) {

        FuelRequisitionConv fuelRequisitionConv = new FuelRequisitionConv();
        FuelRequisition fuelRequisition = fuelRequisitionConv.getFuelRequisitionFromFuelRequisitionDto(fuelRequisitionDto);
        fuelRequisition.setDateAuthorized(LocalDateTime.now());
        fuelRequisition.setDateApproved(LocalDateTime.now());
        fuelRequisition.setDateCreated(LocalDateTime.now());
        String ft = fuelRequisitionDto.getFuelType().getFuelType().toString();
       Stream<FuelTypes>  px  = Stream.of(FuelTypes.values());

       Optional<FuelTypes> type =  px.filter(x->x.getValue().equals(ft)).findAny();
       type.orElseThrow(() ->new FuelManagementResourceNotFoundException("no such fueltype -"+ type.get()));

       fuelRequisition.setFuelType(fuelRequisitionDto.getFuelType());

        RequisitionStatus  requisitionStatus = RequisitionStatus.builder()
               .requisitionStatusLevel(RequistionStatus.REQUESTED.getValue())
               .build();
       fuelRequisition.setRequisitionStatus(requisitionStatus);


        fuelRequisitionRepository.save(fuelRequisition);
        return fuelRequisitionDto;
    }

    @Override
    public FuelRequisition editFuelRequisition(Long id ,FuelRequisition fuelRequisition){

        FuelRequisition  fuelRequisitionId = fuelRequisitionRepository.findById(id).get();
        if (Objects.nonNull(fuelRequisition)) {
           fuelRequisitionId.setAmount(fuelRequisition.getAmount());
           fuelRequisitionId.setDescription(fuelRequisition.getDescription());
           fuelRequisitionId.setReasonForRequest(fuelRequisition.getReasonForRequest());
           fuelRequisitionId.setAuthorisedBy(fuelRequisition.getAuthorisedBy());
           fuelRequisitionId.setApprovedBy(fuelRequisition.getApprovedBy());

           fuelRequisitionRepository.save(fuelRequisitionId);
        }

        return fuelRequisition;
    }

   /* @Override
    public List<FuelRequisition> getRequisitionByStatus(boolean status)  {
        List<FuelRequisition> fuelRequisitionList = fuelRequisitionRepository.findByStatus(status);
        log.info("inside getRequisitionByStatus-------------->>>",fuelRequisitionList);
        if(Objects.isNull(fuelRequisitionList)){
           throw new FuelManagementResourceNotFoundException("no record/s with -" + status );
        }
        return fuelRequisitionList;
    } */

    @Override
    public List<FuelRequisition> getRequisitionByUserz(String requester, String authorizer, String approver) {
        log.info(" inside getRequisitionByUserz-------------->>>");
        List<FuelRequisition>  RequisitionByUserzList = fuelRequisitionRepository.findFuelRequisitionByRequestedByAndAuthorisedByAndApprovedBy( requester,authorizer, approver);
        if(Objects.isNull(RequisitionByUserzList)){
            throw new FuelManagementResourceNotFoundException("no record/s with the  given users -" + requester + authorizer + approver);
        }

        return RequisitionByUserzList;
    }

    @Override
    public List<FuelRequisition> getAllRequisitions() {
        List<FuelRequisition>  allRequisitions = fuelRequisitionRepository.findAll();
        return allRequisitions;
    }

    @Override
    public void changeRequistionStatus(Long id, FuelRequisition fuelRequisition) {
      Optional<FuelRequisition> fuelRequisition1 = fuelRequisitionRepository.findById(id);
       String px = fuelRequisition.getRequisitionStatus().getRequisitionStatusLevel();
       System.out.println(px);
        if(fuelRequisition1.isEmpty())
        {
            throw new FuelManagementResourceNotFoundException("no record/s with the given id -" + id);
        }else if(px.equals(RequistionStatus.REQUESTED)){

           fuelRequisition1.get().setRequisitionStatus(fuelRequisition.getRequisitionStatus());
            fuelRequisitionRepository.save(fuelRequisition1.get());

        }else {

            List<RequisitionStatus> requisitionStatusList = requisitionStatusRepository.findAll();
            for(RequisitionStatus requisitionStatus: requisitionStatusList) {
                if(px.equals(requisitionStatus.getRequisitionStatusLevel())) {
                    fuelRequisition1.get().setRequisitionStatus(fuelRequisition.getRequisitionStatus());
                    fuelRequisitionRepository.save(fuelRequisition1.get());
                }
            }
            throw new FuelManagementResourceNotFoundException("cannot request same id/s create a new requesition -" + id);
        }
    }


}
