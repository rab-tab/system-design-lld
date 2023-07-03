package ElevatorLLD;

import java.util.List;

public class Building {
    List<Floor> floors;

    public Building(List<Floor> floors) {
        this.floors = floors;
    }

    public void addFloors(Floor floor) {
        floors.add(floor);
    }

    public void removeFloors(Floor floor) {
        floors.remove(floor);
    }

    public List<Floor> getAllFloors() {
        return floors;
    }
}
