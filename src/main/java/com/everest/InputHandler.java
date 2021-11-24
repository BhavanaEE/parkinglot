package com.everest;

import com.everest.display.Display;
import com.everest.display.MediatorDisplay;
import com.everest.displaystrategy.DisplayBikeStrategy;
import com.everest.displaystrategy.DisplayCarStrategy;
import com.everest.displaystrategy.DisplayTruckStrategy;
import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Vehicle;

import java.util.Scanner;

public class InputHandler {
    Vehicle vehicle;
    InputForParkVehicle parkVehicleInput = new InputForParkVehicle();
    Display display = new Display();
    MediatorDisplay mediatorDisplay;
    String vehicle_type;
    Scanner sc = new Scanner(System.in);

    public void inputFromConsole(ParkingLot parkingLot) {
        while (true) {
            System.out.println("\n1.park_vehicle \n2.unPark_vehicle \n3.display \n4.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("park_vehicle ");
                    sc.nextLine();
                    String input = sc.nextLine();
                    parkVehicleInput.parkVehicleInput(input, parkingLot);
                    break;
                case 2:
                    System.out.print("unPark_vehicle ");
                    String ticketId = sc.next();
                    System.out.println(parkingLot.unParkVehicle(ticketId, parkingLot));
                    break;
                case 3:
                    System.out.println("display ");
                    sc.nextLine();
                    String s = sc.nextLine();
                    String[] text = s.split(" ");
                    if (text[1].equalsIgnoreCase("CAR"))
                        mediatorDisplay = new MediatorDisplay(new DisplayCarStrategy());
                    else if (text[1].equalsIgnoreCase("BIKE"))
                        mediatorDisplay = new MediatorDisplay(new DisplayBikeStrategy());
                    else
                        mediatorDisplay = new MediatorDisplay(new DisplayTruckStrategy());
                    mediatorDisplay.displaySlots(text[0], parkingLot);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
