package HotelManagementSystem.pricing;

public class RoomServiceCharge implements BaseRoomCharge{

    double cost;
    BaseRoomCharge baseRoomCharge;
    @Override
    public Double getCost() {
        return  baseRoomCharge.getCost()+cost;

    }
}
