package com.everest.vehicle;

public class Truck implements Vehicle{
    private String registrationNumber,color;
    public Truck(String registrationNumber, String color){
        this.registrationNumber = registrationNumber;
        this.color=color;
    }

    @Override
    public String getVehicleType() {
        return "TRUCK";
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
