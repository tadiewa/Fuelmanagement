package com.fuelmanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "fueltype")
public class FuelType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long fuelId;
    String fuelType;
    String fuelDescription;
    private String field4;
    private String field5;
    private String field6;
    private String field7;


}
