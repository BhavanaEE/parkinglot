package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.parkinglot.Slot;
import com.everest.vehicle.Vehicle;

public class ParkByCarStrategy extends ParkingStrategy{
    Slot slot;
    int slotForCarStartsAt=3;
    private int slotsInEachFloor;
    @Override
    public String parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        for (int i = 0; i < parkingLot.getNoOfFloors(); i++) {
            for (int j = slotForCarStartsAt; j < parkingLot.getSlotsInEachFloor(); j++) {
//                System.out.println(parkingLot.getFloorAtIndex(i)+"........");
//                System.out.println(parkingLot.getFloorAtIndex(i).getASlotAtIndex(j));
                if (parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).isEmpty()) {
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).parkVehicle(vehicle);
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).setTicketId(i, j);
                    return "Parked vehicle. Ticket ID: " + parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).getTicketId();
                }
            }
        }
        return "Parking Lot is full";
    }
}
