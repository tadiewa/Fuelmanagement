package com.fuelmanagement.constants;

public enum RequistionStatus {
    REQUESTED("requested"), APPROVED("approved"), AUTHORIZED("authorized");
    private String value;

    private RequistionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
