package com.fuelmanagement.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id ;
    private  String userName;
    private String surName;
    private  String accessLevel;
    private String ncNumber;
}
