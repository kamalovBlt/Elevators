package ru.itis301.labs;

public class Elevators implements FreeElevator, Calling {

    private Node root;
    private Node current;
    public void addElevator(Elevator elevator) {
        if (root == null) {
            root = new Node(elevator);
            current = root;
            root.next = current;
        }
        else {
            current.next = new Node(elevator);
            current = current.next;
            current.next = root;
        }
    }
    @Override
    public Elevator free(ElevatorType elevatorType) throws ElevatorFullException {
        try {
            if (root == null) {
                throw new ElevatorFullException("Лифтов нет");
            }
            else if (root.getElevatorStatus() == ElevatorStatus.FREE && root.getElevatorType() == elevatorType) {
                root.elevator.elevatorStatus = ElevatorStatus.EMPLOYED;
                return root.elevator;
            }
            else {
                Node nowCurrent = root.next;
                while (nowCurrent != root) {
                    if (nowCurrent.getElevatorStatus() == ElevatorStatus.FREE && nowCurrent.getElevatorType() == elevatorType) {
                        nowCurrent.elevator.elevatorStatus = ElevatorStatus.EMPLOYED;
                        return nowCurrent.elevator;
                    }
                    nowCurrent = nowCurrent.next;
                }
                throw new ElevatorFullException("Нет свободных лифтов подходяшие под критерии");
            }
        } catch (ElevatorFullException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
    }
    @Override
    public void call(ElevatorType elevatorType) throws ElevatorFullException {
        if (free(elevatorType) != null) {
            print();
        }
    }
    private static void print() {
        System.out.println("Лифт скоро приедет");
    }
}
