package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.parkinglot.Slot;
import com.everest.vehicle.Vehicle;

public class ParkByBikeStrategy extends ParkingStrategy{
    private int slotForBikeStartsAt = 1;
    private int slotForBikeEndsAt = 3;
    Slot slot;

    @Override
    public String parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        for (int i = 0; i < parkingLot.getNoOfFloors(); i++) {
            for (int j = slotForBikeStartsAt; j < slotForBikeEndsAt; j++) {
                if (parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).isEmpty()) {
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).parkVehicle(vehicle);
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).setTicketId(i, j);
                    return "Parked vehicle. Ticket ID: " + parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).getTicketId();
                }
            }
        }
        return "Parking lot is full";
    }
}
