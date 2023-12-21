package ru.itis301.labs;

public class EvenElevator extends Elevator {
    public EvenElevator() {
        super(ElevatorType.EVEN_FLOOR_ELEVATOR);
        elevatorStatus = ElevatorStatus.FREE;
    }
}
