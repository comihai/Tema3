package com.packet.exceptions;

/**
 * Created by mihai on 11/2/2014.
 * This is the exception class thrown by the {@Link com.packets.interfaces.IOffRoadMachine } interface
 */
public class OffRoadMachineException extends Exception {
    /**
     * Constructorul default
     *
     * @param message
     */
    public OffRoadMachineException(String message) {
        super(message);
    }
}