package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Vehicle;

public abstract class ParkingStrategy {
    public abstract String parkVehicle(Vehicle vehicle, ParkingLot parkingLot);

    public String unParkVehicle(String ticketId,ParkingLot parkingLot){
        try {
            String[] getParticularFloorAndSlot = ticketId.split("_");
            int floorNumber = Integer.parseInt(getParticularFloorAndSlot[1]) - 1;
            int slotNumber = Integer.parseInt(getParticularFloorAndSlot[2]) - 1;
            if (!parkingLot.getFloorAtIndex(floorNumber).getASlotAtIndex(slotNumber).isEmpty()) {
                Vehicle vehicle1 = parkingLot.getFloorAtIndex(floorNumber).getASlotAtIndex(slotNumber).unParkVehicle();
                return "UnParked vehicle with Registration Number: " + vehicle1.getRegistrationNumber() + " and Color: " + vehicle1.getColor();
            }
            return "Invalid ticket";
        }
        catch (Exception e){
            return "Invalid Ticket";
        }
    }
}
