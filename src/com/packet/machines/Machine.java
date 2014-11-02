package com.packet.machines;

/**
 * Created by mihai on 11/2/2014.
 * This is the abstract machine class
 */
public abstract class  Machine {

    private float capacity;
    private float power;


    /**
     * The default constructor that initializes the machine with capacity and power;
     * @param capacity
     * @param power
     */
    protected Machine(float capacity, float power) {
        this.capacity = capacity;
        this.power = power;
    }

    /**
     *
     * This method must be overwritten by all the subclasses
     *
     * @param championship  The name of the championship
     * @return True if the machine is for racing, False otherwise
     */
    public abstract boolean usedForRace(String championship);

    /**
     * This method is defined for all the subclasses
     *
     * @return
     */
    public  boolean designedForUseOverRoughTerrain()
    {
        return (getPower() > 100 && getCapacity() > 240) ? true : false;

    }

    /**
     * Gets the capacity of the machine
     * @return
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Gets the power of the machine
     * @return
     */
    public float getPower() {
        return power;
    }

    /**
     * Sets the capacity of the machine
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Sets the power of the machine
     * @param power
     */
    public void setPower(int power) {
        this.power = power;
    }
}
