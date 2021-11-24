package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Vehicle;

public abstract class ParkingStrategy {
    public abstract String parkVehicle(Vehicle vehicle, ParkingLot parkingLot);

    public boolean unParkVehicle(String ticketId,ParkingLot parkingLot){
        return false;
    }
}
