package com.everest.parkinglot;

import com.everest.vehicle.Vehicle;

public class Slot {
    Vehicle vehicle;
    private String ticketId;
    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void unParkVehicle(){
        this.vehicle=null;
    }

    public boolean isEmpty(){
        return this.vehicle==null;
    }
    public void setTicketId(int i,int j){
        this.ticketId="PR1234"+"_"+(i+1)+"_"+(j+1);
    }
    public String getTicketId(){
        return this.ticketId;
    }
}
