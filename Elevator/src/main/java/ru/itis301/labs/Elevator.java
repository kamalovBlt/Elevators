package ru.itis301.labs;

public abstract class Elevator {

    protected ElevatorStatus elevatorStatus;
    protected ElevatorType elevatorType;
    public Elevator(ElevatorType elevatorType) {
        this.elevatorType = elevatorType;
        elevatorStatus = ElevatorStatus.FREE;
    }

}
