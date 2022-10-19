package com.fuelmanagement.constants;

public enum FuelTypes {
    DISEAL( "diseal") ,PETROL("petrol") ,PARAFFIN("paraffin");
     private String value;

     private FuelTypes(String value) {
          this.value = value;
     }

     public String getValue() {
          return value;
     }

}
