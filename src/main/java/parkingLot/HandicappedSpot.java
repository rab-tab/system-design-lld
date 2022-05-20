package parkingLot;

public class HandicappedSpot extends ParkingSpot {
    private String Number;

    public HandicappedSpot() {
        super(ParkingSpotType.HANDICAPPED);
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
}
