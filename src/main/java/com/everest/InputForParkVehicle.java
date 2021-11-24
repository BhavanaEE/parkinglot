package com.everest;

import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Bike;
import com.everest.vehicle.Car;
import com.everest.vehicle.Truck;
import com.everest.vehicle.Vehicle;

public class InputForParkVehicle {
    Vehicle vehicle;
    public void parkVehicleInput(String input, ParkingLot parkingLot){
        String parkingInput[]=input.split(" ");
        String vehicle_type=parkingInput[0];
        String registrationNumber=parkingInput[1];
        String color=parkingInput[2];
        vehicle = parkVehicleForVehicleType(vehicle_type, registrationNumber, color);
        System.out.println(parkingLot.parkVehicle(vehicle,parkingLot));
    }

    public Vehicle parkVehicleForVehicleType(String vehicle_type,String registrationNumber,String color) {
        switch (vehicle_type){
            case "CAR":
                return new Car(registrationNumber,color);
            case "BIKE":
                return new Bike(registrationNumber,color);
            case "TRUCK":
                return new Truck(registrationNumber,color);
        }
        return null;
    }
}
