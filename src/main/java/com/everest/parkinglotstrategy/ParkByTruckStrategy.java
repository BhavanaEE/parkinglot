package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.parkinglot.Slot;
import com.everest.vehicle.Vehicle;

public class ParkByTruckStrategy extends ParkingStrategy{
    private int slotForTruckStartsAt =0;
    private int slotsForTruckEndsAt=1;
    Slot slot;
    @Override
    public String parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        for (int i=0;i<parkingLot.getNoOfFloors();i++){
            for (int j = slotForTruckStartsAt; j<slotsForTruckEndsAt; j++){
                if(parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).isEmpty()){
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).parkVehicle(vehicle);
                    parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).setTicketId(i,j);
                    return "Parked vehicle. Ticket ID: "+parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).getTicketId();
                }
            }
        }
        return "Parking Lot is full";
    }
}
