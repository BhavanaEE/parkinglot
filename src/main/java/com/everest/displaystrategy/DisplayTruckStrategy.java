package com.everest.displaystrategy;

import com.everest.display.Display;
import com.everest.parkinglot.ParkingLot;

import java.util.ArrayList;

public class DisplayTruckStrategy implements DisplayStrategy{
    Display display=new Display();

    @Override
    public void displayFreeCount(ParkingLot parkingLot) {
        ArrayList<ArrayList<Integer>> res=display.display(parkingLot, 0, 1);
        int temp=parkingLot.getNoOfFloors();
        while(temp>0){
            System.out.print("No. of free slots for "+"TRUCK"+" on Floor "+((parkingLot.getNoOfFloors()-temp)+1)+" : "+res.get(parkingLot.getNoOfFloors()-temp).size()+"\n");
            temp--;
        }
    }

    @Override
    public void displayFreeSlots(ParkingLot parkingLot) {
        ArrayList<ArrayList<Integer>> res=display.display(parkingLot, 0, 1);
        int temp=parkingLot.getNoOfFloors();
        while(temp>0){
            System.out.print("Free slots for "+"TRUCK"+" on Floor "+((parkingLot.getNoOfFloors()-temp)+1)+": "+res.get(parkingLot.getNoOfFloors()-temp).toString().replace("[", "").replace("]", "")+"\n");
            temp--;
        }
    }

    @Override
    public void displayOccupiedSlots(ParkingLot parkingLot) {
        ArrayList<ArrayList<Integer>> res=display.displayOccupied(parkingLot, 0, 1);
        int temp=parkingLot.getNoOfFloors();
        while(temp>0){
            System.out.print("Occupied slots for "+"TRUCK"+" on Floor "+((parkingLot.getNoOfFloors()-temp)+1)+": "+res.get(parkingLot.getNoOfFloors()-temp).toString().replace("[", "").replace("]", "")+"\n");
            temp--;
        }
    }
}
