package com.fuelmanagement.Controller;


import com.fuelmanagement.Dto.StoresIssuesVoucherDto;
import com.fuelmanagement.Service.StoresIssuesVoucherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fuel-issuesvoucher")
@Slf4j
public class StoresIssuesVoucherController {

    @Autowired
    private StoresIssuesVoucherService storesIssuesVoucherService;

    public StoresIssuesVoucherDto createStoresIssuesVoucher(@RequestBody StoresIssuesVoucherDto storesIssuesVoucherDto){
        return storesIssuesVoucherService.createStoresIssuesVoucher(storesIssuesVoucherDto);

    }
}
