package ru.itis301.labs;

public class EmployeeElevator extends Elevator {
    public EmployeeElevator() {
        super(ElevatorType.EMPLOYEE_ELEVATOR);
        elevatorStatus = ElevatorStatus.FREE;
    }
}
