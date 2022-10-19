package com.fuelmanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RequisitionStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long requisitionStatusId;
    private String requisitionStatusLevel;
    private String field4;
    private String field5;
    private String field6;
    private String field7;


}
