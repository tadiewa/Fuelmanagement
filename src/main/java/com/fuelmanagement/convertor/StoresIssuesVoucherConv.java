package com.fuelmanagement.convertor;

import com.fuelmanagement.Dto.StoresIssuesVoucherDto;
import com.fuelmanagement.domain.StoresIssuesVoucher;
import org.springframework.stereotype.Component;

@Component
public class StoresIssuesVoucherConv {

    public StoresIssuesVoucher  IssuesVoucherFromVoucherDto(StoresIssuesVoucherDto storesIssuesVoucherDto){

        StoresIssuesVoucher storesIssuesVoucher = new StoresIssuesVoucher();
        storesIssuesVoucher.setIssuedDate(storesIssuesVoucherDto.getIssuedDate());
        storesIssuesVoucher.setIssuedBy(storesIssuesVoucherDto.getIssuedBy());
        storesIssuesVoucher.setDescription(storesIssuesVoucherDto.getDescription());
        storesIssuesVoucher.setQuantity(storesIssuesVoucherDto.getQuantity());
        storesIssuesVoucher.setRequestedBy(storesIssuesVoucherDto.getRequestedBy());

        return storesIssuesVoucher;
    }
    public StoresIssuesVoucherDto  IssuesVoucherToVoucherDto(StoresIssuesVoucher storesIssuesVoucher){

        StoresIssuesVoucherDto storesIssuesVoucherDto = new StoresIssuesVoucherDto();
        storesIssuesVoucherDto.setIssuedDate(storesIssuesVoucher.getIssuedDate());
        storesIssuesVoucherDto.setIssuedBy(storesIssuesVoucher.getIssuedBy());
        storesIssuesVoucherDto.setDescription(storesIssuesVoucher.getDescription());
        storesIssuesVoucherDto.setQuantity(storesIssuesVoucher.getQuantity());
        storesIssuesVoucherDto.setRequestedBy(storesIssuesVoucher.getRequestedBy());

        return storesIssuesVoucherDto;
    }
}
