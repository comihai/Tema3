package com.packet.machines;

/**
 * Created by mihai on 11/2/2014.
 * <p/>
 * This is the class for truck machine
 */
public class Truck extends Machine {
    private String name;
    private double wight;
    private boolean hasTurbo;

    /**
     * The default constructor for truck class
     *
     * @param capacity
     * @param power
     * @param name
     * @param wight
     * @param hasTurbo
     */
    public Truck(float capacity, float power, String name, double wight, boolean hasTurbo) {
        super(capacity, power);
        this.name = name;
        this.wight = wight;
        this.hasTurbo = hasTurbo;
    }

    /**
     * Getters and Setters
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    /**
     * This method retun true if the truck is used for championships
     *
     * @param championship The name of the championship
     * @return
     */
    @Override
    public boolean usedForRace(String championship) {
        return championship != null && (championship.contains("turbo"));
    }
}
