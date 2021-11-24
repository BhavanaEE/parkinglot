package com.everest;

import com.everest.parkinglot.ParkingLot;

import java.util.Scanner;

public class Application {
    private static ParkingLot parkingLot;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.print("create_parking_lot ");
        String parkingId=sc.next();
        int noOfFloors=sc.nextInt();
        int slotsInEachFloor=sc.nextInt();
        parkingLot =new ParkingLot(parkingId,noOfFloors,slotsInEachFloor);
        System.out.println("Created parking lot with "+noOfFloors+" floors and "+slotsInEachFloor+" slots per floor");
        InputHandler inputHandler=new InputHandler();
        inputHandler.inputFromConsole(parkingLot);
    }
}
