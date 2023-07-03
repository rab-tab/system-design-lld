package ElevatorLLD;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    static {

        Elevator elevatorCar1 = new Elevator();
        elevatorCar1.id = 1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        Elevator elevatorCar2 = new Elevator();
        elevatorCar1.id = 2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }

}
