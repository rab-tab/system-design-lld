package parkingLot;

public class CompactSpot extends ParkingSpot {

    public CompactSpot() {
        super(ParkingSpotType.COMPACT);
    }

    private String Number;
    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
}