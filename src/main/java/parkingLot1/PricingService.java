package parkingLot1;

import java.util.Date;

public abstract class PricingService {

    abstract double calculate(VehicleType vehicleType, Date entryTime, Date exitTime);
}
