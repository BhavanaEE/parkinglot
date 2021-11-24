package com.everest.vehicle;

public class Bike implements Vehicle{
    private String registrationNumber,color;
    public Bike(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color=color;
    }

    @Override
    public String getVehicleType() {
        return "BIKE";
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getColor() {
        return color;
    }
}
