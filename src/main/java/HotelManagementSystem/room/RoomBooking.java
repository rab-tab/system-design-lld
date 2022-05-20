package HotelManagementSystem.room;

import HotelManagementSystem.pricing.BaseRoomCharges;
import HotelManagementSystem.BookingStatus;
import HotelManagementSystem.actors.Guest;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    String bookingId;
    Date startDate;
    int duration;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomList;
    BaseRoomCharges totalPrice;
}
