package ru.itis301.labs;

public interface FreeElevator {
    public Elevator free(ElevatorType elevatorType) throws ElevatorFullException;
}
