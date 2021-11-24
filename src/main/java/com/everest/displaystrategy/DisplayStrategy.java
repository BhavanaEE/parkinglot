package com.everest.displaystrategy;

import com.everest.parkinglot.ParkingLot;

public interface DisplayStrategy {
    void displayFreeCount(ParkingLot parkingLot);
    void displayFreeSlots(ParkingLot parkingLot);
    void displayOccupiedSlots(ParkingLot parkingLot);
}
