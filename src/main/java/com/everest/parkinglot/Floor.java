package com.everest.parkinglot;

public class Floor {
    private Slot[] slots;
    public Floor(int slotsInEachFloor){
        slots=new Slot[slotsInEachFloor];
        for(int i=0;i<slotsInEachFloor;i++){
            slots[i]=new Slot();
        }
    }
    public Slot[] getSlots(){
        return this.slots;
    }

    public Slot getASlotAtIndex(int j) {
        return this.slots[j];
    }
}
