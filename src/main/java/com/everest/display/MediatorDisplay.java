package com.everest.display;

import com.everest.displaystrategy.DisplayStrategy;
import com.everest.parkinglot.ParkingLot;

public class MediatorDisplay {
    private DisplayStrategy displayStrategy;
    public MediatorDisplay(DisplayStrategy displayStrategy)
    {
        this.displayStrategy = displayStrategy;
    }
    public void displaySlots(String text, ParkingLot parkingLot){
        if(text.equalsIgnoreCase("free_count"))
            this.displayStrategy.displayFreeCount(parkingLot);
        else if(text.equalsIgnoreCase("free_slots"))
            this.displayStrategy.displayFreeSlots(parkingLot);
        else
            this.displayStrategy.displayOccupiedSlots(parkingLot);
    }
}
