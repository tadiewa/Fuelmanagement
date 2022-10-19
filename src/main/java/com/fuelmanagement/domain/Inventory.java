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
@Table(name = "inventory")
public class Inventory {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private  Long inv_Id;
   private  String inv_Type;
   private String inv_Description;
   private String inv_Items;
   private String inv_Number;

}
