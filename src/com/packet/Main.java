package com.packet;

import com.packet.interfaces.IOffRoadMachine;
import com.packet.exceptions.OffRoadMachineException;
import com.packet.machines.Automobile;
import com.packet.machines.Machine;
import com.packet.machines.Motorcycle;
import com.packet.machines.Truck;

/**
 * Created by mihai on 11/2/2014.
 * This is the main function
 */
public class Main {
    public static void main(String[] args){

        IOffRoadMachine offVehicle = new Automobile("Bmw", "rosu", 100, 120, 500, 100);
        Machine moto = new Motorcycle(120, 230, "kawasaki", "albastru");
        Automobile car = new Automobile(null, null, 0, 0, 0, 0);
        Machine normalCar = new Automobile(null, null, 0, 0, 0, 0);
        Machine truck = new Truck(200,230,"john deer",678.9,true);

        try {
            offVehicle.driveOffRoad();
        } catch (OffRoadMachineException e) {
            System.out.println("Exception : "+e.getMessage());
        }

        try {
            ((IOffRoadMachine) moto).driveOffRoad();
            ((IOffRoadMachine) moto).attendingRoadTypes();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            car.driveOffRoad();

        } catch (OffRoadMachineException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        car.setName("Audi A6 convertible");
        car.setColor("blue");

        System.out.println("Is a convertible car?\n" + (car.isConvertible() ? "Yes!" : "No!"));


        System.out.println("Is a racing truck?\n" + ((((Truck) truck).isHasTurbo() ? "Yes.It is!" : "No!" )));
        System.out.println("Is a truck that is designed for use over rough terrain?\n" + (((truck).designedForUseOverRoughTerrain() ? "Yes.It is!" : "No!" )));
    }

}
