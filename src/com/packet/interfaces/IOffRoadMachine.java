package com.packet.interfaces;
import com.packet.exceptions.OffRoadMachineException;

/**
 * Created by mihai on 11/2/2014.
 */
public interface IOffRoadMachine {
    /**
     * This is the racing method
     * @throws OffRoadMachineException
     */
    public void driveOffRoad() throws OffRoadMachineException;

    /**
     * This is the method for attending at one type of road
     * @throws OffRoadMachineException
     */
    public void attendingRoadTypes() throws OffRoadMachineException;
}