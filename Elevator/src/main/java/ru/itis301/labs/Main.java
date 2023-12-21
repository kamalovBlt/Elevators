package ru.itis301.labs;

public class Main {
    public static void main(String[] args) throws ElevatorFullException {

        Elevators elevators = new Elevators();

        elevators.addElevator(new OddElevator());
        elevators.addElevator(new OddElevator());
        elevators.addElevator(new OddElevator());

        elevators.addElevator(new EvenElevator());
        elevators.addElevator(new EvenElevator());
        elevators.addElevator(new EvenElevator());

        elevators.addElevator(new EmployeeElevator());

        for(int i = 0; i < 2; ++i) {
            elevators.call(ElevatorType.EMPLOYEE_ELEVATOR);
        }
        elevators.call(ElevatorType.ODD_FLOOR_ELEVATOR);
    }
}