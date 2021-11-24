package com.everest.vehicle;

public class Car implements Vehicle{
    private String registrationNumber,color;
    public Car(String registrationNumber, String Color){
        this.registrationNumber = registrationNumber;
        this.color=Color;
    }

    @Override
    public String getVehicleType() {
        return "CAR";
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
