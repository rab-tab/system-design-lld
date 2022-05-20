package parkingLot1;

public abstract class ParkingService {
    abstract Ticket entry(VehicleType vehicleType);
    abstract void exit();
}
