package com.everest.parkinglot;

public class ParkingLot {
    private String parkingId;
    private int noOfFloors;
    private int slotsInEachFloor;
    private Floor[] floors;

    public ParkingLot(String parkingId, int noOfFloors, int slotsInEachFloor) {
        this.parkingId=parkingId;
        this.noOfFloors=noOfFloors;
        this.slotsInEachFloor=slotsInEachFloor;
        floors=new Floor[noOfFloors];
        for(int i=0;i<noOfFloors;i++){
            floors[i]=new Floor(slotsInEachFloor);
        }
    }

    public Floor getFloorAtIndex(int i){
        return this.floors[i];
    }

    public int getSlotsInEachFloor(){
        return this.slotsInEachFloor;
    }

    public int getNoOfFloors() {
        return this.noOfFloors;
    }
}
