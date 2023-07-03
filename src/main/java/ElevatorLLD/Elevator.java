package ElevatorLLD;

public class Elevator {

    int id;
    ElevatorDisplay display;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorState elevatorState;
    ElevatorDoor elevatorDoor;
    InternalButton internalButtons;

    public Elevator() {
        display = new ElevatorDisplay();
        internalButtons = new InternalButton();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();

    }
    public void showDisplay(){
        display.showDisplay();
    }

    public void pressButton(int destination){
        this.display.setDisplay(destination,this.elevatorDirection);
    }
    public void setDisplay() {
        this.display.setDisplay(currentFloor, elevatorDirection);
    }



}
