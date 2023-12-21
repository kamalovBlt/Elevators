package ru.itis301.labs;

public class Node {

    public Elevator elevator;
    public Node next;
    public Node(Elevator elevator) {
        this.elevator = elevator;
    }
    public ElevatorStatus getElevatorStatus() {
        return elevator.elevatorStatus;
    }
    public ElevatorType getElevatorType() {
        return elevator.elevatorType;
    }
}
