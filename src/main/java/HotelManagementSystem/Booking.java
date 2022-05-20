package HotelManagementSystem;

import HotelManagementSystem.actors.Guest;
import HotelManagementSystem.room.RoomBooking;

public class Booking {
    public RoomBooking createBooking(Guest guestInfo){return  new RoomBooking();}
    public RoomBooking cancelBooking(int bookingId){return  new RoomBooking();};
}
