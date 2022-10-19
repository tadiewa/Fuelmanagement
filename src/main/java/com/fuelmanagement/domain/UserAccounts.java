package com.fuelmanagement.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAccounts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private  String userName;
    private String surName;
    private  String accessLevel;
    private String ncNumber;
    private String role;
    private String password;
    private String authorities;
}
