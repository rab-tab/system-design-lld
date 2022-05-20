package HotelManagementSystem.actors;

import HotelManagementSystem.Booking;
import HotelManagementSystem.Search;
import HotelManagementSystem.room.RoomBooking;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Person{
    Search searchObj;
    Booking bookingObj;

    public List<RoomBooking> getAllRoomBookings(){
        return new ArrayList<>();
    };

}
