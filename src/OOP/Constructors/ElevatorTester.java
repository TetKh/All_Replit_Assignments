package OOP.Constructors;

public class ElevatorTester {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(16);

        elevator.goUp(15);
        elevator.closeDoor();

        System.out.println("Number Of Floors : "+elevator.getNumberOfFloors());
        System.out.println("Current Floor : "+elevator.getCurrentFloor());
        System.out.println("Is door open: " +elevator.isDoorOpen() + "\n");

        elevator.goDown(3);
        elevator.closeDoor();

        System.out.println("Number Of Floors : "+elevator.getNumberOfFloors());
        System.out.println("Current Floor : "+elevator.getCurrentFloor());
        System.out.println("Is door open: " +elevator.isDoorOpen() + "\n");

        elevator.goUp(16);
        elevator.openDoor();

        System.out.println("Number Of Floors : "+elevator.getNumberOfFloors());
        System.out.println("Current Floor : "+elevator.getCurrentFloor());
        System.out.println("Is door open: " +elevator.isDoorOpen());

    }
}
