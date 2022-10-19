package com.fuelmanagement.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoresIssuesVoucherDto {
    private LocalDate issuedDate ;
    private  String   requestedBy;
    private  Double  quantity;
    private String  issuedBy;
    private String  description;
}
