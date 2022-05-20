package parkingLot1;

public abstract class SlotService {
     abstract ParkingSlot allocate(VehicleType vehicleType);
    abstract boolean unallocate( ParkingSlot parkingSlot);
}
