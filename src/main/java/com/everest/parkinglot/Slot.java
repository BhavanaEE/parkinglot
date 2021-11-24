package com.everest.parkinglot;

import com.everest.vehicle.Vehicle;

public class Slot {
    Vehicle vehicle;
    private String ticketId;
    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public Vehicle unParkVehicle(){
        Vehicle vehicle1=vehicle;
        this.vehicle=null;
        return vehicle1;
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
