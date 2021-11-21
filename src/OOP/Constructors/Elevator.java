package OOP.Constructors;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfFloors){

        this.numberOfFloors = numberOfFloors;
        this.currentFloor = 1;

    }
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = !doorOpen;
    }
    public void goUp(int desiredFloor)
    {
        if(desiredFloor < numberOfFloors)
            this.currentFloor = desiredFloor;
    }
    public void goDown(int desiredFloor)
    {
        if(desiredFloor > 1)
            this.currentFloor = desiredFloor;
    }
}