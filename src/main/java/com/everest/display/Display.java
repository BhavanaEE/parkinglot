package com.everest.display;

import com.everest.parkinglot.ParkingLot;

import java.util.ArrayList;

public class Display {
    public ArrayList<ArrayList<Integer>> display(ParkingLot parkingLot, int startIndex, int endIndex){
        ArrayList<ArrayList<Integer>> freeCount=new ArrayList<ArrayList<Integer>>();
        int temp=parkingLot.getNoOfFloors();
        if(parkingLot.getSlotsInEachFloor()<startIndex+1){
            System.out.println("No slot available");
        }
        else{
            for (int i = 0; i < parkingLot.getNoOfFloors(); i++) {
                ArrayList<Integer> freeSlotsInParticularFloor=new ArrayList<>();
                for (int j = startIndex; j < endIndex; j++) {
                    if (parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).isEmpty()) {
                        freeSlotsInParticularFloor.add(j+1);
                    }
                }
                freeCount.add(freeSlotsInParticularFloor);
            }
        }
        return freeCount;
    }

    public ArrayList<ArrayList<Integer>> displayOccupied(ParkingLot parkingLot,int startIndex,int endIndex){
        ArrayList<ArrayList<Integer>> occupied=new ArrayList<ArrayList<Integer>>();
        int temp=parkingLot.getNoOfFloors();
        if(parkingLot.getSlotsInEachFloor()<startIndex+1){
            System.out.println("No slot available");
        }
        else{
            for (int i = 0; i < parkingLot.getNoOfFloors(); i++) {
                ArrayList<Integer> freeSlotsInParticularFloor=new ArrayList<>();
                for (int j = startIndex; j < endIndex; j++) {
                    if (!(parkingLot.getFloorAtIndex(i).getASlotAtIndex(j).isEmpty())) {
                        freeSlotsInParticularFloor.add(j+1);
                    }
                }
                occupied.add(freeSlotsInParticularFloor);
            }
        }
        return occupied;
    }

}
