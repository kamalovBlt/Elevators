package ru.itis301.labs;

public class OddElevator extends Elevator{
    public OddElevator() {
        super(ElevatorType.ODD_FLOOR_ELEVATOR);
        elevatorStatus = ElevatorStatus.FREE;
    }
}
