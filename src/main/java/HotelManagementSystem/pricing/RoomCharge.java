package HotelManagementSystem.pricing;

import HotelManagementSystem.pricing.BaseRoomCharge;

public class RoomCharge implements BaseRoomCharge {

    double cost;

    @Override
    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
