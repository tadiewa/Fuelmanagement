package com.fuelmanagement.Service.Imp;

import com.fuelmanagement.Dto.StoresIssuesVoucherDto;
import com.fuelmanagement.Repository.StoresIssuesVoucherRepository;
import com.fuelmanagement.Service.StoresIssuesVoucherService;
import com.fuelmanagement.convertor.StoresIssuesVoucherConv;
import com.fuelmanagement.domain.StoresIssuesVoucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoresIssuesVoucherServiceImp implements StoresIssuesVoucherService {
    @Autowired
    public StoresIssuesVoucherRepository storesIssuesVoucherRepository;
    @Override
    public StoresIssuesVoucherDto createStoresIssuesVoucher(StoresIssuesVoucherDto storesIssuesVoucherDto) {
        StoresIssuesVoucherConv storesIssuesVoucherConv = new StoresIssuesVoucherConv();
        StoresIssuesVoucher storesIssuesVoucher = storesIssuesVoucherConv.IssuesVoucherFromVoucherDto(storesIssuesVoucherDto);
        storesIssuesVoucherRepository.save(storesIssuesVoucher);
        return storesIssuesVoucherDto;
    }
}
