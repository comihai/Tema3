package com.packet.machines;

import com.packet.interfaces.IOffRoadMachine;

/**
 * Created by mihai on 11/2/2014.
 * <p/>
 * This class is for motorcycles
 */
public class Motorcycle extends Machine implements IOffRoadMachine {
    private String name;
    private String color;

    /**
     * This is the default constructor for Motorcycle
     *
     * @param capacity
     * @param power
     * @param name
     * @param color
     */
    public Motorcycle(float capacity, float power, String name, String color) {
        super(capacity, power);
        this.name = name;
        this.color = color;
    }

    /**
     * Getters and Setters
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method return true if the motorcycle is for championships
     *
     * @param championship The name of the championship
     * @return
     */
    @Override
    public boolean usedForRace(String championship) {
        return championship != null && (championship.contains("off-road"));
    }

    /**
     * This method says if the motorcycle can drive offroad
     */
    @Override
    public void driveOffRoad() {
        if (getPower() > 450 && getName() != null) {
            System.out.println("This machine motor is intended for off-road racing!");
        } else {
            System.out.println("This machine motor is not intended for off-road racing!");
        }
    }

    /**
     * This method is for choosing the type of road
     */
    @Override
    public void attendingRoadTypes() {
        if (getPower() > 500) {
            System.out.println("The roadside area must be free from obstacles and dangerous slopes.");
        } else {
            System.out.println("Stop and regain vehicle control within 9 meters.");
        }
    }
}
